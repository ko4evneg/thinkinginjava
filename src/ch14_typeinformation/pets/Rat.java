package ch14_typeinformation.pets;

public class Rat extends Rodent implements Factory<Rat>{
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