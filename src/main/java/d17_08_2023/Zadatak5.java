package d17_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        System.out.println("Unesite a :");
        int a = s.nextInt();
        System.out.println("Unesite b :");
        int b = s.nextInt();
        System.out.println("Unesite operator");
        String operator = s.next();

        int rezultat = 0;

        if (operator.equals("+")){
            rezultat = a + b;
        } else if (operator.equals("-")) {
            rezultat = a - b;
        } else if (operator.equals("*")) {
            rezultat = a * b;
        } else if (operator.equals("/")) {
            rezultat = a / b;
        }

        System.out.println("Rezultat:" + rezultat);
    }
}
