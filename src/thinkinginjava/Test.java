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
				Matcher m1 = Pattern.compile("La.*\\s").matcher("a big La pattern!");
				Matcher m2 = Pattern.compile("La.*\\s").matcher("La pattern!");
				Matcher m3 = Pattern.compile("La.*\\s").matcher("La ");

				while (m1.find()) {
						System.out.println(m1.group());
				}
				while (m2.find()) {
						System.out.println(m2.lookingAt());
				}
				while (m3.find()) {
						System.out.println(m3.matches());
				}
		}
}