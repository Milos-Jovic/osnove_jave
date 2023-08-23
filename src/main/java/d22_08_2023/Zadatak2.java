package d22_08_2023;

import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj: ");
        int broj = s.nextInt();
        int apsolutnaVrednost;


        while (broj != 0) {

            if (broj < 0) {
                apsolutnaVrednost = -broj;
            } else {
                apsolutnaVrednost = broj;
            }

            System.out.println("Apsolutna vrednost broja je:" + apsolutnaVrednost);

            System.out.println("Unesite broj: ");
            broj = s.nextInt();
        }

        System.out.println("Kraj programa jer je uneta nula.");

    }
}
