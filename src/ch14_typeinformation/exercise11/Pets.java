package ch14_typeinformation.exercise11;

import ch14_typeinformation.pets.Pet;
import ch14_typeinformation.pets.PetCreator;

import java.util.ArrayList;

public class Pets {
		public static final PetCreator creator = new LiteralPetCreator();

		public static Pet randomPet() {
				return creator.randomPet();
		}

		public static Pet[] createArray(int size) {
				return creator.createArray(size);
		}

		public static ArrayList<Pet> arrayList(int size) {
				return creator.arrayList(size);
		}
}