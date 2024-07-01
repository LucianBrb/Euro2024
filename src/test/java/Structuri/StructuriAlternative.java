package Structuri;

import org.testng.annotations.Test;

public class StructuriAlternative {
    //structuri alternative = IF... THEN...ELSE / SWITCH....CASE


    @Test
    public void metodaTest(){
//        numarMaiMareCaX(11);
//        numarMaiMareCaX(10);
//        numarMaiMareCaX(9);

//        numarParPozitiv(0);
//        numarParPozitiv(1);
//        numarParPozitiv(2);
//        numarParPozitiv(-2);
//        numarParPozitiv(-1);


        zileSaptamana(3);


    }




    //verificam daca un numar este mai mare decat 10

    public void numarMaiMareCaX(Integer input) {
        if (input>10) {
            System.out.println("Numarul "+input+" este mai mare decat 10");
        }

        else if (input==10) {
            System.out.println("Numarul "+input+" este egal cu 10");
        }

        else {
            System.out.println("Numarul "+input+" este mai mic decat 10");
        }

    }



    //verificam daca un numar este par si pozitiv

    public void numarParPozitiv(Integer x) {
        if (x%2==0) {
            if (x>=0) {
                System.out.println("Numarul "+x+" este par si pozitiv");
            }
            else System.out.println("Numarul "+x+" este par si negativ");
        }
        else {
            if (x>=0) {
                System.out.println("Numarul "+x+" este impar si pozitiv");
            }
            else System.out.println("Numarul "+x+" este impar si negativ");
        }


    }

    //verificam ca o propozitie contine doua cuvinte
    //Ana are mere=> caut Ana si mere
    public void propozitie(String propozitie, String cuvant1, String cuvant2) {
        if (propozitie.contains(cuvant1) && propozitie.contains(cuvant2)) {  // ! = negatie
            System.out.println("Adevarat");
        }
        else {
            System.out.println("Fals");
        }

    }

    //reprezentam cazurile pentru zilele saptamanii
    public void zileSaptamana(Integer zi) {
        switch (zi){
            case 1:
                System.out.println("Azi e luni");
                break; //opreste rularea codului pentru urmatoarele cazuri
            case 2:
                System.out.println("Azi este marti");
                break;
            case 3:
                System.out.println("Azi este miercuri");
                break;
            default:
                System.out.println("Valoare invalida");

        }
    }

}
