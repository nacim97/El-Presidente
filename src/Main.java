package src;

import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        int seasons =1, EndGame =0;

        Menu menu = new Menu();
        menu.startMenu();
        String president = menu.initializePresident();
        String country = menu.initializeCountry();
        float difficulty = menu.choiceLevel();
        while(menu.loosecondition(difficulty) && EndGame <20) {
            if(menu.randomEvents(seasons)){
                menu.checkValueSat();
                menu.viewUpdate(president, country);
                seasons = menu.season(seasons, president, country);
                menu.repartition();
                menu.getdown();
                EndGame++;
            }

        }
    }
}
