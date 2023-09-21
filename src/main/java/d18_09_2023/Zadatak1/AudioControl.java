package d18_09_2023.Zadatak1;

public class AudioControl extends Control{


    private boolean proveraJacine;

    public AudioControl(boolean proveraJacine) {
        this.proveraJacine = proveraJacine;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer){
    if (proveraJacine){
        if (videoPlayer.getJacinaZvuka() < 100){
            int noviZvuk = videoPlayer.getJacinaZvuka() + 1;
            videoPlayer.setJacinaZvuka(noviZvuk);
        } else {
            videoPlayer.setJacinaZvuka(100);
        }
    } else {
        if (videoPlayer.getJacinaZvuka() > 0){
            int noviZvuk = videoPlayer.getJacinaZvuka() - 1;
            videoPlayer.setJacinaZvuka(noviZvuk);
        } else {
            videoPlayer.setJacinaZvuka(0);
        }
    }


    }



    public boolean isProveraJacine() {
        return proveraJacine;
    }

    public void setProveraJacine(boolean proveraJacine) {
        this.proveraJacine = proveraJacine;
    }
}
