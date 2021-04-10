package ch14_typeinformation.exercise16;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static thinkinginjava.Utils.print;

interface Factory<T> {
		T create();
}

public class CofeeFactories {
		private static List<Factory<? extends Coffee>> coffeeFactories = new ArrayList<>();

		static {
				coffeeFactories.addAll(List.of(
								new Latte(), new Mocha(), new Breve(), new Cappuccino(), new Americano()
				));
				Coffee.setCounter(1);
		}

		public static Coffee createRandom() {
				Random r = new Random();
				return coffeeFactories.get(r.nextInt(coffeeFactories.size())).create();
		}

		public static void main(String[] args) {
				List<Coffee> coffeeList = new ArrayList<>();
				for (int i = 0; i < 20 ; i++) {
						coffeeList.add(createRandom());
				}
				print(coffeeList);
		}
}

class Coffee {
		private static long counter = 0;
		private final long id = counter++;

		public static void setCounter(long counter) {
				Coffee.counter = counter;
		}

		public String toString() {
				return getClass().getSimpleName() + " " + id;
		}
} ///:~

//: generics/coffee/Latte.java
class Latte extends Coffee implements Factory<Latte> {
		@Override
		public Latte create() {
				return new Latte();
		}
} ///:~

//: generics/coffee/Mocha.java
class Mocha extends Coffee implements Factory<Mocha> {
		@Override
		public Mocha create() {
				return new Mocha();
		}
} ///:~

//: generics/coffee/Cappuccino.java
class Cappuccino extends Coffee implements Factory<Cappuccino> {
		@Override
		public Cappuccino create() {
				return new Cappuccino();
		}
} ///:~

//: generics/coffee/Americano.java
class Americano extends Coffee implements Factory<Americano> {
		@Override
		public Americano create() {
				return new Americano();
		}
} ///:~

//: generics/coffee/Breve.java
class Breve extends Coffee implements Factory<Breve> {
		@Override
		public Breve create() {
				return new Breve();
		}
}