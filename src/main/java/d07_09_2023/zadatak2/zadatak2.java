package d07_09_2023.zadatak2;

public class zadatak2 {

//    Zadatak 2: Kreiranje klase "Automobil"
//    Napišite klasu "Automobil" sa atributima: marka (String), model (String) i godinaProizvodnje (int).
//    U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti. Ispisati informacije o automobilima.

    public static void main(String[] args) {

        Automobil prviAutomobil = new Automobil();
        prviAutomobil.marka = "Ford";
        prviAutomobil.model = "Fiesta";
        prviAutomobil.godinaProizvodnje = 2005;

        Automobil drugiAutomobil = new Automobil();
        drugiAutomobil.marka = "Dacia";
        drugiAutomobil.model = "Stepway";
        drugiAutomobil.godinaProizvodnje = 2023;

        Automobil treciAutomobil = new Automobil();
        treciAutomobil.marka = "Mercedes";
        treciAutomobil.model = "Benz A 180";
        treciAutomobil.godinaProizvodnje = 2011;

        System.out.println(prviAutomobil.marka + " " + prviAutomobil.model + " automobil je proizveden " + prviAutomobil.godinaProizvodnje);
        System.out.println(drugiAutomobil.marka + " " + drugiAutomobil.model + " automobil  je proizveden " + drugiAutomobil.godinaProizvodnje);
        System.out.println(treciAutomobil.marka + " " + treciAutomobil.model + " automobil  je proizveden " + treciAutomobil.godinaProizvodnje);
    }
}
