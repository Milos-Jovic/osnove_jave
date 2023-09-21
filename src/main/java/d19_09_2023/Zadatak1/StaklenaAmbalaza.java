package d19_09_2023.Zadatak1;

public  class StaklenaAmbalaza extends Ambalaza{

    private double kaucija;
    private boolean daLiSePlaca;
    private double osnovnaCena;

    public StaklenaAmbalaza(String barkod, String naziv, double netoTezina, double brutoTezina, double kaucija, boolean daLiSePlaca, double osnovnaCena) {
        super(barkod, naziv, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.daLiSePlaca = daLiSePlaca;
        this.osnovnaCena = osnovnaCena;
    }


    @Override
    public double cenaArtikla() {
        if(daLiSePlaca){
            return getOsnovnaCena() * 1.2 + this.kaucija;
        } else {
            return getOsnovnaCena() * 1.2;
        }

    }

    @Override
    public void stampaj(){
        System.out.println("Barkod: " + this.getBarkod());
        System.out.println("Naziv artikla: " + this.getNaziv());
        System.out.println("Neto tezina: " + this.getNetoTezina());
        System.out.println("Bruto Tezina: " + this.getBrutoTezina());
        System.out.println("Kaucija za flasu: " + this.kaucija);
        System.out.println("Da li se placa kaucija: " + this.daLiSePlaca);
        System.out.println("Osnovna cena: " + this.osnovnaCena);
    }

    public double getKaucija() {
        return kaucija;
    }

    public void setKaucija(double kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isDaLiSePlaca() {
        return daLiSePlaca;
    }

    public void setDaLiSePlaca(boolean daLiSePlaca) {
        this.daLiSePlaca = daLiSePlaca;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }
}
