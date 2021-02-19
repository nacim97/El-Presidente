package src;

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

        // --> Continuer à remplir les evenements (voir fichier excel : https://docs.google.com/spreadsheets/d/1nGVAs71KOm6bU3m5yy7fff1l_9kLIrdpbVzSOcJDWSE/edit#gid=0)
        Event six = new Event("Des extra-terrestes apparaissent et prennent contact, ils souhaitent s'adresser au chef terrien.", 0);
        Event seven = new Event("Des extra-terrestes apparaissent et prennent contact, ils souhaitent s'adresser au chef terrien.", 0);
        Event eight = new Event("Des extra-terrestes apparaissent et prennent contact, ils souhaitent s'adresser au chef terrien.", 0);
        Event nine = new Event("Des extra-terrestes apparaissent et prennent contact, ils souhaitent s'adresser au chef terrien.", 0);
        Event ten = new Event("Des extra-terrestes apparaissent et prennent contact, ils souhaitent s'adresser au chef terrien.", 0);
        Event eleven = new Event("Des extra-terrestes apparaissent et prennent contact, ils souhaitent s'adresser au chef terrien.", 0);
        Event twelve = new Event("Des extra-terrestes apparaissent et prennent contact, ils souhaitent s'adresser au chef terrien.", 0);
        Event thirteen = new Event("Des extra-terrestes apparaissent et prennent contact, ils souhaitent s'adresser au chef terrien.", 0);
        Event fourteen = new Event("Des extra-terrestes apparaissent et prennent contact, ils souhaitent s'adresser au chef terrien.", 0);
        Event fifteen = new Event("Des extra-terrestes apparaissent et prennent contact, ils souhaitent s'adresser au chef terrien.", 0);
        Event sixteen = new Event("Des extra-terrestes apparaissent et prennent contact, ils souhaitent s'adresser au chef terrien.", 0);
        Event seventeen = new Event("Des extra-terrestes apparaissent et prennent contact, ils souhaitent s'adresser au chef terrien.", 0);
        Event eighteen = new Event("Des extra-terrestes apparaissent et prennent contact, ils souhaitent s'adresser au chef terrien.", 0);
        Event nineteen = new Event("Des extra-terrestes apparaissent et prennent contact, ils souhaitent s'adresser au chef terrien.", 0);
        Event twenty = new Event("Des extra-terrestes apparaissent et prennent contact, ils souhaitent s'adresser au chef terrien.", 0);

        //add Answer
        Answer oneA = new Answer("A : Aucun discution possible, vous ordonnez l'armez d'abattre les ennemies.",10,0,0,-10,-10,0,0,0,0,0,0);
        Answer oneB = new Answer("B : Vous répondez à leurs appels et faites en sorte de mettre en place un traité de pays.",0,10,10,0,-10,0,-10,10,0,0,0);
        // --> Continuer à remplir les answer (voir fichier excel : https://docs.google.com/spreadsheets/d/1nGVAs71KOm6bU3m5yy7fff1l_9kLIrdpbVzSOcJDWSE/edit#gid=0)

        //initialize Country





        Menu.mainFunction( );
    }
}
