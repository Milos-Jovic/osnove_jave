package d17_08_2023;

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {



//                Napisati program koji simulira izvrsenja test case-a za redirekciju nakon uspesnog logovanja na sistem.
//                Program sa tastature ucitava actual url stranice,
//                expected url stranice i kod o gresci koja treba da se prikaze ukoliko actual stranica nije kao sto je ocekivano.


        Scanner s = new Scanner(System.in);

        System.out.println("Enter actual url :");
        String actualURL = s.next();
        System.out.println("Enter expected url :");
        String expectedURL = s.next();
        System.out.println("Enter error code :");
        String errorCode = s.next();

        if (actualURL.endsWith(expectedURL)){
            System.out.println("1 Test passed");
        } else {
            System.out.println("Assertion Error : Expected " + expectedURL + " but got " + actualURL + " ,error code: " + errorCode );
        }



    }




}
