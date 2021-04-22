package ch15_generics.exercise1;
//Exercise 1: (1) Use Holders with the typeinfo.pets library to show that a Holders that is specified to hold a base
//type can also hold a derived type.

import ch15_generics.exercise1.pets.Cymric;
import ch15_generics.exercise1.pets.Pet;

import static thinkinginjava.Utils.print;

public class Holders<T> {
		public T obj;

		public Holders(T obj) {
				this.obj = obj;
		}

		public void setObj(T obj) {
				this.obj = obj;
		}

		public static void main(String[] args) {
				Holders<Pet> h = new Holders<Pet>(new Pet("Pet"));
				print(h.obj);
				h.setObj(new Cymric("Cymric"));
				print(h.obj);
		}
}
