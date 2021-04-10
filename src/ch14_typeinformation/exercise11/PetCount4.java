package ch14_typeinformation.exercise11;

import ch14_typeinformation.pets.Pet;
import static thinkinginjava.Utils.print;
import static thinkinginjava.Utils.printnb;

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