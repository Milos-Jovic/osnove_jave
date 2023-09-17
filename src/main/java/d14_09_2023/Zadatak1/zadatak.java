package d14_09_2023.Zadatak1;

public class zadatak {
    public static void main(String[] args) {

        Ispit ispit1 = new Ispit("istorija", 7, "Milica Micic");
        Ispit ispit2 = new Ispit("Programiranje", 5, "Milan Jovic");
        Ispit ispit3 = new Ispit("Srpski", 9, "Zoran Stefanovic");

        Student prviStudent = new Student(1962, "Milos Jovic", "Master");
        prviStudent.dodajIspit(ispit1);
        prviStudent.dodajIspit(ispit2);
        prviStudent.dodajIspit(ispit3);


        prviStudent.stampaj();





    }
}
