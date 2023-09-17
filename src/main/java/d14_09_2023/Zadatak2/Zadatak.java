package d14_09_2023.Zadatak2;

public class Zadatak {
    public static void main(String[] args) {
        TestStep step1 = new TestStep("otvori aplikaciju", "","","");
        TestStep step2 = new TestStep("unesi email", "milos@gmail.com","milos@gmail.com","");
        TestStep step3 = new TestStep("unesi password", "xxxxx","xxxxx","");
        TestStep step4 = new TestStep("uloguj se", "","","");

        TestCase testSlucaj = new TestCase("12-45R", "Log in");
        testSlucaj.addTestSteps(step1);
        testSlucaj.addTestSteps(step2);
        testSlucaj.addTestSteps(step3);
        testSlucaj.addTestSteps(step4);
        testSlucaj.stampa();
    }
}
