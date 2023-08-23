package d21_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesi n: ");
        int n = s.nextInt();

        int likeBrojac = 0;
        int smileBrojac = 0;
        int heartBrojac = 0;

        for (int i = 0; i <n ; i++) {
            System.out.println("Unesi reakciju: ");
            String rec = s.next();

            if(rec.equals("like")){
                likeBrojac++;
            } else if (rec.equals("smile")) {
                smileBrojac++;
            } else if (rec.equals("heart")) {
                heartBrojac++;
            }


        }

        System.out.println("Sumery: like " + likeBrojac + "| smile " + smileBrojac + "| heart " + heartBrojac + "|");




    }
}
