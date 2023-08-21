package p17_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite br. a: ");
        double a = s.nextDouble();
        System.out.print("Unesite br. b: ");
        double b = s.nextDouble();
        System.out.print("Unesite br. c: ");
        double c = s.nextDouble();

        double avg = (a + b + c) / 3;

        System.out.println("Srednja vrednost je: " + avg);




    }
}
