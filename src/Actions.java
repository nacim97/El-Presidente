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
    private float EffLoy;
    private int EffFood;

    public Actions(String name, float amount, int effCap, int effCom, int effLib, int effRel, int effMil, int effEco, int effNat, float effLoy, int EffFood) {
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
