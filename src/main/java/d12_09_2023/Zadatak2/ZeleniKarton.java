package d12_09_2023.Zadatak2;

public class ZeleniKarton {

private String imeIprezimeStudenta;
private String brojIndeksa;
private String predmet;
private String ImeIprezimeProfesora;
private int ocena;



    public ZeleniKarton (String imeIprezimeStudenta, String brojIndeksa, String predmet,String imeIprezimeProfesora,int ocena){
        this.imeIprezimeStudenta = imeIprezimeStudenta;
        this.brojIndeksa = brojIndeksa;
        this.predmet = predmet;
        this.ImeIprezimeProfesora = imeIprezimeProfesora;
        this.ocena = ocena;

    }


    private boolean daLiJePolozio(){
        return this.ocena > 5 && this.ocena <=10;
    }



    public void print(){
        System.out.println(this.predmet + " " + this.ocena);

        if(this.daLiJePolozio()){
            System.out.println("polozen ispit");
        } else {
            System.out.println("nije polozio ispit");
        }
        System.out.println("Student: " + this.imeIprezimeStudenta + ", " + this.brojIndeksa);
        System.out.println("Profesor: " + this.ImeIprezimeProfesora);
    }


    public String getImeIprezimeStudenta() {
        return imeIprezimeStudenta;
    }

    public void setImeIprezimeStudenta(String imeIprezimeStudenta) {
        this.imeIprezimeStudenta = imeIprezimeStudenta;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getImeIprezimeProfesora() {
        return ImeIprezimeProfesora;
    }

    public void setImeIprezimeProfesora(String imeIprezimeProfesora) {
        ImeIprezimeProfesora = imeIprezimeProfesora;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }


}
