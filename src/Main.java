package src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner scanner = new Scanner(System.in);
        int seasons = 1, EndGame = 0;
        Menu menu = new Menu();
        menu.renameFactions();
        menu.startMenu();
        String president = menu.initializePresident();
        String country = menu.initializeCountry();
        int difficulty = menu.choiceLevel();
        while (menu.loosecondition(difficulty) && EndGame < 20) {
            if (menu.randomEvents(seasons)) {
                menu.checkValueSat();
                menu.viewUpdate(president, country);
                menu.checkMoneyValue();
                seasons = menu.season(seasons, president, country);
                menu.repartition();
                menu.getdown();
                EndGame++;
            }

        }
    }
}
