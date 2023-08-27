package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

//        Napisati progam koji stampa niz u obrnutom redosledu tj. od zadnjeg elementa do nultog.
//         Ako je niz 1,2,4,5,7, stampa se 7,5,4,2,1

        Scanner s = new Scanner(System.in);
        ArrayList<Integer> niz = new ArrayList<>();

        System.out.println("Unesite n: ");
        int n = s.nextInt();


        for (int i = 0; i < n ; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            niz.add(broj);

        }

        for (int i = niz.size()-1; i >=0 ; i--) {
            System.out.print(niz.get(i)+", ");

    }

}
}
