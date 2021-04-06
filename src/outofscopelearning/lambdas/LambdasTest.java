package outofscopelearning.lambdas;

import java.util.function.Consumer;

import static thinkinginjava.Utils.print;

public class LambdasTest {
		public static void main(String[] args) {
				DoAction doAction = () -> print("Simple lamba's code");
				doAction.doAction();

				ReturnByAction ret = (z) -> "Returnable string: " + z;
				String s = ret.returnableAction("Lambdas's argument");
				print(s);
		}

		static String returnText(){
				return "return test: ";
		}
}

@FunctionalInterface
interface DoAction {
		void doAction();
}

@FunctionalInterface
interface ReturnByAction {
		String returnableAction(String s);
}
