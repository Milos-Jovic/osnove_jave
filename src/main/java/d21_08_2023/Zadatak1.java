package d21_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite n: ");
        int n = s.nextInt();
        int suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("unesi broj: ");
            int broj = s.nextInt();
            if(broj % 2 == 0){
                suma = suma + broj;
            }

        }

        System.out.println(" Suma parnih brojeva je: " + suma);

    }
}
