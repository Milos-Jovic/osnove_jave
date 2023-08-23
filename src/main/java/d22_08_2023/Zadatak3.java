package d22_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);




        System.out.print("Unesite broj: ");
        String rBroj = s.next();


        while (!rBroj.equals("KRAJ")){

            if (rBroj.equals("I")) {
                System.out.println("Arapski: 1");
            } else if (rBroj.equals("V")) {
                System.out.println("Arapski: 5");
            } else if (rBroj.equals("X")) {
                System.out.println("Arapski: 10");
            } else if (rBroj.equals("L")) {
                System.out.println("Arapski: 50");
            } else if (rBroj.equals("C")) {
                System.out.println("Arapski: 100");
            } else if (rBroj.equals("D")) {
                System.out.println("Arapski: 500");
            } else if (rBroj.equals("M")) {
                System.out.println("Arapski: 1000");
            }
            System.out.print("Unesite broj: ");
            rBroj = s.next();
        }


        System.out.println("Kraj programa");

    }
}
