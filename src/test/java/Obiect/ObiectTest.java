package Obiect;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class ObiectTest {

    @Test
    public void metodaTest(){
        List<String> dotariExterioareAudi= Arrays.asList("faruri led", "oglinzi electrice", "camera video");
        Audi AudiA5 = new Audi("Audi","A5","Rosu",
                "Motorina",2021,1998,50000, dotariExterioareAudi);
        AudiA5.setCuloare("Gri");
        AudiA5.pornesteMasina();
        AudiA5.prezentareAudi();


        List<String> dotariInterioareBMW= Arrays.asList("scaune incalzite", "incalzire volan", "head-up display");
        List<String> dotariExterioareBMW= Arrays.asList("faruri led", "oglinzi electrice", "camera video");
        BMW BMWZ4 = new BMW ("BMW", "Seria 4", "Negru", "Benzina", 2000,
                2998,40000,dotariInterioareBMW,dotariExterioareBMW);
        BMWZ4.pornesteMasina();
        BMWZ4.prezentareBMW();
        BMWZ4.afisarePret();
        BMWZ4.afisarePret(10);
        BMWZ4.afisarePret("Promo22");

//      Masina Toyota=new Masina("Toyota", "Avensis", "Gri", "Benzina", 2001, 1997,25000);
//      Toyota.prezentareMasina();
//
        AudiA5.definireImpozit();
//      BMWZ4.definireImpozit();
//      Toyota.definireImpozit();



    }
}
