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
        Factions commmmuniste = new Factions("Commmmuniste",50, 15, 0);
        Factions liberaux = new Factions("Libéraux",50, 15, 0);
        Factions religieux = new Factions("Religieux",50, 15,0);
        Factions militariste = new Factions("Militariste",50, 15,0);
        Factions ecologiste = new Factions("Ecologiste",50, 15,0);
        Factions nationaliste = new Factions("Nationaliste",50, 15,0);
        Factions loyaliste = new Factions("Loyaliste",100, 15,0);

        Actions goldCapitaliste = new Actions("Pot de vin : Capitaliste",15,10,0,0,0,0,0,0,0,0);
        Actions goldCommuniste = new Actions("Pot de vin : Communiste",15,0,10,0,0,0,0,0,0,0);
        Actions goldLiberaux = new Actions("Pot de vin : Liberaux",15,0,0,10,0,0,0,0,0,0);
        Actions goldReligieux = new Actions("Pot de vin : Religieux",15,0,0,0,10,0,0,0,0,0);
        Actions goldMilitariste = new Actions("Pot de vin : Militariste",15,0,0,0,0,10,0,0,0,0);
        Actions goldEcologiste = new Actions("Pot de vin : Ecologiste",15,0,0,0,0,0,10,0,0,0);
        Actions goldNationaliste = new Actions("Pot de vin : Nationaliste",15,0,0,0,0,0,0,10,0,0);
        Actions foodMarket = new Actions ("Acheter une unité de nourriture",8,0,0,0,0,0,0,0,0,1);
    }
