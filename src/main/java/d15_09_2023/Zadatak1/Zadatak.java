package d15_09_2023.Zadatak1;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Igrac> igraci = new ArrayList<>();

        Igrac igrac1 = new Igrac("Milos Jovic", "12345","1995",7, "levo krilo" ,false);
        Igrac igrac2 = new Igrac("Stefan Milenkovic", "19172","1995",1, "golman" ,true);

        igrac1.stampaj();
        System.out.println();
        igrac2.stampaj();

        ArrayList<Trener> treneri = new ArrayList<>();

        Trener trener1 = new Trener("Marko Markovic", "5678", "1972",15,"kondicioni");
        Trener trener2 = new Trener("Jovan Jovic", "145755", "1971",22,"personalni");

        trener1.stampaj();
        System.out.println();
        trener2.stampaj();

        System.out.println("Unesite n");
        int n = s.nextInt();

        for (int i = 0; i <n ; i++) {
            System.out.println("Unesite ime i prezime: ");
            String imePrezime = s.next();
            System.out.println("Unesi jmbg: ");
            String jmbg = s.next();
            System.out.println("Unesi godinu: ");
            String godinaRodjenja = s.next();
            System.out.println("Unesi broj igraca");
            int broj = s.nextInt();
            System.out.println("Unesi poziciju");
            String pozicija = s.next();
            System.out.println("Da li je kapiten");
            boolean kapiten = s.nextBoolean();
            Igrac igrac = new Igrac(imePrezime, jmbg, godinaRodjenja, broj,pozicija,kapiten);
            igraci.add(igrac);
        }

        for (int i = 0; i < igraci.size(); i++) {
            igraci.get(i).stampaj();
        }

        System.out.println("Unesite x");
        int x = s.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.println("Unesite ime i prezime: ");
            String imePrezime = s.next();
            System.out.println("Unesi jmbg: ");
            String jmbg = s.next();
            System.out.println("Unesi godinu: ");
            String godinaRodjenja = s.next();
            System.out.println("Unesite godine iskustva: ");
            int iskustvo = s.nextInt();
            System.out.println("Unesite tip Trenera: ");
            String tip = s.next();
            Trener trener = new Trener(imePrezime, jmbg, godinaRodjenja,iskustvo, tip);
            treneri.add(trener);
        }

        for (int i = 0; i < treneri.size(); i++) {
            treneri.get(i).stampaj();
        }

    }
}
