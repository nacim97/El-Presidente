package src;

import java.util.ArrayList;
import java.lang.Object;
import java.util.Random;
import java.util.Scanner;

public class Menu implements Cloneable {
    public Object clone2() throws CloneNotSupportedException {
        return super.clone();
    }

    public Menu() throws CloneNotSupportedException {
        initFactions();

    }

    public Country indu = new Country("Industrialisation", 15);
    public Country agri = new Country("Agriculture", 15);
    public Country tresor = new Country("Trésorerie", 2000);
    public Country food = new Country("Nourriture", 600);

    public int difficulty = 0;

    public Factions capitaliste = new Factions("Capitaliste", 50, 15, 0);

    public Factions communiste = (Factions) capitaliste.clone();
    public Factions liberaux = (Factions) capitaliste.clone();
    public Factions religieux = (Factions) capitaliste.clone();
    public Factions militariste = (Factions) capitaliste.clone();
    public Factions ecologiste = (Factions) capitaliste.clone();
    public Factions nationaliste = (Factions) capitaliste.clone();
    public Factions loyaliste = (Factions) capitaliste.clone();

    private ArrayList<Factions> factions = new ArrayList<>();

    public void renameFactions() throws CloneNotSupportedException {
        communiste.setName("Communiste");
        liberaux.setName("Liberaux");
        religieux.setName("Religieux");
        militariste.setName("Militariste");
        ecologiste.setName("Ecologiste");
        nationaliste.setName("Nationaliste");
        loyaliste.setName("Loyaliste");
        loyaliste.setSatisfaction(100);

    }

    public void initFactions() {
        this.factions.add(this.capitaliste);
        this.factions.add(this.communiste);
        this.factions.add(this.liberaux);
        this.factions.add(this.religieux);
        this.factions.add(this.militariste);
        this.factions.add(this.ecologiste);
        this.factions.add(this.nationaliste);
        this.factions.add(this.loyaliste);
    }


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
            helpGame();
        } else {
            System.out.println("Bonne partie et bonne chance !");
        }
    }

    public static void displayRule() {
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

    public void displayFaction() {

        for (Factions faction : this.factions) {
            System.out.println(faction.getName() + " : Satisfaction = " + faction.getSatisfaction() + ", Paritisans  = " + faction.getPartisans());
        }
    }

    public void helpGame() {
        displayRule();
        System.out.println("----------------------------------------------------------------------Initialisation de la partie-------------------------------------------------------------------\n");
        System.out.println("Vous commencerez avec ces statiques de base : \n");
        this.displayFaction();
        System.out.println("\nL'agriculture ainsi que l'industrialisation sont initialisés à " + agri.getValue() + ".");
        System.out.println("Vous possèderez : " + food.getValue() + "rations alimentaires.");
        System.out.println("Concernant la trésorerie, votre pays possède " + tresor.getValue() + "€.\n");
        System.out.println("Vous connaissez maintenant les règles du jeu. Appuyez sur Entrée afin de lancer la partie.");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    public String initializePresident() {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("--> Début de la partie.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Comment voulez-vous que le peuple s'addresse à vous ?");
        String presidentName = scanner.nextLine();
        return presidentName;
    }

    public String initializeCountry() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Et comment s'appelle votre pays ?");
        String countryName = scanner.nextLine();
        return countryName;
    }

    public int choiceLevel() {
        Scanner scanner = new Scanner(System.in);
        int level = 0;
        boolean choiceDifficulty = false;

        System.out.println("Choissisez le niveau de difficulté :");
        System.out.println("Tappez 1 pour la difficulté NORMAL");
        System.out.println("Tappez 2 pour la difficulté DIFFICILE");

        while (!choiceDifficulty) {
            level = scanner.nextInt();
            switch (level) {
                case 1 -> {
                    System.out.println("Difficulté NORMAL confirmée.\n");
                    this.difficulty = 1;
                    choiceDifficulty = true;
                }
                case 2 -> {
                    System.out.println("Difficulté DIFFICILE confirmée.\n");
                    this.difficulty = 2;
                    choiceDifficulty = true;
                }
                default -> {
                    System.out.println("Ce niveau n'existe pas, sélectionnez un niveau entre 1 et 3.");
                    choiceDifficulty = false;
                }
            }
        }
        return this.difficulty;
    }

    public boolean randomEvents(int seas) {

        Scanner scanner = new Scanner(System.in);

        Random nbEvent = new Random();
        int value = 1 + nbEvent.nextInt(20 - 1);
        int valueScenario;
        Boolean choicevalueScenario = true;
        switch (value) {
            case 1:
                if (Events.ONE.getAlused() == 0 && (Events.ONE.getconstraint() != seas)) {
                    System.out.println("Olala \uD83D\uDE31 \uD83D\uDE31 \uD83D\uDE31" + Events.ONE.getSpecs() + "\n");
                    System.out.print(Answers.oneone.getText());
                    System.out.println("(Capitaliste : " + Answers.oneone.getEffCap() + " | Religieux : " + Answers.oneone.getEffRel() + " | Militariste : " + Answers.oneone.getEffMil() + ")\n");
                    System.out.print(Answers.onetwo.getText());
                    System.out.println("(Capitaliste : " + Answers.onetwo.getEffCap() + " | Communiste : " + Answers.onetwo.getEffCom() + " | Libéraliste : " + Answers.onetwo.getEffLib() + " | Religieux : " + Answers.onetwo.getEffRel() + ")\n");
                    System.out.print(Answers.onethree.getText());
                    System.out.println("(Capitaliste : " + Answers.onethree.getEffCap() + " | Communiste : " + Answers.onethree.getEffCom() + " | Libéraliste : " + Answers.onethree.getEffLib() + " | Religieux : " + Answers.onethree.getEffRel() + ")\n");
                    System.out.println("Quel scénario sélectionnez vous ?");

                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                updateFromEvent(Answers.oneone);
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                updateFromEvent(Answers.onetwo);
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                updateFromEvent(Answers.onethree);
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                } else return false;
                break;
            case 2:
                if (Events.TWO.getAlused() == 0 && (Events.TWO.getconstraint() != seas)) {
                    System.out.println("Ayaya \uD83D\uDC68\u200D\uD83D\uDCBB" + Events.TWO.getSpecs() + "\uD83D\uDC68\u200D\uD83D\uDCBB" + "\n");
                    System.out.print(Answers.twoone.getText());
                    System.out.println("(Capitaliste : " + Answers.twoone.getEffCap() + " | Communiste : " + Answers.twoone.getEffCom() + " | Libéraux : " + Answers.twoone.getEffLib() + " | Religieux : " + Answers.twoone.getEffRel() + " | Militant : " + Answers.twoone.getEffMil() + " | Ecologiste : " + Answers.twoone.getEffEco() + " | Nationaliste : " + Answers.twoone.getEffNat() + " | Loyaliste : " + Answers.twoone.getEffLoy() + ")\n");
                    System.out.print(Answers.twotwo.getText());
                    System.out.println("(Capitaliste : " + Answers.twotwo.getEffCap() + " | Communiste : " + Answers.twotwo.getEffCom() + " | Libéraliste : " + Answers.twotwo.getEffLib() + " | Religieux : " + Answers.twotwo.getEffRel() + " | Militant : " + Answers.twotwo.getEffMil() + " | Ecologiste : " + Answers.twotwo.getEffEco() + " | Nationaliste : " + Answers.twotwo.getEffNat() + " | Loyaliste : " + Answers.twotwo.getEffLoy() + ")\n");
                    System.out.print(Answers.twothree.getText());
                    System.out.println("(Religieux : " + Answers.twothree.getEffRel() + " | Militant : " + Answers.twothree.getEffMil() + ")\n");
                    System.out.println("Quel scénario sélectionnez vous ?");

                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                this.updateFromEvent(Answers.twoone);
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                this.updateFromEvent(Answers.twotwo);
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                updateFromEvent(Answers.twothree);
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                } else return false;
                break;
            case 3:
                if (Events.THREE.getAlused() == 0 && (Events.THREE.getconstraint() != seas)) {
                    System.out.println("Catastrophe !! " + Events.THREE.getSpecs() + "\n");
                    System.out.print(Answers.threeone.getText());
                    System.out.println("(Capitaliste : " + Answers.threeone.getEffCap() + " | Religieux : " + Answers.threeone.getEffRel() + ")\n");
                    System.out.print(Answers.twotwo.getText());
                    System.out.println("(Communiste : " + Answers.threetwo.getEffCom() + " | Libéraux : " + Answers.threetwo.getEffLib() + " | Militant : " + Answers.threetwo.getEffMil() + " | Nationaliste : " + Answers.twotwo.getEffNat() + ")\n");
                    System.out.print(Answers.threethree.getText());
                    System.out.println("(Capitaliste : " + Answers.threethree.getEffCap() + " | Ecologiste : " + Answers.threethree.getEffEco() + " | Loyaliste : " + Answers.threethree.getEffLoy() + ")\n");
                    System.out.println("Quel scénario sélectionnez vous ?");

                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                updateFromEvent(Answers.threeone);
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");

                                updateFromEvent(Answers.threetwo);
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                updateFromEvent(Answers.threethree);
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }

                        break;
                    }
                } else return false;
                break;
            case 4:
                if (Events.FOUR.getAlused() == 0 && (Events.FOUR.getconstraint() != seas)) {
                    System.out.println(" Incroyable ! " + Events.FOUR.getSpecs() + "\n");
                    System.out.print(Answers.fourone.getText());
                    System.out.println("(Capitaliste : " + Answers.fourone.getEffCap() + " | Ecologiste : " + Answers.fourone.getEffEco() + " | Nationaliste : " + Answers.fourone.getEffNat() + " | Loyaliste : " + Answers.fourone.getEffLoy() + ")\n");
                    System.out.print(Answers.fourtwo.getText());
                    System.out.println("(Capitaliste : " + Answers.fourtwo.getEffCap() + " | Communiste : " + Answers.fourtwo.getEffCom() + " | Libéraliste : " + Answers.fourtwo.getEffLib() + ")\n");
                    System.out.print(Answers.fourthree.getText());
                    System.out.println("(Capitaliste : " + Answers.fourthree.getEffCap() + " | Libéraliste : " + Answers.fourthree.getEffLib() + " | Religieux : " + Answers.fourthree.getEffRel() + " | Nationaliste : " + Answers.fourthree.getEffNat() + ")\n");
                    System.out.println("Quel scénario sélectionnez vous ?");

                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                updateFromEvent(Answers.fourone);
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                updateFromEvent(Answers.fourtwo);
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                updateFromEvent(Answers.fourthree);
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }

                        break;
                    }
                } else return false;
                break;
            case 5:
                if (Events.FIVE.getAlused() == 0 && (Events.FIVE.getconstraint() != seas)) {
                    System.out.println("Voici le scénario qui ce présente à vous :");
                    System.out.println(Events.FIVE.getSpecs() + "\n");
                    System.out.print(Answers.fiveone.getText());
                    System.out.println("(Religieux : " + Answers.fiveone.getEffRel() + " | Ecologiste : " + Answers.fiveone.getEffEco() + " | Loyaliste : " + Answers.fiveone.getEffLoy() + ")\n");
                    System.out.print(Answers.fivetwo.getText());
                    System.out.println("(Capitaliste : " + Answers.fivetwo.getEffCap() + " | Communiste : " + Answers.fivetwo.getEffCom() + " | Militant : " + Answers.fivetwo.getEffMil() + " | Ecologiste : " + Answers.fivetwo.getEffEco() + ")\n");
                    System.out.print(Answers.fivethree.getText());
                    System.out.println("(Capitaliste : " + Answers.fivethree.getEffCap() + " | Libéraliste : " + Answers.fivethree.getEffLib() + " | Loyaliste : " + Answers.fivethree.getEffLoy() + ")\n");
                    System.out.println("Quel scénario sélectionnez vous ?");

                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                updateFromEvent(Answers.fiveone);
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                updateFromEvent(Answers.fivetwo);
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                updateFromEvent(Answers.fivethree);
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }

                        break;
                    }
                } else return false;
                break;
            case 6:
                if (Events.SIX.getAlused() == 0 && (Events.SIX.getconstraint() != seas)) {
                    System.out.println("Un malheureux incident est arrivé ... :");
                    System.out.println(Events.SIX.getSpecs() + "\n");
                    System.out.print(Answers.sixone.getText());
                    System.out.println("(Capitaliste : " + Answers.sixone.getEffCap() + " | Communiste : " + Answers.sixone.getEffCom() + " | Libéraux : " + Answers.sixone.getEffLib() + " | Religieux : " + Answers.sixone.getEffRel() + " | Militant : " + Answers.sixone.getEffMil() + " | Ecologiste : " + Answers.sixone.getEffEco() + " | Nationaliste : " + Answers.sixone.getEffNat() + " | Loyaliste : " + Answers.sixone.getEffLoy() + ")\n");
                    choicevalueScenario = false;
                } else return false;
                break;
            case 7:
                if (Events.SEVEN.getAlused() == 0 && (Events.SEVEN.getconstraint() != seas)) {
                    System.out.println("Voici le scénario qui ce présente à vous :");
                    System.out.println(Events.SEVEN.getSpecs() + "\n");
                    System.out.print(Answers.sevenone.getText());
                    System.out.println("(Capitaliste : " + Answers.sevenone.getEffCap() + " | Libéraux : " + Answers.sevenone.getEffLib() + " | Nationaliste : " + Answers.sevenone.getEffNat() + " | Loyaliste : " + Answers.sevenone.getEffLoy() + ")\n");
                    System.out.print(Answers.seventwo.getText());
                    System.out.println("(Communiste : " + Answers.seventwo.getEffCom() + " | Libéraliste : " + Answers.seventwo.getEffLib() + " | Religieux : " + Answers.seventwo.getEffRel() + " | Ecologiste : " + Answers.seventwo.getEffEco() + " | Nationaliste : " + Answers.seventwo.getEffNat() + ")\n");
                    System.out.print(Answers.seventhree.getText());
                    System.out.println("(Libéraliste : " + Answers.seventhree.getEffLib() + " | Militant : " + Answers.seventhree.getEffMil() + " | Nationaliste : " + Answers.seventhree.getEffNat() + ")\n");
                    System.out.println("Quel scénario sélectionnez vous ?");

                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                updateFromEvent(Answers.sevenone);
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");

                                updateFromEvent(Answers.seventwo);
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                updateFromEvent(Answers.seventhree);
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }

                        break;
                    }
                } else return false;
                break;
            case 8:
                if (Events.EIGHT.getAlused() == 0 && (Events.EIGHT.getconstraint() != seas)) {
                    System.out.println("Voici le scénario qui ce présente à vous :");
                    System.out.println(Events.EIGHT.getSpecs() + "\n");
                    System.out.print(Answers.eightone.getText());
                    System.out.println("(Capitaliste : " + Answers.eightone.getEffCap() + " | Libéraux : " + Answers.eightone.getEffLib() + " | Religieux : " + Answers.eightone.getEffRel() + " | Ecologiste : " + Answers.eightone.getEffEco() + ")\n");
                    System.out.print(Answers.eighttwo.getText());
                    System.out.println("(Religieux : " + Answers.eighttwo.getEffRel() + " | Ecologiste : " + Answers.eighttwo.getEffEco() + ")\n");
                    System.out.print(Answers.eightthree.getText());
                    System.out.println("(Capitaliste : " + Answers.eightthree.getEffCap() + "Communiste : " + Answers.eightthree.getEffCom() + "Religieux : " + Answers.eightthree.getEffRel() + " | Ecologiste : " + Answers.eightthree.getEffEco() + " | Nationaliste : " + Answers.eightthree.getEffNat() + ")\n");
                    System.out.println("Quel scénario sélectionnez vous ?");
                    choicevalueScenario = false;
                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                updateFromEvent(Answers.eightone);
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                updateFromEvent(Answers.eighttwo);
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                updateFromEvent(Answers.eightthree);
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                        break;
                    }
                } else return false;
                break;
            case 9:
                if (Events.NINE.getAlused() == 0 && (Events.NINE.getconstraint() != seas)) {
                    System.out.println("Voici le scénario qui ce présente à vous :");
                    System.out.println(Events.NINE.getSpecs() + "\n");
                    System.out.print(Answers.nineone.getText());
                    System.out.println("(Capitaliste : " + Answers.nineone.getEffCap() + " | Libéraux : " + Answers.nineone.getEffLib() + " | Religieux : " + Answers.nineone.getEffRel() + " | Ecologiste : " + Answers.nineone.getEffEco() + " | Nationaliste : " + Answers.nineone.getEffNat() + " )\n");
                    System.out.print(Answers.ninetwo.getText());
                    System.out.println("(Capitaliste : " + Answers.ninetwo.getEffCap() + " | Communiste : " + Answers.ninetwo.getEffCom() + " | Libéraux : " + Answers.ninetwo.getEffLib() + " | Religieux : " + Answers.ninetwo.getEffRel() + " | Militariste : " + Answers.ninetwo.getEffMil() + " | Ecologiste : " + Answers.ninetwo.getEffEco() + " | Nationaliste : " + Answers.ninetwo.getEffNat() + " | Loyaliste : " + Answers.ninetwo.getEffLoy() + " )\n");
                    System.out.print(Answers.ninethree.getText());
                    System.out.println("(Libéraux : " + Answers.ninethree.getEffLib() + " | Religieux : " + Answers.ninethree.getEffRel() + " )\n");
                    System.out.println("Quel scénario sélectionnez vous ?");

                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                updateFromEvent(Answers.nineone);
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");

                                this.updateFromEvent(Answers.ninetwo);

                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                updateFromEvent(Answers.ninethree);
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                } else return false;
                break;
            case 10:
                if (Events.TEN.getAlused() == 0 && (Events.TEN.getconstraint() != seas)) {
                    System.out.println("Panique \uD83D\uDE31 " + Events.TEN.getSpecs() + "\n");
                    System.out.print(Answers.tenone.getText());
                    System.out.println("(Capitaliste : " + Answers.tenone.getEffCap() + " | Communiste : " + Answers.tenone.getEffCom() + " | Libéraux : " + Answers.tenone.getEffLib() + " | Religieux : " + Answers.tenone.getEffRel() + " | Militariste : " + Answers.tenone.getEffMil() + " | Ecologiste : " + Answers.tenone.getEffEco() + " | Nationaliste : " + Answers.tenone.getEffNat() + " | Loyaliste : " + Answers.tenone.getEffLoy() + " )\n");
                    System.out.print(Answers.tentwo.getText());
                    System.out.println("(Capitaliste : " + Answers.tentwo.getEffCap() + " | Communiste : " + Answers.tentwo.getEffCom() + " | Libéraux : " + Answers.tentwo.getEffLib() + " | Religieux : " + Answers.tentwo.getEffRel() + " | Militariste : " + Answers.tentwo.getEffMil() + " | Ecologiste : " + Answers.tentwo.getEffEco() + " | Nationaliste : " + Answers.tentwo.getEffNat() + " | Loyaliste : " + Answers.tentwo.getEffLoy() + " )\n");
                    System.out.print(Answers.tenthree.getText());
                    System.out.println("(Capitaliste : " + Answers.tenthree.getEffCap() + " | Communiste : " + Answers.tenthree.getEffCom() + " | Libéraux : " + Answers.tenthree.getEffLib() + " | Religieux : " + Answers.tenthree.getEffRel() + " | Militariste : " + Answers.tenthree.getEffMil() + " | Ecologiste : " + Answers.tenthree.getEffEco() + " | Nationaliste : " + Answers.tenthree.getEffNat() + " | Loyaliste : " + Answers.tenthree.getEffLoy() + " )\n");
                    System.out.println("Quel scénario sélectionnez vous ?");

                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                this.updateFromEvent(Answers.tenone);
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                this.updateFromEvent(Answers.tentwo);
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                this.updateFromEvent(Answers.tenthree);
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                } else return false;
                break;
            case 11:
                if (Events.ELEVEN.getAlused() == 0 && (Events.ELEVEN.getconstraint() != seas)) {
                    System.out.println("Voici le scénario qui ce présente à vous :");
                    System.out.println(Events.ELEVEN.getSpecs() + "\n");
                    System.out.print(Answers.elevenone.getText());
                    System.out.println("(Capitaliste : " + Answers.elevenone.getEffCap() + " | Ecologiste : " + Answers.elevenone.getEffEco() + " | Nationaliste : " + Answers.elevenone.getEffNat() + " )\n");
                    System.out.print(Answers.eleventwo.getText());
                    System.out.println("(Capitaliste : " + Answers.eleventwo.getEffCap() + " | Communiste : " + Answers.eleventwo.getEffCom() + " | Libéraux : " + Answers.eleventwo.getEffLib() + " | Religieux : " + Answers.eleventwo.getEffRel() + " | Militariste : " + Answers.eleventwo.getEffMil() + " | Ecologiste : " + Answers.eleventwo.getEffEco() + " | Nationaliste : " + Answers.eleventwo.getEffNat() + " | Loyaliste : " + Answers.eleventwo.getEffLoy() + " )\n");
                    System.out.print(Answers.eleventhree.getText());
                    System.out.println("(Communiste : " + Answers.eleventhree.getEffCom() + " | Ecologiste : " + Answers.eleventhree.getEffEco() + " | Nationaliste : " + Answers.eleventhree.getEffNat() + " | Loyaliste : " + Answers.eleventhree.getEffLoy() + " )\n");
                    System.out.println("Quel scénario sélectionnez vous ?");
                    choicevalueScenario = false;
                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                updateFromEvent(Answers.elevenone);
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");

                                this.updateFromEvent(Answers.eleventwo);

                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                updateFromEvent(Answers.eleventhree);
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                } else return false;
                break;
            case 12:
                if (Events.TWELVE.getAlused() == 0 && (Events.TWELVE.getconstraint() != seas)) {
                    System.out.println("Malheur ! " + Events.TWELVE.getSpecs() + "\n");
                    System.out.print(Answers.twelveone.getText());
                    System.out.println("(Capitaliste : " + Answers.twelveone.getEffCap() + " | Communiste : " + Answers.twelveone.getEffCom() + " | Libéraux : " + Answers.twelveone.getEffLib() + " | Religieux : " + Answers.twelveone.getEffRel() + " | Militariste : " + Answers.twelveone.getEffMil() + " | Ecologiste : " + Answers.twelveone.getEffEco() + " | Nationaliste : " + Answers.twelveone.getEffNat() + " | Loyaliste : " + Answers.twelveone.getEffLoy() + " )\n");
                    System.out.print(Answers.twelvetwo.getText());
                    System.out.println("(Capitaliste : " + Answers.twelvetwo.getEffCap() + " | Communiste : " + Answers.twelvetwo.getEffCom() + " | Libéraux : " + Answers.twelvetwo.getEffLib() + " | Religieux : " + Answers.twelvetwo.getEffRel() + " | Militariste : " + Answers.twelvetwo.getEffMil() + " | Ecologiste : " + Answers.twelvetwo.getEffEco() + " | Nationaliste : " + Answers.twelvetwo.getEffNat() + " | Loyaliste : " + Answers.twelvetwo.getEffLoy() + " )\n");
                    System.out.print(Answers.twelvethree.getText());
                    System.out.println("(Communiste : " + Answers.twelvetwo.getEffCom() + " | Libéraux : " + Answers.twelvetwo.getEffLib() + " | Nationaliste : " + Answers.twelvetwo.getEffNat() + " )\n");
                    System.out.println("Quel scénario sélectionnez vous ?");
                    choicevalueScenario = false;
                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                this.updateFromEvent(Answers.twelveone);
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                this.updateFromEvent(Answers.twelvetwo);
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                updateFromEvent(Answers.twelvethree);
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                } else return false;
                break;
            case 13:
                if (Events.THIRTEEN.getAlused() == 0 && (Events.THIRTEEN.getconstraint() != seas)) {
                    System.out.println("Voici le scénario qui ce présente à vous :");
                    System.out.println(Events.THIRTEEN.getSpecs() + "\n");
                    System.out.print(Answers.thirdteenone.getText());
                    System.out.println("(Capitaliste : " + Answers.thirdteenone.getEffCap() + " | Religieux : " + Answers.thirdteenone.getEffRel() + " | Ecologiste : " + Answers.thirdteenone.getEffEco() + " )\n");
                    System.out.print(Answers.thirdteentwo.getText());
                    System.out.println("(Capitaliste : " + Answers.thirdteentwo.getEffCap() + " | Communiste : " + Answers.thirdteentwo.getEffCom() + " | Nationaliste : " + Answers.thirdteentwo.getEffNat() + " )\n");
                    System.out.print(Answers.thirdteenthree.getText());
                    System.out.println("(Capitaliste : " + Answers.thirdteenthree.getEffCap() + " | Militariste : " + Answers.thirdteenthree.getEffMil() + " | Loyaliste : " + Answers.thirdteenthree.getEffLoy() + " )\n");
                    System.out.println("Quel scénario sélectionnez vous ?");
                    choicevalueScenario = false;
                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                updateFromEvent(Answers.thirdteenone);
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                updateFromEvent(Answers.thirdteentwo);
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                updateFromEvent(Answers.thirdteenthree);
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                } else return false;
                break;
            case 14:
                if (Events.FOURTEEN.getAlused() == 0 && (Events.FOURTEEN.getconstraint() != seas)) {
                    System.out.println("Voici le scénario qui ce présente à vous :");
                    System.out.println(Events.FOURTEEN.getSpecs() + "\n");
                    System.out.print(Answers.fourteenone.getText());
                    System.out.println("(Communiste : " + Answers.fourteenone.getEffCom() + " | Libéraux : " + Answers.fourteenone.getEffLib() + " | Nationaliste : " + Answers.fourteenone.getEffNat() + " | Loyaliste : " + Answers.fourteenone.getEffLoy() + " )\n");
                    System.out.print(Answers.fourteentwo.getText());
                    System.out.println("(Communiste : " + Answers.fourteentwo.getEffCom() + " | Libéraux : " + Answers.fourteentwo.getEffLib() + " | Nationaliste : " + Answers.fourteentwo.getEffNat() + " )\n");
                    System.out.print(Answers.fourteenthree.getText());
                    System.out.println("(Religieux : " + Answers.fourteenthree.getEffRel() + " | Ecologiste : " + Answers.fourteenthree.getEffEco() + " | Nationaliste : " + Answers.fourteenthree.getEffNat() + " | Loyaliste : " + Answers.fourteenthree.getEffLoy() + " )\n");
                    System.out.println("Quel scénario sélectionnez vous ?");
                    choicevalueScenario = false;
                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                updateFromEvent(Answers.fourteenone);
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                updateFromEvent(Answers.fourteentwo);
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                updateFromEvent(Answers.fourteenthree);
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                } else return false;
                break;
            case 15:
                if (Events.FIFTEEN.getAlused() == 0 && (Events.FIFTEEN.getconstraint() != seas)) {
                    System.out.println("Coup de thêatre ! " + Events.FIFTEEN.getSpecs() + "\n");
                    System.out.print(Answers.fifteenone.getText());
                    System.out.println("(Capitaliste : " + Answers.fifteenone.getEffCap() + " | Communiste : " + Answers.fifteenone.getEffCom() + " | Libéraux : " + Answers.fifteenone.getEffLib() + " | Religieux : " + Answers.fifteenone.getEffRel() + " | Militariste : " + Answers.fifteenone.getEffMil() + " | Ecologiste : " + Answers.fifteenone.getEffEco() + " | Nationaliste : " + Answers.fifteenone.getEffNat() + " | Loyaliste : " + Answers.fifteenone.getEffLoy() + " )\n");
                    System.out.print(Answers.fifteentwo.getText());
                    System.out.println("(Capitaliste : " + Answers.fifteentwo.getEffCap() + " | Communiste : " + Answers.fifteentwo.getEffCom() + " | Libéraux : " + Answers.fifteentwo.getEffLib() + " | Religieux : " + Answers.fifteentwo.getEffRel() + " | Militariste : " + Answers.fifteentwo.getEffMil() + " | Ecologiste : " + Answers.fifteentwo.getEffEco() + " | Nationaliste : " + Answers.fifteentwo.getEffNat() + " | Loyaliste : " + Answers.fifteentwo.getEffLoy() + " )\n");
                    System.out.println("Quel scénario sélectionnez vous ?");
                    choicevalueScenario = false;
                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                this.updateFromEvent(Answers.fifteenone);
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                this.updateFromEvent(Answers.fifteentwo);
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                } else return false;
                break;
            case 16:
                if (Events.SIXTEEN.getAlused() == 0 && (Events.SIXTEEN.getconstraint() != seas)) {
                    System.out.println("Voici le scénario qui ce présente à vous :");
                    System.out.println(Events.SIXTEEN.getSpecs() + "\n");
                    System.out.print(Answers.sixteenone.getText());
                    System.out.println("(Capitaliste : " + Answers.sixteenone.getEffCap() + " | Religieux : " + Answers.sixteenone.getEffRel() + " | Ecologiste : " + Answers.sixteenone.getEffEco() + " | Nationaliste : " + Answers.sixteenone.getEffNat() + " | Loyaliste : " + Answers.sixteenone.getEffLoy() + " )\n");
                    System.out.print(Answers.sixteentwo.getText());
                    System.out.println("(Capitaliste : " + Answers.sixteentwo.getEffCap() + " | Libéraux : " + Answers.sixteentwo.getEffLib() + " | Loyaliste : " + Answers.sixteentwo.getEffLoy() + " )\n");
                    System.out.print(Answers.sixteenthree.getText());
                    System.out.println("(Capitaliste : " + Answers.sixteenthree.getEffCap() + " | Communiste : " + Answers.sixteenthree.getEffCom() + " | Libéraux : " + Answers.sixteenthree.getEffLib() + " | Religieux : " + Answers.sixteenthree.getEffRel() + " | Militariste : " + Answers.sixteenthree.getEffMil() + " | Ecologiste : " + Answers.sixteenthree.getEffEco() + " | Nationaliste : " + Answers.sixteenthree.getEffNat() + " | Loyaliste : " + Answers.sixteenthree.getEffLoy() + " )\n");
                    System.out.println("Quel scénario sélectionnez vous ?");
                    choicevalueScenario = false;
                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                updateFromEvent(Answers.sixteenone);
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                updateFromEvent(Answers.sixteentwo);
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                this.updateFromEvent(Answers.sixteenthree);
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                } else return false;
                break;
            case 17:
                if (Events.SEVENTEEN.getAlused() == 0 && (Events.SEVENTEEN.getconstraint() != seas)) {
                    System.out.println("Vous apprenez qu'" + Events.SEVENTEEN.getSpecs() + "\n");
                    System.out.print(Answers.seventeenone.getText());
                    System.out.println("(Capitaliste : " + Answers.seventeenone.getEffCap() + " | Communiste : " + Answers.seventeenone.getEffCom() + " | Libéraux : " + Answers.seventeenone.getEffLib() + " | Religieux : " + Answers.seventeenone.getEffRel() + " | Militariste : " + Answers.seventeenone.getEffMil() + " | Ecologiste : " + Answers.seventeenone.getEffEco() + " | Nationaliste : " + Answers.seventeenone.getEffNat() + " | Loyaliste : " + Answers.seventeenone.getEffLoy() + " )\n");
                    System.out.print(Answers.seventeentwo.getText());
                    System.out.println("(Capitaliste : " + Answers.seventeentwo.getEffCap() + " | Communiste : " + Answers.seventeentwo.getEffCom() + " | Libéraux : " + Answers.seventeentwo.getEffLib() + " | Religieux : " + Answers.seventeentwo.getEffRel() + " | Militariste : " + Answers.seventeentwo.getEffMil() + " | Ecologiste : " + Answers.seventeentwo.getEffEco() + " | Nationaliste : " + Answers.seventeentwo.getEffNat() + " | Loyaliste : " + Answers.seventeentwo.getEffLoy() + " )\n");
                    System.out.print(Answers.seventeenthree.getText());
                    System.out.println("(Capitaliste : " + Answers.seventeenthree.getEffCap() + " | Communiste : " + Answers.seventeenthree.getEffCom() + " | Libéraux : " + Answers.seventeenthree.getEffLib() + " | Religieux : " + Answers.seventeenthree.getEffRel() + " | Militariste : " + Answers.seventeenthree.getEffMil() + " | Ecologiste : " + Answers.seventeenthree.getEffEco() + " | Nationaliste : " + Answers.seventeenthree.getEffNat() + " | Loyaliste : " + Answers.seventeenthree.getEffLoy() + " )\n");
                    System.out.println("Quel scénario sélectionnez vous ?");
                    choicevalueScenario = false;
                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                this.updateFromEvent(Answers.thirdteenone);
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                this.updateFromEvent(Answers.seventeentwo);
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                this.updateFromEvent(Answers.seventeenthree);
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                } else return false;
                break;
            case 18:
                if (Events.EIGHTEEN.getAlused() == 0 && (Events.EIGHTEEN.getconstraint() != seas)) {
                    System.out.println("Voici le scénario qui ce présente à vous :");
                    System.out.println(Events.EIGHTEEN.getSpecs() + "\n");
                    System.out.print(Answers.eighteenone.getText());
                    System.out.println("(Ecologiste : " + Answers.eighteenone.getEffEco() + " | Loyaliste : " + Answers.eighteenone.getEffLoy() + ")\n");
                    System.out.print(Answers.eighteentwo.getText());
                    System.out.println("(Capitaliste : " + Answers.eighteentwo.getEffCap() + " | Communiste : " + Answers.eighteentwo.getEffCom() + " | Libéraux : " + Answers.eighteentwo.getEffLib() + " | Militariste : " + Answers.eighteentwo.getEffMil() + " | Loyaliste : " + Answers.eighteentwo.getEffLoy() + " )\n");
                    System.out.print(Answers.eighteenthree.getText());
                    System.out.println("(Capitaliste : " + Answers.eighteenthree.getEffCap() + " | Communiste : " + Answers.eighteenthree.getEffCom() + " | Libéraux : " + Answers.eighteenthree.getEffLib() + " | Religieux : " + Answers.eighteenthree.getEffRel() + " | Militariste : " + Answers.eighteenthree.getEffMil() + " | Ecologiste : " + Answers.eighteenthree.getEffEco() + " | Nationaliste : " + Answers.eighteenthree.getEffNat() + " | Loyaliste : " + Answers.eighteenthree.getEffLoy() + " )\n");
                    System.out.println("Quel scénario sélectionnez vous ?");
                    choicevalueScenario = false;
                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                updateFromEvent(Answers.eighteenone);
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                updateFromEvent(Answers.eighteentwo);
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                this.updateFromEvent(Answers.eighteenthree);
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                } else return false;
                break;
            case 19:
                if (Events.NINETEEN.getAlused() == 0 && (Events.NINETEEN.getconstraint() != seas)) {
                    System.out.println("Voici le scénario qui ce présente à vous :");
                    System.out.println(Events.NINETEEN.getSpecs() + "\n");
                    System.out.print(Answers.nineteenone.getText());
                    System.out.println("(Capitaliste : " + Answers.nineteenone.getEffCap() + " | Communiste : " + Answers.nineteenone.getEffCom() + " | Libéraux : " + Answers.nineteenone.getEffLib() + " | Religieux : " + Answers.nineteenone.getEffLoy() + " | Trésorerie : " + Answers.nineteenone.getEffBank() + ")\n");
                    System.out.print(Answers.nineteentwo.getText());
                    System.out.println("(Capitaliste : " + Answers.nineteentwo.getEffCap() + " | Communiste : " + Answers.nineteentwo.getEffCom() + " | Libéraux : " + Answers.nineteentwo.getEffLib() + " | Religieux : " + Answers.nineteentwo.getEffRel() + " | Militariste : " + Answers.nineteentwo.getEffMil() + " | Ecologiste : " + Answers.nineteentwo.getEffEco() + " | Nationaliste : " + Answers.nineteentwo.getEffNat() + " | Loyaliste : " + Answers.nineteentwo.getEffLoy() + " )\n");
                    System.out.print(Answers.nineteenthree.getText());
                    System.out.println("(Capitaliste : " + Answers.nineteenthree.getEffCap() + " | Communiste : " + Answers.nineteenthree.getEffCom() + " | Libéraux : " + Answers.nineteenthree.getEffLib() + " | Religieux : " + Answers.nineteenthree.getEffRel() + " | Militariste : " + Answers.nineteenthree.getEffMil() + " | Ecologiste : " + Answers.nineteenthree.getEffEco() + " | Nationaliste : " + Answers.nineteenthree.getEffNat() + " | Loyaliste : " + Answers.nineteenthree.getEffLoy() + " )\n");
                    System.out.println("Quel scénario sélectionnez vous ?");
                    choicevalueScenario = false;
                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                updateFromEvent(Answers.nineteenone);
                                tresor.setValue(tresor.getValue() + Answers.nineteenone.getEffBank());
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                this.updateFromEvent(Answers.nineteentwo);
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                this.updateFromEvent(Answers.nineteenthree);
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                } else return false;
                break;
            case 20:
                if (Events.TWENTY.getAlused() == 0 && (Events.TWENTY.getconstraint() != seas)) {
                    System.out.println("Incroyable \uD83E\uDD73\uD83E\uDD73 !" + Events.TWENTY.getSpecs() + "\n");
                    System.out.print(Answers.twentyone.getText());
                    System.out.println("(Capitaliste : " + Answers.twentyone.getEffCap() + " | Libéraux : " + Answers.twentyone.getEffLib() + " | Ecologiste : " + Answers.twentyone.getEffEco() + " | Loyaliste : " + Answers.twentyone.getEffLoy() + ")\n");
                    System.out.print(Answers.twentytwo.getText());
                    System.out.println("(Capitaliste : " + Answers.twentytwo.getEffCap() + " | Communiste : " + Answers.twentytwo.getEffCom() + " | Militarite : " + Answers.twentytwo.getEffMil() + " | Loyaliste : " + Answers.twentytwo.getEffLoy() + ")\n");
                    System.out.print(Answers.twentythree.getText());
                    System.out.println("(Capitaliste : " + Answers.twentythree.getEffCap() + " | Religieux : " + Answers.twentythree.getEffRel() + " | Ecologiste : " + Answers.twentythree.getEffEco() + ")\n");
                    System.out.println("Quel scénario sélectionnez vous ?");
                    choicevalueScenario = false;
                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                updateFromEvent(Answers.twentyone);
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                updateFromEvent(Answers.twentytwo);
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                updateFromEvent(Answers.twentythree);
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                } else return false;
                break;
            default:
                System.out.println("Choissiez parmis les scénarios disponible.");
                choicevalueScenario = false;
        }
        return true;
    }

    public void updateFromEvent(Answers answers) {
        for (Factions faction : this.factions) {
            switch (faction.getName()) {
                case "Capitaliste":
                    faction.setSatisfaction(faction.getSatisfaction() + answers.getEffCap() * this.difficulty);
                    break;
                case "Communisme":
                    faction.setSatisfaction(faction.getSatisfaction() + answers.getEffCom() * this.difficulty);
                    break;
                case "Liberaux":
                    faction.setSatisfaction(faction.getSatisfaction() + answers.getEffLib() * this.difficulty);
                    break;
                case "Religieux":
                    faction.setSatisfaction(faction.getSatisfaction() + answers.getEffRel() * this.difficulty);
                    break;
                case "Militariste":
                    faction.setSatisfaction(faction.getSatisfaction() + answers.getEffMil() * this.difficulty);
                    break;
                case "Ecologiste":
                    faction.setSatisfaction(faction.getSatisfaction() + answers.getEffEco() * this.difficulty);
                    break;
                case "Nationaliste":
                    faction.setSatisfaction(faction.getSatisfaction() + answers.getEffNat() * this.difficulty);
                    break;
                case "Loyaliste":
                    faction.setSatisfaction(faction.getSatisfaction() + answers.getEffLoy() * this.difficulty);
                    break;
            }

        }
    }

    public void viewUpdate(String president, String country) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tappez entrer pour visualiser les impacts.");
        scanner.nextLine();
        this.displayFaction();
        System.out.println("Vos statistiques actuelles : ");
        System.out.println("\nL'Agriculture représente " + agri.getValue() + "% de " + country + ".");
        System.out.println("L'Industrialisation représente " + indu.getValue() + "% de " + country + ".");
        System.out.println(president + " possède " + tresor.getValue() + "€.");
    }

    public void displayPotDeVin() {
        System.out.println("Vous avez choisi de verser un pot de vin.\n");
        System.out.println("Choix de la faction :");
        int i = 1;
        for (Factions faction : this.factions) {
            System.out.println(i + ". " + faction.getName() + ". (" + (faction.getPartisans() * 15) + "€)");
            i++;
        }
        System.out.println("0. Retour");
    }

    public boolean action(String president, String country) {
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

        switch (choice) {
            case 1:
                displayPotDeVin();
                choice = scanner.nextInt();
                try {
                    this.factions.get(choice - 1).setSatisfaction(this.factions.get(choice - 1).getSatisfaction() + 10);
                    valueTresor = this.factions.get(choice - 1).getPartisans() * 15;
                    if (valueTresor < tresor.getValue()) {
                        this.factions.get(choice - 1).setSatisfaction(this.factions.get(choice - 1).getSatisfaction() + 10);
                        tresor.setValue(tresor.getValue() - valueTresor);
                        this.factions.get(choice - 1).setSatisfaction(this.factions.get(choice - 1).getSatisfaction() - (valueTresor / 10));
                        System.out.println("Pot de vin versé aux " + this.factions.get(choice - 1).getName() + ".\n" + "Satisfaction des " + this.factions.get(choice - 1).getName() + ": " + this.factions.get(choice - 1).getSatisfaction() + ", cela vous a coûter  " + valueTresor + "€.");
                        System.out.println("Loyaliste satisfaction :" + this.factions.get(choice - 1).getSatisfaction());
                    } else {
                        System.out.println("Vous n'avez pas assez d'argent");
                    }
                    break;
                } catch (Exception e) {
                    //Hors index
                    System.out.println("Faites un choix parmis les factions disponibles.");
                }
                break;
            case 2:
                System.out.println("Combien de ration de nourriture voulez-vous acheter ? (8€ / ration)");
                System.out.println("Stock actuel : " + food.getValue() + " rations et " + tresor.getValue() + "€.");

                do {
                    valueFood = scanner.nextInt();
                    float costFood = valueFood * 8;
                    if (valueFood >= 0 && costFood < tresor.getValue()) {
                        food.setValue(food.getValue() + valueFood);
                        tresor.setValue(tresor.getValue() - (valueFood * 8));
                        System.out.println("Nouveau stock : " + food.getValue() + " et le reste dans la trésorerie est de: " + tresor.getValue());
                    } else {
                        System.out.println("Vous n'avez pas assez d'argent pour acheter cette quantité de nourriture");
                    }
                } while (valueFood <= 0);
                break;
            case 3:
                viewUpdate(president, country);
                break;
            case 4:
                return false;
            default:
                System.out.println("Prenez une décision parmis les choix disponibles.");
        }
        return true;
    }

    public boolean loosecondition(float difficulty) {
        System.out.println("\n \n \n ");
        int pourcloose = 1;
        if (difficulty == 0.5f) {
            pourcloose = 10;
        }
        if (difficulty == 1f) {
            pourcloose = 25;
        }
        if (difficulty == 2f) {
            pourcloose = 50;
        }

        int somme = 0;
        for (Factions faction : this.factions) {
            somme += faction.getSatisfaction() * faction.getPartisans();
        }
        return somme > pourcloose; //Return vrai ou faux
    }

    public int season(int seas, String president, String country) {
        Scanner scanner = new Scanner(System.in);
        if (seas == 4) {
            while (this.action(president, country)) {
            }
            EndYear();
            FoodUsed(president, country);
            scanner.nextLine();
            return 1;
        } else seas++;
        return seas;
    }

    public void repartition() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (indu.getValue() + agri.getValue() > 100) {
            System.out.println("La surface occupée par l'agriculture et par l'industrialisation est trop grand :");
            System.out.println("Agriculture : " + agri.getValue());
            System.out.println("Industrialisation : " + indu.getValue());
            System.out.println("\nVous devez en réduire un, souhaitez vous réduire l'industrialisation (1) ou l'agriculture (2) ?");
            choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("De combien souhaitez vous réduire l'industrialisation ?");
                indu.setValue(indu.getValue() - scanner.nextInt());
            } else if (choice == 2) {
                System.out.println("De combien souhaitez vous réduire l'agriculture ?");
                agri.setValue(agri.getValue() - scanner.nextInt());
            } else System.out.println("Sélectionnez 1 ou 2");
        }
    }

    public void EndYear() {
        int naissance = 0;
        System.out.println("Voilà la fin de la l'année ! vos terrains en Industrialisation vous ont permis de gagner " + (indu.getValue() * 10) + "€");
        System.out.println("Votre agriculture a généré " + (agri.getValue() * 40) + " unités de nourriture");
        tresor.setValue(tresor.getValue() + (indu.getValue() * 10));
        food.setValue(food.getValue() + (agri.getValue() * 40));
        if (agri.getValue() > indu.getValue()) {
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

    public void FoodUsed(String president, String country) {
        int deadppl = 0;
        int popMonde = (this.capitaliste.getPartisans() + this.communiste.getPartisans() + this.liberaux.getPartisans() +
                this.religieux.getPartisans() + this.militariste.getPartisans() + this.ecologiste.getPartisans() + this.nationaliste.getPartisans()
                + this.loyaliste.getPartisans());
        System.out.println("votre population est constituée de " + popMonde + "Personnes");
        System.out.println("Ils ont consommé 4 unités de nourriture chacun pendant l'année, ce qui fait un total de " + (popMonde * 4) + " unités de nourriture.");
        System.out.println("Stock initial : " + food.getValue());
        food.setValue(food.getValue() - (4 * popMonde));
        System.out.println("Stock final : " + food.getValue());
        if (food.getValue() < 0) {
            while (food.getValue() < 0) {
                food.setValue(food.getValue() + 4);
                deadppl++;
            }
            System.out.printf("A cause de la famine, vous avez perdu " + deadppl + " villageois.");
            while (deadppl != 0) {
                Random ddppl = new Random();
                int dpl = ddppl.nextInt(8 - 1);
                switch (dpl) {
                    case 1:
                        if (this.capitaliste.getPartisans() > 0) {
                            this.capitaliste.setPartisans(this.capitaliste.getPartisans() - 1);
                            this.capitaliste.setSatisfaction(this.capitaliste.getSatisfaction() - 2);
                        } else deadppl++;
                        break;
                    case 2:
                        if (this.communiste.getPartisans() > 0) {
                            this.communiste.setPartisans(this.communiste.getPartisans() - 1);
                            this.communiste.setSatisfaction(this.communiste.getSatisfaction() - 2);
                        } else deadppl++;
                        break;
                    case 3:
                        if (this.liberaux.getPartisans() > 0) {
                            this.liberaux.setPartisans(this.liberaux.getPartisans() - 1);
                            this.liberaux.setSatisfaction(this.liberaux.getSatisfaction() - 2);
                        } else deadppl++;
                        break;
                    case 4:
                        if (this.religieux.getPartisans() > 0) {
                            this.religieux.setPartisans(this.religieux.getPartisans() - 1);
                            this.religieux.setSatisfaction(this.religieux.getSatisfaction() - 2);
                        } else deadppl++;
                        break;
                    case 5:
                        if (this.militariste.getPartisans() > 0) {
                            this.militariste.setPartisans(this.militariste.getPartisans() - 1);
                            this.militariste.setSatisfaction(this.militariste.getSatisfaction() - 2);
                        } else deadppl++;
                        break;
                    case 6:
                        if (this.ecologiste.getPartisans() > 0) {
                            this.ecologiste.setPartisans(this.ecologiste.getPartisans() - 1);
                            this.ecologiste.setSatisfaction(this.ecologiste.getSatisfaction() - 2);
                        } else deadppl++;
                        break;
                    case 7:
                        if (this.nationaliste.getPartisans() > 0) {
                            this.nationaliste.setPartisans(this.nationaliste.getPartisans() - 1);
                            this.nationaliste.setSatisfaction(this.nationaliste.getSatisfaction() - 2);
                        } else deadppl++;
                        break;
                    case 8:
                        if (this.loyaliste.getPartisans() > 0) {
                            this.loyaliste.setPartisans(this.loyaliste.getPartisans() - 1);
                            this.loyaliste.setSatisfaction(this.loyaliste.getSatisfaction() - 2);
                        } else deadppl++;
                        break;
                }
                deadppl--;
            }
            viewUpdate(president, country);
        }
    }

    public void getdown() {
        for (Factions faction : this.factions) {
            if (faction.getSatisfaction() <= 0) {
                faction.setDown(1);
            }
        }
    }

    public void checkValueSat() {
        for (Factions faction : this.factions) {
            if (faction.getSatisfaction() > 100) {
                faction.setSatisfaction(100);
            }
        }
    }


    public void checkMoneyValue() {
        if (tresor.getValue() < 0) {
            System.out.println("Vous n'avez plus de monnaie dans votre trésorie ");
            tresor.setValue(0);
        }
    }
}