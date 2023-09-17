package d14_09_2023.Zadatak2;

import p14_09_2023.Zadatak1.Pasta;

public class TestStep {
    private String opis;
    private String actual;
    private String expected;
    private String errorMessage;


    public TestStep(String opis, String actual, String expected, String errorMessage) {
        this.opis = opis;
        this.actual = actual;
        this.expected = expected;
        this.errorMessage = errorMessage;
    }

    public boolean validate(){
        if(actual.equals(expected)){
            return true;
        }
        else {
            return false;
        }
    }


    public void stampaj(){
        String isPassed;
        if (this.validate()) {
            isPassed = "passed";
        } else {
            isPassed = "failed";
        }
        System.out.print("| " + this.opis + " |");
        System.out.print("| Status " + isPassed + "|");
        if(!validate()){
            System.out.print("Error message:" + this.errorMessage);
        }
    }


    public String getOpis() {
        return opis;
    }

    public String getActual() {
        return actual;
    }

    public String getExpected() {
        return expected;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
