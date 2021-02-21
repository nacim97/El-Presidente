package src;

public enum Events {
    ONE("Des extra-terrestes apparaissent et prennent contact, ils souhaitent s'adresser au chef terrien :", 0, 0),
    TWO("Des hackers ont piraté des secrets d'état et réclament une rançon de 250 millions d'euro :", 0, 0),
    THREE("Une pandémie touche mondialement :", 1, 0),
    FOUR("Une nouvelle source d'énergie verte illimitée est découverte :", 0, 0),
    FIVE("Suite à un incendie ayant dévaster une grand partie de la faune et la flore du pays :", 2, 0),
    SIX("Votre fille vient d'être enlevée par des terroristes, ils vous demandent une rançon de 10millions d'euros :", 0, 0),
    SEVEN("Une grève des travailleurs du bâtiment dure depuis 2 semaines :", 0, 0),
    EIGHT("Une forte canicule impacte les agriculteurs, ainsi que les personnes agées :", 3, 0),
    NINE("Des réfugiés de guerre provenant du pays voisins demandent votre protection :", 0, 0),
    TEN("Une météorité va s'écraser très prochainement dans le territoire du pays :", 0, 0),
    ELEVEN("Un traité concernant l'émission de CO2 est proposé à échelle mondiale :", 0, 0),
    TWELVE("Vous observez une augmentation de présence de punaise de lit à échelle nationale :", 0, 0),
    THIRTEEN("Un célèbre et brillant scientifique vous demande des subventions pour ses recherches spatiales :", 0, 0),
    FOURTEEN("Une montée alarmante du niveau du fleuve national menace de déborder :", 0, 0),
    FIFTEEN("Un coup d'état vous menace, il est orchestré par votre premier ministre :", 0, 0),
    SIXTEEN("Un séisme magnitude 7.5 a ravagé une bonne partie de la capitale :", 0, 0),
    SEVENTEEN("une guerre religieuse naît entre les 8 différentes factions présentent au sein du pays :", 0, 0),
    EIGHTEEN("Les nouvelles élections présidentielles approchent :", 0, 0),
    NINETEEN("Votre premier ministre est accusé de détournement de fond public, le peuple n'a pas encore écho de cette information :", 0, 0),
    TWENTY("Votre pays est sélectionné pour organiser les prochains Jeux Olympiques :", 0, 0);

    private final String Specs;
    private final int constraint;
    private int alused;
    Events(String Specs, int constraint, int alused){
        this.Specs = Specs;
        this.constraint = constraint;
        this.alused = alused;
    }
    public String getSpecs(){return this.Specs;}
    public int getconstraint(){return this.constraint;}
    public int getAlused(){return this.alused;}
}
