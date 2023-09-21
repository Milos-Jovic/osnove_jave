package d19_09_2023.Zadatak2;

public class Alpinista extends Planinar{

    private int brPoena;

    public Alpinista(int identifikator, String punoIme, int brPoena) {
        super(identifikator, punoIme);
        this.brPoena = brPoena;
    }

    public int getBrPoena() {
        return brPoena;
    }

    public void setBrPoena(int brPoena) {
        this.brPoena = brPoena;
    }

    @Override
    public  double clanarina(){
        return 1500 - 50 * brPoena;
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
            if(planina.getVisinaPlanine() <= 4000){
                return true;
             } else {
                return false;
            }
    }

    @Override
    public  void stampaj(){
        System.out.println("Alpinista, ID : " + getIdentifikator());
        System.out.println("Ime: " + getPunoIme());
        System.out.println("Broj poena: " + this.brPoena);
    }

}
