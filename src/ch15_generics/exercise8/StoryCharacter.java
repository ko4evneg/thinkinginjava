package ch15_generics.exercise8;

public class StoryCharacter {
		String name;
		int age;

		public StoryCharacter(String name) {
				this.name = name;
		}

		public StoryCharacter(String name, int age) {
				this.name = name;
				this.age = age;
		}

		@Override
		public String toString() {
				return name + " (" + age + ")";
		}
}
