package ch13_strings.exercise12;
//Exercise 12: (5) Modify Groups.java to count all of the unique words that do not start with a capital letter.

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static thinkinginjava.Utils.*;

public class Groups {
		static public final String POEM =
						"Twas brillig, and the slithy toves\n" +
										"Did gyre and gimble in the wabe.\n" +
										"All mimsy were the borogoves,\n" +
										"And the mome raths outgrabe.\n\n" +
										"Beware the Jabberwock, my son,\n" +
										"The jaws that bite, the claws that catch.\n" +
										"Beware the Jubjub bird, and shun\n" +
										"The frumious Bandersnatch.";

		static public Set<String> words = new LinkedHashSet<>();
		public static void main(String[] args) {
				Matcher m = Pattern.compile("\\b[a-z]+\\b").matcher(POEM);
				while(m.find()) {
					words.add(m.group());
				}

				for (String s : words) {
						printnb(s + " ");
				}

		}
}