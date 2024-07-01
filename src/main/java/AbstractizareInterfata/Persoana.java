package AbstractizareInterfata;

public class Persoana {

    //Abstractizare = conceptul prin care definim comportamentul unei clase
    //Acest concept se poate face folosind interfete sau clase abstracte
    //O interfata se recunoaste dupa cuvantul interface
    //O interfata contine doar metode abstracte( metode care nu au body)
    //Int-o interfata toate metodele sunt publice
    // Intr-o interfata putem avea metode de tip void sau return
    //Intr-o interfata nu putem avea un constructor=> nu putem face un obiect
    //O interfata se implementeaza, o clasa se mosteneste
    //Clasa care implementeaza interfata => trebuie sa ofere implementare pentru toate metodele abstracte
    // O clasa poate implementa n intefete
    //O interfata poate mosteni o alta interfata insa nu poate extinde o clasa abstracta

    private String nume;
    private String prenume;
    private Integer varsta;

    public Persoana(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }


    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }


}
