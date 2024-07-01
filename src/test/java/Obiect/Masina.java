package Obiect;

public class Masina {

    // CONSTRUCTOR = are ca rol sa initilizeze variabilele unei clase
    //putem sa recunoastem un constructor dupa numele clasei
    //de cele mai multe ori constructorul este public
    //exista doua tipuri de constructori: cu parametrii sau fara parametrii
    //intr-o clasa java exista un constructor default fara parametrii
    // OBIECT = instanta unei clase
    //dintr-o clasa putem instantia 'n' obiecte
    //obiectele se diferentiaza prin numele lor sau prin numarul de parametrii pe care il primesc
    //in momentul cand un obiect pprimeste valori (se initializeaza) se apeleaza constructorul din clasa

    private String marca;
    private String model;
    private String culoare;
    private String carburant;
    private Integer an;
    private Integer capacitateCilindrica;
    private Integer pret;


    //exista 4 concepte OOP: mostenire, incapsulare, abstractizare si polimorfism
    //MOSTENIREA = conceptul prin care o clasa este mostenita(extinsa) de o alta clasa
    //cand o clasa mosteneste o alta clasa se formeaza o relatie de parinte-copil
    //in java, o clasa poate mosteni doar o singura clasa
    //cand se aplica mostenirea, copilul poate accesa toate variabilele/ metodele din parinte(daca sunt public sau protected)
    //in momentul cand copilul mosteneste parintele, copilul trebuie sa apeleze constructorul din parinte cu super


    //INCAPSULARE = conceptul prin care excludem posibiltatea ca unele informatii sa fie modificate din exteriorul clasei
    //Access control in java = public, private, protected, default
    //Public = ofera vizibilitate in toate pachetele din proiect
    //Private = restrange vizibilitatea doar in clasa unde este definit
    //Ca sa oferim vizibilitatea proprietatilor in alte clase apelam la conceptul getter/setter


    //POLIMORFISM = conceptul prin care o metoda poate avea implementari diferite
    //Polimorfismul este de doua feluri: dinamic (Oerride) si static (Overload)
    //Polimorfismul dinamic - intr-o ierarhie de clase obtinute prin mostenire, o metoda poate avea implementari diferite
    //Polimorfismul dinamic - se regaseste tot timpul in procesul de mostenire

    //Polimorfismul static: posibilitatea prin care o metoda cu acelasi nume sa fie implementata de mai multe ori
    //Diferentierea intre aceste metode s-ar face prin numarul sau tipul de parametrii
    //Polimorfismul static se poate aplica doar la metodele cu void






    public Masina(String marca, String model, String culoare, String carburant, Integer an, Integer capacitateCilindrica) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.carburant = carburant;
        this.an = an;
        this.capacitateCilindrica = capacitateCilindrica;
    }

    public Masina(String marca, String model, String culoare, String carburant, Integer an, Integer capacitateCilindrica, Integer pret) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.carburant = carburant;
        this.an = an;
        this.capacitateCilindrica = capacitateCilindrica;
        this.pret = pret;
    }

    //definim prima implementare pentru o metoda pe care o vom suprascrie

    public void pornesteMasina (){
        System.out.println("Masina porneste de la cheie!");
    }

    public void prezentareMasina(){
        System.out.println("Marca masinii este "+ marca);
        System.out.println("Modelul masinii este "+ model);
        System.out.println("Culoarea masinii este "+ culoare);
        System.out.println("Carburantul este "+ carburant);
        System.out.println("Anul fabricatiei este "+ an);
        System.out.println("Cilindreea este "+ capacitateCilindrica);
        if (pret!=null){
            System.out.println("Pretul initial al masinii este "+ pret);
        }
        else System.out.println("Ai castigat o masina");

    }

    //>=2023=>5lei
    //2020-2022=>10lei
    //2020=>20lei
    public void definireImpozit(){
        if(an>=2023){
            System.out.println("Pentru "+ marca + " din anul "+ an + " impozitul este 5 lei");
        } else if (an>2020 && an<2023) {
            System.out.println("Pentru "+ marca + " din anul "+ an + " impozitul este 10 lei");
        }
        else if (an==2020){
            System.out.println("Pentru "+ marca + " din anul "+ an + " impozitul este 20 lei");
        }
        else System.out.println("Nu se plateste impozit");

    }

    //facem getter/setter


    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public String getCuloare() {
        return culoare;
    }

    public String getCarburant() {
        return carburant;
    }

    public Integer getAn() {
        return an;
    }

    public Integer getCapacitateCilindrica() {
        return capacitateCilindrica;
    }

    public Integer getPret() {
        return pret;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    public void setAn(Integer an) {
        this.an = an;
    }

}


