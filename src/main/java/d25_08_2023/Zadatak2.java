package d25_08_2023;

public class Zadatak2 {

//    Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu vrednost
//    koja se formira kao na primeru. METODA NISTA NE STAMPA.

    public static void main(String[] args) {

        int broj = noviBroj(2,3);
        System.out.println(broj);

        broj = noviBroj(6,2);
        System.out.println(broj);

    } public static int noviBroj(int a, int b) {
    return a * 10 + b;
    }

}
