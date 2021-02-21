package src;

import java.sql.SQLOutput;
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
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("|                          Bienvenue dans El-Presidente !                            |");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Règles du jeu :\n ");
        System.out.println("Vous incarnerez un dirigeant et serrez à la tête de votre nation.");
        System.out.println("Le but étant d'être le meilleur Presidente ! Et pour cela vous allez devoir survivre \n" +
                "à un maximum d'évènements divers et variés. \n");
    }

    public static String initializePresident(){
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

    public static void randomEvents(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Voici le scénario qui ce présente à vous :");

        Random nbEvent = new Random();
        int value = 1 + nbEvent.nextInt(20-1);
        int valueScenario;

        switch (value) {
            case 1:
                System.out.println(one.getSpecs() + "\n");
                System.out.print(oneone.getText());
                System.out.println("(Capitaliste : " + oneone.getEffCap() + " | Religieux : " + oneone.getEffRel() + " | Militariste : " + oneone.getEffMil() + ")\n");
                System.out.print(onetwo.getText());
                System.out.println("(Capitaliste : " + onetwo.getEffCap() + " | Communiste : " + onetwo.getEffCom() + " | Libéraliste : " +onetwo.getEffLib() + " | Religieux : " + onetwo.getEffRel() + ")\n");
                System.out.print(onethree.getText());
                System.out.println("(Capitaliste : " +onethree.getEffCap() + " | Communiste : " + onethree.getEffCom() + " | Libéraliste : " + onethree.getEffLib() + " | Religieux : " + onethree.getEffRel() + ")\n");
                System.out.println("Quel scénario sélectionnez vous ?");

                Boolean choicevalueScenario = false;

                while(!choicevalueScenario) {
                    valueScenario = scanner.nextInt();
                    switch (valueScenario){
                        case 1 :
                            System.out.println("Choix scénario 1 : Validé.");
                            Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + oneone.getEffCap());
                            Religieux.setSatisfaction(Religieux.getSatisfaction() + oneone.getEffRel());
                            Militariste.setSatisfaction(Militariste.getSatisfaction() + oneone.getEffMil());
                            //les calculs
                            // affichage résumé / impacts des calculs
                            choicevalueScenario = true;
                            break;
                        case 2 :
                            System.out.println("Choix scénario 2 : Validé.");
                            Communiste.setSatisfaction(Communiste.getSatisfaction() + onetwo.getEffCom());
                            Liberaux.setSatisfaction(Liberaux.getSatisfaction() + onetwo.getEffLib());
                            Militariste.setSatisfaction(Militariste.getSatisfaction() + onetwo.getEffMil());
                            Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + onetwo.getEffNat());
                            Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + onetwo.getEffLoy());
                            choicevalueScenario = true;
                            break;
                        case 3 :
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
                break;
            case 2:
                System.out.println(two.getSpecs());

                break;
            case 3:
                System.out.println(three.getSpecs());
                break;
            case 4:
                System.out.println(four.getSpecs());
                break;
            case 5:
                System.out.println(five.getSpecs());
                break;
            case 6:
                System.out.println(six.getSpecs());
                break;
            case 7:
                System.out.println(seven.getSpecs());
                break;
            case 8:
                System.out.println(eight.getSpecs());
                break;
            case 9:
                System.out.println(nine.getSpecs());
                break;
            case 10:
                System.out.println(ten.getSpecs());
                break;
            case 11:
                System.out.println(eleven.getSpecs());
                break;
            case 12:
                System.out.println(twelve.getSpecs());
                break;
            case 13:
                System.out.println(thirteen.getSpecs());
                break;
            case 14:
                System.out.println(fourteen.getSpecs());
                break;
            case 15:
                System.out.println(fifteen.getSpecs());
                break;
            case 16:
                System.out.println(sixteen.getSpecs());
                break;
            case 17:
                System.out.println(seventeen.getSpecs() + "\n");
                System.out.print(nineteenone.getText());
                System.out.println("(Capitaliste : " + nineteenone.getEffCap() + " | Communiste : " + nineteenone.getEffCom() + " | Libéraux : " + nineteenone.getEffLib() + " | Religieux : " + nineteenone.getEffLoy() + " | Trésorerie : " + nineteenone.getEffBank() + ")\n");
                System.out.print(nineteentwo.getText());
                System.out.println("(Capitaliste : " + nineteentwo.getEffCap() + " | Communiste : " + nineteentwo.getEffCom() + " | Libéraux : " +nineteentwo.getEffLib() + " | Religieux : " + nineteentwo.getEffRel() + " | Militariste : " + nineteentwo.getEffMil() + " | Ecologiste : " + nineteentwo.getEffEco() + " | Nationaliste : " + nineteentwo.getEffNat() + " | Loyaliste : " + nineteentwo.getEffLoy() + " )\n");
                System.out.print(nineteenthree.getText());
                System.out.println("(Capitaliste : " + nineteenthree.getEffCap() + " | Communiste : " + nineteenthree.getEffCom() + " | Libéraux : " +nineteenthree.getEffLib() + " | Religieux : " + nineteenthree.getEffRel() + " | Militariste : " + nineteenthree.getEffMil() + " | Ecologiste : " + nineteenthree.getEffEco() + " | Nationaliste : " + nineteenthree.getEffNat() + " | Loyaliste : " + nineteenthree.getEffLoy() + " )\n");
                System.out.println("Quel scénario sélectionnez vous ?");

                choicevalueScenario = false;

                while(!choicevalueScenario) {
                    valueScenario = scanner.nextInt();
                    switch (valueScenario){
                        case 1 :
                            System.out.println("Choix scénario 1 : Validé.");
                            Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + nineteenone.getEffCap());
                            Communiste.setSatisfaction(Communiste.getSatisfaction() + nineteenone.getEffCom());
                            Liberaux.setSatisfaction(Liberaux.getSatisfaction() + nineteenone.getEffLib());
                            Religieux.setSatisfaction(Religieux.getSatisfaction() + nineteenone.getEffRel());
                            Tresor.setValue(Tresor.getValue()+nineteenone.getEffBank());
                            choicevalueScenario = true;
                            break;
                        case 2 :
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
                        case 3 :
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
                    }
                }
                break;
            case 18:
                System.out.println(eighteen.getSpecs() + "\n");
                System.out.print(eighteenone.getText());
                System.out.println("(Ecologiste : " + eighteenone.getEffEco() + " | Loyaliste : " + eighteenone.getEffLoy() + ")\n");
                System.out.print(eighteentwo.getText());
                System.out.println("(Capitaliste : " + eighteentwo.getEffCap() + " | Communiste : " + eighteentwo.getEffCom() + " | Libéraux : " +eighteentwo.getEffLib() + " | Militariste : " + eighteentwo.getEffMil() + " | Loyaliste : " + eighteentwo.getEffLoy() + " )\n");
                System.out.print(eighteenthree.getText());
                System.out.println("(Capitaliste : " + eighteenthree.getEffCap() + " | Communiste : " + eighteenthree.getEffCom() + " | Libéraux : " +eighteenthree.getEffLib() + " | Religieux : " + eighteenthree.getEffRel() + " | Militariste : " + eighteenthree.getEffMil() + " | Ecologiste : " + eighteenthree.getEffEco() + " | Nationaliste : " + eighteenthree.getEffNat() + " | Loyaliste : " + eighteenthree.getEffLoy() + " )\n");
                System.out.println("Quel scénario sélectionnez vous ?");

                choicevalueScenario = false;

                while(!choicevalueScenario) {
                    valueScenario = scanner.nextInt();
                    switch (valueScenario){
                        case 1 :
                            System.out.println("Choix scénario 1 : Validé.");
                            Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + eighteenone.getEffEco());
                            Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + eighteenone.getEffLoy());
                            choicevalueScenario = true;
                            break;
                        case 2 :
                            System.out.println("Choix scénario 2 : Validé.");
                            Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + eighteentwo.getEffCap());
                            Communiste.setSatisfaction(Communiste.getSatisfaction() + eighteentwo.getEffCom());
                            Liberaux.setSatisfaction(Liberaux.getSatisfaction() + eighteentwo.getEffLib());
                            Militariste.setSatisfaction(Militariste.getSatisfaction() + eighteentwo.getEffMil());
                            Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + eighteentwo.getEffLoy());
                            choicevalueScenario = true;
                            break;
                        case 3 :
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
                    }
                }
                break;
            case 19:
                System.out.println(nineteen.getSpecs() + "\n");
                System.out.print(nineteenone.getText());
                System.out.println("(Capitaliste : " + nineteenone.getEffCap() + " | Communiste : " + nineteenone.getEffCom() + " | Libéraux : " + nineteenone.getEffLib() + " | Religieux : " + nineteenone.getEffLoy() + " | Trésorerie : " + nineteenone.getEffBank() + ")\n");
                System.out.print(nineteentwo.getText());
                System.out.println("(Capitaliste : " + nineteentwo.getEffCap() + " | Communiste : " + nineteentwo.getEffCom() + " | Libéraux : " +nineteentwo.getEffLib() + " | Religieux : " + nineteentwo.getEffRel() + " | Militariste : " + nineteentwo.getEffMil() + " | Ecologiste : " + nineteentwo.getEffEco() + " | Nationaliste : " + nineteentwo.getEffNat() + " | Loyaliste : " + nineteentwo.getEffLoy() + " )\n");
                System.out.print(nineteenthree.getText());
                System.out.println("(Capitaliste : " + nineteenthree.getEffCap() + " | Communiste : " + nineteenthree.getEffCom() + " | Libéraux : " +nineteenthree.getEffLib() + " | Religieux : " + nineteenthree.getEffRel() + " | Militariste : " + nineteenthree.getEffMil() + " | Ecologiste : " + nineteenthree.getEffEco() + " | Nationaliste : " + nineteenthree.getEffNat() + " | Loyaliste : " + nineteenthree.getEffLoy() + " )\n");
                System.out.println("Quel scénario sélectionnez vous ?");

                choicevalueScenario = false;

                while(!choicevalueScenario) {
                    valueScenario = scanner.nextInt();
                    switch (valueScenario){
                        case 1 :
                            System.out.println("Choix scénario 1 : Validé.");
                            Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + nineteenone.getEffCap());
                            Communiste.setSatisfaction(Communiste.getSatisfaction() + nineteenone.getEffCom());
                            Liberaux.setSatisfaction(Liberaux.getSatisfaction() + nineteenone.getEffLib());
                            Religieux.setSatisfaction(Religieux.getSatisfaction() + nineteenone.getEffRel());
                            Tresor.setValue(Tresor.getValue()+nineteenone.getEffBank());
                            choicevalueScenario = true;
                            break;
                        case 2 :
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
                        case 3 :
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
                    }
                }
                break;
            case 20:
                System.out.println(twenty.getSpecs() + "\n");
                System.out.print(twentyone.getText());
                System.out.println("(Capitaliste : " + twentyone.getEffCap() + " | Libéraux : " + twentyone.getEffLib() + " | Ecologiste : " + twentyone.getEffEco() + " | Loyaliste : " + twentyone.getEffLoy() + ")\n");
                System.out.print(twentytwo.getText());
                System.out.println("(Capitaliste : " + twentytwo.getEffCap() + " | Communiste : " + twentytwo.getEffCom() + " | Militarite : " +twentytwo.getEffMil() + " | Loyaliste : " + twentytwo.getEffLoy() + ")\n");
                System.out.print(twentythree.getText());
                System.out.println("(Capitaliste : " +twentythree.getEffCap() + " | Religieux : " + twentythree.getEffRel() + " | Ecologiste : " + twentythree.getEffEco() + ")\n");
                System.out.println("Quel scénario sélectionnez vous ?");

                choicevalueScenario = false;

                while(!choicevalueScenario) {
                    valueScenario = scanner.nextInt();
                    switch (valueScenario){
                        case 1 :
                            System.out.println("Choix scénario 1 : Validé.");
                            Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + twentyone.getEffCap());
                            Liberaux.setSatisfaction(Liberaux.getSatisfaction() + twentyone.getEffLib());
                            Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + twentyone.getEffEco());
                            Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + twentyone.getEffLoy());
                            choicevalueScenario = true;
                            break;
                        case 2 :
                            System.out.println("Choix scénario 2 : Validé.");
                            Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + twentytwo.getEffCap());
                            Communiste.setSatisfaction(Communiste.getSatisfaction() + twentytwo.getEffCom());
                            Militariste.setSatisfaction(Militariste.getSatisfaction() + twentytwo.getEffMil());
                            Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() + twentytwo.getEffLoy());
                            choicevalueScenario = true;
                            break;
                        case 3 :
                            System.out.println("Choix scénario 3 : Validé.");
                            Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + twentythree.getEffCap());
                            Religieux.setSatisfaction(Religieux.getSatisfaction() + twentythree.getEffRel());
                            Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + twentythree.getEffEco());
                            choicevalueScenario = true;
                            break;
                    }
                }
                break;
            default:
                System.out.println("Choissiez parmis les scénarios disponible.");
                choicevalueScenario = false;
        }
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

    public static void action(String president, String country){
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
                System.out.println("1. Capitaliste.");
                System.out.println("2. Communiste.");
                System.out.println("3. Libéraux.");
                System.out.println("4. Religieux.");
                System.out.println("5. Militariste.");
                System.out.println("6. Ecologiste.");
                System.out.println("7. Nationaliste.");

                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        Capitaliste.setSatisfaction(Capitaliste.getSatisfaction() + 10);
                        valueTresor = Capitaliste.getPartisans() * 15;
                        Tresor.setValue(Tresor.getValue() - valueTresor);
                        Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() - (valueTresor / 10));
                        System.out.println("Pot de vin versé aux Capitaliste.\n" + "Satifaction des Capitalistes : " + Capitaliste.getSatisfaction() + ", cela vous a coûter  " + valueTresor + "€.");
                        System.out.println("Loyaliste satisfaction :" + Loyaliste.getSatisfaction());
                        break;
                    case 2:
                        Communiste.setSatisfaction(Communiste.getSatisfaction() + 10);
                        valueTresor = Communiste.getPartisans() * 15;
                        Tresor.setValue(Tresor.getValue() - valueTresor);
                        Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() - (valueTresor / 10));
                        System.out.println("Pot de vin versé aux Capitaliste.");
                        break;
                    case 3:
                        Liberaux.setSatisfaction(Liberaux.getSatisfaction() + 10);
                        valueTresor = Liberaux.getPartisans() * 15;
                        Tresor.setValue(Tresor.getValue() - valueTresor);
                        Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() - (valueTresor / 10));
                        break;
                    case 4:
                        Religieux.setSatisfaction(Religieux.getSatisfaction() + 10);
                        valueTresor = Religieux.getPartisans() * 15;
                        Tresor.setValue(Tresor.getValue() - valueTresor);
                        Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() - (valueTresor / 10));
                        break;
                    case 5:
                        Militariste.setSatisfaction(Militariste.getSatisfaction() + 10);
                        valueTresor = Militariste.getPartisans() * 15;
                        Tresor.setValue(Tresor.getValue() - valueTresor);
                        Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() - (valueTresor / 10));
                        break;
                    case 6:
                        Ecologiste.setSatisfaction(Ecologiste.getSatisfaction() + 10);
                        valueTresor = Ecologiste.getPartisans() * 15;
                        Tresor.setValue(Tresor.getValue() - valueTresor);
                        Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() - (valueTresor / 10));
                        break;
                    case 7:
                        Nationaliste.setSatisfaction(Nationaliste.getSatisfaction() + 10);
                        valueTresor = Nationaliste.getPartisans() * 15;
                        Tresor.setValue(Tresor.getValue() - valueTresor);
                        Loyaliste.setSatisfaction(Loyaliste.getSatisfaction() - (valueTresor / 10));
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
                    if (valueFood > 0) {
                        Food.setValue(Food.getValue()+valueFood);
                        Tresor.setValue(Tresor.getValue()-(valueFood*8));
                        System.out.println("Nouveau stock : " + Food.getValue() + " et le reste dans la trésorerie est de: " + Tresor.getValue());
                    } else {
                        System.out.println("Entrez une valeur supérieur à 0");
                    }
                } while (valueFood <= 0);
                break;
            case 3 :
                viewUpdate(president, country);
                break;
            case 4 :
                break;
            default:
                System.out.println("Prenez une décision parmis les choix disponibles.");
        }
    }

    public static void mainFunction(){
        startMenu();
        String president = initializePresident();
        String country = initializeCountry();
        float difficulty = choiceLevel();
        randomEvents();
        viewUpdate(president,country);
        action(president,country);
    }
}
