package thinkinginjava;

import ch13_strings.exercise6.StringFormat;

import java.util.*;

import static thinkinginjava.Utils.print;
import static thinkinginjava.Utils.printf;

// An exception that reports through a Logger.
import java.util.logging.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Test {
		public static void main(String[] args) {
				String str = "La big Lahuy pattern!";
				Matcher m1 = Pattern.compile("(La.*?)\\s").matcher(str);

				StringBuffer sb = new StringBuffer();
				while (m1.find()) {
						//m1.appendReplacement(sb, "ZALUPA");

				}
				//m1.appendTail(sb);
				print(sb);
				print(str);
		}
}