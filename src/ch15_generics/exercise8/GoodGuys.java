package ch15_generics.exercise8;

public class GoodGuys extends StoryCharacter {
		public GoodGuys(String name) {
				super(name);
		}

		public GoodGuys(String name, int age) {
				super(name, age);
		}

		@Override
		public String toString() {
				return "good: " + super.toString();
		}
}
