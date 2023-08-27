package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {


//    Napisati program koji ucitava N brojeva i smesta ih u niz.
//        Zatim, iz niza, broji koliko je parnih brojeva uneto. brojeve unosi korisnik.

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        ArrayList<Integer> brojevi = new ArrayList<>();

        System.out.println("Unesite N: ");
        int nBrojeva = s.nextInt();
        int parni = 0;

        for (int i = 0; i < nBrojeva; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            brojevi.add(broj);
        }

        for (int i = 0; i <brojevi.size() ; i++) {

            if(brojevi.get(i) % 2 == 0){
                parni++;
            }

        }


        System.out.println("Broj parnih brojeva:" + parni);


    }

}
