package ch14_typeinformation.project;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextFileUtil implements TextFileWrite{
		File f;

		public TextFileUtil(File f) {
				this.f = f;
		}

		public TextFileUtil(Path p) {
				f = p.toFile();
		}

		public TextFileUtil(String s) {
				f = new File(s);
		}

		@Override
		public void writeText(String s) {
				
		}
}
