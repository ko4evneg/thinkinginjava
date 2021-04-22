package ch15_generics.exercise1.pets;

public class Rat extends Rodent implements Factory<Rat> {
		public Rat(String name) {
				super(name);
		}

		@Override
		public Rat create() {
				return new Rat();
		}

		public Rat() {
				super();
		}
}