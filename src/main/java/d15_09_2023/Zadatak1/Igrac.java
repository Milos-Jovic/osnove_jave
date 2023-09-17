package d15_09_2023.Zadatak1;

public class Igrac extends Osoba{
private int brojIgraca;
private String pozicijia;
private boolean kapite;

    public Igrac() {
    }

    public Igrac(String punoIme, String JMbG, String godinaRodjenja,
                 int brojIgraca, String pozicijia, boolean kapite) {
        super(punoIme, JMbG, godinaRodjenja);
        this.brojIgraca = brojIgraca;
        this.pozicijia = pozicijia;
        this.kapite = kapite;
    }


    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println("Broj igraca: " + this.brojIgraca + ", pozicija " + this. pozicijia + ", kapiten " + this.kapite);
    }


    public int getBrojIgraca() {
        return brojIgraca;
    }

    public void setBrojIgraca(int brojIgraca) {
        this.brojIgraca = brojIgraca;
    }

    public String getPozicijia() {
        return pozicijia;
    }

    public void setPozicijia(String pozicijia) {
        this.pozicijia = pozicijia;
    }

    public boolean isKapite() {
        return kapite;
    }

    public void setKapite(boolean kapite) {
        this.kapite = kapite;
    }
}
