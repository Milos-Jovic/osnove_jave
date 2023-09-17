package d15_09_2023.Zadatak2;

import java.util.ArrayList;

public class Igrac extends Osoba{

    private int brojDresa;
    private String pozicija;
    private ArrayList<Karton> kartoni;

    private boolean kapiten;

    public Igrac() {
        this.kartoni = new ArrayList<>();
    }

    public Igrac(String punoIme, String jmbg, String godinaRodjenja, int brojDresa, String pozicija, boolean kapiten) {
        super(punoIme, jmbg, godinaRodjenja);
        this.brojDresa = brojDresa;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
        this.kartoni = new ArrayList<>();
    }


    public int getBrojDresa() {
        return brojDresa;
    }

    public void setBrojDresa(int brojDresa) {
        this.brojDresa = brojDresa;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }

    public void dodajKarton(Karton karton){
        kartoni.add(karton);
    }


    public int brojZutihKartona(){
        int brojacZutihKartona = 0;
        for (int i = 0; i <kartoni.size() ; i++) {
            if(kartoni.get(i).getTipKartona().equals("zuti")){
                brojacZutihKartona++;
            }
        }
        return brojacZutihKartona;
    }

    public int brojCrvenihKartona(){
        int brojCrvenihKartona = 0;
        for (int i = 0; i <kartoni.size() ; i++) {
            if(kartoni.get(i).getTipKartona().equals("crveni")){
                brojCrvenihKartona++;
            }
        }
        return brojCrvenihKartona;
    }

        @Override
    public void stampaj(){
        if(isKapiten()){
            System.out.println("Kapiten ");
        } else {
            System.out.println("Igrac");
        }
    super.stampaj();
            System.out.println("Broj dresa: " + this.brojDresa);
            System.out.println("Pozicija: " + this.pozicija);
            System.out.println("Zuti karton: " + this.brojZutihKartona());
            System.out.println("Crveni karton: " + this.brojCrvenihKartona());

    }


}
