package ch11_holdingyourobjects.exercise21;
//Exercise 21: (3) Using a Map<String,Integer>, follow the form of UniqueWords.java to create a program that counts the
//occurrence of words in a file. Sort the results using Collections.sort( ) with a second argument of
//String.CASE_INSENSITIVE_ORDER (to produce an alphabetic sort), and display the result.

import java.util.*;

import static thinkinginjava.util.Utils.print;

public class WordsCount {
    private static Map<String, Integer> words = new LinkedHashMap<>();
    private static Map<String, Integer> sortedWords = new LinkedHashMap<>();
    private static final String toAnalysis = "Create a Set of the vowels. Count and display the number of vowels.".toLowerCase();

    public static void main(String[] args) {
        evaluateString(toAnalysis);
        print(words);
        print(sortedWords);
    }

    private static void evaluateString(String s) {
        String[] strs = s.split(" ");
        for (int i = 0; i < strs.length; i++) {
            words.put(strs[i], words.getOrDefault(strs[i], 0) + 1);
        }
        List<String> entries = new LinkedList<>(words.keySet());
        Collections.sort(entries, String.CASE_INSENSITIVE_ORDER);
        for (String str : entries) {
            sortedWords.put(str, words.get(str));
        }
    }
}

