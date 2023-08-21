package p17_08_2023;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.println("Unesitre broj a: ");
        int a = s.nextInt();
        System.out.println("Unesite broj b: ");
        int b = s.nextInt();
        System.out.println("Unesite broj c: ");
        int c = s.nextInt();


        if (a < 0) {
            System.out.println("A=" + a + ", je nevalidan broj.");
        }
        if (b < 0) {
            System.out.println("B=" + b + ", je nevalidan broj.");
        }
        if (c < 0) {
            System.out.println("C=" + c + ", je nevalidan broj.");
        }

    }
}
