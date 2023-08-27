package d25_08_2023;

import java.util.Scanner;

public class Zadatak4 {

//    Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite n: ");
        int n = s.nextInt();
        System.out.println("Unesi karakter");
        String k = s.next();

        stampa(n, k);



    }
    public static void stampa(int n, String k ){

        for (int i = 0; i <n ; i++) {
            System.out.print(k);
        }
    }
}
