package src;

import java.util.Random;
import java.util.Scanner;

public class Menu {

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
        int money = 200;
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
        System.out.println("Voici le scénario qui ce présente à vous :");

        Random nbEvent = new Random();
        int value = 1 + nbEvent.nextInt(20-1);

        Events one = Events.ONE;
        Events two = Events.TWO;
        Events three = Events.THREE;
        Events four = Events.FOUR;
        Events five = Events.FIVE;
        Events six = Events.SIX;
        Events seven = Events.SEVEN;
        Events eight = Events.EIGHT;
        Events nine = Events.NINE;
        Events ten = Events.TEN;
        Events eleven = Events.ELEVEN;
        Events twelve = Events.TWELVE;
        Events thirteen = Events.THIRTEEN;
        Events fourteen = Events.FOURTEEN;
        Events fifteen = Events.FIFTEEN;
        Events sixteen = Events.SIXTEEN;
        Events seventeen = Events.SEVENTEEN;
        Events eighteen = Events.EIGHTEEN;
        Events nineteen = Events.NINETEEN;
        Events twenty = Events.TWENTY;

        Answers oneone = Answers.oneone;
        Answers onetwo = Answers.onetwo;
        Answers onethree = Answers.onethree;

        switch (value) {
            case 1:
                int valueAnswer = 0;
                System.out.println(one.getSpecs());
                System.out.println(oneone.getText());
                System.out.println(onetwo.getText());
                System.out.println(onethree.getText());
                switch (valueAnswer){
       //             case 1 :
       //                 int valkiry = difficulty;
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

        /*variable aléatoire de selection d event
                print de levent
                    print des différents scenario possible
                        demande de choix du joueur
                            affichage des diffents impacts du choix (conclusion updated)*/


    }

    public static void mainFunction(){

        startMenu();
        initializeCountry();
        float difficulty = choiceLevel();
        randomEvents();
    }
}
