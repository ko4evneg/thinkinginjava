package ch14_typeinformation.exercise16;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
//Exercise 14: (4) A constructor is a kind of factory method. Modify RegisteredFactories.java so that instead of using
//an explicit factory, the class object is stored in the List, and newlnstance( ) is used to create each object.

class Part {
		public String toString() {
				return getClass().getSimpleName();
		}

		static List<Class<? extends Part>> partFactories =
						new ArrayList<>();

		static {
// Collections.addAll() gives an "unchecked generic
// array creation ... for varargs parameter" warning.
				partFactories.add(FuelFilter.class);
				partFactories.add(AirFilter.class);
				partFactories.add(CabinAirFilter.class);
				partFactories.add(OilFilter.class);
				partFactories.add(FanBelt.class);
				partFactories.add(PowerSteeringBelt.class);
				partFactories.add(GeneratorBelt.class);
		}

		private static Random rand = new Random();

		public static Part createRandom() throws IllegalAccessException, InstantiationException {
				int n = rand.nextInt(partFactories.size());
				return partFactories.get(n).newInstance();
		}
}

class Filter extends Part {
}

class FuelFilter extends Filter {
		// Create a Class Factory for each specific type:
		public static class Factory implements ch14_typeinformation.exercise16.Factory<FuelFilter> {
				public FuelFilter create() {
						return new FuelFilter();
				}
		}
}

class AirFilter extends Filter {
		public static class Factory implements ch14_typeinformation.exercise16.Factory<AirFilter> {
				public AirFilter create() {
						return new AirFilter();
				}
		}
}

class CabinAirFilter extends Filter {
		public static class Factory implements ch14_typeinformation.exercise16.Factory<CabinAirFilter> {
				public CabinAirFilter create() {
						return new CabinAirFilter();
				}
		}
}

class OilFilter extends Filter {
		public static class Factory implements ch14_typeinformation.exercise16.Factory<OilFilter> {
				public OilFilter create() {
						return new OilFilter();
				}
		}
}

class Belt extends Part {
}

class FanBelt extends Belt {
		public static class Factory implements ch14_typeinformation.exercise16.Factory<FanBelt> {
				public FanBelt create() {
						return new FanBelt();
				}
		}
}

class GeneratorBelt extends Belt {
		public static class Factory implements ch14_typeinformation.exercise16.Factory<GeneratorBelt> {
				public GeneratorBelt create() {
						return new GeneratorBelt();
				}
		}
}

class PowerSteeringBelt extends Belt {
		public static class Factory implements ch14_typeinformation.exercise16.Factory<PowerSteeringBelt> {
				public PowerSteeringBelt create() {
						return new PowerSteeringBelt();
				}
		}
}

public class RegisteredFactories {
		public static void main(String[] args) throws InstantiationException, IllegalAccessException {
				for (int i = 0; i < 10; i++)
						System.out.println(Part.createRandom());
		}
}