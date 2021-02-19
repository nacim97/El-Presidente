package src;

public class Factions {

    private String name;
    private int satisfaction;
    private int partisans;

    public Factions(String name, int satisfaction, int partisans) {
        this.name = name;
        this.satisfaction = satisfaction;
        this.partisans = partisans;
    }

    public Factions(String name, int satisfaction) {
    }
}
