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

    public static void startMenu() {
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("|                          Bienvenue dans El-Presidente !                            |");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Règles du jeu :\n ");
        System.out.println("Vous incarnerez un dirigeant et serrez à la tête de votre nation.");
        System.out.println("Le but étant d'être le meilleur Presidente ! Et pour cela vous allez devoir survivre \n" +
                "à un maximum d'évènements divers et variés. \n");
    }

    public static void initializeCountry(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Comment voulez-vous que le peuple s'addresse à vous ?");
        String presidentName = scanner.nextLine();
        System.out.println("Et comment s'appelle votre pays ?");
        String countryName = scanner.nextLine();
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
        value =1;

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
                System.out.println(seventeen.getSpecs());
                break;
            case 18:
                System.out.println(eighteen.getSpecs());
                break;
            case 19:
                System.out.println(nineteen.getSpecs());
                break;
            case 20:
                System.out.println(twenty.getSpecs());
                break;
        }

        /*    demande de choix du joueur
                            affichage des diffents impacts du choix (conclusion updated)*/


    }

    public void viewUpdate(){
        System.out.println("Vos statistiques actuelles : ");
        System.out.println("Capitaliste : Satisfaction = " + Capitaliste.getSatisfaction() + ", Partisans = " + Capitaliste.getPartisans());
        System.out.println("Communiste : Satisfaction = " + Communiste.getSatisfaction() + ", Partisans = " + Communiste.getPartisans());
        System.out.println("Libéraux : Satisfaction = " + Liberaux.getSatisfaction() + ", Partisans = " + Liberaux.getPartisans());
        System.out.println("Religieux : Satisfaction = " + Religieux.getSatisfaction() + ", Partisans = " + Religieux.getPartisans());
        System.out.println("Militariste : Satisfaction = " + Militariste.getSatisfaction() + ", Partisans = " + Militariste.getPartisans());
        System.out.println("Ecologiste : Satisfaction = " + Ecologiste.getSatisfaction() + ", Partisans = " + Ecologiste.getPartisans());
        System.out.println("Nationaliste : Satisfaction = " + Nationaliste.getSatisfaction() + ", Partisans = " + Nationaliste.getPartisans());
        System.out.println("Loyaliste : Satisfaction = " + Loyaliste.getSatisfaction() + ", Partisans = " + Loyaliste.getPartisans());

        System.out.println("L'Agriculture représente " );
    }

    public static void mainFunction(){

        startMenu();
        initializeCountry();
        float difficulty = choiceLevel();
        randomEvents();

        System.out.println("");

    }
}
