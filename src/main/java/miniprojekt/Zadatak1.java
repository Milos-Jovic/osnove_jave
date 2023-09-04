package miniprojekt;

import java.util.Scanner;

public class Zadatak1 {
//    **Zadatak: Simulacija skidanja tekstualnog fajla**
//    Napišite program koji simulira proces skidanja tekstualnog fajla. Skidanje fajla se obavlja u paketima od po 5 karaktera.
//    Pretpostavljamo da korisnik unosi podatke u skladu sa sledećim zahtevima:
//    Korisnik unosi veličinu fajla u bajtovima, pri čemu svaki karakter zauzima 1 bajt.
//    Ako broj karaktera u fajlu nije deljiv sa 5, poslednji paket će sadržati manje od 5 karaktera.
//    Korisnik će biti upitan za podatke svakog paketa kroz for petlju.
//    Nakon unosa svakog paketa, program treba da prikaže procenat trenutno skinutog fajla.
//    Na programu je da odredi koliko paketa je potrebno za ceo fajl.
//    Na kraju programa, ispišite sadržaj celog fajla.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite velicinu fajla: ");
        int velicinaFajla = s.nextInt();
        int brojIteracija = 0;
        String fajl = "";

        if (velicinaFajla % 5 == 0) {
            brojIteracija = velicinaFajla / 5;
        } else {
            brojIteracija = velicinaFajla / 5 + 1;
        }


        for (int i = 0; i < brojIteracija; i++) {
            System.out.print("Unesite paket: ");
            String paket = s.next();
            fajl = fajl.concat(paket);
            System.out.println("Skinuto " + String.format("%.1f", (double) fajl.length() / velicinaFajla * 100));

        }
        System.out.println("Sadrzaj fajla je: " + fajl);

    }
























}
