package ch09_interfaces.exercise16;
//Exercise 16: (3) Create a class that produces a sequence of chars. Adapt this class so that it can be an input to a
//Scanner object.

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class CharGen implements Readable{
    private static final char[] chars =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final int CHARSET_LENGTH = chars.length - 1;
    private int count;

    public CharGen(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) {
        Random r = new Random();
        int initCount = count;
        while (count-- > 0) {
            cb.put(chars[r.nextInt(CHARSET_LENGTH)]);
        }
        return initCount; // Number of characters appended
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new CharGen(20));
        while (s.hasNext())
            System.out.println(s.next());
    }
}
