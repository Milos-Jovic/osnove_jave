package d25_08_2023;

import java.util.Scanner;

public class Zadatak5 {

//    Napisati funkciju koja vrsi konverziju eura u dinare,
//    rublje ili dolare prema dole navedenoj konverziji.
//    Metoda od parametara prima vrednost u eurima kao i valutu u kojoj je potrebno izvrsiti konverziju (RSD/USD/RUB) a vraca konvertovanu vrednost.
//    U glavnom programu pozvati funkciju za neki od primera.

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite sumu u eurima: ");
        double eur = s.nextDouble();

        System.out.println("Unesite valutu za konverziju: ");
        String valuta = s.next();

        System.out.println(konverter(eur, valuta));

    }

        public static double konverter(double suma, String valuta) {

            double konverterSume = 0;
            if (valuta.equals("RSD")) {
                konverterSume = suma * 117.5;
            } else if (valuta.equals("USD")) {
                konverterSume = suma * 1.1;
            } else {
                konverterSume = suma * 62.98;
            }
                return konverterSume;

        }

}
