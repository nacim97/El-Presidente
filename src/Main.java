package src;

import java.lang.reflect.Parameter;

public class Main {

    public static void main(String[] args){

        //add factions
        //Factions capitaliste = new Factions("Capitaliste",50, 15);
        Factions commmmuniste = new Factions("Commmmuniste",50, 15, 0);
        Factions liberaux = new Factions("Libéraux",50, 15, 0);
        Factions religieux = new Factions("Religieux",50, 15,0);
        Factions militariste = new Factions("Militariste",50, 15,0);
        Factions ecologiste = new Factions("Ecologiste",50, 15,0);
        Factions nationaliste = new Factions("Nationaliste",50, 15,0);
        Factions loyaliste = new Factions("Loyaliste",100, 15,0);

        //add actions
        Actions goldCapitaliste = new Actions("Pot de vin : Capitaliste",15,10,0,0,0,0,0,0,0,0);
        Actions goldCommuniste = new Actions("Pot de vin : Communiste",15,0,10,0,0,0,0,0,0,0);
        Actions goldLiberaux = new Actions("Pot de vin : Liberaux",15,0,0,10,0,0,0,0,0,0);
        Actions goldReligieux = new Actions("Pot de vin : Religieux",15,0,0,0,10,0,0,0,0,0);
        Actions goldMilitariste = new Actions("Pot de vin : Militariste",15,0,0,0,0,10,0,0,0,0);
        Actions goldEcologiste = new Actions("Pot de vin : Ecologiste",15,0,0,0,0,0,10,0,0,0);
        Actions goldNationaliste = new Actions("Pot de vin : Nationaliste",15,0,0,0,0,0,0,10,0,0);
        Actions foodMarket = new Actions ("Acheter une unité de nourriture",8,0,0,0,0,0,0,0,0,1);

        Menu.mainFunction( );
    }
}
