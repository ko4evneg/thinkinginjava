package ch14_typeinformation.pets;

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