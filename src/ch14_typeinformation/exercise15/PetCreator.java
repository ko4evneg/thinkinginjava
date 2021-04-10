package ch14_typeinformation.exercise15;

import ch14_typeinformation.pets.Factory;
import ch14_typeinformation.pets.Pet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class PetCreator {
		private Random rand = new Random();
		public abstract List<Factory<? extends Pet>> types();

		public Pet randomPet() { // Create one random Pet
				int n = rand.nextInt(types().size());
						return types().get(n).create();
		}

		public Pet[] createArray(int size) {
				Pet[] result = new Pet[size];
				for (int i = 0; i < size; i++)
						result[i] = randomPet();
				return result;
		}

		public ArrayList<Pet> arrayList(int size) {
				ArrayList<Pet> result = new ArrayList<Pet>();
				Collections.addAll(result, createArray(size));
				return result;
		}
}
