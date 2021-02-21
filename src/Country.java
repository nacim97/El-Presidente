package src;

public class Country {
    private String name;
    private int value;

    public static Country Indu = new Country("Industrialisation", 15);
    public static Country Agri = new Country("Agriculture" , 15);
    public static Country Tresor = new Country ("Trésorerie", 2000);
    public static Country Food = new Country ("Nourriture" , 600);

    public Country(String name, int value){
        this.name = name;
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public int setValue(int value) {
        this.value = value;
        return value;
    }
}

