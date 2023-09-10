package d08_09_2023.zadatak1;

public class Proizvod {

    public String naziv;
    public double cena;
    public double tezina;


    public void stampaj(){
        System.out.println(this.naziv + ", " + this.cena + ", " + this.tezina);
    }

    public void povecajCenu(double povecaj){
        this.cena = this.cena + povecaj;
    }

    public double vratiCenuSaPopustom(double popust){
        double kolikiJePopust = this.cena * popust / 100;
        return this.cena = this.cena - kolikiJePopust;
    }


    public double racunajPostarinu(){
        if(this.tezina <= 100){
            return 200;
        } else if (this.tezina > 100 && this.tezina <= 500) {
            return 400;
        } else {
            return 1000;
        }
    }

}
