package d25_08_2023;

import java.util.Scanner;

public class Zadatak7 {
//       Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
//    U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite prvi broj");
        int broj1 = s.nextInt();
        System.out.println("Unesite drugi broj");
        int broj2 = s.nextInt();
        System.out.println("Unesite treci broj");
        int broj3 = s.nextInt();


        System.out.println("Najmanji broj je " + minimum(broj1, broj2, broj3));
    }


    public static int minimum(int br1, int br2, int br3) {

        int min = br1;
            if (br2 < min) {
                min = br2;
            }
            if (br3 < min){
                min = br3;
            }
                return min;
    }


}