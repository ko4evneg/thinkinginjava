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
				String str = "/*Exercise 17: (8) Write a program that reads a Java source-code\n //file (you provide the file name on the command line)\n" +
								"//and displays all the\n" +
								" comments.*\\XD";
				Matcher m1 = Pattern.compile("",Pattern.DOTALL).matcher(str);

				while (m1.find()) {
						print(m1.group());
				}

		}
}