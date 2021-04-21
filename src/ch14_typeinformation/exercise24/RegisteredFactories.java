package ch14_typeinformation.exercise24;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static thinkinginjava.Utils.print;
//Exercise 13: (3) Use TypeCounter with the RegisteredFactories.java example in this chapter.
//Exercise 24: (4) Add Null Objects to RegisteredFactories.java.

class Part {
		public String toString() {
				return partName;
		}

		static List<Factory<? extends Part>> partFactories =
						new ArrayList<Factory<? extends Part>>();

		private String partName;
		private static int number = 0;
		private int id = number++;

		public Part(String partName) {
				this.partName = partName + ":" + id;
		}

		private Part() {
		}

		static {
// Collections.addAll() gives an "unchecked generic
// array creation ... for varargs parameter" warning.
				partFactories.add(new FuelFilter.Factory());
				partFactories.add(new AirFilter.Factory());
				partFactories.add(new CabinAirFilter.Factory());
				partFactories.add(new OilFilter.Factory());
				partFactories.add(new FanBelt.Factory());
				partFactories.add(new PowerSteeringBelt.Factory());
				partFactories.add(new GeneratorBelt.Factory());
		}

		private static Random rand = new Random();
		public static final Part NULL_PART = new Part();
		static {
				NULL_PART.partName = "NULL part: -1";
		}

		public static Part createRandom() {
				int n = rand.nextInt(partFactories.size() + 1);
				if (n == partFactories.size())
						return NULL_PART;
				return partFactories.get(n).create();
		}
}

class Filter extends Part {
		public Filter(String partName) {
				super(partName);
		}
}

class FuelFilter extends Filter {
		public FuelFilter(String partName) {
				super(partName);
		}

		// Create a Class Factory for each specific type:
		public static class Factory implements  ch14_typeinformation.exercise24.Factory<FuelFilter> {
				public FuelFilter create() {
						return new FuelFilter("Fuel filter");
				}
		}
}

class AirFilter extends Filter {
		public AirFilter(String partName) {
				super(partName);
		}

		public static class Factory implements  ch14_typeinformation.exercise24.Factory<AirFilter> {
				public AirFilter create() {
						return new AirFilter("Air filter");
				}
		}
}

class CabinAirFilter extends Filter {
		public CabinAirFilter(String partName) {
				super(partName);
		}

		public static class Factory implements  ch14_typeinformation.exercise24.Factory<CabinAirFilter> {
				public CabinAirFilter create() {
						return new CabinAirFilter("Cabin air filter");
				}
		}
}

class OilFilter extends Filter {
		public OilFilter(String partName) {
				super(partName);
		}

		public static class Factory implements  ch14_typeinformation.exercise24.Factory<OilFilter> {
				public OilFilter create() {
						return new OilFilter("Oil filter");
				}
		}
}

class Belt extends Part {
		public Belt(String partName) {
				super(partName);
		}
}

class FanBelt extends Belt {
		public FanBelt(String partName) {
				super(partName);
		}

		public static class Factory implements  ch14_typeinformation.exercise24.Factory<FanBelt> {
				public FanBelt create() {
						return new FanBelt("Fan belt");
				}
		}
}

class GeneratorBelt extends Belt {
		public GeneratorBelt(String partName) {
				super(partName);
		}

		public static class Factory implements  ch14_typeinformation.exercise24.Factory<GeneratorBelt> {
				public GeneratorBelt create() {
						return new GeneratorBelt("Generator belt");
				}
		}
}

class PowerSteeringBelt extends Belt {
		public PowerSteeringBelt(String partName) {
				super(partName);
		}

		public static class Factory implements  ch14_typeinformation.exercise24.Factory<PowerSteeringBelt> {
				public PowerSteeringBelt create() {
						return new PowerSteeringBelt("Power steering belt");
				}
		}
}

public class RegisteredFactories {
		public static void main(String[] args) {
				for (int i = 0; i < 10; i++)
						print(Part.createRandom());
		}
}