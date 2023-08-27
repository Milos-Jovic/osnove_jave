package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//        Napisati program koji ucitava niz A duzine N,
//        i koji nakon unosa niz A stampa sve elemente niza koji su veci od nule.

        ArrayList<Integer> a = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite n: ");
        int n = s.nextInt();

        for (int i = 0; i <n ; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            a.add(broj);

        }
        System.out.print("Brojevi veci od nule u nizu A su: ");
        for (int i = 0; i < n ; i++) {
            if(a.get(i) > 0){
                System.out.print(a.get(i) + ", ");
            }
        }
    }
}
