package ch15_generics.exercise1.pets;

public class Pet {
		String name;

		public Pet(String name) {
				this.name = name;
		}

		public Pet() {
				super();
		}

		public void voice() {
				System.out.println("Pets have different voices!");
		}
}