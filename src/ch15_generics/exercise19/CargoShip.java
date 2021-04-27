package ch15_generics.exercise19;

import thinkinginjava.util.Generator;
import thinkinginjava.util.Generators;

import java.util.*;

public class CargoShip extends Ship {
		static Random random = new Random();

		public CargoShip(int crewCount, int decksCount, int containersCount, int itemsCount) {
				super(crewCount);
				Generators.fill(this, () -> new Deck(containersCount, itemsCount), decksCount);
		}

		public static void main(String[] args) {
				CargoShip cargoShip = new CargoShip(25, 3, 5, 10);
				StringBuilder sb = new StringBuilder("");
				for (Deck deck : cargoShip) {
						for (Container container : deck) {
								for (Item item : container) {
									sb.append(String.format("%s:%s - %s\n", deck, container, item));
								}
						}
				}
				System.out.println(sb);
		}
}

class Ship extends ArrayList<Deck> {
		private Crew[] crew;

		public Ship(int crewCount) {
				this.crew = new Crew[crewCount];
				Generators.fill(crew, Crew::new, crewCount);
		}
}

class Deck extends ArrayList<Container> {
		private final int id = count++;
		private static int count = 1;

		@Override
		public String toString() {
				return "Deck#" + id;
		}

		public Deck(int containersCount, int itemsCount) {
				Generators.fill(this, () -> new Container(itemsCount), containersCount);
		}
}

class Container extends ArrayList<Item> {
		private final int id = count++;
		private static int count = 1;

		@Override
		public String toString() {
				return "Container#" + id;
		}

		public Container(int itemsCount) {
				Generators.fill(this, Item.itemGenerator, itemsCount);
		}
}

class Crew {
		private String name;

		public Crew() {
				name = "Crew#" + (CargoShip.random.nextInt(1000) + 1);
		}
}

class Item {
		private final int id;
		private double price;
		public static Generator<Item> itemGenerator = Item::new;

		public Item() {
				this.id = CargoShip.random.nextInt(1000) + 1;
				this.price = CargoShip.random.nextInt(300) + 100 + CargoShip.random.nextInt(100) / 100.0;
		}

		@Override
		public String toString() {
				return "Item#" + id + " (" + price + " Eur)";
		}
}

