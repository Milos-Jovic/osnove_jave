package d19_09_2023.Zadatak2;

import java.util.ArrayList;

public class PlaninarskiDom {
    private String nazivDoma;
    private int godinaOsnivanja;
    private ArrayList<Planinar> planinari;

    public PlaninarskiDom() {
        this.planinari = new ArrayList<>();
    }

    public PlaninarskiDom(String nazivDoma, int godinaOsnovanja) {
        this.nazivDoma = nazivDoma;
        this.godinaOsnivanja = godinaOsnovanja;
        this.planinari = new ArrayList<>();
    }


    public void uclaniPlaninara(Planinar planinar){
        planinari.add(planinar);
    }

        public void izbaciPlaninara(int identifikator){
            for (int i = 0; i <planinari.size() ; i++) {
                if (planinari.get(i).getIdentifikator() == identifikator){
                    planinari.remove(planinari.get(i));
                }
            }
        }

        public void stampaj(){
            System.out.println("Naziv doma: " + this.nazivDoma);
            System.out.println("Godina osnivanja: " + this.godinaOsnivanja);

            for (int i = 0; i < planinari.size(); i++) {
                planinari.get(i).stampaj();
            }
        }

            public int brojPlaninara(Planina planina) {
                int brojac = 0;
                for (int i = 0; i < planinari.size(); i++) {
                    if (planinari.get(i).uspesanUspon(planina)) {
                        brojac++;
                    }

                }
                return brojac;
            }

        public double prihodClanarine(){
            double suma = 0;
            for (int i = 0; i <planinari.size() ; i++) {
                suma = suma + planinari.get(i).clanarina();
            }
                return suma;
        }


    public String getNazivDoma() {
        return nazivDoma;
    }

    public void setNazivDoma(String nazivDoma) {
        this.nazivDoma = nazivDoma;
    }

    public int getGodinaOsnivanja() {
        return godinaOsnivanja;
    }

    public void setGodinaOsnivanja(int godinaOsnivanja) {
        this.godinaOsnivanja = godinaOsnivanja;
    }
}
