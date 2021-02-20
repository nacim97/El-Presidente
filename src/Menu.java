package src;

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

    public static void choiceLevel(){
        Scanner scanner = new Scanner(System.in);
        int level = 0;
        float difficulty;
        Boolean choiceDifficulty = false;

        System.out.println("Choissisez le niveau de difficulté :");
        System.out.println("Tappez 1 pour la difficulté FACILE");
        System.out.println("Tappez 2 pour la difficulté NORMAL");
        System.out.println("Tappez 3 pour la difficulté DIFFICILE");

        while (!choiceDifficulty) {
        level = scanner.nextInt();

            switch (level) {
                case 1:
                    System.out.println("Difficulté FACILE confirmée.");
                    difficulty = 0.5f;
                    choiceDifficulty = true;
                    break;
                case 2:
                    System.out.println("Difficulté NORMAL confirmée.");
                    difficulty =1;
                    choiceDifficulty = true;
                    break;
                case 3:
                    System.out.println("Difficulté DIFFICILE confirmée.");
                    difficulty = 2;
                    choiceDifficulty = true;
                    break;
                default:
                    System.out.println("Sélectionnez un niveau entre 1 et 3.");
                    choiceDifficulty = false;
            }
        }
    }

    public static void mainFunction(){
        startMenu();
        initializeCountry();
        choiceLevel();
    }
}
