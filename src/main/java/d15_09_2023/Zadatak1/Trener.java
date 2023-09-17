package d15_09_2023.Zadatak1;

public class Trener extends Osoba{
    private int iskustvo;
    private String tipTrenera;


    public Trener(String punoIme, String jmbg, String godinaRodjenja, int iskustvo, String tipTrenera) {
        super(punoIme, jmbg, godinaRodjenja);
        this.iskustvo = iskustvo;
        this.tipTrenera = tipTrenera;
    }

    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Godine iskustva : " + this.iskustvo + " Tip trenera: " + this.tipTrenera);
    }

    public int getIskustvo() {
        return iskustvo;
    }

    public void setIskustvo(int iskustvo) {
        this.iskustvo = iskustvo;
    }

    public String getTipTrenera() {
        return tipTrenera;
    }

    public void setTipTrenera(String tipTrenera) {
        this.tipTrenera = tipTrenera;
    }
}
