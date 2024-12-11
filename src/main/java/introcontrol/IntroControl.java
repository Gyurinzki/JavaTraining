package introcontrol;

import java.util.Random;
import java.util.Scanner;

public class IntroControl {

    public static void main(String[] args) {
        int x = new Random().nextInt(1000);
        if ((x % 2) == 0) {
            System.out.println("Even:" + x);
        }
        else {
            System.out.println("Odd:" + x);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }




        for (int v = 0; v < 10; v++) {
            System.out.println("write the number of visitors:");
            Scanner scanner = new Scanner(System.in);
            int visitors = scanner.nextInt();
            if (visitors <= 2) {
                System.out.println("Take the small one");
            }
            if (visitors == 3) {
                System.out.println("Take the middle one");
            }
            if (visitors == 5) {
                System.out.println("Take the big one");
            }
            if (visitors > 3 && visitors < 5) {
                System.out.println("Take the big one");
            }
            if (visitors > 5 && visitors <= 8) {
                System.out.println("Take the big one and the small one");
            }
            if (visitors > 8) {
                System.out.println("Take all of them");
            }
        }

    }
}