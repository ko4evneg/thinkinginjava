package ch14_typeinformation.project;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import static thinkinginjava.util.Utils.print;

public class DynamicProxy {
		private static boolean transactionSucceed = false;

		public static void main(String[] args) throws IOException {
				TextFileUtil textFileUtil = new TextFileUtil("D:\\temp_java\\text.txt");
				//Creating proxy
				TextFileWrite tProxy = (TextFileWrite) Proxy.newProxyInstance(TextFileWrite.class.getClassLoader(),
								new Class[]{TextFileWrite.class}, new InvocationHandler() {
										@Override
										public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
												try {
														method.invoke(textFileUtil, args);
												} catch (InvocationTargetException e) {
														throw e.getCause();
												}
												transactionSucceed = true;
												return -1;
										}
								});
				//textFileUtil.writeText("test");
				tProxy.writeText("Da string");
				print(transactionSucceed);
		}
}
