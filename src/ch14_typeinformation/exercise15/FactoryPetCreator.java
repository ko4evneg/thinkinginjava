package ch14_typeinformation.exercise15;

import ch14_typeinformation.pets.*;
import java.util.ArrayList;
import java.util.List;
import static thinkinginjava.util.Utils.print;
//Exercise 15: (4) Implement a new PetCreator using Registered Factories, and modify the Pets Facade so that it uses
//this one instead of the other two. Ensure that the rest of the examples that use Pets .Java still work correctly.

public class FactoryPetCreator extends PetCreator {
		private List<Factory<? extends Pet>> petFactories = new ArrayList();

		{
				petFactories.addAll(List.of(new EgyptianMau(), new Cymric(), new EgyptianMau(), new Hamster(), new Mouse(),
								new Mutt(), new Pug(), new Rat()
				));
		}

		@Override
		public List<Factory<? extends Pet>> types() {
				return petFactories;
		}

		@Override
		public Pet randomPet() {
				return super.randomPet();
		}

		public static void main(String[] args) {
				PetCreator petCreator = new FactoryPetCreator();
				PetCounter petCounter = new PetCounter(Pet.class);
				Pet[] pets = petCreator.createArray(20);
				for (Pet pet : pets) {
						petCounter.count(pet);
				}
				print(petCounter);
		}
}
