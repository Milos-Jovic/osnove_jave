package d12_09_2023.Zadatak3;

public class Racun {
    private String brRacuna;
    private String imeIPrezime;
    private double trenutnoStanje;



    public Racun(String brRacuna, String imeIPrezime, double trenutnoStanje){
        this.brRacuna = brRacuna;
        this.imeIPrezime = imeIPrezime;
        this.trenutnoStanje = trenutnoStanje;
    }

    public void uplataNaRacun(double placanje){
        this.trenutnoStanje = trenutnoStanje + placanje;
    }
    public void skiniSaRacuna(double placanje){
        this.trenutnoStanje = trenutnoStanje - placanje;
    }

    public void stampaj(){
        System.out.println(this.imeIPrezime + " - " + brRacuna);
        System.out.println("Stanje na racunu " + this.trenutnoStanje + " rsd.");
    }


    public String getBrRacuna() {
        return brRacuna;
    }

    public void setBrRacuna(String brRacuna) {
        this.brRacuna = brRacuna;
    }


    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }
    public double getTrenutnoStanje() {
        return trenutnoStanje;
    }


}
