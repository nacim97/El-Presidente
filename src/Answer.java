package src;

public class Answer extends Event{
    private String text;
    private int EffCap;
    private int EffCom;
    private int EffLib;
    private int EffRel;
    private int EffMil;
    private int EffEco;
    private int EffNat;
    private int EffLoy;
    private int EffBank;
    private int EffIndu;
    private int EffAgri;

    public Answer(String text, int effCap, int effCom, int effLib, int effRel, int effMil, int effEco, int effNat, int effLoy, int effBank, int effIndu, int effAgri) {
        this.text = text;
        this.EffCap = effCap;
        this.EffCom = effCom;
        this.EffLib = effLib;
        this.EffRel = effRel;
        this.EffMil = effMil;
        this.EffEco = effEco;
        this.EffNat = effNat;
        this.EffLoy = effLoy;
        this.EffBank = effBank;
        this.EffIndu = effIndu;
        this.EffAgri = effAgri;
    }


}
