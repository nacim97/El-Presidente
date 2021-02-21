package src;

public class Country {
    private String name;
    private int value;

    public static Country Indu = new Country("Industrialisation", 15);
    public static Country Agri = new Country("Agriculture" , 15);
    public static Country Tresor = new Country ("Trésorerie", 200);
    public static Country Food = new Country ("Nourriture" , 0);

    public Country(String name, int value){
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public int setValue(int value) {
        this.value = value;
        return value;
    }

    public static Country getIndu() {
        return Indu;
    }

    public static void setIndu(Country indu) {
        Indu = indu;
    }

    public static Country getAgri() {
        return Agri;
    }

    public static void setAgri(Country agri) {
        Agri = agri;
    }

    public static Country getTresor() {
        return Tresor;
    }

    public static void setTresor(Country tresor) {
        Tresor = tresor;
    }

    public static Country getFood() {
        return Food;
    }

    public static void setFood(Country food) {
        Food = food;
    }
}

