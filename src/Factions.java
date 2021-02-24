package src;

import java.lang.Object;

public class Factions implements Cloneable {

    String name;
    int satisfaction;
    private int partisans;
    private int down;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Factions(String name, int satisfaction, int partisans, int down) {
        this.name = name;
        this.satisfaction = satisfaction;
        this.partisans = partisans;
        this.down = down;


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

    public int getDown() {
        return down;
    }

    public void setDown(int down) {
        this.down = down;
    }
}
