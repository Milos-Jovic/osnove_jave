package d13_09_2023.Zadatak1;

public class FizickoLice {

private String imeIPrezime;
private int brojLicneKarte;
private String jmbg;
private boolean proveraKupovine;

public FizickoLice (String imeIPrezime, int brojLicneKarte, String jmbg){
    this.imeIPrezime = imeIPrezime;
    this.brojLicneKarte = brojLicneKarte;
    this.jmbg = jmbg;
}

public FizickoLice (String imeIPrezime, int brojLicneKarte, String jmbg, boolean proveraKupovine){
    this.imeIPrezime = imeIPrezime;
    this.brojLicneKarte = brojLicneKarte;
    this.jmbg = jmbg;
    this.proveraKupovine = proveraKupovine;
}

public String getImeIPrezime(){
    return this.imeIPrezime;
}

public void setImeIPrezime(String imeIPrezime){
    this.imeIPrezime = imeIPrezime;
}

public int getBrojLicneKarte(){
    return this.brojLicneKarte;
}

public void setBrojLicneKarte(int brojLicneKarte){
    this.brojLicneKarte=brojLicneKarte;
}

public String getJmbg(){
    return this.jmbg;
}


public boolean getProveraKupovine(){
    return this.proveraKupovine;
}

public void setProveraKupovine(boolean proveraKupovine){
    this.proveraKupovine = proveraKupovine;
}

public void print (){
    System.out.println(this.imeIPrezime + ", " + this.brojLicneKarte);
}



}
