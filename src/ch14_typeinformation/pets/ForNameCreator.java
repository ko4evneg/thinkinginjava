package ch14_typeinformation.pets;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {
		private static List<Class<? extends Pet>> types =
						new ArrayList<>();
		
		// Types that you want to be randomly created:
		private static String[] typeNames = {
						"ch14_typeinformation.pets.Mutt",
						"ch14_typeinformation.pets.Pug",
						"ch14_typeinformation.pets.EgyptianMau",
						"ch14_typeinformation.pets.Manx",
						"ch14_typeinformation.pets.Cymric",
						"ch14_typeinformation.pets.Rat",
						"ch14_typeinformation.pets.Mouse",
						"ch14_typeinformation.pets.Hamster"
		};

		@SuppressWarnings("unchecked")
		private static void loader() {
				try {
						for (String name : typeNames)
								types.add((Class<? extends Pet>) Class.forName(name));
				} catch (ClassNotFoundException e) {
						throw new RuntimeException(e);
				}
		}

		static {
				loader();
		}

		@Override
		public List<Class<? extends Pet>> types() {
				return types;
		}

		public static void main(String[] args) throws Exception {
				ForNameCreator fnc = new ForNameCreator();
				List<Class<? extends Pet>> types = fnc.types();

				Class<?> testClassPet = Dog.class;
				Class<Dog> testClassDog = Dog.class;
				Class<? extends Pet> testClassPetDog = Dog.class;

				Dog d = (Dog) testClassPet.newInstance();
				Dog dd = testClassDog.newInstance();
				Pet ddd = (Pet) testClassPetDog.newInstance();
		}
}
