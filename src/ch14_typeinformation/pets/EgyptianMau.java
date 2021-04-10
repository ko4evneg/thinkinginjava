package ch14_typeinformation.pets;

public class EgyptianMau extends Cat implements Factory<EgyptianMau>{
		public EgyptianMau(String name) {
				super(name);
		}

		public EgyptianMau() {
				super();
		}

		@Override
		public EgyptianMau create() {
				return new EgyptianMau();
		}
}