package ch14_typeinformation.exercise11;

import ch14_typeinformation.pets.*;

import java.util.Collections;
import java.util.List;

public class LiteralPetCreator extends PetCreator {
		// No try block needed.
		@SuppressWarnings("unchecked")
		public static final List<Class<? extends Pet>> allTypes =
						Collections.unmodifiableList(List.of(
										Pet.class, Dog.class, Cat.class, Rodent.class,
										Mutt.class, Pug.class, EgyptianMau.class, Manx.class,
										Cymric.class, Rat.class, Mouse.class, Hamster.class, Gerbil.class));
		// Types for random creation:
		private static final List<Class<? extends Pet>> types =
						allTypes.subList(allTypes.indexOf(Mutt.class),
										allTypes.size());

		public List<Class<? extends Pet>> types() {
				return types;
		}

		public static void main(String[] args) {
				System.out.println(types);
		}
}