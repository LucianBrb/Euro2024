package variabilaMetoda;

import org.testng.annotations.Test;

public class Cursant {
    //acesta este un comentariu
    //clasa = sablon specific unui anumit obiect/produs
    //o clasa trebuie sa contina un nume
    //recunoastem o clasa intr-un fisier java dupa cuvantul class
    //intr-un fisier java putem avea mai multe clase (nu este un practice bun)
    //variabila = proprietatea/atributul unei clase
    //intr-o clasa putem avea mai multe variabile
    //exista doua tipuri de variabile: global si local
    //variabila globala = vizibila peste tot in acest fisier
    //variabila locala = vizibila doar in locul unde este definita
    //pentru inceput toate variabilele globale sunt publice
    //diferenta intre global si local o face "access control" ("public")
    //tipuri de date: String, Integer, Double (64bit), Float (32bit), Character, Boolean
    //nu este obligatoriu ca o variabila sa primeasca o valoare cand o definim


    public String nume ;
    public String prenume;
    public Integer varsta;
    public Double inaltime;
    public Float greutate;
    public Character sex;
    public Boolean areRestante;


    //metoda = actiunea unei clase
    //intr-o clasa putem avea mai multe metode diferentiate prin nume
    //metodele sunt de doua feluri: void si return
    //void = cea mai des folosita care are ca scop sa execute si sa afiseze informatia
    //return = are ca scop sa execute si sa returneze informatia
    //o metoda poate sau nu sa contina parametrii
    //parametrii se diferentiaza prin numar, nume sau tip


    @Test
   public void metodaTest(){
//        nume="Brebu";
//        prenume="Lucian";
//        varsta=36;
//        inaltime=1.81;
//        greutate=82.0f;
//        sex='M';
//        areRestante=false;

//        prezentareCursant("Brebu","Lucian",36,1.81,82.0f,'M',false);
//        System.out.println(" ");

//        prezentareCursant("Brebu","Roxana",33,1.63,52.0f,'F',false);
//        System.out.println(" ");

        prezentareCursant("Popescu","Ion",43,1.93,92.0f,'F',true);
        calculMedie(7,8,9,5,6);
        System.out.println(getSalariu());


    }


    public void prezentareCursant(String param1, String param2,
                                  Integer param3, Double param4,
                                  Float param5, Character param6, Boolean param7)
    {


        System.out.println("Numele complet al cursantului este: "+param1+" "+param2);
        System.out.println("Varsta cursantului este: "+param3);
        System.out.println("Inaltimea cursantului este: "+param4);
        System.out.println("Greutatea cursantului este: "+param5);
        System.out.println("Sexul cursantului este: "+param6);
        System.out.println("Are cursantul restante: "+param7);

    }



    //Calulam media curasantului din sesiune
    public void calculMedie(Integer nota1, Integer nota2, Integer nota3, Integer nota4, Integer nota5)
    {
        Integer medie=(nota1+nota2+nota3+nota4+nota5)/5;
        System.out.println("Media cursantului este "+medie);

    }

    //Exemplu metoda return 31.01.24 1:37
    public Integer getSalariu()
    {
      Integer salariu=2000;
      return salariu;

    }




}
