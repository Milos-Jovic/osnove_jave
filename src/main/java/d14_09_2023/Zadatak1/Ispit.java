package d14_09_2023.Zadatak1;

public class Ispit {
    private String nazivPredmeta;
    private int ocena;
    private String punoImeProfesora;


    public Ispit(String nazivPredmeta, int ocena, String punoImeProfesora) {
        this.nazivPredmeta = nazivPredmeta;
        this.ocena = ocena;
        this.punoImeProfesora = punoImeProfesora;
    }

    public boolean daLiJePolozen() {

        if (ocena >= 6 && ocena <= 10) {
            return true;
        } else {
            return false;
        }

    }


    public void stapaj(){
        System.out.println(this.nazivPredmeta + " - " + this.punoImeProfesora + " - " + this.ocena);
    }


    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getPunoImeProfesora() {
        return punoImeProfesora;
    }

    public void setPunoImeProfesora(String punoImeProfesora) {
        this.punoImeProfesora = punoImeProfesora;
    }
}
