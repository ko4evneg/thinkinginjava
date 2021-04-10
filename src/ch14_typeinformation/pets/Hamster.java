package ch14_typeinformation.pets;

public class Hamster extends Rodent implements Factory<Hamster> {
		public Hamster(String name) {
				super(name);
		}

		public Hamster() {
				super();
		}

		@Override
		public Hamster create() {
				return new Hamster();
		}
}