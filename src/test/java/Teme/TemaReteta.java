package Teme;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TemaReteta {

    @Test
    public void testTema(){

        retetaMancare();
    }


    public void retetaMancare(){
        Map<String, List<String>> reteta=new HashMap<>();

        List<String> retetaLasagna=new ArrayList<>();
        retetaLasagna.add("Carne 500g");
        retetaLasagna.add("Rosii 500g");
        retetaLasagna.add("Pasta tomate 250g");
        retetaLasagna.add("Morcovi 20g");
        retetaLasagna.add("Ceapa 20g");
        retetaLasagna.add("Rosmarin");
        retetaLasagna.add("Sare");

        reteta.put("Lasagna", retetaLasagna);

        for (String key: reteta.keySet()){
            System.out.println("Reteta este "+key);
            System.out.println("Ingredientele sunt"+reteta.get(key));
        }

    }

}
