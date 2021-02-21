package src;

public class Factions {

    private String name;
    private int satisfaction;
    private int partisans;
    public static Factions capitaliste = new Factions("Capitaliste",50, 15);
    public static Factions commmmuniste = new Factions("Commmmuniste",50, 15);
    public static Factions liberaux = new Factions("Libéraux",50, 15);
    public static Factions religieux = new Factions("Religieux",50, 15);
    public static Factions militariste = new Factions("Militariste",50, 15);
    public static Factions ecologiste = new Factions("Ecologiste",50, 15);
    public static Factions nationaliste = new Factions("Nationaliste",50, 15);
    public static Factions loyaliste = new Factions("Loyaliste",100, 15);

    public Factions(String name, int satisfaction, int partisans) {
        this.name = name;
        this.satisfaction = satisfaction;
        this.partisans = partisans;
    }

    public Factions(String name, int satisfaction) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSatisfaction() {
        return satisfaction;
    }

    public void setSatisfaction(int satisfaction) {
        this.satisfaction = satisfaction;
    }

    public int getPartisans() {
        return partisans;
    }

    public void setPartisans(int partisans) {
        this.partisans = partisans;
    }
}
