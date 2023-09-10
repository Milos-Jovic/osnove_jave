package d07_09_2023.zadatak4;

public class zadatak4 {

//    Zadatak 4: Kreiranje klase "Film"
//    Napišite klasu "Film" sa atributima: naslov (String), godinaIzdanja (int) i reziser (String).
//    U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti unosom sa tastature. Ispisati informacije o filmovima.
    public static void main(String[] args) {

        Film prviFilm = new Film();
        prviFilm.naslov = "Captain America: The First Avenger";
        prviFilm.godinaIzdanja = 2011;
        prviFilm.reziser = "Kevin Feige";

        Film drugiFilm = new Film();
        drugiFilm.naslov = "Pljacka Treceg rajha";
        drugiFilm.godinaIzdanja = 2004;
        drugiFilm.reziser = "Zdravko Sotra";

        Film treciFilm = new Film();
        treciFilm.naslov = "The Godfather";
        treciFilm.godinaIzdanja = 1972;
        treciFilm.reziser = "Albert S. Ruddy";


        System.out.println("Za film " + prviFilm.naslov + " premijera je bila " + prviFilm.godinaIzdanja + " godine i rezirao ga je " + prviFilm.reziser + ".");
        System.out.println("Za film " + drugiFilm.naslov + " premijera je bila " + drugiFilm.godinaIzdanja + " godine i rezirao ga je " + drugiFilm.reziser + ".");
        System.out.println("Za film " + treciFilm.naslov + " premijera je bila " + treciFilm.godinaIzdanja + " godine i rezirao ga je " + treciFilm.reziser + ".");



    }

}
