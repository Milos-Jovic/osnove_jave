package d17_08_2023;

import java.awt.*;
import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        System.out.println("Unesite broj a");
        int a = s.nextInt();
        System.out.println("Unesite broj b (1 ili 2)");
        int b = s.nextInt();

        if (b == 1) {
            a = a + 10;
        }

        if (b == 2) {
            a = a + 20;
        }

        System.out.println("Nova vrednost za a je :" + a);

    }


}
