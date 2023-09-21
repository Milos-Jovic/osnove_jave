package d19_09_2023.Zadatak1;

public class SuperKartica {
    private int brojKartice;
    private String punoIme;
    private double popust;

    public SuperKartica() {
    }

    public SuperKartica(int brojKartice, String punoIme, double popust) {
        this.brojKartice = brojKartice;
        this.punoIme = punoIme;
        this.popust = popust;
    }


    public void stampaj(){
        System.out.println(this.brojKartice + " " + this.punoIme);
    }


    public int getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(int brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public double getPopust() {
        return popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }
}
