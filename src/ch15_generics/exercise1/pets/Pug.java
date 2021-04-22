package ch15_generics.exercise1.pets;

public class Pug extends Dog implements Factory<Pug> {
		public Pug(String name) {
				super(name);
		}

		public Pug() {
				super();
		}

		@Override
		public Pug create() {
				return new Pug();
		}
}