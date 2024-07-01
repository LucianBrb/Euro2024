package Structuri;

import org.testng.annotations.Test;

public class StructuriRepetitive {
    //structuri repetitive = for, while, for each



    @Test
    public void metodaTest(){
//        afisamprimelennumere(5);
//        afisarecuwhile(7);
          afiseznrpare0la20();

    }

    //afisam primele 15 numere cu For (numar finit de pasi, are timpi morti)

    public void afisamprimelennumere(Integer capat) {
        for (Integer index=0; index<=capat; index++){      //index++    este index+1
            System.out.println(index);
        }
    }


    //aceeasi metoda cu While (numar infinit de pasi, fara timpi morti)

    public void afisarecuwhile(Integer capat) {
        Integer index=0;
        while (index<=capat){
            System.out.println(index);
            index++;
        }
    }

    //vreau sa afisez numerele pare de la 0 la 20

    public void afiseznrpare0la20(){
        for (Integer i=0; i<=20; i++) {
            if (i%2==0){
                System.out.println(i);
            }

        }
    }

}
