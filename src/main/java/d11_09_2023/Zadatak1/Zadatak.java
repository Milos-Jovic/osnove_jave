package d11_09_2023.Zadatak1;

public class Zadatak {


//    Kreirati klasu Autor koja ima
//-ime i prezime
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu:
//            (ime autora) (prezime autora)
//
//    Kreirati klasu Knjiga koji ima:
//            -ISBN
//-naziv
//-godina izdanja
//-autor
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//            (ISBN)
//            (naziv) - (godina izdanja)
//    autor: (ime autora) (prezime autora)
//
//    U glavnom programu napraviti vise autora sa vise knjiga.

    public static void main(String[] args) {


        Autor prviAutor = new Autor("Robert", "Kiyosaki");
        Knjiga prvaKnjiga = new Knjiga("123-456", "Bogati otac", 1997, prviAutor);
        prvaKnjiga.print();

        System.out.println();
        System.out.println();

        Autor drugiAutor = new Autor("James", "Clear");
        Knjiga drugaKnjiga = new Knjiga("456-567", "Atomske navike", 2018, drugiAutor);
        drugaKnjiga.print();

        System.out.println();
        System.out.println();

       Knjiga trecaKnjiga = new Knjiga();
        trecaKnjiga.setISBN("564-412");
        trecaKnjiga.setNazv("Second Chance");
        trecaKnjiga.setGodinaIzdanja(2015);
        trecaKnjiga.setAutor(prviAutor);
        trecaKnjiga.print();


    }

}
