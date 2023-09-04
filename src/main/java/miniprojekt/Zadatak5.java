package miniprojekt;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak5 {

//        **Zadatak: Generisanje Random Passworda sa Specijalnim Karakterom**
//        Kako biste saznali više o generisanju random brojeva u programiranju, preporučujemo da istražite sledeći link: random koristeci Random class. Ovaj resurs će vam pružiti detaljnije razumevanje kako programi generišu slučajne brojeve i kako ih možete koristiti u različitim situacijama.
//        Napišite program koji simulira automatsko generisanje random passworda. Korisnik će uneti željenu dužinu passworda, a program će kreirati i ispisati password koji zadovoljava te parametre. Ovaj zadatak zahteva implementaciju različitih metoda za generisanje karaktera i passworda.
//                generisiRandomKarakter: Ova metoda generiše i vraća random karakter. Metoda koristi niz stringova sa elementima koji predstavljaju mala slova, velika slova i brojeve (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao povreatnu vrednost (string). Ova metoda nema ulazne parametre.
//        generisiRandomSpecijalanKarakter: Ova metoda generiše i vraća random specijalan karakter. Metoda koristi niz stringova sa elementima `@`, `#`, `&`, `*` i `!` (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao string. Ova metoda nema ulazne parametre.
//               Napomena: Metode generisiRandomSpecijalanKarakter generisiRandomKarakter nemaju nikakvu stampu u sebi!
//                Glavni program:
//        - Korisnik unosi dužinu passworda i informaciju da li treba sadržati specijalan karakter.
//                - Koristeći metodu `generisiPassword`, program generiše i ispisuje password.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite dužinu passworda: ");
        int n = s.nextInt();
        System.out.println("Da li želite da sadrži specijalan karakter: ");
        boolean specijalanKarakter = s.nextBoolean();
        String password = "";

        for (int i = 0; i < n - 1; i++) {
            password = password + generisiRandomKarakter();
        }

        if (specijalanKarakter) {
            password = password + generisiRandomSpecijalanKarakter();
        } else {
            password = password + generisiRandomKarakter();
        }

        System.out.println("Generisan password: " + password);

    }

    public static char generisiRandomKarakter() {


        ArrayList<Character> karakter = new ArrayList<>();

        karakter.add('A');
        karakter.add('X');
        karakter.add('R');
        karakter.add('D');
        karakter.add('F');
        karakter.add('q');
        karakter.add('w');
        karakter.add('o');
        karakter.add('m');
        karakter.add('y');
        karakter.add('3');
        karakter.add('7');
        karakter.add('9');
        karakter.add('1');
        karakter.add('5');

        Random random = new Random();
        return karakter.get(random.nextInt(karakter.size()));

    }

    public static char generisiRandomSpecijalanKarakter() {


        ArrayList<Character> specijalni = new ArrayList<>();

        specijalni.add('@');
        specijalni.add('#');
        specijalni.add('&');
        specijalni.add('*');
        specijalni.add('i');
        specijalni.add('!');

        Random random = new Random();
        return specijalni.get(random.nextInt(specijalni.size()));


    }

}
