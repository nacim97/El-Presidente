package src;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Menu {

    public Menu(){
        initFactions();
    }

    private Factions capitaliste = new Factions("Capitaliste",50, 15, 0);
    private Factions communiste = new Factions("Communiste",50, 15,0);
    private Factions liberaux = new Factions("Libéraux",50, 15,0);
    private Factions religieux = new Factions("Religieux",50, 15,0);
    private Factions militariste = new Factions("Militariste",50, 15,0);
    private Factions ecologiste = new Factions("Ecologiste",50, 15,0);
    private Factions nationaliste = new Factions("Nationaliste",50, 15,0);
    private Factions loyaliste = new Factions("Loyaliste",100, 15,0);

    private ArrayList<Factions> factions = new ArrayList<>();

    public void initFactions(){
        this.factions.add(this.capitaliste);
        this.factions.add(this.communiste);
        this.factions.add(this.liberaux);
        this.factions.add(this.religieux);
        this.factions.add(this.militariste);
        this.factions.add(this.ecologiste);
        this.factions.add(this.nationaliste);
        this.factions.add(this.loyaliste);
    }


    private static Country Agri = Country.Agri;
    private static Country Indu = Country.Indu;
    private static Country Tresor = Country.Tresor;
    private static Country Food = Country.Food;

    public void startMenu() {
        Scanner scanner = new Scanner(System.in);
        int help;

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("|                                                               Bienvenue dans El-Presidente !                                                             |");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Manuel du jeu ? 1. Oui / 2. Non");
        help = scanner.nextInt();
        if (help != 1 && help != 2) {
            System.out.println("Choix possible : 1. Affichage des règles du jeu.");
            System.out.println("Choix possible : 2. Commencer le jeu.");
        }
        if (help == 1) {
            this.helpGame();
        } else {
            System.out.println("Bonne partie et bonne chance !");
        }
    }
    public static void displayRule(){
        System.out.println("----------------------------------------------------------------------Règles du jeu----------------------------------------------------------------------------------\n ");
        System.out.println("Vous incarnerez un président et serez à la tête de votre nation.");
        System.out.println("Votre pays est constitué de 8 factions : Capitaliste / Communistes / Libéraux / Religieux / Militaristes / Ecologistes / Nationaliste et Loyaliste.");
        System.out.println("Chacune de ces factions possède un pourcentage de satisfaction du régime en place. Une faction tombe si elle atteind un taux de satisfaction de 0%.");
        System.out.println("Le but étant d'être le meilleur Président ! Et pour cela vous allez devoir survivre à un maximum d'évènements divers et variés. \n");
        System.out.println("Vous perdez la partie si votre taux de satisfaction global atteint un niveau critique qui est fixé en fonction de la difficulté sélectionné.\n");
        System.out.println("Ce qu'il faut savoir :\n ");
        System.out.println("L'industrie et l'agriculture sont deux marqueurs qui se cumulent et donc peuvent dépasser 100% à deux, mais ne peut être inférieur à 100%.");
        System.out.println("L'industrialisation correspond au pourcentage du pays dédié à l'industrie. De même pour l'agriculture.");
        System.out.println("La trésorie représente l'argent disponible dans les caisses de la république. Cet argent permet d'acheter des rations de nourriture ou bien de payer des pots de vins.\n");

        System.out.println("----------------------------------------------------------------------Déroulement d'une partie----------------------------------------------------------------------\n");
        System.out.println("Une saison correspond à un tour de jeu, soit un évènement.");
        System.out.println("A chaque fin d'année, vous aurez, en tant que président, la possibilité d'influer sur votre nation via 2 options :");
        System.out.println("1 - Verser des pots-de-vins aux nations de votre choix. (Coût : 15€/partisans de la faction concernée. Bénéfice : +10% satisfaction.");
        System.out.println("2 - Acheter des rations alimentaires. (Coût : 8€/rations alimentaires");
        System.out.println("Ces actions sont seulement limité par votre trésorerie.");
        System.out.println("Après 4 saisons, un bilan de fin d'année est effectué :");
        System.out.println("Si l'agriculture et les rations alimentaires ne sont pas suffisantes pour nourrir la poputations, un rééquilibrage de la population est faite.\nDes partisans sont éliminés jusqu'à que les stocks soit suffisants pour les partisans restants.\nIl faut noter que chaque élimination fait perdre 2% de satisfaction à la faction du défunt.\n");
        System.out.println("Dans le cas inverse, l'agriculute est excédentaire et entraîne donc une augmentation de la natalité globale du pays (entre 1 et 10% et répartition aléatoire). \n");

        System.out.println("----------------------------------------------------------------------Condition de défaite--------------------------------------------------------------------------\n");
        System.out.println("En fonction du niveau de difficulté sélectionné, vous êtes considéré perdant lorsque le taux de satisfaction globale des factions atteins le seuil limite.");
        System.out.println("Facile = 10% \nMoyen = 25%\nDifficile = 50%\n");
    }
    public void displayFaction(){

        for (Factions faction : this.factions){
            System.out.println(faction.getName() + " : Satisfaction = " + faction.getSatisfaction() + ", Paritisans  = " + faction.getPartisans());
        }
    }

    public void helpGame(){
        displayRule();
        System.out.println("----------------------------------------------------------------------Initialisation de la partie-------------------------------------------------------------------\n");
        System.out.println("Vous commencerez avec ces statiques de base : \n");
        displayFaction();
        System.out.println("\nL'agriculture ainsi que l'industrialisation sont initialisés à " + Agri.getValue() + ".");
        System.out.println("Vous possèderez : " + Food.getValue() + "rations alimentaires.");
        System.out.println("Concernant la trésorerie, votre pays possède " + Tresor.getValue() + "€.\n");
        System.out.println("Vous connaissez maintenant les règles du jeu. Appuyez sur Entrée afin de lancer la partie.");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    public String initializePresident(){
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("--> Début de la partie.");
        Scanner scanner = new Scanner (System.in);
        System.out.println("Comment voulez-vous que le peuple s'addresse à vous ?");
        String presidentName = scanner.nextLine();
        return presidentName;
    }

    public String initializeCountry(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Et comment s'appelle votre pays ?");
        String countryName = scanner.nextLine();
        return countryName;
    }

    public float choiceLevel(){
        Scanner scanner = new Scanner(System.in);
        float difficulty = 0;
        int level = 0;
        Boolean choiceDifficulty = false;

        System.out.println("Choissisez le niveau de difficulté :");
        System.out.println("Tappez 1 pour la difficulté FACILE");
        System.out.println("Tappez 2 pour la difficulté NORMAL");
        System.out.println("Tappez 3 pour la difficulté DIFFICILE");

        while (!choiceDifficulty) {
            level = scanner.nextInt();
            switch (level) {
                case 1:
                    System.out.println("Difficulté FACILE confirmée.\n");
                    difficulty = 0.5f;
                    choiceDifficulty = true;
                    break;
                case 2:
                    System.out.println("Difficulté NORMAL confirmée.\n");
                    difficulty =1.0f;
                    choiceDifficulty = true;
                    break;
                case 3:
                    System.out.println("Difficulté DIFFICILE confirmée.\n");
                    difficulty = 2.0f;
                    choiceDifficulty = true;
                    break;
                default:
                    System.out.println("Ce niveau n'existe pas, sélectionnez un niveau entre 1 et 3.");
                    choiceDifficulty = false;
            }
        }
        return difficulty;
    }

    public void updateFromEvent(Answers answers){
        for(Factions faction : this.factions){
            faction.setSatisfaction(faction.getSatisfaction() + answers.getEffCap());
        }

    }



    public void viewUpdate(String president, String country){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tappez entrer pour visualiser les impacts.");
        scanner.nextLine();
        this.displayFaction();
        System.out.println("Vos statistiques actuelles : ");
        System.out.println("\nL'Agriculture représente " + Agri.getValue() + "% de " + country + ".");
        System.out.println("L'Industrialisation représente " + Indu.getValue() + "% de " + country + ".");
        System.out.println(president + " possède " + Tresor.getValue() + "€.");
    }

    public void displayPotDeVin(){
        System.out.println("Vous avez choisi de verser un pot de vin.\n");
        System.out.println("Choix de la faction :");
        int i = 1;
        for(Factions faction : this.factions){
            System.out.println( i + ". "+ faction.getName()+ ". ("+(faction.getPartisans()*15) + "€)");
        }
        System.out.println("0. Retour");
    }

    public boolean action(String president, String country){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        int valueTresor = 0;
        int valueFood = 0;

        System.out.println("\nChoissisez l'action que vous souhaitez effectuer : ");
        System.out.println("1 : Verser un pot de vin à la faction de votre choix (15€/partisans , +10% de satisfaction [Faction] , Baisse de satisfaction chez [Loyaliste]).");
        System.out.println("2 : Acheter de la nourriture.");
        System.out.println("3 : Afficher les statistiques.");
        System.out.println("4 : Rien.");

        choice = scanner.nextInt();

        switch (choice){
            case 1 :
                displayPotDeVin();
                choice = scanner.nextInt();
                try{
                    this.factions.get(choice-1).setSatisfaction( this.factions.get(choice-1).getSatisfaction() + 10);
                    valueTresor =   this.factions.get(choice-1).getPartisans() * 15;
                    if(valueTresor < Tresor.getValue()){
                        this.factions.get(choice-1).setSatisfaction(this.factions.get(choice-1).getSatisfaction() + 10);
                        Tresor.setValue(Tresor.getValue() - valueTresor);
                        this.factions.get(choice-1).setSatisfaction( this.factions.get(choice-1).getSatisfaction() - (valueTresor / 10));
                        System.out.println("Pot de vin versé aux "+ this.factions.get(choice-1).getName()+".\n" + "Satisfaction des "+  this.factions.get(choice-1) +": " +  this.factions.get(choice-1).getSatisfaction() + ", cela vous a coûter  " + valueTresor + "€.");
                        System.out.println("Loyaliste satisfaction :" +  this.factions.get(choice-1).getSatisfaction());
                    }else {
                        System.out.println("Vous n'avez pas assez d'argent");
                    }
                    break;
                }catch ( Exception e){
                    //Hors index
                    System.out.println("Faites un choix parmis les factions disponibles.");
                }
                break;
            case 2 :
                System.out.println("Combien de ration de nourriture voulez-vous acheter ? (8€ / ration)" );
                System.out.println("Stock actuel : " + Food.getValue() + " rations et " + Tresor.getValue() + "€.");

                do{
                    valueFood = scanner.nextInt();
                    float costFood = valueFood * 8;
                    if (valueFood >= 0 && costFood < Tresor.getValue()) {
                        Food.setValue(Food.getValue()+valueFood);
                        Tresor.setValue(Tresor.getValue()-(valueFood*8));
                        System.out.println("Nouveau stock : " + Food.getValue() + " et le reste dans la trésorerie est de: " + Tresor.getValue());
                    } else {
                        System.out.println("Vous n'avez pas assez d'argent pour acheter cette quantité de nourriture");
                    }
                } while (valueFood <= 0);
                break;
            case 3 :
                viewUpdate(president, country);
                break;
            case 4 :
                return false;
            default:
                System.out.println("Prenez une décision parmis les choix disponibles.");
        }
        return true;
    }

    public boolean loosecondition(float difficulty){
        System.out.println("\n \n \n ");
        int pourcloose=1;
        if(difficulty == 0.5f){
            pourcloose = 10;
        }
        if(difficulty == 1f){
            pourcloose = 25;
        }
        if(difficulty == 2f){
            pourcloose = 50;
        }

        int somme = 0;
        for (Factions faction : this.factions ){
            somme += faction.getSatisfaction()*faction.getPartisans();
        }
        return somme > pourcloose; //Return vrai ou faux
    }

    public int season(int seas, String president, String country){
        Scanner scanner = new Scanner(System.in);
        if(seas == 4){
            while(this.action(president, country)){}
            EndYear();
            FoodUsed(president, country);
            scanner.nextLine();
            return 1;
        }else seas++;
        return seas;
    }

    public void repartition(){
        Scanner scanner = new Scanner(System.in);
        int choice =0;
        while(Indu.getValue() + Agri.getValue() > 100){
            System.out.println("La surface occupée par l'agriculture et par l'industrialisation est trop grand :");
            System.out.println("Agriculture : " + Agri.getValue());
            System.out.println("Industrialisation : " + Indu.getValue());
            System.out.println("\nVous devez en réduire un, souhaitez vous réduire l'industrialisation (1) ou l'agriculture (2) ?");
            choice = scanner.nextInt();
            if(choice == 1){
                System.out.println("De combien souhaitez vous réduire l'industrialisation ?");
                Indu.setValue(Indu.getValue() - scanner.nextInt());
            }else if(choice == 2){
                System.out.println("De combien souhaitez vous réduire l'agriculture ?");
                Agri.setValue(Agri.getValue() - scanner.nextInt());
            }else System.out.println("Sélectionnez 1 ou 2");
        }
    }

    public void EndYear(){
        int naissance =0;
        System.out.println("Voilà la fin de la l'année ! vos terrains en Industrialisation vous ont permis de gagner " + (Indu.getValue()*10) + "€");
        System.out.println("Votre agriculture a généré " + (Agri.getValue() *40) + " unités de nourriture");
        Tresor.setValue(Tresor.getValue() + (Indu.getValue() * 10));
        Food.setValue(Food.getValue() + (Agri.getValue() * 40));
        if(Agri.getValue()>Indu.getValue()) {
            Random nbbirth = new Random();
            float birth = nbbirth.nextInt(10 - 1);
            System.out.println("Grâce à votre agriculture florissante, vous avez " + birth + " villageois en plus.");
            birth = (int) birth;
            while (birth != 0) {
                Random nbbirth2 = new Random();
                int birth2 = nbbirth2.nextInt(8 - 1);
                switch (birth2) {
                    case 1:
                        this.capitaliste.setPartisans(this.capitaliste.getPartisans() + 1);
                        break;
                    case 2:
                        this.communiste.setPartisans(this.communiste.getPartisans() + 1);
                        break;
                    case 3:
                        this.liberaux.setPartisans(this.liberaux.getPartisans() + 1);
                        break;
                    case 4:
                        this.religieux.setPartisans(this.religieux.getPartisans() + 1);
                        break;
                    case 5:
                        this.militariste.setPartisans(this.militariste.getPartisans() + 1);
                        break;
                    case 6:
                        this.ecologiste.setPartisans(this.ecologiste.getPartisans() + 1);
                        break;
                    case 7:
                        this.nationaliste.setPartisans(this.nationaliste.getPartisans() + 1);
                        break;
                    case 8:
                        this.loyaliste.setPartisans(this.loyaliste.getPartisans() + 1);
                        break;
                }
                birth--;
            }
        }
    }

    public void FoodUsed(String president, String country){
        int deadppl=0;
        int popMonde = (this.capitaliste.getPartisans()+ this.communiste.getPartisans()+ this.liberaux.getPartisans()+
                this.religieux.getPartisans()+ this.militariste.getPartisans()+ this.ecologiste.getPartisans()+ this.nationaliste.getPartisans()
                + this.loyaliste.getPartisans());
        System.out.println("votre population est constituée de " + popMonde+ "Personnes");
        System.out.println("Ils ont consommé 4 unités de nourriture chacun pendant l'année, ce qui fait un total de " + (popMonde*4) + " unités de nourriture.");
        System.out.println("Stock initial : " + Food.getValue());
        Food.setValue(Food.getValue() - (4*popMonde));
        System.out.println("Stock final : " +Food.getValue());
        if(Food.getValue()<0) {
            while (Food.getValue() < 0) {
                Food.setValue(Food.getValue() + 4);
                deadppl++;
            }
            System.out.printf("A cause de la famine, vous avez perdu " + deadppl + " villageois.");
            while (deadppl != 0) {
                Random ddppl = new Random();
                int dpl = ddppl.nextInt(8 - 1);
                switch (dpl) {
                    case 1:
                        if(this.capitaliste.getPartisans()>0) {
                            this.capitaliste.setPartisans(this.capitaliste.getPartisans() - 1);
                            this.capitaliste.setSatisfaction(this.capitaliste.getSatisfaction() -2);
                        }else deadppl++;
                        break;
                    case 2:
                        if(this.communiste.getPartisans()>0) {
                            this.communiste.setPartisans(this.communiste.getPartisans() - 1);
                            this.communiste.setSatisfaction(this.communiste.getSatisfaction()-2);
                        }else deadppl++;
                        break;
                    case 3:
                        if(this.liberaux.getPartisans()>0) {
                            this.liberaux.setPartisans(this.liberaux.getPartisans() - 1);
                            this.liberaux.setSatisfaction(this.liberaux.getSatisfaction() -2);
                        }else deadppl++;
                        break;
                    case 4:
                        if(this.religieux.getPartisans()>0) {
                            this.religieux.setPartisans(this.religieux.getPartisans() - 1);
                            this.religieux.setSatisfaction(this.religieux.getSatisfaction()-2);
                        }else deadppl++;
                        break;
                    case 5:
                        if(this.militariste.getPartisans()>0) {
                            this.militariste.setPartisans(this.militariste.getPartisans() - 1);
                            this.militariste.setSatisfaction(this.militariste.getSatisfaction()-2);
                        }else deadppl++;
                        break;
                    case 6:
                        if(this.ecologiste.getPartisans()>0) {
                            this.ecologiste.setPartisans(this.ecologiste.getPartisans() - 1);
                            this.ecologiste.setSatisfaction(this.ecologiste.getSatisfaction()-2);
                        }else deadppl++;
                        break;
                    case 7:
                        if(this.nationaliste.getPartisans()>0) {
                            this.nationaliste.setPartisans(this.nationaliste.getPartisans() - 1);
                            this.nationaliste.setSatisfaction(this.nationaliste.getSatisfaction()-2);
                        }else deadppl++;
                        break;
                    case 8:
                        if(this.loyaliste.getPartisans()>0) {
                            this.loyaliste.setPartisans(this.loyaliste.getPartisans() - 1);
                            this.loyaliste.setSatisfaction(this.loyaliste.getSatisfaction()-2);
                        }else deadppl++;
                        break;
                }
                deadppl--;
            }
            viewUpdate(president, country);
        }
    }

    public void getdown(){
        for (Factions faction : this.factions){
            if(faction.getSatisfaction()<=0){
                faction.setDown(1);
            }
        }
    }

    public void checkValueSat(){

        for (Factions faction : this.factions){
            if(faction.getSatisfaction() > 100){
                faction.setSatisfaction(100);
            }
        }
    }

    public static void checkMoneyValue(){
        if(Tresor.getValue() < 0){
            System.out.println("Vous n'avez plus de monnaie dans votre trésorie ");
            Tresor.setValue(0);
        }
    }
}
