package d24_08_2023;

import java.rmi.UnexpectedException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {

//    Napisati program koji ucitava niz A duzine N i broj X.
//    Nakon unosa treba ispisati indekse onih clanova niza koji su jednaki broju X.

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        ArrayList<Integer> a = new ArrayList<>();

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        for (int i = 0; i < n ; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            a.add(broj);
        }
        System.out.print("Unesite X: ");
        int x = s.nextInt();


        System.out.print("Elementi niza A koji su jednaki broju X imaju indekse:");
        for (int i = 0; i < n ; i++) {

            if (a.get(i) == x){
                System.out.print( i + ", " );
        }


    }

} }
