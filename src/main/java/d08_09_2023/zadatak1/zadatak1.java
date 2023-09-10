package d08_09_2023.zadatak1;


public class zadatak1 {

//    Napisati klasu Proizvod koja ima atribute
//    naziv proizvoda (String)
//    cenu proizvoda (double)
//    težinu proizvoda u gramima. (double)
//    i metode:
//    stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//    povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu. Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//            vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
//    racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
//    za tezinu do 100g, postarina iznosi 200din
//    za tezinu od 101g do 500g, postarina iznosi 400din
//    za tezinu preko 500g, postarina iznosi 1000din
//
//    U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.


    public static void main(String[] args) {

       Proizvod prviProizvod = new Proizvod();
       prviProizvod.naziv = "Knjiga";
       prviProizvod.cena = 999;
       prviProizvod.tezina = 200;

        prviProizvod.povecajCenu(5);
        prviProizvod.stampaj();
        System.out.println(prviProizvod.naziv + " sa popustom iznosi " + prviProizvod.vratiCenuSaPopustom(15) + " dinara, i doplata za postarinu je "+ prviProizvod.racunajPostarinu() + " dinara.");


       Proizvod drugiProizvod = new Proizvod();
       drugiProizvod.naziv = "Naocare";
       drugiProizvod.cena = 9.999;
       drugiProizvod.tezina = 15;

        drugiProizvod.povecajCenu(3);
        drugiProizvod.stampaj();
        System.out.println(drugiProizvod.naziv + " sa popustom iznose " + drugiProizvod.vratiCenuSaPopustom(8) + " dinara, i doplata za postarinu je "+ drugiProizvod.racunajPostarinu() + " dinara.");


       Proizvod treciProizvod = new Proizvod();
       treciProizvod.naziv = "Slusalice";
       treciProizvod.cena = 1.799;
       treciProizvod.tezina = 700;


        treciProizvod.povecajCenu(15);
        treciProizvod.stampaj();
        System.out.println(treciProizvod.naziv + " sa popustom iznose " + treciProizvod.vratiCenuSaPopustom(10) + " dinara, i doplata za postarinu je "+ treciProizvod.racunajPostarinu() + " dinara.");



    }
}
