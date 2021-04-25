package ch11_holdingyourobjects.exercise22;
//Exercise 21: (3) Using a Map<String,Integer>, follow the form of UniqueWords.java to create a program that counts the
//occurrence of words in a file. Sort the results using Collections.sort( ) with a second argument of
//String.CASE_INSENSITIVE_ORDER (to produce an alphabetic sort), and display the result.

//Exercise 22: (5) Modify the previous exercise so that it uses a class containing a String and a count field to store
//each different word, and a Set of these objects to maintain the list of words.

import java.util.*;

import static thinkinginjava.util.Utils.print;

public class WordsCount {
    private static TreeSet<Word> words = new TreeSet<>();
    private static final String toAnalysis = "Create a Set of the vowels. Count and display the number of vowels.".toLowerCase();

    public static void main(String[] args) {
        evaluateString(toAnalysis);
        for (Word word : words) {
            print(word.word + ": " + word.count);
        }
    }

    private static void evaluateString(String s) {
        String[] strs = s.split(" ");
        for (int i = 0; i < strs.length; i++) {
            Word currentWord = new Word(strs[i]);
            if (words.contains(currentWord)){
                for (Word word : words) {
                    if (word.equals(currentWord)) {
                        currentWord.count = word.count + 1;
                        break;
                    }
                }
            }
            words.remove(currentWord);
            words.add(currentWord);
        }
    }

    private static class Word implements Comparable {
        String word;
        int count = 1;

        public Word(String word) {
            this.word = word;
        }

        @Override
        public int compareTo(Object o) {
            Word word1 = (Word) o;
            return word.compareTo(word1.word);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Word word1 = (Word) o;

            return word != null ? word.equals(word1.word) : word1.word == null;
        }

        @Override
        public int hashCode() {
            return word != null ? word.hashCode() : 0;
        }
    }
}

