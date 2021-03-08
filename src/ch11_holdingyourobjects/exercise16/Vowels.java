package ch11_holdingyourobjects.exercise16;
//Exercise 16: (5) Create a Set of the vowels. Working from UniqueWords.Java, count and display the number of vowels in
//each input word, and also display the total number of vowels in the input file.

import java.util.*;

import static thinkinginjava.Utils.print;

public class Vowels {
    private static final String[] VOWELS = "A, E, I, O, U, Y".toLowerCase().split(", ");
    private static final Set<String> VOWELS_SET = new HashSet<>(Arrays.asList(VOWELS));
    private static final String toAnalysis = "Create a Set of the vowels. Count and display the number of vowels.".toLowerCase();

    public static void main(String[] args) {
        for (String s : evaluateString(toAnalysis)) {
            print(s);
        }
    }

    private static List<String> evaluateString(String s) {
        List<String> result = new LinkedList<>();
        String[] strings = s.split(" ");
        int totalVowelsCount = 0;
        for (String str : strings) {
            int vowelsCount = 0;
            for (int i = 0; i < str.length(); i++) {
                if (VOWELS_SET.contains(str.substring(i, i + 1))) {
                    vowelsCount++;
                    totalVowelsCount++;
                }
            }
            result.add(String.format("%-8s:%d/%d", str, vowelsCount, totalVowelsCount));
        }
        result.add("\nTotal:" + ": " + totalVowelsCount);
        return result;
    }


}
