package Exceptii;

import org.checkerframework.checker.units.qual.C;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Miercuri {

    //Exceptie = eroare care apare in momentul cand programul ruleaza
    //Exceptiie trebuie tratare deoarece contin informatii care pot sa fie exploatate
    //ex: citim continutul unui fisier care nu exista => filenotfoundexception
    //ex: citim datele dintr-un tabel din baza de date => sqlexception
    //ca sa tratam o exceptie ne folosim de constructia: try ... catch ... finally
    //exista doua tipuri de exceptii: checked si unchecked
    //Checked => exceptii care se trateaza in timpul compilarii
    //Unchecked => exceptii care nu se trateaza in timpul compilarii
    //Exista doua cuvinte cheie pentru tratarea exceptiilor: throw si throws
    //Throw => folosit sa arunce o exceptie anume (explicit)
    //Throw => este regasit in interiorul unei metode
    //Throws => este folosit in semnatura metodei ca sa declare ca o metoda poate arunca o exceptie


    @Test
    public void testMethod() throws FileNotFoundException {
        incarcaFisierul();
        //afisareCursanti();
        //cumparEnergizant();
        incarcaFisierV2();
    }

    public void incarcaFisierul(){
        try {
            File file = new File("Adresa/resursa /fisier");  //un fisier ce nu exista
            FileInputStream fileInputStream = new FileInputStream(file);
        }
        catch (FileNotFoundException e){
            System.out.println("Nu exista fisierul");

        }
        finally {
            System.out.println("A intrat pe finally indiferent daca a cazut sau nu");

        }
    }

    public void afisareCursanti(){
        String[] Cursanti = new String[2];

        Cursanti[0]="Lucian";
        Cursanti[1]="Ioana";
        Cursanti[2]="Calin";

        for (int i=0; i<Cursanti.length; i++) {
            System.out.println(Cursanti[i]);
        }
    }

    public void cumparEnergizant () {
        Integer varsta = 15;
        if (varsta<=18){
            throw new RuntimeException("Persoana este minora");
        }
    }

    public void incarcaFisierV2() throws FileNotFoundException {
        File file = new File("Adresa/resursa /fisier");  //un fisier ce nu exista
        FileInputStream fileInputStream = new FileInputStream(file);

    }

}
