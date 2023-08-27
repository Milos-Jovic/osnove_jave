package d25_08_2023;

public class Zadatak1 {


//    Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost
//    za 10 veca.Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

    public static void main(String[] args) {


        stampajVrednostZa10Vecu(10);
        stampajVrednostZa10Vecu(20);
        stampajVrednostZa10Vecu(30);
        stampajVrednostZa10Vecu(40);
        stampajVrednostZa10Vecu(50);


    }

    public static void stampajVrednostZa10Vecu (int vrednost){

        System.out.println(vrednost + 10);
    }
}
