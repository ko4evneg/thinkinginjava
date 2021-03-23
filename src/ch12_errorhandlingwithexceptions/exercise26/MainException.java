package ch12_errorhandlingwithexceptions.exercise26;
//Exercise 26: (1) Change the file name string in MainException.java to name a file that doesn’t exist. Run the program
//and note the result.

import java.io.FileInputStream;

public class MainException {
		// Pass all exceptions to the console:
		public static void main(String[] args) throws Exception {
// Open the file:
				FileInputStream file =
								new FileInputStream("MainException.java");
// Use the file ...
// Close the file:
				file.close();
		}
}