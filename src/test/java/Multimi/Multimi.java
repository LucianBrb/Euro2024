package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Multimi {

//multimi=array, lista, map

    @Test
    public void testMethod() {

//        colegiCursArray();
//        colegiCursArray();
//        diferiteGrupe();
        tariOrase();
    }

    //reprezentam multimea colegilor de la curs
    public void colegiCursArray() {
        String[] Colegi=new String[5];
        Colegi[0]="Daniel";
        Colegi[1]="Alex";
        Colegi[2]="Lucian";
        Colegi[3]="Lavinia";
        Colegi[4]="Carina";
        for (Integer index=0; index<Colegi.length; index++){
            System.out.println(Colegi[index]);
        }
    }

    //exemplul de mai sus cu liste
    public void colegiCursList(){
        List<String> Colegi=new ArrayList<>();
        Colegi.add("Daniel");
        Colegi.add("Alex");
        Colegi.add("Lucian");
        Colegi.add("Lavinia");
        Colegi.add("Carina");
        for (Integer index=0; index<Colegi.size(); index++) {
            System.out.println(Colegi.get(index));
        }
    }

    //map => key(fruct)-value(mar)
    public void diferiteGrupe() {
        Map<String, String> Obiecte=new HashMap<>();
        Obiecte.put("fruct","mar");
        Obiecte.put("haina","pantaloni");
        Obiecte.put("instrument","chitara");
        for (String key: Obiecte.keySet()){
            System.out.println("Cheia este "+key);
            System.out.println("Valoarea este "+ Obiecte.get(key));
        }

    }

    //reprezentam niste tari cu orasele care le apartin
    public void tariOrase(){
        Map<String,List<String>> Diverse=new HashMap<>();

        List<String> OraseRomania=new ArrayList<>();
        OraseRomania.add("Brasov");
        OraseRomania.add("Iasi");
        OraseRomania.add("Timisoara");

        List<String> OraseSpania=new ArrayList<>();
        OraseSpania.add("Barcelona");
        OraseSpania.add("Madrid");
        OraseSpania.add("Tenerife");

        List<String> OraseItalia=new ArrayList<>();
        OraseItalia.add("Roma");
        OraseItalia.add("Milano");
        OraseItalia.add("Genova");

        Diverse.put("Romania", OraseRomania);
        Diverse.put("Spania", OraseSpania);
        Diverse.put("Italia", OraseItalia);

        for (String key: Diverse.keySet()) {
            if (key.equals("Spania")) {
                System.out.println("Tara este " + key);
                System.out.println("Orasele sunt " + Diverse.get(key));
            }

        }
        //key este unica; valorile(value) pot fi duplicate

    }

    //Tema1: De reprezentat reteta mancare cu lista de ingrediente (denumire mancare este key, valoarea este lista ingrediente
    //Tema2: Adaug cartiere pentru orasele specificate mai sus (intr o metoda noua)




}
