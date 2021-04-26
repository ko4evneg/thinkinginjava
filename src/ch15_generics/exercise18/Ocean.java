//Exercise 18: (3) Following the form of BankTeller.java, create an example where BigFish eat LittleFish in the Ocean.
package ch15_generics.exercise18;

import java.util.*;

public class Ocean {
		public static void eat(BigFish bigFish, SmallFish smallFish) {
				System.out.println(bigFish + " eats " + smallFish);
		}

		public static void main(String[] args) {
				List<BigFish> bigFishes = new LinkedList<>();
				List<SmallFish> smallFishes = new LinkedList<>();

				for (int i = 0; i < 5; i++)
						bigFishes.add(BigFish.bigFishGen.next());

				for (int i = 0; i < 20; i++)
						smallFishes.add(SmallFish.getGen().next());

				Random r = new Random();
				for (SmallFish smallFish : smallFishes)
						eat(bigFishes.get(r.nextInt(bigFishes.size())), smallFish);
		}
}
