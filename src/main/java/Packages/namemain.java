package Packages;


import java.util.Scanner;

public class namemain {

    public static void main(String[] args) {
        prefix prefix  = new prefix("Dr.");
        firstname firstname = new firstname("Laszlo");
        lastname lastname = new lastname("Gyüre");

        System.out.println(prefix.getPre());
        System.out.println(firstname.getFirst());
        System.out.println(lastname.getLast());
        System.out.println(prefix.getPre() + " " + firstname.getFirst() + " " + lastname.getLast());

    }
}
