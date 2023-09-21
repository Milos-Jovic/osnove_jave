package d19_09_2023.Zadatak1;

public class Zadatak {
    public static void main(String[] args) {

        Korpa korpa = new Korpa();

        SuperKartica superKartica = new SuperKartica(4444,"Milos", 4);

        Tetrapak tetrapak1 = new Tetrapak("123","artikal1", 1.9, 2.1,true,120);
        Tetrapak tetrapak2 = new Tetrapak("143","artikal2", 2.1, 2.2,true,110);

        StaklenaAmbalaza ambalaza1 = new StaklenaAmbalaza("444","artikal3", 2.2,2.3,10,false,200);
        StaklenaAmbalaza ambalaza2 = new StaklenaAmbalaza("441","artikal4", 2.2,2.3,11,true,211);

        korpa.dodajAmbalazu(tetrapak1);
        korpa.dodajAmbalazu(tetrapak2);
        korpa.dodajAmbalazu(ambalaza1);
        korpa.dodajAmbalazu(ambalaza2);

        korpa.ukupnaCena(superKartica);

        korpa.izbaciAmbalazu("441");


    }
}
