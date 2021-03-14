package ch11_holdingyourobjects.exercise30;
//Exercise 30: (5) Modify CollectionSequence.java so that it does not inherit from AbstractCollection, but instead
//implements Collection.

import java.util.*;

import static thinkinginjava.Utils.print;

public class CollectionSequence implements Collection {
    private Pet[] pets = Pets.createArray(8);

    public int size() {
        return pets.length;
    }

    @Override
    public boolean isEmpty() {
        return pets.length == 0 ? true : false;
    }

    @Override
    public boolean contains(Object o) {
        return new ArrayList<Pet>(Arrays.asList(pets)).contains(o);
    }

    @Override
    public Object[] toArray() {
        return pets;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return pets;
    }

    @Override
    public boolean add(Object o) {
        if (!(o instanceof Pet))
            throw new ClassCastException();
        int nextIndex = pets.length;
        Pet[] tempPets = new Pet[pets.length + 1];

        if (pets[pets.length - 1] != null) {
            for (int i = 0; i < pets.length; i++) {
                tempPets[i] = pets[i];
            }
        }
        tempPets[pets.length] = (Pet) o;
        pets = tempPets;
        return this.contains(o);
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < pets.length; i++) {
            if (pets[i].equals((Pet) o))
                pets[i] = null;
        }
        return this.contains(o);
    }

    @Override
    public boolean containsAll(Collection c) {
        return Arrays.asList(pets).containsAll(c);
    }

    @Override
    public boolean addAll(Collection c) {
        ArrayList<Pet> petsList = new ArrayList<>(Arrays.asList(pets));
        petsList.addAll(c);
        pets = petsList.toArray(pets);
        return containsAll(c);
    }

    @Override
    public boolean removeAll(Collection c) {
        for (int i = 0; i < pets.length; i++) {
            if (pets[i] == null)
                 continue;
            for (Object pet : c) {
                Pet p;
                if (pet instanceof Pet)
                    p = (Pet) pet;
                else
                    throw new ClassCastException();
                if (pets[i].equals(p)) {
                    pets[i] = null;
                    break;
                }
            }
        }
        return this.containsAll(c);
    }

    @Override
    public boolean retainAll(Collection c) {
        List<Pet> petList = new ArrayList<>(Arrays.asList(pets));
        boolean result = petList.retainAll(c);
        pets = new Pet[petList.size()];
        pets = petList.toArray(pets);
        return result;
    }

    @Override
    public void clear() {
        for (int i = 0; i < pets.length; i++) {
            pets[i] = null;
        }
    }

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

    public static void main(String[] args) {
        CollectionSequence c = new CollectionSequence();
        c.retainAll(List.of(new Pet(String.valueOf(2)), new Pet(String.valueOf(4))));
        //c.addAll(List.of(new Pet("Bobik"),new Pet("Sharik")));
        display(c);
        display(c.iterator());
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