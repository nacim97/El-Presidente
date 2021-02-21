package src;

public class Actions {

    private String name;
    private float amount;
    private int EffCap;
    private int EffCom;
    private int EffLib;
    private int EffRel;
    private int EffMil;
    private int EffEco;
    private int EffNat;
    private int EffLoy;
    private int EffFood;
    public static Actions goldCapitaliste = new Actions("Pot de vin : Capitaliste",15,10,0,0,0,0,0,0,0,0);
    public static Actions goldCommuniste = new Actions("Pot de vin : Communiste",15,0,10,0,0,0,0,0,0,0);
    public static Actions goldLiberaux = new Actions("Pot de vin : Liberaux",15,0,0,10,0,0,0,0,0,0);
    public static Actions goldReligieux = new Actions("Pot de vin : Religieux",15,0,0,0,10,0,0,0,0,0);
    public static Actions goldMilitariste = new Actions("Pot de vin : Militariste",15,0,0,0,0,10,0,0,0,0);
    public static Actions goldEcologiste = new Actions("Pot de vin : Ecologiste",15,0,0,0,0,0,10,0,0,0);
    public static Actions goldNationaliste = new Actions("Pot de vin : Nationaliste",15,0,0,0,0,0,0,10,0,0);
    public static Actions foodMarket = new Actions ("Acheter une unité de nourriture",8,0,0,0,0,0,0,0,0,1);

    public Actions(String name, float amount, int effCap, int effCom, int effLib, int effRel, int effMil, int effEco, int effNat, int effLoy, int EffFood) {
        this.name = name;
        this.amount = amount;
        this.EffCap = effCap;
        this.EffCom = effCom;
        this.EffLib = effLib;
        this.EffRel = effRel;
        this.EffMil = effMil;
        this.EffEco = effEco;
        this.EffNat = effNat;
        this.EffLoy = effLoy;
        this.EffFood = EffFood;
    }
}
