package ch13_strings.exercise7;
//Exercise 7: (5) Using the documentation for java.util.regex.Pattern as a resource, write and test a regular expression
//that checks a sentence to see that it begins with a capital letter and ends with a period.

public class IsCapitalized {
		public static void main(String[] args) {
				String s = "this is not";
				String sCap = "This is yes";

				System.out.println(s.matches("^\\p{Upper}.+"));
				System.out.println(s.matches("^\\p{Lower}.+"));

				System.out.println(sCap.matches("^\\p{Upper}.+"));
				System.out.println(sCap.matches("^\\p{Lower}.+"));
		}
}
