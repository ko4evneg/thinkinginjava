//Exercise 8: (2) Following the form of the Coffee example, create a hierarchy of StoryCharacters from your favorite
//movie, dividing them into GoodGuys and BadGuys. Create a generator for StoryCharacters, following the form of
//CoffeeGenerator.
package ch15_generics.exercise8;

import thinkinginjava.Generator;
import java.util.Random;
import static thinkinginjava.Utils.print;

public class StoryCharacterGenerator implements Generator<StoryCharacter> {
		private static Random rand = new Random();
		private static Class[] types = {Architect.class, Morpheus.class, Naomi.class, Neo.class,
						Smith.class, Restorator.class};

		@Override
		public StoryCharacter next() {
				try {
						return (StoryCharacter) types[rand.nextInt(types.length)].newInstance();
				} catch (Exception e) {
						throw new RuntimeException("Shit, so bad"){
						};
				}
		}

		public static void main(String[] args) {
				StoryCharacterGenerator sGen = new StoryCharacterGenerator();
				for (int i = 0; i < 10; i++) {
						print(sGen.next());
				}
		}
}
