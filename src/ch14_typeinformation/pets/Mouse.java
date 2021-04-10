package ch14_typeinformation.pets;

public class Mouse extends Rodent implements Factory<Mouse>{
		public Mouse(String name) {
				super(name);
		}

		public Mouse() {
				super();
		}

		@Override
		public Mouse create() {
				return new Mouse(

				);
		}
}