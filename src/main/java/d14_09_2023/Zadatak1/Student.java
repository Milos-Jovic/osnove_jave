package d14_09_2023.Zadatak1;

import java.util.ArrayList;

public class Student {
    private int brIndeksa;
    private String imeIPrezime;
    private String tipStudija;

    private ArrayList<Ispit> ispiti;

    public Student(int brIndeksa, String imeIPrezime, String tipStudija) {
        this.brIndeksa = brIndeksa;
        this.imeIPrezime = imeIPrezime;
        this.tipStudija = tipStudija;
        this.ispiti =new ArrayList<>();
    }


    public double prosek(){
                double suma = 0;
                int polezeni = 0;
        for (int i = 0; i <ispiti.size() ; i++) {
            if (this.ispiti.get(i).daLiJePolozen()){
                suma = suma + this.ispiti.get(i).getOcena();
                polezeni++;
            }
        }

        return suma / polezeni;

    }

        public void stampaj(){
            System.out.println(this.brIndeksa + " - " + this.imeIPrezime + " - " + this.tipStudija);
            System.out.println("Predmeti");
            for (int i = 0; i < ispiti.size(); i++) {
                System.out.println(ispiti.get(i).getNazivPredmeta() + " - " + ispiti.get(i).getPunoImeProfesora() + " - " + ispiti.get(i).getOcena());
            }
            System.out.println("Prosecna ocena: " + prosek());
        }

    public void dodajIspit(Ispit ispit){
        ispiti.add(ispit);
    }



    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }

    public int getBrIndeksa() {
        return brIndeksa;
    }

    public void setBrIndeksa(int brIndeksa) {
        this.brIndeksa = brIndeksa;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }
}
