package ch13_strings.exercise15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Exercise 15: (5) Modify JGrep.java to accept flags as arguments (e.g., Pattern.CASE_INSENSITIVE, Pattern.MULTILINE).

public class JGrep {
		public static void main(String[] args) throws Exception {
				String str = "Then, when you have found the shrubbery, you must\n" +
								"cut down the mightiest tree in THE forest...\n" +
								"with... a herring!";
				String[] strs = str.split("\n");
				String regex = "\\sthe\\s";

				if(args.length < 1) {
						System.out.println("Usage: java JGrep file regex");
						System.exit(0);
				}
				int flag = 0;
				switch (args[0]) {
						case "Pattern.CASE_INSENSITIVE":
								flag = Pattern.CASE_INSENSITIVE;
								break;
						case "Pattern.MULTILINE":
								flag = Pattern.MULTILINE;
								break;
				}
				Pattern p = Pattern.compile(regex, flag);
// Iterate through the lines of the input file:
				int index = 0;
				Matcher m = p.matcher("");
				for (String line : strs) {
						m.reset(line);
						while (m.find())
								System.out.println(index++ + ": " +
												m.group() + ": " + m.start());
				}
		}
}