public class UvodPromenljive {

    public static void main(String[] args) {



       String firstName = "Milos"; // inicijalizacija (inicijalna pocetna vrecnost)
        String lastName = "Jovic"; // deklaracija i inicijalizacija
        int yearOfBirth = 1998; // moze biti pozitivan i negativan
        int currentYear = 2023;
        float avg = 5.8f; // 5.8f  f- smatra se da je float
        double avrg = 5.8; // ima duplo veci opseg od float-a
        boolean active = true; // moze biti samo true ili false

        int age = currentYear - yearOfBirth;


        System.out.println("First name: " + firstName);
        System.out.println("lastName: " + lastName);
        System.out.println("age: " + age);
        System.out.println("active: " + active);





    }
}
