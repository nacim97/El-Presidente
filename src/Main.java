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
        /*Event one = new Event("Des extra-terrestes apparaissent et prennent contact, ils souhaitent s'adresser au chef terrien :", 0);
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
        Event twenty = new Event("Votre pays est sélectionné pour organiser les prochains Jeux Olympiques :", 0);*/

        //add Answer
        /*Answer oneA = new Answer("A : Aucun discution possible, vous ordonnez l'armez d'abattre les ennemies.",10,0,0,-10,-10,0,0,0,0,0,0);
        Answer oneB = new Answer("B : Vous répondez à leurs appels et faites en sorte de mettre en place un traité de pays.",0,10,10,0,-10,0,-10,10,0,0,0);
        Answer oneC = new Answer("C : Vous temporisez et laissez les visiteurs dans l'attente.",-10,-10,-10,-10,-10,-10,-10,-10,0,0,0);
        Answer twoA = new Answer("A : Vous mettez en place une équipe de hacker qui a pour mission de contrer l'ennemi (l'ennemi est mis hors d'état de nuire).", 10,10,10,10,10,10,10,10,0,0,0);
        Answer twoB = new Answer("B : Vous payez la rançon (mauvaise idée, l'ennemi continu son chantage).", -15,-15,-15,-15,-15,-15,-15,-15,0,0,0);
        Answer twoC = new Answer("C : Vous envoyez une équipe militaire pour débusquer l'ennemi (vous mettez la main sur l'ennemi, mais l'abattez).",0,0,0,-13,12,0,0,0,0,0,0);
        Answer threeA = new Answer("A : Vous confinez la population dès que possible et mettez en place un vaccin.", 20,0,0,-13,0,0,0,0,0,0,0);
        Answer threeB = new Answer("B : Vous considérez que les effets du virus sont sur-évalués.", 0,-14,-14,0,13,0,-14,0,0,0,0);
        Answer threeC = new Answer("C : Vous mettez en place un couvre feu et un confinement le week end.", -14,0,0,0,0,12,0,12,0,0,0);
        Answer fourA = new Answer("A : Vous vous en servez pour développer votre pays.",-12,0,0,0,0,16,16,16,0,0,0);
        Answer fourB = new Answer("B : Vous passez des accords avec d'autres pays pour une exploitation conventionné.",12,-12,-12,0,0,0,0,0,0,0,0);
        Answer fourC = new Answer("C : Vous vendez le contrôle total de cette énegie à un pays développé.",20,0,-18,20,0,0,-17,0,0,0,0);
        Answer fiveA = new Answer("A : Vous mettez en place un plan de pérénisation des espèces.",0,0,0,16, 0,16,0,-12,0,0,0);
        Answer fiveB = new Answer("B : Vous exploitez le terrain libéré afin de construire de nouvelle infracstructure de recherche et développement.",12,12,0,0,12,-16,0,0,0,0,0);
        Answer fiveC = new Answer("C : Vous laissez faire la nature.", -12,0,15,0,0,15,0,15,0,0,0);
        Answer sixA = new Answer("A : Vous payez la rançon et récupérez votre fille.",-15,-15,20,-15,-15,-15,-15,20,0,0,0);
        Answer sevenA = new Answer("A : vous acceptez leurs revendications sans négociation.",-12,0,16,0,0,0,16,-12,0,0,0);
        Answer sevenB = new Answer("B : vous proposez un accord prenant en comptes les revendications prioritaire.",0,10,10,-10,0,10,10,0,0,0,0);
        Answer sevenC = new Answer("C : vous envoyez l'armée afin de mettre fin à la grève.",0,0,-14,0,16,0,-14,0,0,0,0);
        Answer eightA = new Answer("A : vous mettez en place un plan de subvention afin de contrer les impacts subits",-12,0,13,13, 0, 13, 0,0,0,0,0);
        Answer eightB = new Answer("B : vous ignorez les risques.",0,0,0,-14,0,-13,0,0,0,0,0);
        Answer eightC = new Answer("C : Vous mettez au service des agriculteurs des moyens militaires permettant l'hydratation des terres et une assistance aux personnes vulnérables.",14,-12,0,-12,0,13,15,0,0,0,0);
        Answer nineA = new Answer("A : vous leur ouvrez les portes et les offrez une prise en charge totale.",-12, 0,18,18,0,18,-12,0,0,0,0);
        Answer nineB = new Answer("B : vous fermez les portes et menacez les étrangers.",-18,-18,-18,-18,10,-18,-18,12,0,0,0);
        Answer nineC = new Answer("C : vous acceptez sous conditions.", 0,0,10,10,0,0,0,0,0,0,0);
        Answer tenA = new Answer("A : vous mettez à l'abris au maximum la population.", -15,15,15,15,15,15,15,15,0,0,0);
        Answer tenB = new Answer("B : il est trop tard, vous sélectionnez les éléments indispensable au pays et laissez les autres à leurs sorts.", 25,-20,-20,-20,-20,-20,-20,25,0,0,0);
        Answer tenC = new Answer("C : Les femmes et les enfants d'abord.", 10,10,10,10,10,10,10,10,0,0,0);
        Answer elevenA = new Answer("A : vous l'acceptez sans problème.", 15,0,0,0,0,15,-12,0,0,0,0);
        Answer elevenB = new Answer("B : vous refusez de signé ce traité.", -15,15,15,15,15,15,15,15,0,0,0);
        Answer elevenC = new Answer("C : vous acceptez mais sous conditions.",0,8,0,0,0,-15,8,8,0,0,0);
        Answer twelveA = new Answer("A : vous lancez une campagne de sensibilisation + aide de l'état.", -15,15,15,15,15,15,15,15,0,0,0);
        Answer twelveB = new Answer("B : vous lancez une campagne de sensibilisation.", -15,15,15,15,15,15,15,15,0,0,0);
        Answer twelveC = new Answer("C : la problématique n'est pas assez importante pour être traité par l'état.", 0,12,12,0,0,0,12,0,0,0,0);
        Answer thirteenA = new Answer("A : vous refusez, la recherche spatiale n'est pas une priorité pour votre pays.", -10,0,0,14,0,15,0,0,0,0,0);
        Answer thirteenB = new Answer("B : vous acceptez.", 12,-11,0,0,0,0,-11,0,0,0,0);
        Answer thirteenC = new Answer("C : vous acceptez mais sous condition de possession des propriétées intellectuels.", -8,0,0,0,10,0,0,10,0,0,0);
        Answer fourteenA = new Answer("A : vous mettez un place un plan de sécurisation tout autour des infrastructures menacées.",0,-14,-14,0,0,0,12,12,0,0,0);
        Answer fourteenB = new Answer("B : vous pensez pas que le risque est réel, vous restez passif face à la situation.", 0,-15,-13,0,0,0,-13,0,0,0,0);
        Answer fourteenC = new Answer("C : vous lancez un campagne de sensibilisation express alertante la poulation à faire attention et à se préparer à partir.", 0,0,0,12,0,12,12,12,0,0,0);
        Answer fifteenA = new Answer("A : Vous n'acceptez pas cet affrond et envoyez l'armé combattre les adversaires.", -25,-25,-25,-25,20,-25,-25,30,0,0,0);
        Answer fifteenB = new Answer("B : Vous acceptez le désacord et organisez de nouvelles élections.", 20,20,20,20,-25,20,20,-25,0,0,0);
        Answer sixteenA = new Answer("A : vous investissez sans compter pour renover toutes les infracstructures en priorité tout en délaissant la populations.", 16,0,0,-14,0,-14,16,16,0,0,0);
        Answer sixteenB = new Answer("B : vous profitez de cette tragédie pour re-centraliser la capitale du pays dans une autre ville.", 15,0,-13,0,0,0,0,15,0,0,0);
        Answer sixteenC = new Answer("C : vous placez la priorité sur la population.", -8,25,25,25,25,25,25,25,0,0,0);
        Answer seventeenA = new Answer("A : vous faites appel au calme et invitez chacun des représentants à la discution autour d'une table.", 25,-15,25,15,25,-15,25,-15,0,0,0);
        Answer seventeenB = new Answer("B : vous faites partie de la factions militaire, vous mettez en place une dictature militaire.", -25,-25,-25,-25,30,-25,-25,-25,0,0,0);
        Answer seventeenC = new Answer("C : vous proposez la répartition equitable du pays en 8 factions et à chaque partie son dirigeant.", -20,25,-20,25,25,25,25,-20,0,0,0);
        Answer eighteenA = new Answer("A : vous vous représentez pour un nouveau mandat.", 0,0,0,0,0,-12,0,15,0,0,0);
        Answer eighteenB = new Answer("B : vous prenez votre retraite politique.", 13,13,13,0,13,0,0,-12,0,0,0);
        Answer eighteenC = new Answer("C : vous ne comptez pas lâcher votre trône et vous auto-proclamez nouveau président.", -20,-20,-20,-20,-20,-20,-20,20,0,0,0);
        Answer nineteenA = new Answer("A : vous trouvez une solution pour étouffer l'affaire et le destitué de ses fonctions.", 12,12,-14,-14,0,0,0,0,12,0,0);
        Answer nineteenB = new Answer("B : vous rendez l'histoire public et désignez un nouveau premier ministre.", -18,17,17,17,17,17,17,17,0,0,0);
        Answer nineteenC = new Answer("C : vous êtes complice, vous étouffez l'histoire.",-25,-25,-25,-25,-25,-25,-25,-25,0,0,0);
        Answer twentyA = new Answer("A : vous acceptez la responsabilité malgrès les immenses investissements.", 15,0,15,0,0,-25,0,25,0,0,0);
        Answer twentyB = new Answer("B : vous refusez car l'état économique du pays ne permet pas ce genre d'investissement.", -15,13,0,0,13,0,0,15,0,0,0);
        Answer twentyC = new Answer("C : vous acceptez et mettez en place un plan économique avec votre équipe d'expert pour prendre le risque de ressortir des bénéfices de cet évènement.", 12,0,0,12,0,-15,0,0,0,0,0);*/

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
