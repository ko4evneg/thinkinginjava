package ch13_strings.exercise17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static thinkinginjava.util.Utils.printf;
//Exercise 17: (8) Write a program that reads a Java source-code file (you provide the file name on the command line)
//and displays all the comments.

public class CommentsReader {
		public static void main(String[] args) throws Exception {
				//Args verification:
				if (args.length < 1) {
						System.out.println("Usage: file or directory path should be provided.");
						System.exit(0);
				}
				//File reading:
				String fileName = args[0];
				File file = new File(fileName);
				Pattern p = Pattern.compile("(?<=\\n|^)\\s*//.*|(?s)/\\*.*\\*/");

				/*some test multiline
				comment*/

				BufferedReader fileReader = new BufferedReader(new FileReader(file));
				StringBuilder fileString = new StringBuilder();
				while (fileReader.ready()) {
						fileString.append(fileReader.readLine() + System.lineSeparator());
				}
				printf("File %s comments:\n", file.getName());
				Matcher m = p.matcher(fileString.toString());
				int index = 0;
				while (m.find())
						System.out.println("Comment " + index++ + ": " + m.group());
				fileReader.close();
		}
}