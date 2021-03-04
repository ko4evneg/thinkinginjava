package ch11_holdingyourobjects.exercise4;
//Exercise 4: (3) Create a generator class that produces character names (as String objects) from your favorite movie
//(you can use Snow White or Star Wars as a fallback) each time you call next( ), and loops around to the beginning of
//the character list when it runs out of names. Use this generator to fill an array, an ArrayList, a LinkedList, a
//HashSet, a LinkedHashSet, and a TreeSet, then print each container.

import java.util.*;

import static thinkinginjava.Utils.print;

public class Generator {
    private String[] names = {"Sarah Connor","John Connor","Terminator"};
    private int index = 0;

    public String next(){
        if (names.length == index)
            index = 0;
        return names[index++];
    }

    public static void main(String[] args) {
        int size = 6;
        String[] charArr = new String[size];
        ArrayList<String> charArrayList = new ArrayList<>();
        LinkedList<String> charLinkedList = new LinkedList<>();
        HashSet<String> charHashSet = new HashSet<>();
        LinkedHashSet<String> charLikedHashSet = new LinkedHashSet<>();
        TreeSet<String> charTreeSet = new TreeSet<>();
        Generator
                one = new Generator(),
                two = new Generator(),
                three = new Generator(),
                four = new Generator(),
                five = new Generator(),
                six = new Generator();
        for (int i = 0; i < size; i++) {
            charArr[i] = one.next();
            charArrayList.add(two.next());
            charLinkedList.add(three.next());
            charHashSet.add(four.next());
            charLikedHashSet.add(five.next());
            charTreeSet.add(six.next());
        }

        print(Arrays.toString(charArr));
        print(charArrayList);
        print(charLinkedList);
        print(charHashSet);
        print(charLikedHashSet);
        print(charTreeSet);
    }
}
