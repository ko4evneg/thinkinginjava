package ch15_generics.exercise1.pets;

public class Mouse extends Rodent implements Factory<Mouse> {
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