package d18_09_2023.Zadatak1;

public class VideoPlayer {
    private int duzinaVidea;
    private int trenutnoVreme;
    private int jacinaZvuka;

    private int kvalitet;

    public VideoPlayer() {
    }

    public VideoPlayer(int duzinaVidea, int trenutnoVreme, int jacinaZvuka, int kvalitet) {
        this.duzinaVidea = duzinaVidea;
        this.trenutnoVreme = trenutnoVreme;
        this.jacinaZvuka = jacinaZvuka;
        this.kvalitet = kvalitet;
    }


    public void stampaj(){
        System.out.println("Trenutno vreme videa: " + this.trenutnoVreme);
        System.out.println("Jacina zvuka: " + this.jacinaZvuka);
        System.out.println("kvalitet videa: " + this.kvalitet);
    }

    public int getDuzinaVidea() {
        return duzinaVidea;
    }

    public void setDuzinaVidea(int duzinaVidea) {
        this.duzinaVidea = duzinaVidea;
    }

    public int getTrenutnoVreme() {
        return trenutnoVreme;
    }

    public void setTrenutnoVreme(int trenutnoVreme) {
        this.trenutnoVreme = trenutnoVreme;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public int getKvalitet() {
        return kvalitet;
    }

    public void setKvalitet(int kvalitet) {
        this.kvalitet = kvalitet;
    }
}
