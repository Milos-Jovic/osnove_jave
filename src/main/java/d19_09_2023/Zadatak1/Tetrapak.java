package d19_09_2023.Zadatak1;

    public class Tetrapak extends Ambalaza {
    private boolean daLiSeReciklira;
    private double osnovnaCena;


    public Tetrapak(String barkod, String naziv, double netoTezina, double brutoTezina, boolean daLiSeReciklira, double osnovnaCena) {
        super(barkod, naziv, netoTezina, brutoTezina);
        this.daLiSeReciklira = daLiSeReciklira;
        this.osnovnaCena = osnovnaCena;
    }

@Override
    public double cenaArtikla() {
        if(daLiSeReciklira) {
            return izracunajTezinu() * 1.5 + getOsnovnaCena();
        } else {
            return getOsnovnaCena();
        }

    }
    @Override
    public void stampaj(){
        System.out.println("Barkod: " + this.getBarkod());
        System.out.println("Naziv artikla: " + this.getNaziv());
        System.out.println("Neto tezina: " + this.getNetoTezina());
        System.out.println("Bruto Tezina: " + this.getBrutoTezina());
        System.out.println("Da li se reciklira: " + this.daLiSeReciklira);
        System.out.println("Osnovna cena: " + this.osnovnaCena);
    }

    public boolean getTetrapak() {
        return daLiSeReciklira;
    }

    public void setTetrapak(boolean daLiSeReciklira) {
        this.daLiSeReciklira = daLiSeReciklira;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }



}
