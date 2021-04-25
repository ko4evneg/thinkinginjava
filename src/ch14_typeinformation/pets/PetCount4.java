package ch14_typeinformation.pets;

import static thinkinginjava.util.Utils.*;

public class PetCount4 {
		public static void main(String[] args) {
				TypeCounter counter = new TypeCounter(Pet.class);
				for (Pet pet : Pets.createArray(20)) {
						printnb(pet.getClass().getSimpleName() + " ");
						counter.count(pet);
				}
				print();
				print(counter);
		}
}