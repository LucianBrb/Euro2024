package AbstractizareInterfata;

import java.sql.SQLOutput;

public class PersoanaStudent extends Persoana implements Student{
    public PersoanaStudent(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void prezentaCurs() {
        System.out.println("Studentul merge la curs");
    }

    @Override
    public void examinare() {
        System.out.println("Studentul sustine examenele");

    }

    @Override
    public void studiat() {
        System.out.println("Studentul studieaza");

    }
}
