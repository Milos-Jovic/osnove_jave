package d19_09_2023.Zadatak2;

public class RekreativniPlaninar extends Planinar{


    private int tezinaOpreme;
    private String nazivMesta;
    private int usponeBezOpreme;

    public RekreativniPlaninar(int identifikator, String punoIme, int tezinaOpreme, String nazivMesta, int usponeBezOpreme) {
        super(identifikator, punoIme);
        this.tezinaOpreme = tezinaOpreme;
        this.nazivMesta = nazivMesta;
        this.usponeBezOpreme = usponeBezOpreme;
    }
@Override
    public  double clanarina(){
        return 1000;
}

    @Override
    public  void stampaj(){
        System.out.println("rekreativac");
        System.out.println("id: " + getIdentifikator());
        System.out.println("ime i prezime: " + getPunoIme());
        System.out.println("Okrug: " + this.nazivMesta);
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        int uspon = usponeBezOpreme - tezinaOpreme * 50;
        if(uspon > planina.getVisinaPlanine()){
            return true;
        } else {
            return  false;
        }
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public String getNazivMesta() {
        return nazivMesta;
    }

    public int getUsponeBezOpreme() {
        return usponeBezOpreme;
    }
}
