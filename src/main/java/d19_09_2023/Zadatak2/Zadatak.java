package d19_09_2023.Zadatak2;

public class Zadatak {
    public static void main(String[] args) {

        Planina planina = new Planina("Stara Planina","Srbija", 2000);

        PlaninarskiDom dom = new PlaninarskiDom("Planinarski dom", 1995);

        RekreativniPlaninar planinar1 = new RekreativniPlaninar(123,"Milica", 30,"Nis", 3500);
        RekreativniPlaninar planinar2 = new RekreativniPlaninar(333,"Milos", 10,"Nis", 4500);
        RekreativniPlaninar planinar3 = new RekreativniPlaninar(567,"Lidija", 20,"BG", 3500);

        Alpinista planinar4 = new Alpinista(555,"Jovan", 20);
        Alpinista planinar5 = new Alpinista(1222,"Zoran", 30);
        Alpinista planinar6 = new Alpinista(15523,"Stefan", 10);

        dom.uclaniPlaninara(planinar1);
        dom.uclaniPlaninara(planinar2);
        dom.uclaniPlaninara(planinar3);
        dom.uclaniPlaninara(planinar4);
        dom.uclaniPlaninara(planinar5);
        dom.uclaniPlaninara(planinar6);


        dom.izbaciPlaninara(333);
        dom.stampaj();
        dom.brojPlaninara(planina);
        dom.prihodClanarine();

    }
}
