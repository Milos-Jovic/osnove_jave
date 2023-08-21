package p17_08_2023;


import java.util.Scanner;

public class Zadatak10 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesitre broj a: ");
        int a = s.nextInt();
        System.out.println("Unesite broj b: ");
        int b = s.nextInt();
        System.out.println("Unesite broj c: ");
        int c = s.nextInt();

        if( a * a + b * b == c * c ) {
            System.out.println("Trougao je pravougli.");
        } else {
            System.out.println("Trougao nije pravougli.");
        }


        System.out.println("KRAJ");

             }


    }



