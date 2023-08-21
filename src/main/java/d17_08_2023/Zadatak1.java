package d17_08_2023;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {


//        Napisati program koji ima informacije koje ucitava informacije sa tastature:
//                Ime
//                Prezime
//                godinu rodjenja



        Scanner s = new Scanner(System.in);

        System.out.println("Unesite Ime : ");
        String ime = s.next();
        System.out.println("Unesite prezime : ");
        String prezime = s.next();
        System.out.println("Unesite godinu rodjenja : ");
        String godinaRodjenja = s.next();

        System.out.println(ime + " " + prezime + " - " + godinaRodjenja + " god");


    }


}
