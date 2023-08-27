package d24_08_2023;

import java.util.ArrayList;

public class Zadatak6 {

//    Napisati program koji vrsi proveru linkova sa stranice. Program cuva 3 niza:
//    niz linkova
//    niz ocekivanih status kodova za linkove iz prvog niza (expected status codes)
//    niz status kodova koje vracaju linkovi iz prvog niza (actual status codes)

    public static void main(String[] args) {



ArrayList<String> links = new ArrayList<>();

        links.add("https://cms.demo.katalon.com/cart/");
        links.add("https://cms.demo.katalon.com/shop/");
        links.add("https://cms.demo.katalon.com/account/");
        links.add("https://cms.demo.katalon.com/cart/");
        links.add("https://cms.demo.katalon.com/test/");

ArrayList<Integer> expected = new ArrayList<>();

        expected.add(200);
        expected.add(200);
        expected.add(404);
        expected.add(204);
        expected.add(200);

 ArrayList<Integer> actual = new ArrayList<>();

        actual.add(200);
        actual.add(200);
        actual.add(400);
        actual.add(200);
        actual.add(404);


        for (int i = 0; i <links.size() ; i++) {
            int expectedStatus = expected.get(i);
            int actualStatus = actual.get(i);

            if(expectedStatus != actualStatus){

                System.out.println("Link " + links + " expected status code " + expectedStatus + " but got " + actualStatus);
            }

        }


    }


}
