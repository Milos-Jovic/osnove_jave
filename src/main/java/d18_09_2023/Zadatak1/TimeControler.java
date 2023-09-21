package d18_09_2023.Zadatak1;

public class TimeControler  extends Control{

    private boolean unapred;

    public TimeControler(boolean b) {
        this.unapred = unapred;
    }
@Override
    public void izvrsiAkciju(VideoPlayer videoPlayer){
        if(unapred){
            if(videoPlayer.getTrenutnoVreme() + 15 < videoPlayer.getDuzinaVidea()) {
                int novoVreme = videoPlayer.getTrenutnoVreme() + 15;
                videoPlayer.setTrenutnoVreme(novoVreme);
            } else {
                videoPlayer.setTrenutnoVreme(videoPlayer.getDuzinaVidea());
            }
        } else {
            if (videoPlayer.getTrenutnoVreme() - 15 > 0) {
                int novoVreme = videoPlayer.getTrenutnoVreme() - 15;
                videoPlayer.setTrenutnoVreme(novoVreme);
            } else {
                videoPlayer.setTrenutnoVreme(0);
            }
        }
    }


}
