package d15_08_2023;


//  Napisati program koji racuna i ispisuje povrsinu i obim trougla.
//  KOREN BROJA 3 neka bude konstanta 1.73. Za stranicu trougla postavite proizvoljnu vrednost.

public class Zadatak5 {

    public static void main(String[] args) {

    double korenBr = 1.73;
    int a = 5;

    double povrsina = a * a * 1.73 / 4;
    int obim = a * a * a;

        System.out.println("a = " + a);
        System.out.println("Povrsina je " + povrsina);
        System.out.println("Obim je " + obim);


    }

}
