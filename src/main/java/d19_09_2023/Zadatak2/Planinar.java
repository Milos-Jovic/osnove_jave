package d19_09_2023.Zadatak2;

public abstract class Planinar {

    protected int identifikator;

    protected String punoIme;




    public Planinar(int identifikator, String punoIme) {
        this.identifikator = identifikator;
        this.punoIme = punoIme;
    }

    public abstract void stampaj();

    public abstract double clanarina();

    public abstract boolean uspesanUspon(Planina planina);

    public int getIdentifikator() {
        return identifikator;
    }

    public String getPunoIme() {
        return punoIme;
    }
}
