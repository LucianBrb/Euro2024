package AbstractizareClasaAbstracta;

public abstract class Persoana {

    // O clasa abstracta se recunoaste dupa cuvantul abstract
    // O clasa abstracta poate sau nu sa contina metode abstracte (dif fata de interfata)
    // Putem mosteni o singura clasa abstracta
    // Intr-o clasa abstracta putem avea un constructor => nu poti face un obiect
    // O clasa abstracta poate sa implementeze o interfata
    // O metoda abstracta trebuie sa contina cuvantul abstract

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

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    //metoda cu body
    public void prezentare(){
        System.out.println("Metoda cu body");
    }

    // definesc metodele pentru ambele comportamente
    public abstract void munceste();
    public abstract void prezentaBirou();
    public abstract void pauzaMasa();
    public abstract void incasatSalariu();


    public abstract void prezentaCurs();
    public abstract void examinare();
    public abstract void studiat();


}
