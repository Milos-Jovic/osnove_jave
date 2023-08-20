package d17_08_2023;

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {


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
