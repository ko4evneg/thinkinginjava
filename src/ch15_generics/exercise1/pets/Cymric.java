package ch15_generics.exercise1.pets;

public class Cymric extends Manx implements Factory<Cymric> {
		public Cymric(String name) {
				super(name);
		}

		public Cymric() {
				super();
		}
		@Override
		public Cymric create() {
				return new Cymric();
		}
}