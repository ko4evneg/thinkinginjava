package ch14_typeinformation.pets;

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