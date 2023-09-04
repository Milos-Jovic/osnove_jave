package miniprojekt;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
//    **Zadatak: Zamena Placeholdera u SQL Upitu**
//    Napišite program koji obavlja zamenu placeholdera u SQL upitu.Za rešenje ovog zadatka,
//    biće potrebno upoznati se sa upotrebom `replace` metode koju pruža `String` klasa u Javi.
//    Program će sačuvati sledeće informacije:
//
//            1. SQL upit (string) nad kojim će se obaviti zamena.
//            2. Niz vrednosti (niz stringova) koje treba da se ubace umesto placeholdera u SQL upitu.
//
//    Placeholder je označeno mesto u stringu na kom treba da se postavi prava vrednost iz niza vrednosti.
//    Placeholderi su označeni kombinacijom `%` i pozicijom za zamenu. Na primer, ukoliko SQL upit izgleda ovako:
//    INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country) VALUES ('%0', '%1', '%2', '%3', '%4', '%5');
//    i niz vrednosti je:
//    Cardinal, Tom B. Erichsen, Skagen 21, Stavanger, 4006, Norway
//    Nakon izvršenja zamene, dobiće se SQL upit:
//    INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country) VALUES ('Cardinal','Tom B. Erichsen','Skagen 21','Stavanger','4006','Norway');
//    Ovaj program koristi `replace` metodu da zameni placeholder pozicije u SQL upitu sa stvarnim vrednostima iz niza.

    public static void main(String[] args) {

        ArrayList<String> vrednosti = new ArrayList<>();

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite n: ");
        int n = s.nextInt();
        s.nextLine();

        //"INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country) VALUES ('%0', '%1', '%2', '%3', '%4', '%5');"
        System.out.print("Unesite upit: ");
        String sqlUpit = s.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("Unesite vrednost: ");
            String vrednost = s.nextLine();
            vrednosti.add(vrednost);

        }

        for (int i = 0; i < vrednosti.size(); i++) {

            sqlUpit = sqlUpit.replace("%" + i, vrednosti.get(i));
        }

        System.out.println(sqlUpit);



























    }

}



