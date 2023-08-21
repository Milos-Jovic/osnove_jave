package d18_08_2023;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadatak2 {

//    Napisati program koji simulira stampanje ocitane licne karte u vise primeraka.
//    Korisnik unosi podatke :
//              ime
//              prezime
//              jmbg
//              broj primeraka za stampu





    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        System.out.print("Unesite ime: ");
        String ime = s.next();
        System.out.print("Unesite prezime: ");
        String prezime = s.next();
        System.out.print("Unesite JMBG: ");
        String jmgb = s.next();
        System.out.print("Unesite broj primeraka za stampu: ");
        int brPrimeraka = s.nextInt();

        for (int i = 1; i <=3; i++ ) {

            System.out.println("Ime i prezime : " + ime + " " + prezime);
            System.out.println("JMBG : " + jmgb);
        }





    }
}
