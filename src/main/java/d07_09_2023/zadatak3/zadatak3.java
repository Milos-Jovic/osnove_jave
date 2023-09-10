package d07_09_2023.zadatak3;

public class zadatak3 {

//    Zadatak 3: Kreiranje klase "Proizvod"
//    Napišite klasu "Proizvod" sa atributima: naziv (String) i cena (double).
//    U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti. Ispisati informacije o proizvodima.



    public static void main(String[] args) {

    Proizvod prviProizvod = new Proizvod();
    prviProizvod.naziv = "Asus";
    prviProizvod.cena = 173512;

    Proizvod drugiProizvod = new Proizvod();
    drugiProizvod.naziv = "Slusalice";
    drugiProizvod.cena = 4611;

    Proizvod treciProizvod = new Proizvod();
    treciProizvod.naziv = "Mis";
    treciProizvod.cena = 3200;

        System.out.println(prviProizvod.naziv + " laptop je placen " + prviProizvod.cena + " dinara.");
        System.out.println(drugiProizvod.naziv + " za laptop su placene " + drugiProizvod.cena + " dinara.");
        System.out.println(treciProizvod.naziv + " za laptop je placen " + treciProizvod.cena + " dinara.");
    }
}
