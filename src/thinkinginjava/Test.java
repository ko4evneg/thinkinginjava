package thinkinginjava;

import ch13_strings.exercise6.StringFormat;

import java.util.*;

import static thinkinginjava.Utils.print;
import static thinkinginjava.Utils.printf;

// An exception that reports through a Logger.
import java.util.logging.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String s = "abctestabcabcdeabc";
        //Greedy:
        Pattern.matches("abc+",s);

    }
    }
