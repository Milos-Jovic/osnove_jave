package d22_08_2023;

import java.util.Scanner;
import java.util.SortedMap;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.print("Unesite karakter: ");
        String karakter = s.next();
        int brojacL = 0;
        int brojacD = 0;

        while (!karakter.equals("=")) {

            if (karakter.equals("(")) {
                brojacL++;
            } else if (karakter.equals(")")) {
                brojacD++;
            }
            System.out.print("Unesite karakter: ");
            karakter = s.next();

        }

        if (brojacL == brojacD) {
            System.out.println("Zagrade su uparene");
        } else {
            System.out.println("Zagrade nisu uparene");
        }

    }
}
