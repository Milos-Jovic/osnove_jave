package d12_09_2023.Zadatak1;

public class Ugovor {

    private int godina;
    private int dan;
    private int mesec;
    private FizickoLice prodavac;
    private FizickoLice kupac;
    private double prodajnaCena;
    private String adresa;


    public Ugovor (int dan, int mesec, int godina, FizickoLice prodavac, FizickoLice kupac, double prodajnaCena, String adresa){

        this.dan = dan;
        this.mesec = mesec;
        this.godina = godina;
        this.prodavac = prodavac;
        this.kupac = kupac;
        this.prodajnaCena = prodajnaCena;
        this.adresa = adresa;

    }



    public double kalkulacijaZarade(){
        if(this.kupac.getProveraKupovine()){
            return 0.02;
        } else {
            return 0.03;
        }
    }

    public double obracun (){
        return 100 + prodajnaCena * kalkulacijaZarade();
    }

        public void print(){

            System.out.print("Dana " + this.dan +  " " + this.mesec + " " + this.godina + " god sklopljen je ugovor izmedju ");
            this.prodavac.print();
            System.out.print(" i ");
            this.kupac.print();
            System.out.print("o kupovini nekretnine " + this.adresa + " po ceni od " + this.prodajnaCena + " pri cemuu je kupac u obavezi da agenciji isplati novcanu vrednost od " + this.obracun());

        }



}


