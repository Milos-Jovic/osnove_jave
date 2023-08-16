package p15_08_2023;

public class Zadatak3 {
    public static void main(String[] args) {


//        Napisati program koji na ekranu stampa podatke u formatu:
//[IME I PREZIME]
//[BROJ TELEFONA], [ULICA I BROJ], [GRAD]
//[EMAIL]

        String imeIPrezime = "Milos Jovic";
        String brojTelefona = "065555999 ";
        String ulicaIBroj = "Vizantijski 98 ";
        String  grad = "NIs";
        String email = "test@gmail.com";

        System.out.println(imeIPrezime);
        System.out.print(brojTelefona + ",");
        System.out.print(ulicaIBroj + ",");
        System.out.println(grad + ",");
        System.out.println(email);

}}