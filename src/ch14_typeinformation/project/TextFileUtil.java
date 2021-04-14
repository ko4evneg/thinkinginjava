package ch14_typeinformation.project;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class TextFileUtil implements TextFileWrite{
		File file;

		public TextFileUtil(File f) {
				this.file = f;
		}

		public TextFileUtil(Path p) {
				file = p.toFile();
		}

		public TextFileUtil(String s) {
				file = new File(s);
		}

		@Override
		public void writeText(String s) throws IOException {
				if (!file.exists()) throw new IOException("FILE DOES NOT EXIST!");
				BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file,true));
				fileWriter.write(s);
				fileWriter.close();
		}

		public void testPrint(){
				System.out.println("test string");
		}
}
