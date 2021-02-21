package src;

import java.lang.reflect.Parameter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
            Scanner scanner = new Scanner (System.in);
            int seasons =1, EndGame =0;
            Menu.startMenu();
            String president = Menu.initializePresident();
            String country = Menu.initializeCountry();
            float difficulty = Menu.choiceLevel();
            while(Menu.loosecondition(difficulty) && EndGame <20) {
                if(Menu.randomEvents(seasons)){
                    Menu.viewUpdate(president, country);
                    seasons = Menu.season(seasons, president, country);
                    Menu.repartition();
                    Menu.checkValueSat();
                    Menu.getdown();
                    EndGame++;
                }

            }
    }
}
