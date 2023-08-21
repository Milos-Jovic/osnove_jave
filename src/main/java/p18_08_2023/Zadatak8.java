package p18_08_2023;

import java.util.Scanner;

public class Zadatak8 {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        System.out.println("Unesite jacinu zvuka");
        int zvuk = s.nextInt();


        System.out.print("<");


        for (int i = 0; i < zvuk ; i++) {

            if (i == 5) {
                System.out.println("50%");
            }


            System.out.println(" |");

        }




    }



}
