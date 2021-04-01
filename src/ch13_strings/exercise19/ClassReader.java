package ch13_strings.exercise19;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static thinkinginjava.Utils.printf;
//Exercise 19: (8) Building on the previous two exercises, write a program that examines Java source code and produces
//all the class names used in a particular program.

public class ClassReader {
		public static void main(String[] args) throws Exception {
				//Args verification:
				if (args.length < 1) {
						System.out.println("Usage: file or directory path should be provided.");
						System.exit(0);
				}
				//File reading:
				String fileName = args[0];
				File file = new File(fileName);
				Pattern p = Pattern.compile("class\\s+([A-Z]\\w*)\\s+\\{", Pattern.DOTALL);

				/*some test multiline
				comment*/

				BufferedReader fileReader = new BufferedReader(new FileReader(file));
				StringBuilder fileString = new StringBuilder();
				while (fileReader.ready()) {
						fileString.append(fileReader.readLine() + System.lineSeparator());
				}
				printf("File %s Classes:\n", file.getName());
				Matcher m = p.matcher(fileString.toString());
				int index = 0;
				while (m.find())
						System.out.println("Class " + index++ + ": " + m.group(1));
				fileReader.close();
		}
}

class TestClass {
		class InnerClass {
		}
}