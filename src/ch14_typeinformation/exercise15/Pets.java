package ch14_typeinformation.exercise15;

import ch14_typeinformation.pets.Pet;

import java.util.ArrayList;

public class Pets {
		public static final PetCreator creator = new FactoryPetCreator();

		public static ch14_typeinformation.pets.Pet randomPet() {
				return creator.randomPet();
		}

		public static ch14_typeinformation.pets.Pet[] createArray(int size) {
				return creator.createArray(size);
		}

		public static ArrayList<Pet> arrayList(int size) {
				return creator.arrayList(size);
		}
}