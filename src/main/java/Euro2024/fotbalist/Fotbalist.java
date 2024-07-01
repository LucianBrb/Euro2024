package Euro2024.fotbalist;

import Euro2024.Persoana;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class Fotbalist extends Persoana {

    private Integer pozitieTeren;
    private Integer nrTricou;
    private String club;
    private String nationala;
    private Boolean esteCapitan;
    private Boolean esteArbitru;

    public Fotbalist(String nume, String prenume, Integer varsta, String oras, Double rating, String nationalitate,
                     Integer pozitieTeren, Integer nrTricou, String club, String nationala,
                     Boolean esteCapitan, Boolean esteArbitru) {
        super(nume, prenume, varsta, oras, rating, nationalitate);

        this.pozitieTeren = pozitieTeren;
        this.nrTricou = nrTricou;
        this.club = club;
        this.nationala = nationala;
        this.esteCapitan = esteCapitan;
        this.esteArbitru = esteArbitru;
    }
}