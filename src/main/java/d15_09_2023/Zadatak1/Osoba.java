package d15_09_2023.Zadatak1;

public class Osoba {
    protected String punoIme;
    protected String jmbg;
    protected String godinaRodjenja;


    public Osoba() {
    }

    public Osoba(String punoIme, String jmbg, String godinaRodjenja) {
        this.punoIme = punoIme;
        this.jmbg = jmbg;
        this.godinaRodjenja = godinaRodjenja;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(String godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }

    public void stampaj(){
        System.out.println("Puno ime: " + this.punoIme + ", JMBG " + this.jmbg + ", godina rodjenja " + this.godinaRodjenja);
    }
}
