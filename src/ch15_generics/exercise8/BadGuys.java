package ch15_generics.exercise8;

public class BadGuys extends StoryCharacter {
		public BadGuys(String name) {
				super(name);
		}

		public BadGuys(String name, int age) {
				super(name, age);
		}

		@Override
		public String toString() {
				return "bad: " + super.toString();
		}
}
