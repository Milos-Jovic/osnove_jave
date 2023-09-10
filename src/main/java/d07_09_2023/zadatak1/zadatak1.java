package d07_09_2023.zadatak1;

public class zadatak1 {

//    Zadatak 1: Kreiranje klase "Student"
//    Napišite klasu "Student" koja ima sledeće atribute: ime (String), brojIndeksa (int) i fakultet (String).
//    Kreirajte 2-3 objekta ove klase u glavnoj metodi i postavite im vrednosti. Ispisati informacije o studentima.

    public static void main(String[] args) {


    Student prviStudent = new Student();
    prviStudent.ime = "Milos";
    prviStudent.brojIndeksa = 1962;
    prviStudent.fakultet = "Masinski";

    Student drugiStudent = new Student();
    drugiStudent.ime = "Milica";
    drugiStudent.brojIndeksa = 1777;
    drugiStudent.fakultet = "Elektronski";

    Student treciStudent = new Student();
    treciStudent.ime = "Lidija";
    treciStudent.brojIndeksa = 456;
    treciStudent.fakultet = "Arhitektonski";

        System.out.println(prviStudent.ime + " sa brojem indeksa " + prviStudent.brojIndeksa + " nije zavrsio " + prviStudent.fakultet + " fakultet.");
        System.out.println(drugiStudent.ime + " sa brojem indeksa " + drugiStudent.brojIndeksa + " pohadja " + drugiStudent.fakultet + " fakultet.");
        System.out.println(treciStudent.ime + " sa brojem indeksa " + treciStudent.brojIndeksa + " je zavrsila " + treciStudent.fakultet + " fakultet.");


    }

}
