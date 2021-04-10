package ch14_typeinformation.pets;

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