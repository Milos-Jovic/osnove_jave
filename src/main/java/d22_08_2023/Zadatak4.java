package d22_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        int brojDvojki = 0;
        int brojJedinica = 0;

        while (brojDvojki < 2 && brojJedinica < 3) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();

            if (broj == 2) {
                brojDvojki++;

            } else if (broj == 1) {
                brojJedinica++;

            }
        }

        System.out.println("Kraj programa, uneli ste dve dvojke ili tri jedinice");

    }
}
