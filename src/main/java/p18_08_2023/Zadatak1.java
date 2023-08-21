package p18_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


//        int a = 10;
//
//        String akcija = "povecaj";
//
//        if (akcija.equals("povecaj")){
//            a = a + 10;
//        }



        System.out.println("Unesite N:");
        int n = s.nextInt();

        System.out.println("Unesite akciju:");
        String akcija = s.next();

            if (akcija.equals("uvecaj")) {
                n = n + 1;
            }

            if (akcija.equals("smanji")) {
                n = n - 1;
            }

        System.out.println("N: " + n);




    }
}
