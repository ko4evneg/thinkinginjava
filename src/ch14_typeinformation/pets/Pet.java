package ch14_typeinformation.pets;

public class Pet extends Individual {
		public Pet(String name) {
				super(name);
		}

		public Pet() {
				super();
		}

		public void voice() {
				System.out.println("Pets have different voices!");
		}
}