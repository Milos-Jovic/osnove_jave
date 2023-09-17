package d15_09_2023.Zadatak2;

public class Karton {
    private String tipKartona;

    public Karton() {
    }

    public Karton(String tipKartona) {
        this.tipKartona = tipKartona;
    }


    public String getTipKartona() {
        return tipKartona;
    }

    public void setTipKartona(String tipKartona) {
        this.tipKartona = tipKartona;
    }

        public void stampaj(){
            System.out.println("Karton: " + this.tipKartona);
        }

}



