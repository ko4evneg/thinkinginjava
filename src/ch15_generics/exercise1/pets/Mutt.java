package ch15_generics.exercise1.pets;

public class Mutt extends Dog implements Factory<Mutt> {
		public Mutt(String name) {
				super(name);
		}

		public Mutt() {
				super();
		}

		@Override
		public Mutt create() {
				return new Mutt();
		}
}