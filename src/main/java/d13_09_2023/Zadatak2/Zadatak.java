package d13_09_2023.Zadatak2;

import java.util.ArrayList;

public class Zadatak {

//    Zadatak
//    Kreirati klasu ZeleniKarton koja ima:
//    ime i prezime studenta
//    broj indeksa
//    naziv predmeta
//    ime i prezime profesora
//    ocenu - od 5 do 10
//    gettere i settere
//            konstruktore
//    metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//    metodu stampaj koja stampa podatke u formatu:
//            (naziv predmeta) - (ocena)
//    Student: ime i prezime, broj indeksa
//    Profesor: ime i prezime
//
//    U glavnoj klasi:
//    kreirati niz od 5 zelenih kartona za ispite i odstampati podatke za sve ispite
//    Zatim program pronalazi i ispisuje prosecnu ocenu za sve ispite

    public static void main(String[] args) {


        ArrayList<ZeleniKarton> ispiti = new ArrayList<>();

       ZeleniKarton ispit1 = new  ZeleniKarton("Milos Jovic", "123", "Istorija", "Marko Markovic", 7);
        ZeleniKarton ispit2 = new  ZeleniKarton("Milica MIlic", "1323", "Elektrotehnika", "Nenad Ilic", 9);
        ZeleniKarton ispit3 = new  ZeleniKarton("Janko Jankovic", "1113", "Mehanika", "Darko Jankovic", 10);
        ZeleniKarton ispit4 = new  ZeleniKarton("Ratko Markovic", "1883", "Statika", "Milica Jokic", 6);
        ZeleniKarton ispit5 = new  ZeleniKarton("Danica Ilic", "1909", "Programiranje", "Vuk Savic", 5);

        ispiti.add(ispit1);
        ispiti.add(ispit2);
        ispiti.add(ispit3);
        ispiti.add(ispit4);
        ispiti.add(ispit5);


        podaciIspita(ispiti);
        System.out.println("Srednja ocena: " + srednjaOcena(ispiti));

    }

    public static void podaciIspita(ArrayList<ZeleniKarton> ispiti){


        for (int i = 0; i < ispiti.size(); i++) {
            ispiti.get(i).print();
            System.out.println();

        }


    }

    public static double srednjaOcena(ArrayList<ZeleniKarton> ispiti){
        int sum = 0;
        for (int i = 0; i < ispiti.size(); i++) {
            sum = sum + ispiti.get(i).getOcena();
        }
        return sum * 1.0 / ispiti.size();
    }


}
