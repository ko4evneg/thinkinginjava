package ch11_holdingyourobjects.exercise26;
//Exercise 25: (3) Create a Map<String,ArrayList<Integer>>. Use net.mindview.TextFile to open a text file and read it in
//a word at a time (use "\\W+" as the second argument to the TextFile constructor). Count the words as you read them in,
//and for each word in the file, record in the ArrayList<Integer> the word count associated with that word—this is, in
//effect, the location in the file where that word was found.

//Exercise 26: (4) Take the resulting Map from the previous exercise and re-create the order of the words as they a
//appeared in the original file.
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static thinkinginjava.util.Utils.print;

public class TextWrite {
    private static final String toAnalysis = "Create a Set of the vowels. Count and display the number of vowels.";
    private static Map<String, ArrayList<Integer>> map = new LinkedHashMap<>();

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[^\\s]+");
        Matcher matcher = pattern.matcher(toAnalysis);
        int i = 1;
        while (matcher.find()) {
            String currentWord = matcher.group();
            if (map.containsKey(currentWord)) {
                ArrayList<Integer> temp = map.get(currentWord);
                temp.add(i++);
                map.put(currentWord, temp);
            } else
            map.put(currentWord, new ArrayList<>(List.of(i++)));
        }
        //Restore:
        StringBuilder result = new StringBuilder("");
        print(result);
        Map<Integer, String> resultMap = new TreeMap<>();
        for (Map.Entry<String, ArrayList<Integer>> entry : map.entrySet()) {
            for (Integer integer : entry.getValue()) {
                resultMap.put(integer, entry.getKey());
            }
        }
        for (Map.Entry<Integer, String> e : resultMap.entrySet()) {
            result.append(e.getValue() + " ");
        }
        print(result.deleteCharAt(result.lastIndexOf(" ")));
    }
}
