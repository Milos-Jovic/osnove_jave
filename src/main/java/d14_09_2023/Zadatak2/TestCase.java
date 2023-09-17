package d14_09_2023.Zadatak2;

import d14_09_2023.Zadatak1.Ispit;

import java.util.ArrayList;

public class TestCase {
    private String ID;
    private String naziv;
    private ArrayList<TestStep> nizStepova;


    public TestCase() {
        this.nizStepova = new ArrayList<>();
    }

    public TestCase(String ID, String naziv) {
        this.ID = ID;
        this.naziv = naziv;

    }

    public void addTestSteps(TestStep niz){
        nizStepova.add(niz);
    }

        public int failedSteps(){
            int brojac = 0;
            for (int i = 0; i < nizStepova.size(); i++) {
                if (nizStepova.get(i).validate()){
                    brojac++;
                }
            }
            return brojac;
        }

        public String stanje() {
        if (failedSteps() == 0){
            return "PASSED";
        }
            return "FAILED";
        }

        public void stampa(){
            System.out.println(this.ID + " - " + this.naziv);
            for (int i = 0; i <nizStepova.size() ; i++) {
                nizStepova.get(i).stampaj();
            }
        }

}
