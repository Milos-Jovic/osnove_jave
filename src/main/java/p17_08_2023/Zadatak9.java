package p17_08_2023;

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


//        Poredjenje stringova
//            String ime = "Milan";
//            promenljiva.equal("Tekst");
//            promenljiva == "Tekst"


//        Negaija
//        (!if ime.equas("milan"))) {
//            System.out.println("Ime je Milan");
//        }   equals => poredjenje

//        Poredjenje da li se sadrzi nesto iz 2 teksta sto je isto
//                if (email.contains("gmail.com"))
//                  contains => sadrzanje

        System.out.println("POETAK");

        System.out.println("Unesite broj telefona za proveru");
        String telefon = s.next();

        if (!telefon.contains("+381") || telefon.contains("/")) {
            System.out.println("Broj nije validan");
        }

        System.out.println("KRAJ");



    }
}
