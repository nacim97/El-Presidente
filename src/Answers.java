package src;

public enum Answers {
    oneone("1 : Aucun discution possible, vous ordonnez l'armez d'abattre les ennemies.",10,0,0,-10,-10,0,0,0,0,0,0),
    onetwo("2 : Vous répondez à leurs appels et faites en sorte de mettre en place un traité de pays.",0,10,10,0,-10,0,-10,10,0,0,0),
    onethree("3 : Vous temporisez et laissez les visiteurs dans l'attente.",-10,-10,-10,-10,-10,-10,-10,-10,0,0,0),
    twoone("1 : Vous mettez en place une équipe de hacker qui a pour mission de contrer l'ennemi (l'ennemi est mis hors d'état de nuire).", 10,10,10,10,10,10,10,10,0,0,0),
    twotwo("2 : Vous payez la rançon (mauvaise idée, l'ennemi continu son chantage).", -15,-15,-15,-15,-15,-15,-15,-15,0,0,0),
    twothree("3 : Vous envoyez une équipe militaire pour débusquer l'ennemi (vous mettez la main sur l'ennemi, mais l'abattez).",0,0,0,-13,12,0,0,0,0,0,0),
    threeone("1 : Vous confinez la population dès que possible et mettez en place un vaccin.", 20,0,0,-13,0,0,0,0,0,0,0),
    threetwo("2 : Vous considérez que les effets du virus sont sur-évalués.", 0,-14,-14,0,13,0,-14,0,0,0,0),
    threethree("3 : Vous mettez en place un couvre feu et un confinement le week end.", -14,0,0,0,0,12,0,12,0,0,0),
    fourone("1 : Vous vous en servez pour développer votre pays.",-12,0,0,0,0,16,16,16,0,0,0),
    fourtwo("2 : Vous passez des accords avec d'autres pays pour une exploitation conventionné.",12,-12,-12,0,0,0,0,0,0,0,0),
    fourthree("3 : Vous vendez le contrôle total de cette énegie à un pays développé.",20,0,-18,20,0,0,-17,0,0,0,0),
    fiveone("1 : Vous mettez en place un plan de pérénisation des espèces.",0,0,0,16, 0,16,0,-12,0,0,0),
    fivetwo("2 : Vous exploitez le terrain libéré afin de construire de nouvelle infracstructure de recherche et développement.",12,12,0,0,12,-16,0,0,0,0,0),
    fivethree("3 : Vous laissez faire la nature.", -12,0,15,0,0,15,0,15,0,0,0),
    sixone("1 : Vous payez la rançon et récupérez votre fille.",-15,-15,20,-15,-15,-15,-15,20,0,0,0),
    sevenone("1 : vous acceptez leurs revendications sans négociation.",-12,0,16,0,0,0,16,-12,0,0,0),
    seventwo("2 : vous proposez un accord prenant en comptes les revendications prioritaire.",0,10,10,-10,0,10,10,0,0,0,0),
    seventhree("3 : vous envoyez l'armée afin de mettre fin à la grève.",0,0,-14,0,16,0,-14,0,0,0,0),
    eightone("1 : vous mettez en place un plan de subvention afin de contrer les impacts subits",-12,0,13,13, 0, 13, 0,0,0,0,0),
    eighttwo("2: vous ignorez les risques.",0,0,0,-14,0,-13,0,0,0,0,0),
    eightthree("3 : Vous mettez au service des agriculteurs des moyens militaires permettant l'hydratation des terres et une assistance aux personnes vulnérables.",14,-12,0,-12,0,13,15,0,0,0,0),
    nineone("1 : vous leur ouvrez les portes et les offrez une prise en charge totale.",-12, 0,18,18,0,18,-12,0,0,0,0),
    ninetwo("2 : vous fermez les portes et menacez les étrangers.",-18,-18,-18,-18,10,-18,-18,12,0,0,0),
    ninethree("3 : vous acceptez sous conditions.", 0,0,10,10,0,0,0,0,0,0,0),
    tenone("1 : vous mettez à l'abris au maximum la population.", -15,15,15,15,15,15,15,15,0,0,0),
    tentwo("2 : il est trop tard, vous sélectionnez les éléments indispensable au pays et laissez les autres à leurs sorts.", 25,-20,-20,-20,-20,-20,-20,25,0,0,0),
    tenthree("3 : Les femmes et les enfants d'abord.", 10,10,10,10,10,10,10,10,0,0,0),
    elevenone("1 : vous l'acceptez sans problème.", 15,0,0,0,0,15,-12,0,0,0,0),
    eleventwo("2 : vous refusez de signé ce traité.", -15,15,15,15,15,15,15,15,0,0,0),
    eleventhree("3 : vous acceptez mais sous conditions.",0,8,0,0,0,-15,8,8,0,0,0),
    twelveone("1 : vous lancez une campagne de sensibilisation + aide de l'état.", -15,15,15,15,15,15,15,15,0,0,0),
    twelvetwo("2 : vous lancez une campagne de sensibilisation.", -15,15,15,15,15,15,15,15,0,0,0),
    twelvethree("3 : la problématique n'est pas assez importante pour être traité par l'état.", 0,12,12,0,0,0,12,0,0,0,0),
    thirdteenone("1 : vous refusez, la recherche spatiale n'est pas une priorité pour votre pays.", -10,0,0,14,0,15,0,0,0,0,0),
    thirdteentwo("2 : vous acceptez.", 12,-11,0,0,0,0,-11,0,0,0,0),
    thirdteenthree("3 : vous acceptez mais sous condition de possession des propriétées intellectuels.", -8,0,0,0,10,0,0,10,0,0,0),
    fourteenone("1 : vous mettez un place un plan de sécurisation tout autour des infrastructures menacées.",0,-14,-14,0,0,0,12,12,0,0,0),
    fourteentwo("2 : vous pensez pas que le risque est réel, vous restez passif face à la situation.", 0,-15,-13,0,0,0,-13,0,0,0,0),
    fourteenthree("3 : vous lancez un campagne de sensibilisation express alertante la poulation à faire attention et à se préparer à partir.", 0,0,0,12,0,12,12,12,0,0,0),
    fifteenone("1 : Vous n'acceptez pas cet affrond et envoyez l'armé combattre les adversaires.", -25,-25,-25,-25,20,-25,-25,30,0,0,0),
    fifteentwo("2 : Vous acceptez le désacord et organisez de nouvelles élections.", 20,20,20,20,-25,20,20,-25,0,0,0),
    sixteenone("1 : vous investissez sans compter pour renover toutes les infracstructures en priorité tout en délaissant la populations.", 16,0,0,-14,0,-14,16,16,0,0,0),
    sixteentwo("2 : vous profitez de cette tragédie pour re-centraliser la capitale du pays dans une autre ville.", 15,0,-13,0,0,0,0,15,0,0,0),
    sixteenthree("3 : vous placez la priorité sur la population.", -8,25,25,25,25,25,25,25,0,0,0),
    seventeenone("1 : vous faites appel au calme et invitez chacun des représentants à la discution autour d'une table.", 25,-15,25,15,25,-15,25,-15,0,0,0),
    seventeentwo("2 : vous faites partie de la factions militaire, vous mettez en place une dictature militaire.", -25,-25,-25,-25,30,-25,-25,-25,0,0,0),
    seventeenthree("3 : vous proposez la répartition equitable du pays en 8 factions et à chaque partie son dirigeant.", -20,25,-20,25,25,25,25,-20,0,0,0),
    eighteenone("1 : vous vous représentez pour un nouveau mandat.", 0,0,0,0,0,-12,0,15,0,0,0),
    eighteentwo("2 : vous prenez votre retraite politique.", 13,13,13,0,13,0,0,-12,0,0,0),
    eighteenthree("3 : vous ne comptez pas lâcher votre trône et vous auto-proclamez nouveau président.", -20,-20,-20,-20,-20,-20,-20,20,0,0,0),
    nineteenone("1 : vous trouvez une solution pour étouffer l'affaire et le destitué de ses fonctions.", 12,12,-14,-14,0,0,0,0,12,0,0),
    nineteentwo("2 : vous rendez l'histoire public et désignez un nouveau premier ministre.", -18,17,17,17,17,17,17,17,0,0,0),
    nineteenthree("3 : vous êtes complice, vous étouffez l'histoire.",-25,-25,-25,-25,-25,-25,-25,-25,0,0,0),
    twentyone("1 : vous acceptez la responsabilité malgrès les immenses investissements.", 15,0,15,0,0,-25,0,25,0,0,0),
    twentytwo("2 : vous refusez car l'état économique du pays ne permet pas ce genre d'investissement.", -15,13,0,0,13,0,0,15,0,0,0),
    twentythree("3 : vous acceptez et mettez en place un plan économique avec votre équipe d'expert pour prendre le risque de ressortir des bénéfices de cet évènement.", 12,0,0,12,0,-15,0,0,0,0,0);

    private final String text;
    private final int EffCap;
    private final int EffCom;
    private final int EffLib;
    private final int EffRel;
    private final int EffMil;
    private final int EffEco;
    private final int EffNat;
    private final int EffLoy;
    private final int EffBank;
    private final int EffIndu;
    private final int EffAgri;

    Answers(String text, int EffCap, int EffCom, int EffLib, int EffRel, int EffMil, int EffEco, int EffNat, int EffLoy, int EffBank, int EffIndu, int EffAgri){
        this.text = text;
        this.EffCap = EffCap;
        this.EffCom = EffCom;
        this.EffLib = EffLib;
        this.EffRel = EffRel;
        this.EffMil = EffMil;
        this.EffEco = EffEco;
        this.EffNat = EffNat;
        this.EffLoy = EffLoy;
        this.EffBank = EffBank;
        this.EffIndu = EffIndu;
        this.EffAgri = EffAgri;
    }

    public String getText(){return this.text;}
    public int getEffCap(){return this.EffCap;}
    public int getEffCom(){return this.EffCom;}
    public int getEffLib(){return this.EffLib;}
    public int getEffRel(){return this.EffRel;}
    public int getEffMil(){return this.EffMil;}
    public int getEffEco(){return this.EffEco;}
    public int getEffNat(){return this.EffNat;}
    public int getEffLoy(){return this.EffLoy;}
    public int getEffBank(){return this.EffBank;}
    }

