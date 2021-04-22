package ch15_generics.exercise1.pets;

public class Dog extends Pet {
		public Dog(String name) {
				super(name);
		}

		public Dog() {
				super();
		}

		@Override
		public void voice(){
				System.out.println("Barking...");
		}

}