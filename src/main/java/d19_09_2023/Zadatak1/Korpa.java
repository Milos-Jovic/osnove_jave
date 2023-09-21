package d19_09_2023.Zadatak1;

import java.util.ArrayList;

public class Korpa  {
    private ArrayList<Ambalaza> ambalaze;

    public Korpa() {
        this.ambalaze = new ArrayList<>();
    }

    public void dodajAmbalazu(Ambalaza artikal){
        ambalaze.add(artikal);
    }

    public void izbaciAmbalazu(String barkod){

        for (int i = 0; i < ambalaze.size(); i++) {
           if(ambalaze.get(i).getBarkod().equals(barkod)){
                ambalaze.remove(ambalaze.get(i));
            }
        }

    }


    private double vracaPopust( double popust){
        double suma = 0;
        for (int i = 0; i < ambalaze.size() ; i++) {
            suma = suma + this.ambalaze.get(i).cenaArtikla();
        }
            return suma - popust;
    }

    public double ukupnaCena(SuperKartica superKartica) {
        return vracaPopust(superKartica.getPopust());
    }



}
