package ch14_typeinformation.exercise13;

import java.util.*;
import static thinkinginjava.Utils.print;
//Exercise 13: (3) Use TypeCounter with the RegisteredFactories.java example in this chapter.

class Part {
		public String toString() {
				return getClass().getSimpleName();
		}

		static List<Factory<? extends Part>> partFactories =
						new ArrayList<Factory<? extends Part>>();

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

		private static Random rand = new Random(47);

		public static Part createRandom() {
				int n = rand.nextInt(partFactories.size());
				return partFactories.get(n).create();
		}
}

class Filter extends Part {
}

class FuelFilter extends Filter {
		// Create a Class Factory for each specific type:
		public static class Factory implements ch14_typeinformation.exercise13.Factory<FuelFilter> {
				public FuelFilter create() {
						return new FuelFilter();
				}
		}
}

class AirFilter extends Filter {
		public static class Factory implements ch14_typeinformation.exercise13.Factory<AirFilter> {
				public AirFilter create() {
						return new AirFilter();
				}
		}
}

class CabinAirFilter extends Filter {
		public static class Factory implements ch14_typeinformation.exercise13.Factory<CabinAirFilter> {
				public CabinAirFilter create() {
						return new CabinAirFilter();
				}
		}
}

class OilFilter extends Filter {
		public static class Factory implements ch14_typeinformation.exercise13.Factory<OilFilter> {
				public OilFilter create() {
						return new OilFilter();
				}
		}
}

class Belt extends Part {
}

class FanBelt extends Belt {
		public static class Factory implements ch14_typeinformation.exercise13.Factory<FanBelt> {
				public FanBelt create() {
						return new FanBelt();
				}
		}
}

class GeneratorBelt extends Belt {
		public static class Factory implements ch14_typeinformation.exercise13.Factory<GeneratorBelt> {
				public GeneratorBelt create() {
						return new GeneratorBelt();
				}
		}
}

class PowerSteeringBelt extends Belt {
		public static class Factory implements ch14_typeinformation.exercise13.Factory<PowerSteeringBelt> {
				public PowerSteeringBelt create() {
						return new PowerSteeringBelt();
				}
		}
}

public class RegisteredFactories {
		public static void main(String[] args) {
				TypeCounter typeCounter = new TypeCounter(Part.class);
				for (int i = 0; i < 10; i++)
						typeCounter.count(Part.createRandom());
				print(typeCounter);
		}
}