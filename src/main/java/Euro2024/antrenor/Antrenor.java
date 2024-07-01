package Euro2024.antrenor;

import Euro2024.Persoana;

public class Antrenor extends Persoana implements AntrenorInterfata {
    private Integer aniExperienta;
    private String echipaNationala;
    private Integer nrTrofee;

    public Antrenor(String name, String prenume, Integer varsta, String oras, Double rating,
                    String nationalitate, Integer aniExperienta, String echipaNationala, Integer nrTrofee) {
        super(name, prenume, varsta, oras, rating, nationalitate);
        this.aniExperienta=aniExperienta;
        this.echipaNationala=echipaNationala;
        this.nrTrofee=nrTrofee;
    }
    @Override
    public void strategieAntrenamente(){

    }

    @Override
    public void selectionare() {

    }

    @Override
    public void implementareStrategii() {

    }

    @Override
    public void conferintaPresa() {

    }
}
