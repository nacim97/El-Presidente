package src;

import java.lang.reflect.Parameter;

public class Main {

    public static void main(String[] args){

        //add factions
        Factions capitaliste = new Factions("Capitaliste",50, 15);
        Factions commmmuniste = new Factions("Commmmuniste",50, 15);
        Factions liberaux = new Factions("Libéraux",50, 15);
        Factions religieux = new Factions("Religieux",50, 15);
        Factions militariste = new Factions("Militariste",50, 15);
        Factions ecologiste = new Factions("Ecologiste",50, 15);
        Factions nationaliste = new Factions("Nationaliste",50, 15);
        Factions loyaliste = new Factions("Loyaliste",100, 15);

        //add actions
        Actions goldCapitaliste = new Actions("Pot de vin : Capitaliste",15,10,0,0,0,0,0,0,0.1f,0);
        Actions goldCommuniste = new Actions("Pot de vin : Communiste",15,0,10,0,0,0,0,0,0.1f,0);
        Actions goldLiberaux = new Actions("Pot de vin : Liberaux",15,0,0,10,0,0,0,0,0.1f,0);
        Actions goldReligieux = new Actions("Pot de vin : Religieux",15,0,0,0,10,0,0,0,0.1f,0);
        Actions goldMilitariste = new Actions("Pot de vin : Militariste",15,0,0,0,0,10,0,0,0.1f,0);
        Actions goldEcologiste = new Actions("Pot de vin : Ecologiste",15,0,0,0,0,0,10,0,0.1f,0);
        Actions goldNationaliste = new Actions("Pot de vin : Nationaliste",15,0,0,0,0,0,0,10,0.1f,0);
        Actions foodMarket = new Actions ("Acheter une unité de nourriture",8,0,0,0,0,0,0,0,0,1);

        //add Event
        Event one = new Event("Des extra-terrestes apparaissent et prennent contact, ils souhaitent s'adresser au chef terrien :", 0);
        Event two = new Event("Des hackers ont piraté des secrets d'état et réclament une rançon de 250 millions d'euro :", 0);
        Event three = new Event("Une pandémie touche mondialement :", 1);
        Event four = new Event("Une nouvelle source d'énergie verte illimité est découverte :", 0);
        Event five = new Event("Suite à un incendie ayant dévaster une grand partie de la faune et la flore du pays :", 2);
        Event six = new Event("Votre fille vient d'être enlevée par des terroristes, ils vous demandent une rançon de 10millions d'euros :", 0);
        Event seven = new Event("Une grève des travailleurs du bâtiment dure depuis 2 semaines :", 0);
        Event eight = new Event("Une forte canicule impacte les agriculteurs, ainsi que les personnes agées :", 3);
        Event nine = new Event("Des réfugiés de guerre provenant du pays voisins demandent votre protection :", 0);
        Event ten = new Event("Une météorité va s'écraser très prochainement dans le territoire du pays :", 0);
        Event eleven = new Event("Un traité concernant l'émission de CO2 est proposé à échelle mondiale :", 0);
        Event twelve = new Event("Vous observez une augmentation de présence de punaise de lit à échelle nationale :", 0);
        Event thirteen = new Event("Un célèbre et brillant scientifique vous demande des subventions pour ses recherches spatiales :", 0);
        Event fourteen = new Event("Une montée alarmante du niveau du fleuve national menace de déborder :", 0);
        Event fifteen = new Event("Un coup d'état vous menace, il est orchestré par votre premier ministre :", 0);
        Event sixteen = new Event("Un séisme magnitude 7.5 a ravagé une bonne partie de la capitale :", 0);
        Event seventeen = new Event("Une guerre religieuse naît entre les 8 différentes factions présente au sein du pays :", 0);
        Event eighteen = new Event("Les nouvelles élections présidentielles approchent :", 0);
        Event nineteen = new Event("Votre premier ministre est accusé de détournement de fond public, le peuple n'a pas encore écho de cette information :", 0);
        Event twenty = new Event("Votre pays est sélectionné pour organiser les prochains Jeux Olympiques :", 0);

        //add Answer
        Answer oneA = new Answer("A : Aucun discution possible, vous ordonnez l'armez d'abattre les ennemies.",10,0,0,-10,-10,0,0,0,0,0,0);
        Answer oneB = new Answer("B : Vous répondez à leurs appels et faites en sorte de mettre en place un traité de pays.",0,10,10,0,-10,0,-10,10,0,0,0);
        // --> Continuer à remplir les answer (voir fichier excel : https://docs.google.com/spreadsheets/d/1nGVAs71KOm6bU3m5yy7fff1l_9kLIrdpbVzSOcJDWSE/edit#gid=0)

        //add Supporters
        Supporters suppCapitaliste = new Supporters("Capitaliste",15);
        Supporters suppCommuniste = new Supporters("Communiste",15);
        Supporters suppLiberaux = new Supporters("Libéraux",15);
        Supporters suppReligieux = new Supporters("Religieux",15);
        Supporters suppMilitariste = new Supporters("Militariste",15);
        Supporters suppEcologiste = new Supporters("Ecologiste",15);
        Supporters suppNationaliste = new Supporters("Nationaliste",15);
        Supporters suppLoyaliste = new Supporters("Loyaliste",15);

        Menu.mainFunction( );
    }
}
