package p18_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.println("Unesite N:");
        int n = s.nextInt();

        if (n < 10) {
            System.out.println("Broj je jednocifren.");
        } else if (n < 100) {
            System.out.println("Broj je jednocifren.");
        } else if (n >= 100 && n < 1000) {
            System.out.println("Broj je jednocifren.");
        } else {
            System.out.println("Broj je visecifren.");
        }



    }
}
