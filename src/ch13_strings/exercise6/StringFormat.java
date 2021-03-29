package ch13_strings.exercise6;
//Exercise 6: (2) Create a class that contains int, long, float and double fields. Create a toString( ) method for this
//class that uses String.format( ), and demonstrate that your class works correctly.

public class StringFormat {
		private int i = 308;
		private long l = 49_231_421_142L;
		private float f = 3.21341f;
		private double d = -23.41249659923;

		public static void main(String[] args) {
				StringFormat sf = new StringFormat();
				System.out.println(sf.toString());
		}

		@Override
		public String toString() {
				return String.format("%1$-6s: %5$-12d\n" +
								"%2$-6s: %6$-12d\n" +
								"%3$-6s: %7$-12f\n" +
								"%4$-6s: %8$-12.10f\n", "int", "long", "float", "double", i, l, f, d);
		}
}
