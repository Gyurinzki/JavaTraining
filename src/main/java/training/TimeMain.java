package training;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TimeMain {

    public static void main(String[] args) {

        System.out.println("write a date");
        Scanner scanner = new Scanner(System.in);
        int ora = scanner.nextInt();
        int perc = scanner.nextInt();
        int masodperc = scanner.nextInt();
        System.out.println("Ido = " + ora + ":" + perc + ":" + masodperc);


        System.out.println("write a date");
        int kora = scanner.nextInt();
        int kperc = scanner.nextInt();
        int kmasodperc = scanner.nextInt();
        System.out.println("Ido = " + kora + ":" + kperc + ":" + kmasodperc);

        System.out.println("write a date");
        int elso = scanner.nextInt();
        System.out.println("write a date");
        int masodik = scanner.nextInt();

        // HH:mm:ss format
        System.out.print("Enter time:");
        String input = scanner.nextLine();

        String[] timeParts = input.split(":");

        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);
        int seconds = Integer.parseInt(timeParts[2]);

        System.out.println(ora < kora || (ora == kora && perc < kperc) ? "Az elso korabbi mint a második" : "A masodik korabbi mint az elso");
        System.out.println(elso < masodik  ? "Az elso korabbi mint a második" : "A masodik korabbi mint az elso");

    }

}
