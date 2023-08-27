package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

//    Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni)
//    i koji menja vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        ArrayList<Integer> broj = new ArrayList<>();
        broj.add(1);
        broj.add(3);
        broj.add(23);
        broj.add(2);
        broj.add(7);
        broj.add(12);
        broj.add(19);
        broj.add(33);
        broj.add(4);
        broj.add(187);

        System.out.println("Unesite poziciju K: ");
        int k = s.nextInt();

        System.out.println("Unesite vrednost: ");
        int vrednost = s.nextInt();

        broj.set(k, vrednost);



    }

}
