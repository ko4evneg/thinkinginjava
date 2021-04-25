package ch11_holdingyourobjects.exercise32;
//Exercise 32: (2) Following the example of MultilterableClass, add reversed( ) and randomized( ) methods to
//NonCollectionSequence.java, as well as making NonCollectionSequence implement Iterable, and show that all the
//approaches work in foreach statements.

import java.util.*;

import static thinkinginjava.util.Utils.print;

class PetSequence {
    protected Pet[] pets = Pets.createArray(8);
}

public class NonCollectionSequence extends PetSequence implements Iterable {

    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;

            public boolean hasNext() {
                return index < pets.length;
            }

            public Pet next() {
                return pets[index++];
            }

            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }

    public Iterable<Pet> reversed() {
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                return new Iterator<Pet>() {
                    private int index = pets.length - 1;

                    public boolean hasNext() {
                        return index >= 0;
                    }

                    public Pet next() {
                        return pets[index--];
                    }

                    public void remove() { // Not implemented
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    public Iterable<Pet> randomized() {
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                return new Iterator<Pet>() {
                    {
                        Collections.shuffle(Arrays.asList(pets));
                    }

                    private int index = 0;

                    public boolean hasNext() {
                        return index < pets.length;
                    }

                    public Pet next() {
                        return pets[index++];
                    }

                    public void remove() { // Not implemented
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    public static void main(String[] args) {
        NonCollectionSequence nc = new NonCollectionSequence();
        display(nc.iterator());
        for (Pet pet : nc.reversed())
            print(pet);
        print("-----");
        for (Pet pet : nc.randomized())
            print(pet);
    }

    public static void display(Iterator<Pet> it) {
        while (it.hasNext()) {
            Pet p = it.next();
            if (p == null)
                System.out.print("null");
            else
                System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }

    public static void display(Collection<Pet> pets) {
        for (Pet p : pets)
            if (p == null)
                System.out.print("null");
            else
                System.out.print(p.id() + ":" + p + " ");
        System.out.println();
    }
}

class Pet {
    private String id;

    public String id() {
        return id;
    }

    public Pet(String name) {
        this.id = name;
    }

    @Override
    public String toString() {
        return "Pet " + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pet pet = (Pet) o;

        return id != null ? id.equals(pet.id) : pet.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}

class Pets {
    public static Pet[] createArray(int i) {
        Pet[] p = new Pet[i];
        for (int j = 0; j < i; j++) {
            p[j] = new Pet(String.valueOf(j));
        }
        return p;
    }
}