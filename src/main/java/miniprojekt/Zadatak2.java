package miniprojekt;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {

//**Zadatak: Simulacija iscrtavanja korisnika na Slacku**
//
//    Napišite program koji simulira prikazivanje korisnika na Slacku. Prikaz korisnika treba da se izvede tako da prvo budu prikazani aktivni korisnici, a potom neaktivni. Program će čuvati sledeće informacije:
//    Niz korisnika - u ovom nizu će biti sačuvani svi korisnici koji imaju pristup Slacku.
//    Niz aktivnosti - svaki korisnik će biti označen kao aktivan ili neaktivan. Informacije o aktivnostima biće čuvane u nizu gde će za svakog korisnika biti zabeleženo da li je trenutno aktivan ili ne  (true ili false)..
//    Naravno, korisnik i njegova aktivnost će biti upareni po istom indeksu. To znači da će se za korisnika na poziciji N u nizu "korisnici" čitati aktivnost sa pozicije N u nizu "aktivnosti".
//
//    Program će ispisivati informacije za svakog korisnika na sledeći način:
//    Za aktivne korisnike:
//            | slika |o Ime Prezime
//    Za neaktivne korisnike:
//            | slika |x Ime Prezime


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<String> korisnici = new ArrayList<>();

        ArrayList<Boolean> aktivnosti = new ArrayList<>();

        System.out.print("Unesite broj korisnika: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Unesite ime korisnika: ");
            String ime = s.next();
            System.out.println("Unesite prezime korisnika: ");
            String prezime = s.next();
            korisnici.add(ime + " " + prezime);

            System.out.println("Unesinte aktivnost: ");
            String aktivnost = s.next();
            aktivnosti.add(Boolean.valueOf(aktivnost));

        }

        for (int i = 0; i < n; i++) {

            if (aktivnosti.get(i)) {
                System.out.println("| slika |o " + korisnici.get(i));
            }


        }

        for (int i = 0; i < n; i++) {
            if (!aktivnosti.get(i)) {
                System.out.println("| slika |x " + korisnici.get(i));
            }

        }

    }

}
