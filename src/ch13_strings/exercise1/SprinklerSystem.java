package ch13_strings.exercise1;
//Exercise 1: (2) Analyze SprinklerSystem.toString( ) in reusing/SprinklerSystem.java to discover whether writing the
//toString( ) with an explicit StringBuilder will save any StringBuilder creations.

import java.util.Date;

class WaterSource {
		private String s;

		WaterSource() {
				System.out.println("WaterSource()");
				s = "Constructed";
		}

		public String toString() {
				return s;
		}
}

public class SprinklerSystem {
		private String valve1, valve2, valve3, valve4;
		private WaterSource source = new WaterSource();
		private int i;
		private float f;

		public String toString() {
				String s = new String();
				s = "valve1 = " + valve1 + " " +
								"valve2 = " + valve2 + " " +
								"valve3 = " + valve3 + " " +
								"valve4 = " + valve4 + "\n" +
								"i = " + i + " " + "f = " + f + " " +
								"source = " + source;
				return s;
		}

		public static void main(String[] args) {
				//actually not working as expected as there were changes in Java 9
				SprinklerSystem sprinklers = new SprinklerSystem();
				sprinklers.toString();
		}
}