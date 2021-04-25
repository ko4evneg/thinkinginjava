package ch13_strings.exercise16;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static thinkinginjava.util.Utils.printf;
//Exercise 16: (5) Modify JGrep.java to accept a directory name or a file name as argument (if a directory is provided,
//search should include all files in the directory). Hint: You can generate a list of file names with:
//File[] files = new File(".").listFiles();

public class JGrep {
		public static void main(String[] args) throws Exception {
				if (args.length < 2) {
						System.out.println("Usage: file or directory path should be provided, regex expression should be provided.");
						System.exit(0);
				}

				String fileName = args[0];
				String regex = args[1];
				File[] files;
				if (!Files.isDirectory(Paths.get(fileName)))
						files = new File[]{new File(fileName)};
				else
						files = new File(fileName).listFiles(new FilenameFilter() {
								@Override
								public boolean accept(File dir, String name) {
										if (name.endsWith(".txt"))
												return true;
										return false;
								}
						});

				Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
				Matcher m = p.matcher("");

				int index = 0;
				for (File f : files) {
						BufferedReader fileReader = new BufferedReader(new FileReader(f));
						StringBuilder fileString = new StringBuilder();
						while (fileReader.ready()) {
								fileString.append(fileReader.readLine() + System.lineSeparator());
						}
						printf("File %s content:\n", f.getName());
						for (String s : fileString.toString().split("\n")) {
								m.reset(s);
								while (m.find())
										System.out.println(index++ + ": " + m.group() + ": " + m.start());
						}
						fileReader.close();
				}
		}
}