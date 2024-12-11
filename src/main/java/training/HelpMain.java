package training;

import java.util.Scanner;

public class HelpMain {

    public static void main(String[] args) {
        Help help = new Help("John Doe", 1980);

        System.out.println(help.getName());
        System.out.println(help.getYearOfBirth());

        System.out.println("write a date");
        Scanner scanner = new Scanner(System.in);
        int ora = scanner.nextInt();
        int perc = scanner.nextInt();
        int masodperc = scanner.nextInt();
        System.out.println("Ido = " + ora + ":" + perc + ":" + masodperc);

    }
}
