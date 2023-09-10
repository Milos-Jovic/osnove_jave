package d07_09_2023.zadatak5;

import java.util.Scanner;

public class zadatak5 {

//    Zadatak 5: Kreiranje klase "Oprema"
//    Napišite klasu "Oprema" sa atributima: tip (String), marka (String) i cena (double).
//    U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti unosom sa tasture. Ispisati informacije o opremi.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Oprema patike = new Oprema();
        System.out.println("Unesite koji tip patika zelite: ");
        patike.tip = s.next();
        System.out.println("Unesite marku patika: ");
        patike.marka = s.next();
        System.out.println("Unesite cenu patika: ");
        patike.cena = s.nextDouble();

        Oprema rukavice = new Oprema();
        System.out.println("Unesite koji tip rukavica zelite: ");
        rukavice.tip = s.next();
        System.out.println("Unesite marku rukavica: ");
        rukavice.marka = s.next();
        System.out.println("Unesite cenu rukavica: ");
        rukavice.cena = s.nextDouble();


        Oprema ranac = new Oprema();
        System.out.println("Unesite koji tip ranca zelite: ");
        ranac.tip = s.next();
        System.out.println("Unesite marku ranca: ");
        ranac.marka = s.next();
        System.out.println("Unesite cenu ranca: ");
        ranac.cena = s.nextDouble();


        System.out.println("Patike za " + patike.tip + " marke " + patike.marka + " su placene " + patike.cena + " dinara.");
        System.out.println("Rukavice za " + rukavice.tip + " marke " + rukavice.marka + " su placene " + patike.cena + " dinara.");
        System.out.println("Ranac za " + ranac.tip + " marke " + ranac.marka + " je placen " + patike.cena + " dinara.");
    }
}
