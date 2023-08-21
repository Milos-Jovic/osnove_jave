package p17_08_2023;

import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.println("Unesite dan: ");
        int dan = s.nextInt();
        System.out.println("Unesite mesec: ");
        int mesec = s.nextInt();
        System.out.println("Unesite godinu: ");
        int godina = s.nextInt();


        System.out.println(dan + " - " + mesec + " - " + godina);

    }

}
