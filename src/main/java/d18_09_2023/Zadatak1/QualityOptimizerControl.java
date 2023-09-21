package d18_09_2023.Zadatak1;

public class QualityOptimizerControl extends Control{

    private double brzinaInterneta;


    public QualityOptimizerControl(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

@Override
    public void izvrsiAkciju(VideoPlayer videoPlayer){
        double kvalitet = brzinaInterneta * 10.1;

        if(kvalitet < 144){
            videoPlayer.setKvalitet(144);
        } else if (kvalitet < 240){
            videoPlayer.setKvalitet(240);
        } else if (kvalitet < 360){
            videoPlayer.setKvalitet(360);
        } else if (kvalitet < 480){
            videoPlayer.setKvalitet(480);
        } else if (kvalitet < 720) {
            videoPlayer.setKvalitet(720);
        } else if (kvalitet < 1080) {
            videoPlayer.setKvalitet(1080);

        }
}

    public double getBrzinaInterneta() {
        return brzinaInterneta;
    }

    public void setBrzinaInterneta(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }
}
