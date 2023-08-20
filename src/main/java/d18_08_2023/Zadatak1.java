package d18_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        System.out.print("Uneti vrednost x: ");

        int x = s.nextInt();
        int y;

        if (x < 2){
            y = x;
        } else if (2 <= x && x < 10) {

            y = 2;
        } else {
            y = x - 1;
        }

        System.out.println("y = " + y);

    }
}
