package d25_08_2023;

public class Zadatak3 {

//    Napisati metodu koja stampa podatke o korisniku u formatu:
//    JMBG: [jmbg]
//    Ime: [ime]
//    Prezime: [prezime]
//    God. rodjenja: [god]
//    Aktivan: [true/false]
//    Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.

    public static void main(String[] args) {

        korisnik("1234", "Milos", "Jovic", 1995, true);

    }

    public static void korisnik (String jmbg, String ime, String prezime, int god, boolean aktiv) {
        System.out.println("JMBG: " + jmbg);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("Godina Rodjenja: " + god);
        System.out.println("Aktivan: " + aktiv);

    }




}
