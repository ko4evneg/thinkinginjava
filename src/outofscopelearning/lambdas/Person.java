package outofscopelearning.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static thinkinginjava.Utils.print;

public class Person {
		private String firstName;
		private String lastName;
		private int age;
		private static List<Person> people = Arrays.asList(
						new Person("Ted", "Neward", 42),
						new Person("Charlotte", "Neward", 39),
						new Person("Michael", "Neward", 19),
						new Person("Matthew", "Neward", 13),
						new Person("Neal", "Ford", 45),
						new Person("Candy", "Ford", 39),
						new Person("Jeff", "Brown", 43),
						new Person("Betsy", "Brown", 39)
		);

		public static void main(String[] args) {
				print(people);
				Collections.sort(people, Person::compareLastAndAge);
				print(people);
		}

		public Person(String fn, String ln, int a) {
				this.firstName = fn;
				this.lastName = ln;
				this.age = a;
		}

		public static int compareLastAndAge (Person lhs, Person rhs) {
			if(lhs.lastName.equalsIgnoreCase(rhs.lastName))
					return lhs.getAge() - rhs.getAge();
			else
					return lhs.lastName.compareToIgnoreCase(rhs.lastName);
		}

		public String getFirstName() {
				return firstName;
		}

		public String getLastName() {
				return lastName;
		}

		public int getAge() {
				return age;
		}

		@Override
		public String toString() {
				return String.format("%s, %s (%d)", lastName, firstName, age);
		}
}
