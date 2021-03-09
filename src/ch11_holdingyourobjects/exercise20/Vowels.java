package ch11_holdingyourobjects.exercise20;
//Exercise 16: (5) Create a Set of the vowels. Working from UniqueWords.Java, count and display the number of vowels in
//each input word, and also display the total number of vowels in the input file.

//Exercise 20: (3) Modify Exercise 16 so that you keep a count of the occurrence of each vowel.

import java.util.*;

import static thinkinginjava.Utils.print;

public class Vowels {
    private static final String[] VOWELS = "A, E, I, O, U, Y".toLowerCase().split(", ");
    private static final Set<String> VOWELS_SET = new HashSet<>(Arrays.asList(VOWELS));
    private static Map<String, Integer> vowelsCount = new HashMap<>();
    private static final String toAnalysis = "Create a Set of the vowels. Count and display the number of vowels.".toLowerCase();

    public static void main(String[] args) {
        evaluateString(toAnalysis);
        print(vowelsCount);
    }

    private static void evaluateString(String s) {
        for (int i = 0; i < s.length(); i++) {
            String currentLetter = s.substring(i, i + 1);
            if (VOWELS_SET.contains(currentLetter)) {
                vowelsCount.put(currentLetter, vowelsCount.getOrDefault(currentLetter, 0) + 1);
            }
        }
    }


}
