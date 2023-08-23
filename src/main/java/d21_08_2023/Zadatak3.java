package d21_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.println("Unesite n: ");
        int n = s.nextInt();
        int brojac = 0;

        for (int i = 0; i < n; i++) {

            System.out.println("unesite rec: ");
            String rec = s.next();

            if(rec.contains("!")) {
                System.out.println(rec);
                brojac++;
            } else {
               rec = rec.concat("!");
                System.out.println(rec);

            }


        }
        float nivoAgresivnosti =  (float) brojac / n * 100;
        System.out.println("Nivo agresivnosti je: " + nivoAgresivnosti);
        System.out.println(brojac);

    }
}
