package d08_09_2023.zadatak2;

public class FacebookPost {

    public String korisnik;
    public String profilKorisnika;

    public String tekst;

    public int brojLajkova;
    public int brojDeljenja;


    public void like(){
        this.brojLajkova = this.brojLajkova + 1;
    }

    public void dislike() {
        this.brojLajkova = this.brojLajkova - 1;
        if(this.brojLajkova < 0){
            this.brojLajkova = 0;
        }
    }

    public void share() {
        this.brojDeljenja = this.brojDeljenja + 1;
    }


    public void print(){
        System.out.println(this.korisnik + " >>> " + this.profilKorisnika);
        System.out.println(this.tekst);
        System.out.println("Likes " + this.brojLajkova + " | Shares " + this.brojDeljenja);


    }


}
