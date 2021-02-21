package src;

import java.util.Random;
import java.util.Scanner;

public class Menu {

    private static Factions Capitaliste = Factions.capitaliste;
    private static Factions Liberaux = Factions.liberaux;
    private static Factions Communiste = Factions.communiste;
    private static Factions Religieux = Factions.religieux;
    private static Factions Militariste = Factions.militariste;
    private static Factions Ecologiste = Factions.ecologiste;
    private static Factions Nationaliste = Factions.nationaliste;
    private static Factions Loyaliste = Factions.loyaliste;

    private static Actions GoldCapitaliste = Actions.goldCapitaliste;
    private static Actions GoldCommuniste = Actions.goldCommuniste;
    private static Actions GoldLiberaux = Actions.goldLiberaux;
    private static Actions GoldReligieux = Actions.goldReligieux;
    private static Actions GoldMilitariste = Actions.goldMilitariste;
    private static Actions GoldEcologiste = Actions.goldEcologiste;
    private static Actions GoldNationaliste = Actions.goldNationaliste;
    private static Actions FoodMarket = Actions.foodMarket;

    private static Events one = Events.ONE;
    private static Events two = Events.TWO;
    private static Events three = Events.THREE;
    private static Events four = Events.FOUR;
    private static Events five = Events.FIVE;
    private static Events six = Events.SIX;
    private static Events seven = Events.SEVEN;
    private static Events eight = Events.EIGHT;
    private static Events nine = Events.NINE;
    private static Events ten = Events.TEN;
    private static Events eleven = Events.ELEVEN;
    private static Events twelve = Events.TWELVE;
    private static Events thirteen = Events.THIRTEEN;
    private static Events fourteen = Events.FOURTEEN;
    private static Events fifteen = Events.FIFTEEN;
    private static Events sixteen = Events.SIXTEEN;
    private static Events seventeen = Events.SEVENTEEN;
    private static Events eighteen = Events.EIGHTEEN;
    private static Events nineteen = Events.NINETEEN;
    private static Events twenty = Events.TWENTY;

    private static Answers oneone = Answers.oneone;
    private static Answers onetwo = Answers.onetwo;
    private static Answers onethree = Answers.onethree;
    private static Answers twoone = Answers.twoone;
    private static Answers twotwo = Answers.twotwo;
    private static Answers twothree = Answers.twothree;
    private static Answers threeone = Answers.threeone;
    private static Answers threetwo = Answers.threetwo;
    private static Answers threethree = Answers.threethree;
    private static Answers fourone = Answers.fourone;
    private static Answers fourtwo = Answers.fourtwo;
    private static Answers fourthree = Answers.fourthree;
    private static Answers fiveone = Answers.fiveone;
    private static Answers fivetwo = Answers.fivetwo;
    private static Answers fivethree = Answers.fivethree;
    private static Answers sixone = Answers.sixone;
    private static Answers sevenone = Answers.sevenone;
    private static Answers seventwo = Answers.seventwo;
    private static Answers seventhree = Answers.seventhree;
    private static Answers eightone = Answers.eightone;
    private static Answers eighttwo = Answers.eighttwo;
    private static Answers eightthree = Answers.eightthree;
    private static Answers nineone = Answers.nineone;
    private static Answers ninetwo = Answers.ninetwo;
    private static Answers ninethree = Answers.ninethree;
    private static Answers tenone = Answers.tenone;
    private static Answers tentwo = Answers.tentwo;
    private static Answers tenthree = Answers.tenthree;
    private static Answers elevenone = Answers.elevenone;
    private static Answers eleventwo = Answers.eleventwo;
    private static Answers eleventhree = Answers.eleventhree;
    private static Answers twelveone = Answers.twelveone;
    private static Answers twelvetwo = Answers.twelvetwo;
    private static Answers twelvethree = Answers.twelvethree;
    private static Answers thirdteenone = Answers.thirdteenone;
    private static Answers thirdteentwo = Answers.thirdteentwo;
    private static Answers thirdteenthree = Answers.thirdteenthree;
    private static Answers fourteenone = Answers.fourteenone;
    private static Answers fourteentwo = Answers.fourteentwo;
    private static Answers fourteenthree = Answers.fourteenthree;
    private static Answers fifteenone = Answers.fifteenone;
    private static Answers fifteentwo = Answers.fifteentwo;
    private static Answers sixteenone = Answers.sixteenone;
    private static Answers sixteentwo = Answers.sixteentwo;
    private static Answers sixteenthree = Answers.sixteenthree;
    private static Answers seventeenone = Answers.seventeenone;
    private static Answers seventeentwo = Answers.seventeentwo;
    private static Answers seventeenthree = Answers.seventeenthree;
    private static Answers eighteenone = Answers.eighteenone;
    private static Answers eighteentwo = Answers.eighteentwo;
    private static Answers eighteenthree = Answers.eighteenthree;
    private static Answers nineteenone = Answers.nineteenone;
    private static Answers nineteentwo = Answers.nineteentwo;
    private static Answers nineteenthree = Answers.nineteenthree;
    private static Answers twentyone = Answers.twentyone;
    private static Answers twentytwo = Answers.twentytwo;
    private static Answers twentythree = Answers.twentythree;

    private static Country Agri = Country.Agri;
    private static Country Indu = Country.Indu;
    private static Country Tresor = Country.Tresor;
    private static Country Food = Country.Food;


    public static void startMenu() {
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

    public static void helpGame(){
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

        System.out.println("----------------------------------------------------------------------Initialisation de la partie-------------------------------------------------------------------\n");
        System.out.println("Vous commencerez avec ces statistiques de base : \n");
        System.out.print("Capitaliste : Satisfaction = " + Capitaliste.getSatisfaction() + ", Partisans = " + Capitaliste.getPartisans());
        System.out.println(" || Communiste : Satisfaction = " + Communiste.getSatisfaction() + ", Partisans = " + Communiste.getPartisans());
        System.out.print("Libéraux : Satisfaction = " + Liberaux.getSatisfaction() + ", Partisans = " + Liberaux.getPartisans());
        System.out.println(" || Religieux : Satisfaction = " + Religieux.getSatisfaction() + ", Partisans = " + Religieux.getPartisans());
        System.out.print("Militariste : Satisfaction = " + Militariste.getSatisfaction() + ", Partisans = " + Militariste.getPartisans());
        System.out.println(" || Ecologiste : Satisfaction = " + Ecologiste.getSatisfaction() + ", Partisans = " + Ecologiste.getPartisans());
        System.out.print("Nationaliste : Satisfaction = " + Nationaliste.getSatisfaction() + ", Partisans = " + Nationaliste.getPartisans());
        System.out.println(" || Loyaliste : Satisfaction = " + Loyaliste.getSatisfaction() + ", Partisans = " + Loyaliste.getPartisans());

        System.out.println("\nL'agriculture ainsi que l'industrialisation sont initialisés à " + Agri.getValue() + ".");
        System.out.println("Vous possèderez : " + Food.getValue() + "rations alimentaires.");
        System.out.println("Concernant la trésorerie, votre pays possède " + Tresor.getValue() + "€.\n");

        System.out.println("Vous connaissez maintenant les règles du jeu. Appuyez sur Entrée afin de lancer la partie.");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    public static String initializePresident(){
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("--> Début de la partie.");
        Scanner scanner = new Scanner (System.in);
        System.out.println("Comment voulez-vous que le peuple s'addresse à vous ?");
        String presidentName = scanner.nextLine();
        return presidentName;
    }

    public static String initializeCountry(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Et comment s'appelle votre pays ?");
        String countryName = scanner.nextLine();
        return countryName;
    }

    public static float choiceLevel(){
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

    public static boolean randomEvents(int seas){

        Scanner scanner = new Scanner(System.in);

        Random nbEvent = new Random();
        int value = 1 + nbEvent.nextInt(20-1);
        int valueScenario;
        Boolean choicevalueScenario = true;
        switch (value) {
            case 1:
                if(one.getAlused() == 0 && (one.getconstraint() != seas)) {
                    System.out.println("Olala \uD83D\uDE31 \uD83D\uDE31 \uD83D\uDE31" + one.getSpecs() + "\n");
                    System.out.print(oneone.getText());
                    System.out.println("(Capitaliste : " + oneone.getEffCap() + " | Religieux : " + oneone.getEffRel() + " | Militariste : " + oneone.getEffMil() + ")\n");
                    System.out.print(onetwo.getText());
                    System.out.println("(Capitaliste : " + onetwo.getEffCap() + " | Communiste : " + onetwo.getEffCom() + " | Libéraliste : " + onetwo.getEffLib() + " | Religieux : " + onetwo.getEffRel() + ")\n");
                    System.out.print(onethree.getText());
                    System.out.println("(Capitaliste : " + onethree.getEffCap() + " | Communiste : " + onethree.getEffCom() + " | Libéraliste : " + onethree.getEffLib() + " | Religieux : " + onethree.getEffRel() + ")\n");
                    System.out.println("Quel scénario sélectionnez vous ?");

                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + oneone.getEffCap());
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + oneone.getEffRel());
                                Militariste.setSatisfaction(Militariste.getSatisfaction() + oneone.getEffMil());
                                //les calculs
                                // affichage résumé / impacts des calculs
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                Communiste.setSatisfaction(Communiste.getSatisfaction() + onetwo.getEffCom());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + onetwo.getEffLib());
                                Militariste.setSatisfaction(Militariste.getSatisfaction() + onetwo.getEffMil());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + onetwo.getEffNat());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + onetwo.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + onethree.getEffCap());
                                Communiste.setSatisfaction(Communiste.getSatisfaction() + onethree.getEffCom());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + onethree.getEffLib());
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + onethree.getEffRel());
                                Militariste.setSatisfaction(Militariste.getSatisfaction() + onethree.getEffMil());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + onethree.getEffEco());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + onethree.getEffNat());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + onethree.getEffLoy());

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
                if(two.getAlused() == 0 && (two.getconstraint() != seas)) {
                    System.out.println("Ayaya \uD83D\uDC68\u200D\uD83D\uDCBB" + two.getSpecs() + "\uD83D\uDC68\u200D\uD83D\uDCBB" + "\n");
                    System.out.print(twoone.getText());
                    System.out.println("(Capitaliste : " + twoone.getEffCap() + " | Communiste : " + twoone.getEffCom() + " | Libéraux : " + twoone.getEffLib() + " | Religieux : " + twoone.getEffRel() + " | Militant : " + twoone.getEffMil() + " | Ecologiste : " + twoone.getEffEco() + " | Nationaliste : " + twoone.getEffNat() + " | Loyaliste : " + twoone.getEffLoy() + ")\n");
                    System.out.print(twotwo.getText());
                    System.out.println("(Capitaliste : " + twotwo.getEffCap() + " | Communiste : " + twotwo.getEffCom() + " | Libéraliste : " + twotwo.getEffLib() + " | Religieux : " + twotwo.getEffRel() + " | Militant : " + twotwo.getEffMil() + " | Ecologiste : " + twotwo.getEffEco() + " | Nationaliste : " + twotwo.getEffNat() + " | Loyaliste : " + twotwo.getEffLoy() + ")\n");
                    System.out.print(twothree.getText());
                    System.out.println("(Religieux : " + twothree.getEffRel() + " | Militant : " + twothree.getEffMil() + ")\n");
                    System.out.println("Quel scénario sélectionnez vous ?");

                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + twoone.getEffCap());
                                Communiste.setSatisfaction(Communiste.getSatisfaction() + twotwo.getEffCom());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + twoone.getEffLib());
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + twoone.getEffRel());
                                Militariste.setSatisfaction(Militariste.getSatisfaction() + twoone.getEffMil());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + twoone.getEffEco());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + twoone.getEffNat());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + twoone.getEffLoy());
                                //les calculs
                                // affichage résumé / impacts des calculs
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + twotwo.getEffCap());
                                Communiste.setSatisfaction(Communiste.getSatisfaction() + twotwo.getEffCom());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + twotwo.getEffLib());
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + twotwo.getEffRel());
                                Militariste.setSatisfaction(Militariste.getSatisfaction() + twotwo.getEffMil());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + twotwo.getEffEco());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + twotwo.getEffNat());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + twotwo.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + twothree.getEffRel());
                                Militariste.setSatisfaction(Militariste.getSatisfaction() + twothree.getEffMil());
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                }else return false;
                break;
            case 3:
                if(three.getAlused() == 0 && (three.getconstraint() != seas)) {
                    System.out.println("Catastrophe !! " + three.getSpecs() + "\n");
                    System.out.print(threeone.getText());
                    System.out.println("(Capitaliste : " + threeone.getEffCap() + " | Religieux : " + threeone.getEffRel() + ")\n");
                    System.out.print(twotwo.getText());
                    System.out.println("(Communiste : " + threetwo.getEffCom() + " | Libéraux : " + threetwo.getEffLib() + " | Militant : " + threetwo.getEffMil() + " | Nationaliste : " + twotwo.getEffNat() + ")\n");
                    System.out.print(threethree.getText());
                    System.out.println("(Capitaliste : " + threethree.getEffCap() + " | Ecologiste : " + threethree.getEffEco() + " | Loyaliste : " + threethree.getEffLoy() + ")\n");
                    System.out.println("Quel scénario sélectionnez vous ?");

                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + threeone.getEffCap());
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + threeone.getEffRel());
                                //les calculs
                                // affichage résumé / impacts des calculs
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");

                                Communiste.setSatisfaction(Communiste.getSatisfaction() + threetwo.getEffCom());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + threetwo.getEffLib());
                                Militariste.setSatisfaction(Militariste.getSatisfaction() + threetwo.getEffMil());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + threetwo.getEffNat());
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + threethree.getEffCap());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + threethree.getEffEco());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + threethree.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }

                        break;
                    }
                }else return false;
                break;
            case 4:
                if(four.getAlused() == 0 && (four.getconstraint() != seas)) {
                    System.out.println(" Incroyable ! " + four.getSpecs() + "\n");
                    System.out.print(fourone.getText());
                    System.out.println("(Capitaliste : " + fourone.getEffCap() + " | Ecologiste : " + fourone.getEffEco() + " | Nationaliste : " + fourone.getEffNat() + " | Loyaliste : " + fourone.getEffLoy() + ")\n");
                    System.out.print(fourtwo.getText());
                    System.out.println("(Capitaliste : " + fourtwo.getEffCap() + " | Communiste : " + fourtwo.getEffCom() + " | Libéraliste : " + fourtwo.getEffLib() + ")\n");
                    System.out.print(fourthree.getText());
                    System.out.println("(Capitaliste : " + fourthree.getEffCap() + " | Libéraliste : " + fourthree.getEffLib() + " | Religieux : " + fourthree.getEffRel() + " | Nationaliste : " + fourthree.getEffNat() + ")\n");
                    System.out.println("Quel scénario sélectionnez vous ?");

                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + fourone.getEffCap());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + fourone.getEffEco());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + fourone.getEffNat());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + fourone.getEffLoy());
                                //les calculs
                                // affichage résumé / impacts des calculs
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + fourtwo.getEffCap());
                                Communiste.setSatisfaction(Communiste.getSatisfaction() + fourtwo.getEffCom());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + fourtwo.getEffLib());
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + fourthree.getEffCap());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + fourthree.getEffLib());
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + fourthree.getEffRel());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + fourthree.getEffNat());
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }

                        break;
                    }
                }else return false;
                break;
            case 5:
                if(five.getAlused() == 0 && (five.getconstraint() != seas)) {
                    System.out.println("Voici le scénario qui ce présente à vous :");
                    System.out.println(five.getSpecs() + "\n");
                    System.out.print(fiveone.getText());
                    System.out.println("(Religieux : " + fiveone.getEffRel() + " | Ecologiste : " + fiveone.getEffEco() + " | Loyaliste : " + fiveone.getEffLoy() + ")\n");
                    System.out.print(fivetwo.getText());
                    System.out.println("(Capitaliste : " + fivetwo.getEffCap() + " | Communiste : " + fivetwo.getEffCom() + " | Militant : " + fivetwo.getEffMil() + " | Ecologiste : " + fivetwo.getEffEco() + ")\n");
                    System.out.print(fivethree.getText());
                    System.out.println("(Capitaliste : " + fivethree.getEffCap() + " | Libéraliste : " + fivethree.getEffLib() + " | Loyaliste : " + fivethree.getEffLoy() + ")\n");
                    System.out.println("Quel scénario sélectionnez vous ?");

                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + fiveone.getEffRel());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + fiveone.getEffEco());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + fiveone.getEffLoy());
                                //les calculs
                                // affichage résumé / impacts des calculs
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + fivetwo.getEffCap());
                                Communiste.setSatisfaction(Communiste.getSatisfaction() + fivetwo.getEffCom());
                                Militariste.setSatisfaction(Militariste.getSatisfaction() + fivetwo.getEffMil());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + fivetwo.getEffEco());
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + fivethree.getEffCap());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + fourthree.getEffLib());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + fivethree.getEffLoy());
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
                if(six.getAlused() == 0 && (six.getconstraint() != seas)) {
                    System.out.println("Voici le scénario qui ce présente à vous :");
                    System.out.println(six.getSpecs() + "\n");
                    System.out.print(sixone.getText());
                    System.out.println("(Capitaliste : " + sixone.getEffCap() + " | Communiste : " + sixone.getEffCom() + " | Libéraux : " + sixone.getEffLib() + " | Religieux : " + sixone.getEffRel() + " | Militant : " + sixone.getEffMil() + " | Ecologiste : " + sixone.getEffEco() + " | Nationaliste : " + sixone.getEffNat() + " | Loyaliste : " + sixone.getEffLoy() + ")\n");
                    scanner.nextLine();
                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + twoone.getEffCap());
                                Communiste.setSatisfaction(Communiste.getSatisfaction() + twotwo.getEffCom());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + twoone.getEffLib());
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + twoone.getEffRel());
                                Militariste.setSatisfaction(Militariste.getSatisfaction() + twoone.getEffMil());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + twoone.getEffEco());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + twoone.getEffNat());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + twoone.getEffLoy());
                                //les calculs
                                // affichage résumé / impacts des calculs
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }

                        break;
                    }
                }else return false;
                break;
            case 7:
                if(seven.getAlused() == 0 && (seven.getconstraint() != seas)) {
                    System.out.println("Voici le scénario qui ce présente à vous :");
                    System.out.println(seven.getSpecs() + "\n");
                    System.out.print(sevenone.getText());
                    System.out.println("(Capitaliste : " + sevenone.getEffCap() + " | Libéraux : " + sevenone.getEffLib() + " | Nationaliste : " + sevenone.getEffNat() + " | Loyaliste : " + sevenone.getEffLoy() + ")\n");
                    System.out.print(seventwo.getText());
                    System.out.println("(Communiste : " + seventwo.getEffCom() + " | Libéraliste : " + seventwo.getEffLib() + " | Religieux : " + seventwo.getEffRel() + " | Ecologiste : " + seventwo.getEffEco() + " | Nationaliste : " + seventwo.getEffNat() + ")\n");
                    System.out.print(seventhree.getText());
                    System.out.println("(Libéraliste : " + seventhree.getEffLib() + " | Militant : " + seventhree.getEffMil() + " | Nationaliste : " + seventhree.getEffNat() + ")\n");
                    System.out.println("Quel scénario sélectionnez vous ?");

                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + sevenone.getEffCap());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + sevenone.getEffLib());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + sevenone.getEffNat());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + sevenone.getEffLoy());
                                //les calculs
                                // affichage résumé / impacts des calculs
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");

                                Communiste.setSatisfaction(Communiste.getSatisfaction() + seventwo.getEffCom());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + seventwo.getEffLib());
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + seventwo.getEffRel());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + seventwo.getEffEco());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + seventwo.getEffNat());
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + seventhree.getEffLib());
                                Militariste.setSatisfaction(Militariste.getSatisfaction() + seventhree.getEffMil());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + seventwo.getEffNat());
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }

                        break;
                    }
                }else return false;
                break;
            case 8:
                if(eight.getAlused() == 0 && (eight.getconstraint() != seas)) {
                    System.out.println("Voici le scénario qui ce présente à vous :");
                    System.out.println(eight.getSpecs() + "\n");
                    System.out.print(eightone.getText());
                    System.out.println("(Capitaliste : " + eightone.getEffCap() + " | Libéraux : " + eightone.getEffLib() + " | Religieux : " + eightone.getEffRel() + " | Ecologiste : " + eightone.getEffEco() + ")\n");
                    System.out.print(eighttwo.getText());
                    System.out.println("(Religieux : " + eighttwo.getEffRel() + " | Ecologiste : " + eighttwo.getEffEco() + ")\n");
                    System.out.print(eightthree.getText());
                    System.out.println("(Capitaliste : " + eightthree.getEffCap() + "Communiste : " + eightthree.getEffCom() + "Religieux : " + eightthree.getEffRel() + " | Ecologiste : " + eightthree.getEffEco() + " | Nationaliste : " + eightthree.getEffNat() + ")\n");
                    System.out.println("Quel scénario sélectionnez vous ?");
                    choicevalueScenario = false;
                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + eightone.getEffCap());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + eightone.getEffLib());
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + eightone.getEffRel());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + eightone.getEffEco());
                                //les calculs
                                // affichage résumé / impacts des calculs
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + eighttwo.getEffRel());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + eighttwo.getEffEco());
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + eightthree.getEffCap());
                                Communiste.setSatisfaction(Communiste.getSatisfaction() + eightthree.getEffCom());
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + eightthree.getEffRel());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + eightthree.getEffEco());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + eightthree.getEffNat());
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                        break;
                    }
                }else return false;
                break;
            case 9:
                if(nine.getAlused() == 0 && (nine.getconstraint() != seas)) {
                    System.out.println("Voici le scénario qui ce présente à vous :");
                    System.out.println(nine.getSpecs() + "\n");
                    System.out.print(nineone.getText());
                    System.out.println("(Capitaliste : " + nineone.getEffCap() + " | Libéraux : " + nineone.getEffLib() + " | Religieux : " + nineone.getEffRel() + " | Ecologiste : " + nineone.getEffEco() + " | Nationaliste : " + nineone.getEffNat() + " )\n");
                    System.out.print(ninetwo.getText());
                    System.out.println("(Capitaliste : " + ninetwo.getEffCap() + " | Communiste : " + ninetwo.getEffCom() + " | Libéraux : " + ninetwo.getEffLib() + " | Religieux : " + ninetwo.getEffRel() + " | Militariste : " + ninetwo.getEffMil() + " | Ecologiste : " + ninetwo.getEffEco() + " | Nationaliste : " + ninetwo.getEffNat() + " | Loyaliste : " + ninetwo.getEffLoy() + " )\n");
                    System.out.print(ninethree.getText());
                    System.out.println("(Libéraux : " + ninethree.getEffLib() + " | Religieux : " + ninethree.getEffRel() + " )\n");
                    System.out.println("Quel scénario sélectionnez vous ?");

                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + nineone.getEffCap());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + nineone.getEffLib());
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + nineone.getEffRel());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + nineone.getEffEco());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + nineone.getEffNat());
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + ninetwo.getEffCap());
                                Communiste.setSatisfaction(Communiste.getSatisfaction() + ninetwo.getEffCom());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + ninetwo.getEffLib());
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + ninetwo.getEffRel());
                                Militariste.setSatisfaction(Militariste.getSatisfaction() + ninetwo.getEffMil());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + ninetwo.getEffEco());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + ninetwo.getEffNat());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + ninetwo.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + ninethree.getEffLib());
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + ninethree.getEffRel());
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                }else return false;
                break;
            case 10:
                if(ten.getAlused() == 0 && (ten.getconstraint() != seas)) {
                    System.out.println("Panique \uD83D\uDE31 " + ten.getSpecs() + "\n");
                    System.out.print(tenone.getText());
                    System.out.println("(Capitaliste : " + tenone.getEffCap() + " | Communiste : " + tenone.getEffCom() + " | Libéraux : " + tenone.getEffLib() + " | Religieux : " + tenone.getEffRel() + " | Militariste : " + tenone.getEffMil() + " | Ecologiste : " + tenone.getEffEco() + " | Nationaliste : " + tenone.getEffNat() + " | Loyaliste : " + tenone.getEffLoy() + " )\n");
                    System.out.print(tentwo.getText());
                    System.out.println("(Capitaliste : " + tentwo.getEffCap() + " | Communiste : " + tentwo.getEffCom() + " | Libéraux : " + tentwo.getEffLib() + " | Religieux : " + tentwo.getEffRel() + " | Militariste : " + tentwo.getEffMil() + " | Ecologiste : " + tentwo.getEffEco() + " | Nationaliste : " + tentwo.getEffNat() + " | Loyaliste : " + tentwo.getEffLoy() + " )\n");
                    System.out.print(tenthree.getText());
                    System.out.println("(Capitaliste : " + tenthree.getEffCap() + " | Communiste : " + tenthree.getEffCom() + " | Libéraux : " + tenthree.getEffLib() + " | Religieux : " + tenthree.getEffRel() + " | Militariste : " + tenthree.getEffMil() + " | Ecologiste : " + tenthree.getEffEco() + " | Nationaliste : " + tenthree.getEffNat() + " | Loyaliste : " + tenthree.getEffLoy() + " )\n");
                    System.out.println("Quel scénario sélectionnez vous ?");

                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + tenone.getEffCap());
                                Communiste.setSatisfaction(Communiste.getSatisfaction() + tenone.getEffCom());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + tenone.getEffLib());
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + tenone.getEffRel());
                                Militariste.setSatisfaction(Militariste.getSatisfaction() + tenone.getEffMil());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + tenone.getEffEco());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + tenone.getEffNat());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + tenone.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + tentwo.getEffCap());
                                Communiste.setSatisfaction(Communiste.getSatisfaction() + tentwo.getEffCom());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + tentwo.getEffLib());
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + tentwo.getEffRel());
                                Militariste.setSatisfaction(Militariste.getSatisfaction() + tentwo.getEffMil());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + tentwo.getEffEco());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + tentwo.getEffNat());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + tentwo.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + tenthree.getEffCap());
                                Communiste.setSatisfaction(Communiste.getSatisfaction() + tenthree.getEffCom());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + tenthree.getEffLib());
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + tenthree.getEffRel());
                                Militariste.setSatisfaction(Militariste.getSatisfaction() + tenthree.getEffMil());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + tenthree.getEffEco());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + tenthree.getEffNat());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + tenthree.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                }else return false;
                break;
            case 11:
                if(eleven.getAlused() == 0 && (eleven.getconstraint() != seas)) {
                    System.out.println("Voici le scénario qui ce présente à vous :");
                    System.out.println(eleven.getSpecs() + "\n");
                    System.out.print(elevenone.getText());
                    System.out.println("(Capitaliste : " + elevenone.getEffCap() + " | Ecologiste : " + elevenone.getEffEco() + " | Nationaliste : " + elevenone.getEffNat() + " )\n");
                    System.out.print(eleventwo.getText());
                    System.out.println("(Capitaliste : " + eleventwo.getEffCap() + " | Communiste : " + eleventwo.getEffCom() + " | Libéraux : " + eleventwo.getEffLib() + " | Religieux : " + eleventwo.getEffRel() + " | Militariste : " + eleventwo.getEffMil() + " | Ecologiste : " + eleventwo.getEffEco() + " | Nationaliste : " + eleventwo.getEffNat() + " | Loyaliste : " + eleventwo.getEffLoy() + " )\n");
                    System.out.print(eleventhree.getText());
                    System.out.println("(Communiste : " + eleventhree.getEffCom() + " | Ecologiste : " + eleventhree.getEffEco() + " | Nationaliste : " + eleventhree.getEffNat() + " | Loyaliste : " + eleventhree.getEffLoy() + " )\n");
                    System.out.println("Quel scénario sélectionnez vous ?");

                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + elevenone.getEffCap());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + elevenone.getEffEco());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + elevenone.getEffNat());
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + eleventwo.getEffCap());
                                Communiste.setSatisfaction(Communiste.getSatisfaction() + eleventwo.getEffCom());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + eleventwo.getEffLib());
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + eleventwo.getEffRel());
                                Militariste.setSatisfaction(Militariste.getSatisfaction() + eleventwo.getEffMil());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + eleventwo.getEffEco());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + eleventwo.getEffNat());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + eleventwo.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                Communiste.setSatisfaction(Communiste.getSatisfaction() + eleventhree.getEffCom());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + eleventhree.getEffEco());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + eleventhree.getEffNat());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + eleventhree.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                }else return false;
                break;
            case 12:
                if(twelve.getAlused() == 0 && (twelve.getconstraint() != seas)) {
                    System.out.println("Malheur ! " + twelve.getSpecs() + "\n");
                    System.out.print(twelveone.getText());
                    System.out.println("(Capitaliste : " + twelveone.getEffCap() + " | Communiste : " + twelveone.getEffCom() + " | Libéraux : " + twelveone.getEffLib() + " | Religieux : " + twelveone.getEffRel() + " | Militariste : " + twelveone.getEffMil() + " | Ecologiste : " + twelveone.getEffEco() + " | Nationaliste : " + twelveone.getEffNat() + " | Loyaliste : " + twelveone.getEffLoy() + " )\n");
                    System.out.print(twelvetwo.getText());
                    System.out.println("(Capitaliste : " + twelvetwo.getEffCap() + " | Communiste : " + twelvetwo.getEffCom() + " | Libéraux : " + twelvetwo.getEffLib() + " | Religieux : " + twelvetwo.getEffRel() + " | Militariste : " + twelvetwo.getEffMil() + " | Ecologiste : " + twelvetwo.getEffEco() + " | Nationaliste : " + twelvetwo.getEffNat() + " | Loyaliste : " + twelvetwo.getEffLoy() + " )\n");
                    System.out.print(twelvethree.getText());
                    System.out.println("(Communiste : " + twelvetwo.getEffCom() + " | Libéraux : " + twelvetwo.getEffLib() + " | Nationaliste : " + twelvetwo.getEffNat() + " )\n");
                    System.out.println("Quel scénario sélectionnez vous ?");

                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + twelveone.getEffCap());
                                Communiste.setSatisfaction(Communiste.getSatisfaction() + twelveone.getEffCom());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + twelveone.getEffLib());
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + twelveone.getEffRel());
                                Militariste.setSatisfaction(Militariste.getSatisfaction() + twelveone.getEffMil());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + twelveone.getEffEco());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + twelveone.getEffNat());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + twelveone.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + twelvetwo.getEffCap());
                                Communiste.setSatisfaction(Communiste.getSatisfaction() + twelvetwo.getEffCom());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + twelvetwo.getEffLib());
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + twelvetwo.getEffRel());
                                Militariste.setSatisfaction(Militariste.getSatisfaction() + twelvetwo.getEffMil());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + twelvetwo.getEffEco());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + twelvetwo.getEffNat());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + twelvetwo.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                Communiste.setSatisfaction(Communiste.getSatisfaction() + twelvethree.getEffCom());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + twelvethree.getEffLib());
                                Militariste.setSatisfaction(Militariste.getSatisfaction() + twelvethree.getEffMil());
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                }else return false;
                break;
            case 13:
                if(thirteen.getAlused() == 0 && (thirteen.getconstraint() != seas)) {
                    System.out.println("Voici le scénario qui ce présente à vous :");
                    System.out.println(thirteen.getSpecs() + "\n");
                    System.out.print(thirdteenone.getText());
                    System.out.println("(Capitaliste : " + seventeenone.getEffCap() + " | Religieux : " + seventeenone.getEffRel() + " | Ecologiste : " + seventeenone.getEffEco() + " )\n");
                    System.out.print(thirdteentwo.getText());
                    System.out.println("(Capitaliste : " + thirdteentwo.getEffCap() + " | Communiste : " + thirdteentwo.getEffCom() + " | Nationaliste : " + thirdteentwo.getEffNat() + " )\n");
                    System.out.print(thirdteenthree.getText());
                    System.out.println("(Capitaliste : " + thirdteenthree.getEffCap() + " | Militariste : " + thirdteenthree.getEffMil() + " | Loyaliste : " + thirdteenthree.getEffLoy() + " )\n");
                    System.out.println("Quel scénario sélectionnez vous ?");

                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + thirdteenone.getEffCap());
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + thirdteenone.getEffRel());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + thirdteenone.getEffEco());
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + thirdteentwo.getEffCap());
                                Communiste.setSatisfaction(Communiste.getSatisfaction() + thirdteentwo.getEffCom());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + thirdteentwo.getEffNat());
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + thirdteenthree.getEffCap());
                                Militariste.setSatisfaction(Militariste.getSatisfaction() + thirdteenthree.getEffMil());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + thirdteenthree.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                }else return false;
                break;
            case 14:
                if(fourteen.getAlused() == 0 && (fourteen.getconstraint() != seas)) {
                    System.out.println("Voici le scénario qui ce présente à vous :");
                    System.out.println(fourteen.getSpecs() + "\n");
                    System.out.print(fourteenone.getText());
                    System.out.println("(Communiste : " + fourteenone.getEffCom() + " | Libéraux : " + fourteenone.getEffLib() + " | Nationaliste : " + fourteenone.getEffNat() + " | Loyaliste : " + fourteenone.getEffLoy() + " )\n");
                    System.out.print(fourteentwo.getText());
                    System.out.println("(Communiste : " + fourteentwo.getEffCom() + " | Libéraux : " + fourteentwo.getEffLib() + " | Nationaliste : " + fourteentwo.getEffNat() + " )\n");
                    System.out.print(fourteenthree.getText());
                    System.out.println("(Religieux : " + fourteenthree.getEffRel() + " | Ecologiste : " + fourteenthree.getEffEco() + " | Nationaliste : " + fourteenthree.getEffNat() + " | Loyaliste : " + fourteenthree.getEffLoy() + " )\n");
                    System.out.println("Quel scénario sélectionnez vous ?");

                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                Communiste.setSatisfaction(Communiste.getSatisfaction() + fourteenone.getEffCom());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + fourteenone.getEffLib());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + fourteenone.getEffNat());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + fourteenone.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                Communiste.setSatisfaction(Communiste.getSatisfaction() + fourteentwo.getEffCom());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + fourteentwo.getEffLib());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + fourteentwo.getEffNat());
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + fourteenthree.getEffRel());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + fourteenthree.getEffEco());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + fourteenthree.getEffNat());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + fourteenthree.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                }else return false;
                break;
            case 15:
                if(fifteen.getAlused() == 0 && (fifteen.getconstraint() != seas)) {
                    System.out.println("Coup de thêatre ! " + fifteen.getSpecs() + "\n");
                    System.out.print(fifteenone.getText());
                    System.out.println("(Capitaliste : " + fifteenone.getEffCap() + " | Communiste : " + fifteenone.getEffCom() + " | Libéraux : " + fifteenone.getEffLib() + " | Religieux : " + fifteenone.getEffRel() + " | Militariste : " + fifteenone.getEffMil() + " | Ecologiste : " + fifteenone.getEffEco() + " | Nationaliste : " + fifteenone.getEffNat() + " | Loyaliste : " + fifteenone.getEffLoy() + " )\n");
                    System.out.print(fifteentwo.getText());
                    System.out.println("(Capitaliste : " + fifteentwo.getEffCap() + " | Communiste : " + fifteentwo.getEffCom() + " | Libéraux : " + fifteentwo.getEffLib() + " | Religieux : " + fifteentwo.getEffRel() + " | Militariste : " + fifteentwo.getEffMil() + " | Ecologiste : " + fifteentwo.getEffEco() + " | Nationaliste : " + fifteentwo.getEffNat() + " | Loyaliste : " + fifteentwo.getEffLoy() + " )\n");
                    System.out.println("Quel scénario sélectionnez vous ?");

                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + fifteenone.getEffCap());
                                Communiste.setSatisfaction(Communiste.getSatisfaction() + fifteenone.getEffCom());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + fifteenone.getEffLib());
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + fifteenone.getEffRel());
                                Militariste.setSatisfaction(Militariste.getSatisfaction() + fifteenone.getEffMil());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + fifteenone.getEffEco());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + fifteenone.getEffNat());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + fifteenone.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + fifteentwo.getEffCap());
                                Communiste.setSatisfaction(Communiste.getSatisfaction() + fifteentwo.getEffCom());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + fifteentwo.getEffLib());
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + fifteentwo.getEffRel());
                                Militariste.setSatisfaction(Militariste.getSatisfaction() + fifteentwo.getEffMil());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + fifteentwo.getEffEco());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + fifteentwo.getEffNat());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + fifteentwo.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                }else return false;
                break;
            case 16:
                if(sixteen.getAlused() == 0 && (sixteen.getconstraint() != seas)) {
                    System.out.println("Voici le scénario qui ce présente à vous :");
                    System.out.println(sixteen.getSpecs() + "\n");
                    System.out.print(sixteenone.getText());
                    System.out.println("(Capitaliste : " + sixteenone.getEffCap() + " | Religieux : " + sixteenone.getEffRel() + " | Ecologiste : " + sixteenone.getEffEco() + " | Nationaliste : " + sixteenone.getEffNat() + " | Loyaliste : " + sixteenone.getEffLoy() + " )\n");
                    System.out.print(sixteentwo.getText());
                    System.out.println("(Capitaliste : " + sixteentwo.getEffCap() + " | Libéraux : " + sixteentwo.getEffLib() + " | Loyaliste : " + sixteentwo.getEffLoy() + " )\n");
                    System.out.print(sixteenthree.getText());
                    System.out.println("(Capitaliste : " + sixteenthree.getEffCap() + " | Communiste : " + sixteenthree.getEffCom() + " | Libéraux : " + sixteenthree.getEffLib() + " | Religieux : " + sixteenthree.getEffRel() + " | Militariste : " + sixteenthree.getEffMil() + " | Ecologiste : " + sixteenthree.getEffEco() + " | Nationaliste : " + sixteenthree.getEffNat() + " | Loyaliste : " + sixteenthree.getEffLoy() + " )\n");
                    System.out.println("Quel scénario sélectionnez vous ?");

                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + sixteenone.getEffCap());
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + sixteenone.getEffRel());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + sixteenone.getEffEco());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + sixteenone.getEffNat());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + sixteenone.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + sixteentwo.getEffCap());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + sixteentwo.getEffLib());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + sixteentwo.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + sixteenthree.getEffCap());
                                Communiste.setSatisfaction(Communiste.getSatisfaction() + sixteenthree.getEffCom());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + sixteenthree.getEffLib());
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + sixteenthree.getEffRel());
                                Militariste.setSatisfaction(Militariste.getSatisfaction() + sixteenthree.getEffMil());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + sixteenthree.getEffEco());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + sixteenthree.getEffNat());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + sixteenthree.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                }else return false;
                break;
            case 17:
                if(seventeen.getAlused() == 0 && (seventeen.getconstraint() != seas)) {
                    System.out.println("Vous apprenez qu'"+seventeen.getSpecs() + "\n");
                    System.out.print(seventeenone.getText());
                    System.out.println("(Capitaliste : " + seventeenone.getEffCap() + " | Communiste : " + seventeenone.getEffCom() + " | Libéraux : " + seventeenone.getEffLib() + " | Religieux : " + seventeenone.getEffRel() + " | Militariste : " + seventeenone.getEffMil() + " | Ecologiste : " + seventeenone.getEffEco() + " | Nationaliste : " + seventeenone.getEffNat() + " | Loyaliste : " + seventeenone.getEffLoy() + " )\n");
                    System.out.print(seventeentwo.getText());
                    System.out.println("(Capitaliste : " + seventeentwo.getEffCap() + " | Communiste : " + seventeentwo.getEffCom() + " | Libéraux : " + seventeentwo.getEffLib() + " | Religieux : " + seventeentwo.getEffRel() + " | Militariste : " + seventeentwo.getEffMil() + " | Ecologiste : " + seventeentwo.getEffEco() + " | Nationaliste : " + seventeentwo.getEffNat() + " | Loyaliste : " + seventeentwo.getEffLoy() + " )\n");
                    System.out.print(seventeenthree.getText());
                    System.out.println("(Capitaliste : " + seventeenthree.getEffCap() + " | Communiste : " + seventeenthree.getEffCom() + " | Libéraux : " + seventeenthree.getEffLib() + " | Religieux : " + seventeenthree.getEffRel() + " | Militariste : " + seventeenthree.getEffMil() + " | Ecologiste : " + seventeenthree.getEffEco() + " | Nationaliste : " + seventeenthree.getEffNat() + " | Loyaliste : " + seventeenthree.getEffLoy() + " )\n");
                    System.out.println("Quel scénario sélectionnez vous ?");

                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + seventeenone.getEffCap());
                                Communiste.setSatisfaction(Communiste.getSatisfaction() + seventeenone.getEffCom());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + seventeenone.getEffLib());
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + seventeenone.getEffRel());
                                Militariste.setSatisfaction(Militariste.getSatisfaction() + seventeenone.getEffMil());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + seventeenone.getEffEco());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + seventeenone.getEffNat());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + seventeenone.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + seventeentwo.getEffCap());
                                Communiste.setSatisfaction(Communiste.getSatisfaction() + seventeentwo.getEffCom());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + seventeentwo.getEffLib());
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + seventeentwo.getEffRel());
                                Militariste.setSatisfaction(Militariste.getSatisfaction() + seventeentwo.getEffMil());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + seventeentwo.getEffEco());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + seventeentwo.getEffNat());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + seventeentwo.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + seventeenthree.getEffCap());
                                Communiste.setSatisfaction(Communiste.getSatisfaction() + seventeenthree.getEffCom());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + seventeenthree.getEffLib());
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + seventeenthree.getEffRel());
                                Militariste.setSatisfaction(Militariste.getSatisfaction() + seventeenthree.getEffMil());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + seventeenthree.getEffEco());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + seventeenthree.getEffNat());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + seventeenthree.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                }else return false;
                break;
            case 18:
                if(eighteen.getAlused() == 0 && (eighteen.getconstraint() != seas)) {
                    System.out.println("Voici le scénario qui ce présente à vous :");
                    System.out.println(eighteen.getSpecs() + "\n");
                    System.out.print(eighteenone.getText());
                    System.out.println("(Ecologiste : " + eighteenone.getEffEco() + " | Loyaliste : " + eighteenone.getEffLoy() + ")\n");
                    System.out.print(eighteentwo.getText());
                    System.out.println("(Capitaliste : " + eighteentwo.getEffCap() + " | Communiste : " + eighteentwo.getEffCom() + " | Libéraux : " + eighteentwo.getEffLib() + " | Militariste : " + eighteentwo.getEffMil() + " | Loyaliste : " + eighteentwo.getEffLoy() + " )\n");
                    System.out.print(eighteenthree.getText());
                    System.out.println("(Capitaliste : " + eighteenthree.getEffCap() + " | Communiste : " + eighteenthree.getEffCom() + " | Libéraux : " + eighteenthree.getEffLib() + " | Religieux : " + eighteenthree.getEffRel() + " | Militariste : " + eighteenthree.getEffMil() + " | Ecologiste : " + eighteenthree.getEffEco() + " | Nationaliste : " + eighteenthree.getEffNat() + " | Loyaliste : " + eighteenthree.getEffLoy() + " )\n");
                    System.out.println("Quel scénario sélectionnez vous ?");

                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + eighteenone.getEffEco());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + eighteenone.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + eighteentwo.getEffCap());
                                Communiste.setSatisfaction(Communiste.getSatisfaction() + eighteentwo.getEffCom());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + eighteentwo.getEffLib());
                                Militariste.setSatisfaction(Militariste.getSatisfaction() + eighteentwo.getEffMil());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + eighteentwo.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + eighteenthree.getEffCap());
                                Communiste.setSatisfaction(Communiste.getSatisfaction() + eighteenthree.getEffCom());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + eighteenthree.getEffLib());
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + eighteenthree.getEffRel());
                                Militariste.setSatisfaction(Militariste.getSatisfaction() + eighteenthree.getEffMil());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + eighteenthree.getEffEco());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + eighteenthree.getEffNat());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + eighteenthree.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                }else return false;
                break;
            case 19:
                if(nineteen.getAlused() == 0 && (nineteen.getconstraint() != seas)) {
                    System.out.println("Voici le scénario qui ce présente à vous :");
                    System.out.println(nineteen.getSpecs() + "\n");
                    System.out.print(nineteenone.getText());
                    System.out.println("(Capitaliste : " + nineteenone.getEffCap() + " | Communiste : " + nineteenone.getEffCom() + " | Libéraux : " + nineteenone.getEffLib() + " | Religieux : " + nineteenone.getEffLoy() + " | Trésorerie : " + nineteenone.getEffBank() + ")\n");
                    System.out.print(nineteentwo.getText());
                    System.out.println("(Capitaliste : " + nineteentwo.getEffCap() + " | Communiste : " + nineteentwo.getEffCom() + " | Libéraux : " + nineteentwo.getEffLib() + " | Religieux : " + nineteentwo.getEffRel() + " | Militariste : " + nineteentwo.getEffMil() + " | Ecologiste : " + nineteentwo.getEffEco() + " | Nationaliste : " + nineteentwo.getEffNat() + " | Loyaliste : " + nineteentwo.getEffLoy() + " )\n");
                    System.out.print(nineteenthree.getText());
                    System.out.println("(Capitaliste : " + nineteenthree.getEffCap() + " | Communiste : " + nineteenthree.getEffCom() + " | Libéraux : " + nineteenthree.getEffLib() + " | Religieux : " + nineteenthree.getEffRel() + " | Militariste : " + nineteenthree.getEffMil() + " | Ecologiste : " + nineteenthree.getEffEco() + " | Nationaliste : " + nineteenthree.getEffNat() + " | Loyaliste : " + nineteenthree.getEffLoy() + " )\n");
                    System.out.println("Quel scénario sélectionnez vous ?");

                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + nineteenone.getEffCap());
                                Communiste.setSatisfaction(Communiste.getSatisfaction() + nineteenone.getEffCom());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + nineteenone.getEffLib());
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + nineteenone.getEffRel());
                                Tresor.setValue(Tresor.getValue() + nineteenone.getEffBank());
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + nineteentwo.getEffCap());
                                Communiste.setSatisfaction(Communiste.getSatisfaction() + nineteentwo.getEffCom());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + nineteentwo.getEffLib());
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + nineteentwo.getEffRel());
                                Militariste.setSatisfaction(Militariste.getSatisfaction() + nineteentwo.getEffMil());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + nineteentwo.getEffEco());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + nineteentwo.getEffNat());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + nineteentwo.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + nineteenthree.getEffCap());
                                Communiste.setSatisfaction(Communiste.getSatisfaction() + nineteenthree.getEffCom());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + nineteenthree.getEffLib());
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + nineteenthree.getEffRel());
                                Militariste.setSatisfaction(Militariste.getSatisfaction() + nineteenthree.getEffMil());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + nineteenthree.getEffEco());
                                Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + nineteenthree.getEffNat());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + nineteenthree.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                }else return false;
                break;
            case 20:
                if(twenty.getAlused() == 0 && (twenty.getconstraint() != seas)) {
                    System.out.println("Incroyable \uD83E\uDD73\uD83E\uDD73 !" + twenty.getSpecs() + "\n");
                    System.out.print(twentyone.getText());
                    System.out.println("(Capitaliste : " + twentyone.getEffCap() + " | Libéraux : " + twentyone.getEffLib() + " | Ecologiste : " + twentyone.getEffEco() + " | Loyaliste : " + twentyone.getEffLoy() + ")\n");
                    System.out.print(twentytwo.getText());
                    System.out.println("(Capitaliste : " + twentytwo.getEffCap() + " | Communiste : " + twentytwo.getEffCom() + " | Militarite : " + twentytwo.getEffMil() + " | Loyaliste : " + twentytwo.getEffLoy() + ")\n");
                    System.out.print(twentythree.getText());
                    System.out.println("(Capitaliste : " + twentythree.getEffCap() + " | Religieux : " + twentythree.getEffRel() + " | Ecologiste : " + twentythree.getEffEco() + ")\n");
                    System.out.println("Quel scénario sélectionnez vous ?");

                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + twentyone.getEffCap());
                                Liberaux.setSatisfaction(Liberaux.getSatisfaction() + twentyone.getEffLib());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + twentyone.getEffEco());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + twentyone.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + twentytwo.getEffCap());
                                Communiste.setSatisfaction(Communiste.getSatisfaction() + twentytwo.getEffCom());
                                Militariste.setSatisfaction(Militariste.getSatisfaction() + twentytwo.getEffMil());
                                Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + twentytwo.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + twentythree.getEffCap());
                                Religieux.setSatisfaction(Religieux.getSatisfaction() + twentythree.getEffRel());
                                Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + twentythree.getEffEco());
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                }else return false;
                break;
            default:
                System.out.println("Choissiez parmis les scénarios disponible.");
                choicevalueScenario = false;
        }
        return true;
    }

    public static void viewUpdate(String president, String country){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tappez entrer pour visualiser les impacts.");
        scanner.nextLine();

        System.out.println("Vos statistiques actuelles : ");
        System.out.print("Capitaliste : Satisfaction = " + Capitaliste.getSatisfaction() + ", Partisans = " + Capitaliste.getPartisans());
        System.out.println(" || Communiste : Satisfaction = " + Communiste.getSatisfaction() + ", Partisans = " + Communiste.getPartisans());
        System.out.print("Libéraux : Satisfaction = " + Liberaux.getSatisfaction() + ", Partisans = " + Liberaux.getPartisans());
        System.out.println(" || Religieux : Satisfaction = " + Religieux.getSatisfaction() + ", Partisans = " + Religieux.getPartisans());
        System.out.print("Militariste : Satisfaction = " + Militariste.getSatisfaction() + ", Partisans = " + Militariste.getPartisans());
        System.out.println(" || Ecologiste : Satisfaction = " + Ecologiste.getSatisfaction() + ", Partisans = " + Ecologiste.getPartisans());
        System.out.print("Nationaliste : Satisfaction = " + Nationaliste.getSatisfaction() + ", Partisans = " + Nationaliste.getPartisans());
        System.out.println(" || Loyaliste : Satisfaction = " + Loyaliste.getSatisfaction() + ", Partisans = " + Loyaliste.getPartisans());

        System.out.println("\nL'Agriculture représente " + Agri.getValue() + "% de " + country + ".");
        System.out.println("L'Industrialisation représente " + Indu.getValue() + "% de " + country + ".");
        System.out.println(president + " possède " + Tresor.getValue() + "€.");
    }

    public static boolean action(String president, String country){
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
                System.out.println("Vous avez choisi de verser un pot de vin.\n");
                System.out.println("Choix de la faction :");
                System.out.println("1. Capitaliste. ("+(Capitaliste.getPartisans()*15) + "€)");
                System.out.println("2. Communiste. ("+(Communiste.getPartisans()*15) + "€)");
                System.out.println("3. Libéraux. ("+(Liberaux.getPartisans()*15) + "€)");
                System.out.println("4. Religieux. ("+(Religieux.getPartisans()*15) + "€)");
                System.out.println("5. Militariste. ("+(Militariste.getPartisans()*15) + "€)");
                System.out.println("6. Ecologiste. ("+(Ecologiste.getPartisans()*15) + "€)");
                System.out.println("7. Nationaliste. ("+(Nationaliste.getPartisans()*15) + "€)");
                System.out.println("0. Retour");

                choice = scanner.nextInt();


                switch (choice) {
                    case 1:
                        Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + 10);
                        valueTresor = Capitaliste.getPartisans() * 15;
                        if(valueTresor < Tresor.getValue()){
                            Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + 10);
                            Tresor.setValue(Tresor.getValue() - valueTresor);
                            Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() - (valueTresor / 10));
                            System.out.println("Pot de vin versé aux Capitalistes.\n" + "Satisfaction des Capitalistes : " + Capitaliste.getSatisfaction() + ", cela vous a coûter  " + valueTresor + "€.");
                            System.out.println("Loyaliste satisfaction :" + Loyaliste.getSatisfaction());
                        }else {
                            System.out.println("Vous n'avez pas assez d'argent");
                        }
                        break;
                    case 2:
                        if(valueTresor < Tresor.getValue()) {
                            Communiste.setSatisfaction(Communiste.getSatisfaction() + 10);
                            valueTresor = Communiste.getPartisans() * 15;
                            Tresor.setValue(Tresor.getValue() - valueTresor);
                            Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() - (valueTresor / 10));
                            System.out.println("Pot de vin versé aux Communistes.\n" + "Satisfaction des Communistes : " + Communiste.getSatisfaction() + ", cela vous a coûter  " + valueTresor + "€.");
                            System.out.println("Loyaliste satisfaction :" + Loyaliste.getSatisfaction());
                        }else{
                            System.out.println("Vous n'avez pas assez d'argent");
                        }
                        break;
                    case 3:
                        if(valueTresor < Tresor.getValue()) {
                            Liberaux.setSatisfaction(Liberaux.getSatisfaction() + 10);
                            valueTresor = Liberaux.getPartisans() * 15;
                            Tresor.setValue(Tresor.getValue() - valueTresor);
                            System.out.println("Pot de vin versé aux Liberaux.\n" + "Satisfaction des Liberaux : " + Liberaux.getSatisfaction() + ", cela vous a coûter  " + valueTresor + "€.");
                            System.out.println("Loyaliste satisfaction :" + Loyaliste.getSatisfaction());
                        }else{
                            System.out.println("Vous n'avez pas assez d'argent");
                        }
                        break;
                    case 4:
                        if(valueTresor < Tresor.getValue()) {
                            Religieux.setSatisfaction(Religieux.getSatisfaction() + 10);
                            valueTresor = Religieux.getPartisans() * 15;
                            Tresor.setValue(Tresor.getValue() - valueTresor);
                            Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() - (valueTresor / 10));
                            System.out.println("Pot de vin versé aux Religieux.\n" + "Satisfaction des Religieux : " + Religieux.getSatisfaction() + ", cela vous a coûter  " + valueTresor + "€.");
                            System.out.println("Loyaliste satisfaction :" + Loyaliste.getSatisfaction());
                        }else{
                            System.out.println("Vous n'avez pas assez d'argent");
                        }
                        break;
                    case 5:
                        if(valueTresor < Tresor.getValue()) {
                            Militariste.setSatisfaction(Militariste.getSatisfaction() + 10);
                            valueTresor = Militariste.getPartisans() * 15;
                            Tresor.setValue(Tresor.getValue() - valueTresor);
                            Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() - (valueTresor / 10));
                            System.out.println("Pot de vin versé aux Militaristes.\n" + "Satisfaction des Militaristes : " + Militariste.getSatisfaction() + ", cela vous a coûter  " + valueTresor + "€.");
                            System.out.println("Loyaliste satisfaction :" + Loyaliste.getSatisfaction());
                        }else{
                            System.out.println("Vous n'avez pas assez d'argent");
                        }
                        break;
                    case 6:
                        if(valueTresor < Tresor.getValue()) {
                            Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + 10);
                            valueTresor = Ecologiste.getPartisans() * 15;
                            Tresor.setValue(Tresor.getValue() - valueTresor);
                            Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() - (valueTresor / 10));
                            System.out.println("Pot de vin versé aux Ecologistes.\n" + "Satisfaction des Ecologistes : " + Ecologiste.getSatisfaction() + ", cela vous a coûter  " + valueTresor + "€.");
                            System.out.println("Loyaliste satisfaction :" + Loyaliste.getSatisfaction());
                        }else{
                            System.out.println("Vous n'avez pas assez d'argent");
                        }
                        break;
                    case 7:
                        if(valueTresor < Tresor.getValue()) {
                            Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + 10);
                            valueTresor = Nationaliste.getPartisans() * 15;
                            Tresor.setValue(Tresor.getValue() - valueTresor);
                            Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() - (valueTresor / 10));
                            System.out.println("Pot de vin versé aux Nationalistes.\n" + "Satisfaction des Nationalistes : " + Nationaliste.getSatisfaction() + ", cela vous a coûter  " + valueTresor + "€.");
                            System.out.println("Loyaliste satisfaction :" + Loyaliste.getSatisfaction());
                        }else{
                            System.out.println("Vous n'avez pas assez d'argent");
                        }
                        break;
                    case 0:
                        break;
                    default:
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

    public static boolean loosecondition(float difficulty){
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
        if((((Capitaliste.getSatisfaction()*Capitaliste.getPartisans()) +
                (Communiste.getSatisfaction()*Communiste.getPartisans()) +
                (Liberaux.getSatisfaction()*Liberaux.getPartisans())+
                (Religieux.getSatisfaction()*Religieux.getPartisans())+
                (Militariste.getSatisfaction()* Militariste.getPartisans())+
                (Ecologiste.getSatisfaction()*Ecologiste.getPartisans())+
                (Nationaliste.getSatisfaction()* Nationaliste.getPartisans())+
                (Loyaliste.getSatisfaction()* Loyaliste.getPartisans())
                )/(Capitaliste.getPartisans()+ Communiste.getPartisans()+ Liberaux.getPartisans()+
                Religieux.getPartisans()+ Militariste.getPartisans()+ Ecologiste.getPartisans()+ Nationaliste.getPartisans()
                + Loyaliste.getPartisans()))>pourcloose){
            return true;
        }else return false;
    }

    public static int season(int seas, String president, String country){
        Scanner scanner = new Scanner(System.in);
        if(seas == 4){
            while(action(president, country)){}
            EndYear();
            FoodUsed(president, country);
            scanner.nextLine();
            return 1;
        }else seas++;
        return seas;
    }

    public static void repartition(){
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

    public static void EndYear(){
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
                        Capitaliste.setPartisans(Capitaliste.getPartisans() + 1);
                        break;
                    case 2:
                        Communiste.setPartisans(Communiste.getPartisans() + 1);
                        break;
                    case 3:
                        Liberaux.setPartisans(Liberaux.getPartisans() + 1);
                        break;
                    case 4:
                        Religieux.setPartisans(Religieux.getPartisans() + 1);
                        break;
                    case 5:
                        Militariste.setPartisans(Militariste.getPartisans() + 1);
                        break;
                    case 6:
                        Ecologiste.setPartisans(Ecologiste.getPartisans() + 1);
                        break;
                    case 7:
                        Nationaliste.setPartisans(Nationaliste.getPartisans() + 1);
                        break;
                    case 8:
                        Loyaliste.setPartisans(Loyaliste.getPartisans() + 1);
                        break;
                }
                birth--;
            }
        }
    }

    public static void FoodUsed(String president, String country){
        int deadppl=0;
        int popMonde = (Capitaliste.getPartisans()+ Communiste.getPartisans()+ Liberaux.getPartisans()+
                Religieux.getPartisans()+ Militariste.getPartisans()+ Ecologiste.getPartisans()+ Nationaliste.getPartisans()
                + Loyaliste.getPartisans());
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
                        if(Capitaliste.getPartisans()>0) {
                            Capitaliste.setPartisans(Capitaliste.getPartisans() - 1);
                            Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() -2);
                        }else deadppl++;
                        break;
                    case 2:
                        if(Communiste.getPartisans()>0) {
                            Communiste.setPartisans(Communiste.getPartisans() - 1);
                            Communiste.setSatisfaction(Communiste.getSatisfaction()-2);
                        }else deadppl++;
                        break;
                    case 3:
                        if(Liberaux.getPartisans()>0) {
                            Liberaux.setPartisans(Liberaux.getPartisans() - 1);
                            Liberaux.setSatisfaction(Liberaux.getSatisfaction() -2);
                        }else deadppl++;
                        break;
                    case 4:
                        if(Religieux.getPartisans()>0) {
                            Religieux.setPartisans(Religieux.getPartisans() - 1);
                            Religieux.setSatisfaction(Religieux.getSatisfaction()-2);
                        }else deadppl++;
                        break;
                    case 5:
                        if(Militariste.getPartisans()>0) {
                            Militariste.setPartisans(Militariste.getPartisans() - 1);
                            Militariste.setSatisfaction(Militariste.getSatisfaction()-2);
                        }else deadppl++;
                        break;
                    case 6:
                        if(Ecologiste.getPartisans()>0) {
                            Ecologiste.setPartisans(Ecologiste.getPartisans() - 1);
                            Ecologiste.setSatisfaction(Ecologiste.getSatisfaction()-2);
                        }else deadppl++;
                        break;
                    case 7:
                        if(Nationaliste.getPartisans()>0) {
                            Nationaliste.setPartisans(Nationaliste.getPartisans() - 1);
                            Nationaliste.setSatisfaction(Nationaliste.getSatisfaction()-2);
                        }else deadppl++;
                        break;
                    case 8:
                        if(Loyaliste.getPartisans()>0) {
                            Loyaliste.setPartisans(Loyaliste.getPartisans() - 1);
                            Loyaliste.setSatisfaction(Loyaliste.getSatisfaction()-2);
                        }else deadppl++;
                        break;
                }
                deadppl--;
            }
            viewUpdate(president, country);
        }
    }

    public static void getdown(){
        if(Capitaliste.getSatisfaction()<=0){
            Capitaliste.setDown(1);
        }
        if(Communiste.getSatisfaction()<=0){
            Communiste.setDown(1);
        }
        if(Liberaux.getSatisfaction()<=0){
            Liberaux.setDown(1);
        }
        if(Religieux.getSatisfaction()<=0){
            Religieux.setDown(1);
        }
        if(Militariste.getSatisfaction()<=0){
            Militariste.setDown(1);
        }
        if(Ecologiste.getSatisfaction()<=0){
            Ecologiste.setDown(1);
        }
        if(Nationaliste.getSatisfaction()<=0){
            Nationaliste.setDown(1);
        }
        if(Loyaliste.getSatisfaction()<=0){
            Loyaliste.setDown(1);
        }
        if(Capitaliste.getDown()==1){
            Capitaliste.setSatisfaction(0);
        }
        if(Communiste.getDown()==1){
            Communiste.setSatisfaction(0);
        }
        if(Liberaux.getDown()==1){
            Liberaux.setSatisfaction(0);
        }
        if(Religieux.getDown()==1){
            Religieux.setSatisfaction(0);
        }
        if(Militariste.getDown()==1){
            Militariste.setSatisfaction(0);
        }
        if(Ecologiste.getDown()==1){
            Ecologiste.setSatisfaction(0);
        }
        if(Nationaliste.getDown()==1){
            Nationaliste.setSatisfaction(0);
        }
        if(Loyaliste.getDown()==1){
            Loyaliste.setSatisfaction(0);
        }
    }

    public static void checkValueSat(){
        if(Capitaliste.getSatisfaction() > 100){
            Capitaliste.setSatisfaction(100);
        }
        if(Communiste.getSatisfaction() > 100){
            Communiste.setSatisfaction(100);
        }
        if(Liberaux.getSatisfaction() > 100){
            Liberaux.setSatisfaction(100);
        }
        if(Religieux.getSatisfaction() > 100){
            Religieux.setSatisfaction(100);
        }
        if(Militariste.getSatisfaction() > 100){
            Militariste.setSatisfaction(100);
        }
        if(Ecologiste.getSatisfaction() > 100){
            Ecologiste.setSatisfaction(100);
        }
        if(Nationaliste.getSatisfaction() > 100){
            Nationaliste.setSatisfaction(100);
        }
        if(Loyaliste.getSatisfaction() > 100){
            Loyaliste.setSatisfaction(100);
        }
    }

    public static void checkMoneyValue(){
        if(Tresor.getValue() < 0){
            System.out.println("Vous n'avez plus de monnaie dans votre trésorie ");
            Tresor.setValue(0);
        }
    }
}