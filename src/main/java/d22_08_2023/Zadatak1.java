package d22_08_2023;

import java.util.Scanner;

public class Zadatak1 {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int suma = 0;

        System.out.print("Unesite broj: ");
        int broj = s.nextInt();

        while (suma + broj <= 100) {

            suma = suma + broj;

            System.out.print("Unesite broj: ");
            broj = s.nextInt();

        }

        System.out.println("Prekoracenje! Kraj programa. Scaunata suma je: " + suma);

    }


}
