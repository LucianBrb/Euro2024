package Teme;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultimiTariOraseCartiere {

    @Test
    public void MetodaTest() {
        tariOrase();
        
    }

    public void tariOrase(){

        Map<String, Map<String, List<String>>> Diverse = new HashMap<>();

        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Bucuresti");
        oraseRomania.add("Timisoara");
        oraseRomania.add("Cluj");

        Diverse.put("Romania", new HashMap<>());
        Diverse.get("Romania").put("Bucuresti", new ArrayList<>());
        Diverse.get("Romania").get("Bucuresti").add("cartier B1");
        Diverse.get("Romania").get("Bucuresti").add("cartier B2");
        Diverse.get("Romania").get("Bucuresti").add("cartier B3");

        Diverse.get("Romania").put("Timisoara", new ArrayList<>());
        Diverse.get("Romania").get("Timisoara").add("cartier TM1");
        Diverse.get("Romania").get("Timisoara").add("cartier TM2");
        Diverse.get("Romania").get("Timisoara").add("cartier TM3");

        Diverse.get("Romania").put("Cluj", new ArrayList<>());
        Diverse.get("Romania").get("Cluj").add("cartier CJ1");
        Diverse.get("Romania").get("Cluj").add("cartier CJ2");
        Diverse.get("Romania").get("Cluj").add("cartier CJ3");


        for (String key : Diverse.keySet()) {
            System.out.println("Tara este " + key);
            Map<String, List<String>> Diverse2 = Diverse.get(key);
            for (String key2 : Diverse2.keySet()) {
                System.out.println("Orasul este " + key2);
                System.out.println("Cartierul este " + Diverse2.get(key2));
            }


//        Map<String,Map<String,List<String>>> Diverse2=new HashMap<>();
//
//        List<String> oraseRomania=new ArrayList<>();
//        oraseRomania.add("Bucuresti");
//        oraseRomania.add("Timisoara");
//        oraseRomania.add("Cluj");
//        Diverse2.put("Romania", oraseRomania);
//
//        List<String> cartiereOrase=new ArrayList<>();
//        cartiereOrase.add("cartier1");
//        cartiereOrase.add("cartier2");
//        cartiereOrase.add("cartier3");
//        Diverse2.put("Bucuresti", cartiereOrase);
//
//
//        for(String key: Diverse2.keySet()) {
//            System.out.println("Tara este " + key);
//            System.out.println("Orasul este " + Diverse2.get(key) + "Cartierul este " + Diverse2.get(key));

            //Map<String,Map<String,List<String>>> Diverse2=new HashMap<>();
            //key-Romania, key-Brasov, value-cartier

        }



    }


}
