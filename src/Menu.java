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

    public static void initializePresident(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Comment voulez-vous que le peuple s'addresse à vous ?");
        String presidentName = scanner.nextLine();
        System.out.println("Et comment s'appelle votre pays ?");
        String countryName = scanner.nextLine();
    }

    public static void choiceLevel(){
        System.out.println("Choissisez le niveau de difficulté :");
        System.out.println("Tappez 1 pour la difficulté FACILE");
        System.out.println("Tappez 2 pour la difficulté NORMAL");
        System.out.println("Tappez 3 pour la difficulté DIFFICILE");

        Scanner scanner = new Scanner (System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Difficulté FACILE confirmée.");
                break;
            case 2:
                System.out.println("Difficulté NORMAL confirmée.");
                break;
            case 3:
                System.out.println("Difficulté DIFFICILE confirmée.");
                break;
            default:
                System.out.println("Sélectionnez un niveau de difficulté proposé.");
        }
    }

    public static void randomEvents(){

    }


    public static void mainFunction(){
        startMenu();
        initializePresident();
        choiceLevel();
    }
}
