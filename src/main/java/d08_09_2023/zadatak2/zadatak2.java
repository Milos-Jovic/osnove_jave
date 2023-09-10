package d08_09_2023.zadatak2;

public class zadatak2 {

//    2.Kreirati klasu FacebookPost koja ima:
//    Od atributa:
//    ime i prezime korisnika koji je objavio post
//    ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//    tekst objave
//    broj lajkova
//    broj deljenja
//    Od metoda:
//    like(), koja povecava broj lajkova za 1.
//    dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//    share(), koja povecava broj deljenja za 1
//    print(), koja stampa objavu u formatu:
//            (ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//            (tekst objave)
//    Likes (broj lajkova) | Shares (broj deljenja)
//
//    U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.


    public static void main(String[] args) {


    FacebookPost prviPost = new FacebookPost();

        prviPost.korisnik = "Milos Jovic";
        prviPost.profilKorisnika = "Marko Markovic";
        prviPost.tekst = "Pozdrav";

        prviPost.like();
        prviPost.like();
        prviPost.share();
        prviPost.dislike();
        prviPost.print();


    FacebookPost drugiPost = new FacebookPost();
        drugiPost.korisnik = "Stefan Stefanovic";
        drugiPost.profilKorisnika = "Milan Milovanoic";
        drugiPost.tekst = "Srecan rodjendan";

        drugiPost.like();
        drugiPost.like();
        drugiPost.like();
        drugiPost.like();
        drugiPost.like();
        drugiPost.dislike();
        drugiPost.share();
        drugiPost.share();
        drugiPost.print();


    }
}
