package ch04_controllingexecution.exercise7;
//Exercise 7: (1) Modify Exercise 1 so that the program exits by using the break keyword at value 99.
//Try using return instead.
import static thinkinginjava.util.Utils.print;

public class Exercise7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100 ; i++) {
            if (i == 99)
                break;
            print(i);
        }
    }
}
