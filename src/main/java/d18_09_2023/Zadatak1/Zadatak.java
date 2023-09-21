package d18_09_2023.Zadatak1;

public class Zadatak {
    public static void main(String[] args) {

        VideoPlayer player = new VideoPlayer(340, 15,75,240);

        TimeControler unapred = new TimeControler(true);

            unapred.izvrsiAkciju(player);
            unapred.izvrsiAkciju(player);


        TimeControler unazad = new TimeControler(false);

        unapred.izvrsiAkciju(player);


        AudioControl pojacaj = new AudioControl(true);

        pojacaj.izvrsiAkciju(player);
        pojacaj.izvrsiAkciju(player);
        pojacaj.izvrsiAkciju(player);

        AudioControl smanji = new AudioControl(true);

        smanji.izvrsiAkciju(player);

        QualityOptimizerControl kvalitet = new QualityOptimizerControl(100);

            kvalitet.izvrsiAkciju(player);

            player.stampaj();

    }

}
