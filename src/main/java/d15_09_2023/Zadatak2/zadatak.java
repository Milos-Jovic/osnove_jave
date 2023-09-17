package d15_09_2023.Zadatak2;

public class zadatak {
    public static void main(String[] args) {


        Igrac igrac = new Igrac("Milos Jovic", "1234", "1995", 7, "levoKrilo", true);

        igrac.stampaj();

        Karton prviKarton = new Karton("Zuti");
        Karton drugiKarton = new Karton("Crveni");

        igrac.dodajKarton(prviKarton);
        igrac.dodajKarton(prviKarton);
        igrac.dodajKarton(prviKarton);
        igrac.dodajKarton(drugiKarton);

        igrac.stampaj();





    }
}
