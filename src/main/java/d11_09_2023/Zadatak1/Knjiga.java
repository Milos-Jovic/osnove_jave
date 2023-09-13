package d11_09_2023.Zadatak1;

public class Knjiga {
    private String ISBN;
    private String nazv;
    private int godinaIzdanja;

    private Autor autor;

        public Knjiga(){}



    public Knjiga (String ISBN, String nazv, int godinaIzdanja, Autor autor){

        this.ISBN = ISBN;
        this.nazv = nazv;
        this.godinaIzdanja = godinaIzdanja;
        this.autor = autor;

    }

    public String getISBN(){
        return this.ISBN;
    }

    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }

    public String getNazv(){
        return this.nazv;
    }

    public void setNazv(String nazv){
        this.nazv = nazv;
    }

    public int getGodinaIzdanja(){
        return this.godinaIzdanja;
    }

        public void setGodinaIzdanja(int godinaIzdanja){
        this.godinaIzdanja = godinaIzdanja;
}


    public Autor getAutor(){
        return this.autor;
    }

    public void setAutor(Autor autor){
        this.autor = autor;
    }

        public void print(){
            System.out.println(this.ISBN);
            System.out.println(this.nazv + " - " + this.godinaIzdanja);
            if (this.autor != null){
                System.out.println("Author: ");
                this.autor.print();
            }
        }

}
