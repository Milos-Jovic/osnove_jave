package d13_09_2023.Zadatak3;

public class Transakcija {

private String id;
private Racun racunZaPlacanje;
private Racun racunZaUplatu;


    public Transakcija(String id, Racun racunZaPlacanje, Racun racunZaUplatu){
        this.id = id;
        this.racunZaPlacanje = racunZaPlacanje;
        this.racunZaUplatu =racunZaUplatu;

    }


    public double provizijaNaTransakciju(double placanje){
        if (placanje < 4500){
            return 45;
        } else {
            return placanje * 0.01;
        }
    }


    public void vrsenjeTransakcije(double placanje){
        double ukupnaSuma = placanje + this.provizijaNaTransakciju(placanje);
       if (ukupnaSuma <= this.racunZaPlacanje.getTrenutnoStanje()){
           this.racunZaPlacanje.uplataNaRacun(ukupnaSuma);
           this.racunZaUplatu.skiniSaRacuna(placanje);
           System.out.println("Uspesna transakcija");
       } else {
           System.out.println("Transakcija nije uspela");
       }
    }

        public void print(){
            System.out.println("Sa akaunta " + this.racunZaPlacanje.getImeIPrezime() + " - " + this.racunZaUplatu.getBrRacuna());
            System.out.println("Na akaunt " + this.racunZaUplatu.getImeIPrezime() + " - " + this.racunZaUplatu.getBrRacuna());
        }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Racun getRacunZaPlacanje() {
        return racunZaPlacanje;
    }
    public void setRacunZaPlacanje(Racun racunZaPlacanje) {
        this.racunZaPlacanje = racunZaPlacanje;
    }

    public Racun getRacunZaUplatu() {
        return racunZaUplatu;
    }


    public void setRacunZaUplatu(Racun racunZaUplatu) {
        this.racunZaUplatu = racunZaUplatu;
    }
}
