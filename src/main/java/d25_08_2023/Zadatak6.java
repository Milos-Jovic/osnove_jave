package d25_08_2023;

import java.util.Scanner;

public class Zadatak6 {

//    Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj M: ");
        int m = s.nextInt();
        System.out.println("Unesite broj N: ");
        int n = s.nextInt();

        System.out.print("Broj celih brojeva: " + brojCelihBrojeva(m, n));

    }
    public static int brojCelihBrojeva (int m , int n){

        int izracunaj = 0;

            for (int i = m; i < n - 1; i++) {
                izracunaj++;
            }

        return izracunaj;
    }
}
