package src;

import java.util.Random;
import java.util.Scanner;

public class menuEvents {
    public static boolean randomEvents(int seas){

        Scanner scanner = new Scanner(System.in);

        Random nbEvent = new Random();
        int value = 1 + nbEvent.nextInt(20-1);
        int valueScenario;
        Boolean choicevalueScenario = true;
        switch (value) {
            case 1:
                if(Events.ONE.getAlused() == 0 && (Events.ONE.getconstraint() != seas)) {
                    System.out.println("Olala \uD83D\uDE31 \uD83D\uDE31 \uD83D\uDE31" + Events.ONE.getSpecs() + "\n");
                    System.out.print(Answers.oneone.getText());
                    System.out.println("(Capitaliste : " + Answers.oneone.getEffCap() + " | Religieux : " + Answers.oneone.getEffRel() + " | Militariste : " + Answers.oneone.getEffMil() + ")\n");
                    System.out.print( Answers.onetwo.getText());
                    System.out.println("(Capitaliste : " +  Answers.onetwo.getEffCap() + " | Communiste : " + Answers.onetwo.getEffCom() + " | Libéraliste : " + Answers.onetwo.getEffLib() + " | Religieux : " + Answers.onetwo.getEffRel() + ")\n");
                    System.out.print( Answers.onethree.getText());
                    System.out.println("(Capitaliste : " +  Answers.onethree.getEffCap() + " | Communiste : " + Answers.onethree.getEffCom() + " | Libéraliste : " + Answers.onethree.getEffLib() + " | Religieux : " + Answers.onethree.getEffRel() + ")\n");
                    System.out.println("Quel scénario sélectionnez vous ?");

                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                this.capitaliste.setSatisfaction(this.capitaliste.getSatisfaction() + Answers.oneone.getEffCap());
                                this.religieux.setSatisfaction(this.religieux.getSatisfaction() + Answers.oneone.getEffRel());
                                this.militariste.setSatisfaction(this.militariste.getSatisfaction() + Answers.oneone.getEffMil());
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                this.communiste.setSatisfaction(this.communiste.getSatisfaction() + Answers.onetwo.getEffCom());
                                this.liberaux.setSatisfaction(this.liberaux.getSatisfaction() + Answers.onetwo.getEffLib());
                                this.militariste.setSatisfaction(this.militariste.getSatisfaction() + Answers.onetwo.getEffMil());
                                this.nationaliste.setSatisfaction(this.nationaliste.getSatisfaction() + Answers.onetwo.getEffNat());
                                this.loyaliste.setSatisfaction(this.loyaliste.getSatisfaction() + Answers.onetwo.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                updateFromEvent(Answers.onethree);
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                } else return false;
                break;
            case 2:
                if(Events.TWO.getAlused() == 0 && (Events.TWO.getconstraint() != seas)) {
                    System.out.println("Ayaya \uD83D\uDC68\u200D\uD83D\uDCBB" + Events.TWO.getSpecs() + "\uD83D\uDC68\u200D\uD83D\uDCBB" + "\n");
                    System.out.print(Answers.twoone.getText());
                    System.out.println("(Capitaliste : " + Answers.twoone.getEffCap() + " | Communiste : " + Answers.twoone.getEffCom() + " | Libéraux : " + Answers.twoone.getEffLib() + " | Religieux : " + Answers.twoone.getEffRel() + " | Militant : " + Answers.twoone.getEffMil() + " | Ecologiste : " + Answers.twoone.getEffEco() + " | Nationaliste : " + Answers.twoone.getEffNat() + " | Loyaliste : " + Answers.twoone.getEffLoy() + ")\n");
                    System.out.print(Answers.twotwo.getText());
                    System.out.println("(Capitaliste : " + Answers.twotwo.getEffCap() + " | Communiste : " + Answers.twotwo.getEffCom() + " | Libéraliste : " + Answers.twotwo.getEffLib() + " | Religieux : " + Answers.twotwo.getEffRel() + " | Militant : " + Answers.twotwo.getEffMil() + " | Ecologiste : " + Answers.twotwo.getEffEco() + " | Nationaliste : " + Answers.twotwo.getEffNat() + " | Loyaliste : " + Answers.twotwo.getEffLoy() + ")\n");
                    System.out.print(Answers.twothree.getText());
                    System.out.println("(Religieux : " + Answers.twothree.getEffRel() + " | Militant : " + Answers.twothree.getEffMil() + ")\n");
                    System.out.println("Quel scénario sélectionnez vous ?");

                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                updateFromEvent(Answers.twoone);
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                updateFromEvent(Answers.twotwo);
                                this.capitaliste.setSatisfaction(this.capitaliste.getSatisfaction() + Answers.twotwo.getEffCap());
                                this.communiste.setSatisfaction(this.communiste.getSatisfaction() + Answers.twotwo.getEffCom());
                                this.liberaux.setSatisfaction(this.liberaux.getSatisfaction() + Answers.twotwo.getEffLib());
                                this.religieux.setSatisfaction(this.religieux.getSatisfaction() + Answers.twotwo.getEffRel());
                                this.militariste.setSatisfaction(this.militariste.getSatisfaction() + Answers.twotwo.getEffMil());
                                this.ecologiste.setSatisfaction(this.ecologiste.getSatisfaction() + Answers.twotwo.getEffEco());
                                this.nationaliste.setSatisfaction(this.nationaliste.getSatisfaction() + Answers.twotwo.getEffNat());
                                this.loyaliste.setSatisfaction(this.loyaliste.getSatisfaction() + Answers.twotwo.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                this.religieux.setSatisfaction(this.religieux.getSatisfaction() + Answers.twothree.getEffRel());
                                this.militariste.setSatisfaction(this.militariste.getSatisfaction() + Answers.twothree.getEffMil());
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                }else return false;
                break;
            case 3:
                if(Events.THREE.getAlused() == 0 && (Events.THREE.getconstraint() != seas)) {
                    System.out.println("Catastrophe !! " + Events.THREE.getSpecs() + "\n");
                    System.out.print(Answers.threeone.getText());
                    System.out.println("(Capitaliste : " + Answers.threeone.getEffCap() + " | Religieux : " + Answers.threeone.getEffRel() + ")\n");
                    System.out.print(Answers.twotwo.getText());
                    System.out.println("(Communiste : " + Answers.threetwo.getEffCom() + " | Libéraux : " + Answers.threetwo.getEffLib() + " | Militant : " + Answers.threetwo.getEffMil() + " | Nationaliste : " + Answers.twotwo.getEffNat() + ")\n");
                    System.out.print(Answers.threethree.getText());
                    System.out.println("(Capitaliste : " + Answers.threethree.getEffCap() + " | Ecologiste : " + Answers.threethree.getEffEco() + " | Loyaliste : " + Answers.threethree.getEffLoy() + ")\n");
                    System.out.println("Quel scénario sélectionnez vous ?");

                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                this.capitaliste.setSatisfaction(this.capitaliste.getSatisfaction() + Answers.threeone.getEffCap());
                                this.religieux.setSatisfaction(this.religieux.getSatisfaction() + Answers.threeone.getEffRel());
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");

                                this.communiste.setSatisfaction(this.communiste.getSatisfaction() + Answers.threetwo.getEffCom());
                                this.liberaux.setSatisfaction(this.liberaux.getSatisfaction() + Answers.threetwo.getEffLib());
                                this.militariste.setSatisfaction(this.militariste.getSatisfaction() + Answers.threetwo.getEffMil());
                                this.nationaliste.setSatisfaction(this.nationaliste.getSatisfaction() + Answers.threetwo.getEffNat());
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                this.capitaliste.setSatisfaction(this.capitaliste.getSatisfaction() + Answers.threethree.getEffCap());
                                this.ecologiste.setSatisfaction(this.ecologiste.getSatisfaction() + Answers.threethree.getEffEco());
                                this.loyaliste.setSatisfaction(this.loyaliste.getSatisfaction() + Answers.threethree.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }

                        break;
                    }
                }else return false;
                break;
            case 4:
                if(Events.FOUR.getAlused() == 0 && (Events.FOUR.getconstraint() != seas)) {
                    System.out.println(" Incroyable ! " + Events.FOUR.getSpecs() + "\n");
                    System.out.print(Answers.fourone.getText());
                    System.out.println("(Capitaliste : " + Answers.fourone.getEffCap() + " | Ecologiste : " + Answers.fourone.getEffEco() + " | Nationaliste : " + Answers.fourone.getEffNat() + " | Loyaliste : " + Answers.fourone.getEffLoy() + ")\n");
                    System.out.print(Answers.fourtwo.getText());
                    System.out.println("(Capitaliste : " + Answers.fourtwo.getEffCap() + " | Communiste : " + Answers.fourtwo.getEffCom() + " | Libéraliste : " + Answers.fourtwo.getEffLib() + ")\n");
                    System.out.print(Answers.fourthree.getText());
                    System.out.println("(Capitaliste : " + Answers.fourthree.getEffCap() + " | Libéraliste : " + Answers.fourthree.getEffLib() + " | Religieux : " + Answers.fourthree.getEffRel() + " | Nationaliste : " + Answers.fourthree.getEffNat() + ")\n");
                    System.out.println("Quel scénario sélectionnez vous ?");

                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                this.capitaliste.setSatisfaction(this.capitaliste.getSatisfaction() + Answers.fourone.getEffCap());
                                this.ecologiste.setSatisfaction(this.ecologiste.getSatisfaction() + Answers.fourone.getEffEco());
                                this.nationaliste.setSatisfaction(this.nationaliste.getSatisfaction() + Answers.fourone.getEffNat());
                                this.loyaliste.setSatisfaction(this.loyaliste.getSatisfaction() + Answers.fourone.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                this.capitaliste.setSatisfaction(this.capitaliste.getSatisfaction() + Answers.fourtwo.getEffCap());
                                this.communiste.setSatisfaction(this.communiste.getSatisfaction() + Answers.fourtwo.getEffCom());
                                this.liberaux.setSatisfaction(this.liberaux.getSatisfaction() + Answers.fourtwo.getEffLib());
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                this.capitaliste.setSatisfaction(this.capitaliste.getSatisfaction() + Answers.fourthree.getEffCap());
                                this.liberaux.setSatisfaction(this.liberaux.getSatisfaction() + Answers.fourthree.getEffLib());
                                this.religieux.setSatisfaction(this.religieux.getSatisfaction() + Answers.fourthree.getEffRel());
                                this.nationaliste.setSatisfaction(this.nationaliste.getSatisfaction() + Answers.fourthree.getEffNat());
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }

                        break;
                    }
                }else return false;
                break;
            case 5:
                if(Events.FIVE.getAlused() == 0 && (Events.FIVE.getconstraint() != seas)) {
                    System.out.println("Voici le scénario qui ce présente à vous :");
                    System.out.println(Events.FIVE.getSpecs() + "\n");
                    System.out.print(Answers.fiveone.getText());
                    System.out.println("(Religieux : " + Answers.fiveone.getEffRel() + " | Ecologiste : " + Answers.fiveone.getEffEco() + " | Loyaliste : " + Answers.fiveone.getEffLoy() + ")\n");
                    System.out.print(Answers.fivetwo.getText());
                    System.out.println("(Capitaliste : " + Answers.fivetwo.getEffCap() + " | Communiste : " + Answers.fivetwo.getEffCom() + " | Militant : " + Answers.fivetwo.getEffMil() + " | Ecologiste : " + Answers.fivetwo.getEffEco() + ")\n");
                    System.out.print(Answers.fivethree.getText());
                    System.out.println("(Capitaliste : " + Answers.fivethree.getEffCap() + " | Libéraliste : " + Answers.fivethree.getEffLib() + " | Loyaliste : " + Answers.fivethree.getEffLoy() + ")\n");
                    System.out.println("Quel scénario sélectionnez vous ?");

                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                this.religieux.setSatisfaction(this.religieux.getSatisfaction() + Answers.fiveone.getEffRel());
                                this.ecologiste.setSatisfaction(this.ecologiste.getSatisfaction() + Answers.fiveone.getEffEco());
                                this.loyaliste.setSatisfaction(this.loyaliste.getSatisfaction() + Answers.fiveone.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                this.capitaliste.setSatisfaction(this.capitaliste.getSatisfaction() + Answers.fivetwo.getEffCap());
                                this.communiste.setSatisfaction(this.communiste.getSatisfaction() + Answers.fivetwo.getEffCom());
                                this.militariste.setSatisfaction(this.militariste.getSatisfaction() + Answers.fivetwo.getEffMil());
                                this.ecologiste.setSatisfaction(this.ecologiste.getSatisfaction() + Answers.fivetwo.getEffEco());
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                this.capitaliste.setSatisfaction(this.capitaliste.getSatisfaction() + Answers.fivethree.getEffCap());
                                this.liberaux.setSatisfaction(this.liberaux.getSatisfaction() + Answers.fourthree.getEffLib());
                                this.loyaliste.setSatisfaction(this.loyaliste.getSatisfaction() + Answers.fivethree.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }

                        break;
                    }
                } else return false;
                break;
            case 6:
                if(Events.SIX.getAlused() == 0 && (Events.SIX.getconstraint() != seas)) {
                    System.out.println("Voici le scénario qui ce présente à vous :");
                    System.out.println(Events.SIX.getSpecs() + "\n");
                    System.out.print(Answers.sixone.getText());
                    System.out.println("(Capitaliste : " + Answers.sixone.getEffCap() + " | Communiste : " + Answers.sixone.getEffCom() + " | Libéraux : " + Answers.sixone.getEffLib() + " | Religieux : " + Answers.sixone.getEffRel() + " | Militant : " + Answers.sixone.getEffMil() + " | Ecologiste : " + Answers.sixone.getEffEco() + " | Nationaliste : " + Answers.sixone.getEffNat() + " | Loyaliste : " + Answers.sixone.getEffLoy() + ")\n");
                    scanner.nextLine();
                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                updateFromEvent(Answers.sixone);
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }

                        break;
                    }
                }else return false;
                break;
            case 7:
                if(Events.SEVEN.getAlused() == 0 && (Events.SEVEN.getconstraint() != seas)) {
                    System.out.println("Voici le scénario qui ce présente à vous :");
                    System.out.println(Events.SEVEN.getSpecs() + "\n");
                    System.out.print(Answers.sevenone.getText());
                    System.out.println("(Capitaliste : " + Answers.sevenone.getEffCap() + " | Libéraux : " + Answers.sevenone.getEffLib() + " | Nationaliste : " + Answers.sevenone.getEffNat() + " | Loyaliste : " + Answers.sevenone.getEffLoy() + ")\n");
                    System.out.print(Answers.seventwo.getText());
                    System.out.println("(Communiste : " + Answers.seventwo.getEffCom() + " | Libéraliste : " + Answers.seventwo.getEffLib() + " | Religieux : " + Answers.seventwo.getEffRel() + " | Ecologiste : " + Answers.seventwo.getEffEco() + " | Nationaliste : " + Answers.seventwo.getEffNat() + ")\n");
                    System.out.print(Answers.seventhree.getText());
                    System.out.println("(Libéraliste : " + Answers.seventhree.getEffLib() + " | Militant : " + Answers.seventhree.getEffMil() + " | Nationaliste : " + Answers.seventhree.getEffNat() + ")\n");
                    System.out.println("Quel scénario sélectionnez vous ?");

                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                this.capitaliste.setSatisfaction(this.capitaliste.getSatisfaction() + Answers.sevenone.getEffCap());
                                this.liberaux.setSatisfaction(this.liberaux.getSatisfaction() + Answers.sevenone.getEffLib());
                                this.nationaliste.setSatisfaction(this.nationaliste.getSatisfaction() + Answers.sevenone.getEffNat());
                                this.loyaliste.setSatisfaction(this.loyaliste.getSatisfaction() + Answers.sevenone.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");

                                this.communiste.setSatisfaction(this.communiste.getSatisfaction() + Answers.seventwo.getEffCom());
                                this.liberaux.setSatisfaction(this.liberaux.getSatisfaction() + Answers.seventwo.getEffLib());
                                this.religieux.setSatisfaction(this.religieux.getSatisfaction() + Answers.seventwo.getEffRel());
                                this.ecologiste.setSatisfaction(this.ecologiste.getSatisfaction() + Answers.seventwo.getEffEco());
                                this.nationaliste.setSatisfaction(this.nationaliste.getSatisfaction() + Answers.seventwo.getEffNat());
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                this.liberaux.setSatisfaction(this.liberaux.getSatisfaction() + Answers.seventhree.getEffLib());
                                this.militariste.setSatisfaction(this.militariste.getSatisfaction() + Answers.seventhree.getEffMil());
                                this.nationaliste.setSatisfaction(this.nationaliste.getSatisfaction() + Answers.seventwo.getEffNat());
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }

                        break;
                    }
                }else return false;
                break;
            case 8:
                if(Events.EIGHT.getAlused() == 0 && (Events.EIGHT.getconstraint() != seas)) {
                    System.out.println("Voici le scénario qui ce présente à vous :");
                    System.out.println(Events.EIGHT.getSpecs() + "\n");
                    System.out.print(Answers.eightone.getText());
                    System.out.println("(Capitaliste : " + Answers.eightone.getEffCap() + " | Libéraux : " + Answers.eightone.getEffLib() + " | Religieux : " + Answers.eightone.getEffRel() + " | Ecologiste : " + Answers.eightone.getEffEco() + ")\n");
                    System.out.print(Answers.eighttwo.getText());
                    System.out.println("(Religieux : " + Answers.eighttwo.getEffRel() + " | Ecologiste : " + Answers.eighttwo.getEffEco() + ")\n");
                    System.out.print(Answers.eightthree.getText());
                    System.out.println("(Capitaliste : " + Answers.eightthree.getEffCap() + "Communiste : " + Answers.eightthree.getEffCom() + "Religieux : " + Answers.eightthree.getEffRel() + " | Ecologiste : " + Answers.eightthree.getEffEco() + " | Nationaliste : " + Answers.eightthree.getEffNat() + ")\n");
                    System.out.println("Quel scénario sélectionnez vous ?");
                    choicevalueScenario = false;
                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                this.capitaliste.setSatisfaction(this.capitaliste.getSatisfaction() + Answers.eightone.getEffCap());
                                this.liberaux.setSatisfaction(this.liberaux.getSatisfaction() + Answers.eightone.getEffLib());
                                this.religieux.setSatisfaction(this.religieux.getSatisfaction() + Answers.eightone.getEffRel());
                                this.ecologiste.setSatisfaction(this.ecologiste.getSatisfaction() + Answers.eightone.getEffEco());
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                this.religieux.setSatisfaction(this.religieux.getSatisfaction() + Answers.eighttwo.getEffRel());
                                this.ecologiste.setSatisfaction(this.ecologiste.getSatisfaction() + Answers.eighttwo.getEffEco());
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                this.capitaliste.setSatisfaction(this.capitaliste.getSatisfaction() + Answers.eightthree.getEffCap());
                                this.communiste.setSatisfaction(this.communiste.getSatisfaction() + Answers.eightthree.getEffCom());
                                this.religieux.setSatisfaction(this.religieux.getSatisfaction() + Answers.eightthree.getEffRel());
                                this.ecologiste.setSatisfaction(this.ecologiste.getSatisfaction() + Answers.eightthree.getEffEco());
                                this.nationaliste.setSatisfaction(this.nationaliste.getSatisfaction() + Answers.eightthree.getEffNat());
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                        break;
                    }
                }else return false;
                break;
            case 9:
                if(Events.NINE.getAlused() == 0 && (Events.NINE.getconstraint() != seas)) {
                    System.out.println("Voici le scénario qui ce présente à vous :");
                    System.out.println(Events.NINE.getSpecs() + "\n");
                    System.out.print(Answers.nineone.getText());
                    System.out.println("(Capitaliste : " + Answers.nineone.getEffCap() + " | Libéraux : " + Answers.nineone.getEffLib() + " | Religieux : " + Answers.nineone.getEffRel() + " | Ecologiste : " + Answers.nineone.getEffEco() + " | Nationaliste : " + Answers.nineone.getEffNat() + " )\n");
                    System.out.print(Answers.ninetwo.getText());
                    System.out.println("(Capitaliste : " + Answers.ninetwo.getEffCap() + " | Communiste : " + Answers.ninetwo.getEffCom() + " | Libéraux : " + Answers.ninetwo.getEffLib() + " | Religieux : " + Answers.ninetwo.getEffRel() + " | Militariste : " + Answers.ninetwo.getEffMil() + " | Ecologiste : " + Answers.ninetwo.getEffEco() + " | Nationaliste : " + Answers.ninetwo.getEffNat() + " | Loyaliste : " + Answers.ninetwo.getEffLoy() + " )\n");
                    System.out.print(Answers.ninethree.getText());
                    System.out.println("(Libéraux : " + Answers.ninethree.getEffLib() + " | Religieux : " + Answers.ninethree.getEffRel() + " )\n");
                    System.out.println("Quel scénario sélectionnez vous ?");

                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                this.capitaliste.setSatisfaction(this.capitaliste.getSatisfaction() + Answers.nineone.getEffCap());
                                this.liberaux.setSatisfaction(this.liberaux.getSatisfaction() + Answers.nineone.getEffLib());
                                this.religieux.setSatisfaction(this.religieux.getSatisfaction() + Answers.nineone.getEffRel());
                                this.ecologiste.setSatisfaction(this.ecologiste.getSatisfaction() + Answers.nineone.getEffEco());
                                this.nationaliste.setSatisfaction(this.nationaliste.getSatisfaction() + Answers.nineone.getEffNat());
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");

                                updateFromEvent(Answers.ninetwo);

                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                this.liberaux.setSatisfaction(this.liberaux.getSatisfaction() + Answers.ninethree.getEffLib());
                                this.religieux.setSatisfaction(this.religieux.getSatisfaction() + Answers.ninethree.getEffRel());
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                }else return false;
                break;
            case 10:
                if(Events.TEN.getAlused() == 0 && (Events.TEN.getconstraint() != seas)) {
                    System.out.println("Panique \uD83D\uDE31 " + Events.TEN.getSpecs() + "\n");
                    System.out.print(Answers.tenone.getText());
                    System.out.println("(Capitaliste : " + Answers.tenone.getEffCap() + " | Communiste : " + Answers.tenone.getEffCom() + " | Libéraux : " + Answers.tenone.getEffLib() + " | Religieux : " + Answers.tenone.getEffRel() + " | Militariste : " + Answers.tenone.getEffMil() + " | Ecologiste : " + Answers.tenone.getEffEco() + " | Nationaliste : " + Answers.tenone.getEffNat() + " | Loyaliste : " + Answers.tenone.getEffLoy() + " )\n");
                    System.out.print(Answers.tentwo.getText());
                    System.out.println("(Capitaliste : " + Answers.tentwo.getEffCap() + " | Communiste : " + Answers.tentwo.getEffCom() + " | Libéraux : " + Answers.tentwo.getEffLib() + " | Religieux : " + Answers.tentwo.getEffRel() + " | Militariste : " + Answers.tentwo.getEffMil() + " | Ecologiste : " + Answers.tentwo.getEffEco() + " | Nationaliste : " + Answers.tentwo.getEffNat() + " | Loyaliste : " + Answers.tentwo.getEffLoy() + " )\n");
                    System.out.print(Answers.tenthree.getText());
                    System.out.println("(Capitaliste : " + Answers.tenthree.getEffCap() + " | Communiste : " + Answers.tenthree.getEffCom() + " | Libéraux : " + Answers.tenthree.getEffLib() + " | Religieux : " + Answers.tenthree.getEffRel() + " | Militariste : " + Answers.tenthree.getEffMil() + " | Ecologiste : " + Answers.tenthree.getEffEco() + " | Nationaliste : " + Answers.tenthree.getEffNat() + " | Loyaliste : " + Answers.tenthree.getEffLoy() + " )\n");
                    System.out.println("Quel scénario sélectionnez vous ?");

                    choicevalueScenario = false;

                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                updateFromEvent(Answers.tenone);
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                updateFromEvent(Answers.tentwo);
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                updateFromEvent(Answers.tenthree);
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                }else return false;
                break;
            case 11:
                if(Events.ELEVEN.getAlused() == 0 && (Events.ELEVEN.getconstraint() != seas)) {
                    System.out.println("Voici le scénario qui ce présente à vous :");
                    System.out.println(Events.ELEVEN.getSpecs() + "\n");
                    System.out.print(Answers.elevenone.getText());
                    System.out.println("(Capitaliste : " + Answers.elevenone.getEffCap() + " | Ecologiste : " + Answers.elevenone.getEffEco() + " | Nationaliste : " + Answers.elevenone.getEffNat() + " )\n");
                    System.out.print(Answers.eleventwo.getText());
                    System.out.println("(Capitaliste : " + Answers.eleventwo.getEffCap() + " | Communiste : " + Answers.eleventwo.getEffCom() + " | Libéraux : " + Answers.eleventwo.getEffLib() + " | Religieux : " + Answers.eleventwo.getEffRel() + " | Militariste : " + Answers.eleventwo.getEffMil() + " | Ecologiste : " + Answers.eleventwo.getEffEco() + " | Nationaliste : " + Answers.eleventwo.getEffNat() + " | Loyaliste : " + Answers.eleventwo.getEffLoy() + " )\n");
                    System.out.print(Answers.eleventhree.getText());
                    System.out.println("(Communiste : " + Answers.eleventhree.getEffCom() + " | Ecologiste : " + Answers.eleventhree.getEffEco() + " | Nationaliste : " + Answers.eleventhree.getEffNat() + " | Loyaliste : " + Answers.eleventhree.getEffLoy() + " )\n");
                    System.out.println("Quel scénario sélectionnez vous ?");
                    choicevalueScenario = false;
                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                this.capitaliste.setSatisfaction(this.capitaliste.getSatisfaction() + Answers.elevenone.getEffCap());
                                this.ecologiste.setSatisfaction(this.ecologiste.getSatisfaction() + Answers.elevenone.getEffEco());
                                this.nationaliste.setSatisfaction(this.nationaliste.getSatisfaction() + Answers.elevenone.getEffNat());
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");

                                updateFromEvent(Answers.eleventwo);

                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                this.communiste.setSatisfaction(this.communiste.getSatisfaction() + Answers.eleventhree.getEffCom());
                                this.ecologiste.setSatisfaction(this.ecologiste.getSatisfaction() + Answers.eleventhree.getEffEco());
                                this.nationaliste.setSatisfaction(this.nationaliste.getSatisfaction() + Answers.eleventhree.getEffNat());
                                this.loyaliste.setSatisfaction(this.loyaliste.getSatisfaction() + Answers.eleventhree.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                }else return false;
                break;
            case 12:
                if(Events.TWELVE.getAlused() == 0 && (Events.TWELVE.getconstraint() != seas)) {
                    System.out.println("Malheur ! " + Events.TWELVE.getSpecs() + "\n");
                    System.out.print(Answers.twelveone.getText());
                    System.out.println("(Capitaliste : " + Answers.twelveone.getEffCap() + " | Communiste : " + Answers.twelveone.getEffCom() + " | Libéraux : " + Answers.twelveone.getEffLib() + " | Religieux : " + Answers.twelveone.getEffRel() + " | Militariste : " + Answers.twelveone.getEffMil() + " | Ecologiste : " + Answers.twelveone.getEffEco() + " | Nationaliste : " + Answers.twelveone.getEffNat() + " | Loyaliste : " + Answers.twelveone.getEffLoy() + " )\n");
                    System.out.print(Answers.twelvetwo.getText());
                    System.out.println("(Capitaliste : " + Answers.twelvetwo.getEffCap() + " | Communiste : " + Answers.twelvetwo.getEffCom() + " | Libéraux : " + Answers.twelvetwo.getEffLib() + " | Religieux : " + Answers.twelvetwo.getEffRel() + " | Militariste : " + Answers.twelvetwo.getEffMil() + " | Ecologiste : " + Answers.twelvetwo.getEffEco() + " | Nationaliste : " + Answers.twelvetwo.getEffNat() + " | Loyaliste : " + Answers.twelvetwo.getEffLoy() + " )\n");
                    System.out.print(Answers.twelvethree.getText());
                    System.out.println("(Communiste : " + Answers.twelvetwo.getEffCom() + " | Libéraux : " + Answers.twelvetwo.getEffLib() + " | Nationaliste : " + Answers.twelvetwo.getEffNat() + " )\n");
                    System.out.println("Quel scénario sélectionnez vous ?");
                    choicevalueScenario = false;
                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                updateFromEvent(Answers.twelveone);
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                updateFromEvent(Answers.twelvetwo);
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                this.communiste.setSatisfaction(this.communiste.getSatisfaction() + Answers.twelvethree.getEffCom());
                                this.liberaux.setSatisfaction(this.liberaux.getSatisfaction() + Answers.twelvethree.getEffLib());
                                this.militariste.setSatisfaction(this.militariste.getSatisfaction() + Answers.twelvethree.getEffMil());
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                }else return false;
                break;
            case 13:
                if(Events.THIRTEEN.getAlused() == 0 && (Events.THIRTEEN.getconstraint() != seas)) {
                    System.out.println("Voici le scénario qui ce présente à vous :");
                    System.out.println(Events.THIRTEEN.getSpecs() + "\n");
                    System.out.print(Answers.thirdteenone.getText());
                    System.out.println("(Capitaliste : " + Answers.thirdteenone.getEffCap() + " | Religieux : " + Answers.thirdteenone.getEffRel() + " | Ecologiste : " + Answers.thirdteenone.getEffEco() + " )\n");
                    System.out.print(Answers.thirdteentwo.getText());
                    System.out.println("(Capitaliste : " + Answers.thirdteentwo.getEffCap() + " | Communiste : " + Answers.thirdteentwo.getEffCom() + " | Nationaliste : " + Answers.thirdteentwo.getEffNat() + " )\n");
                    System.out.print(Answers.thirdteenthree.getText());
                    System.out.println("(Capitaliste : " + Answers.thirdteenthree.getEffCap() + " | Militariste : " + Answers.thirdteenthree.getEffMil() + " | Loyaliste : " + Answers.thirdteenthree.getEffLoy() + " )\n");
                    System.out.println("Quel scénario sélectionnez vous ?");
                    choicevalueScenario = false;
                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                this.capitaliste.setSatisfaction(this.capitaliste.getSatisfaction() + Answers.thirdteenone.getEffCap());
                                this.religieux.setSatisfaction(this.religieux.getSatisfaction() + Answers.thirdteenone.getEffRel());
                                this.ecologiste.setSatisfaction(this.ecologiste.getSatisfaction() + Answers.thirdteenone.getEffEco());
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                this.capitaliste.setSatisfaction(this.capitaliste.getSatisfaction() + Answers.thirdteentwo.getEffCap());
                                this.communiste.setSatisfaction(this.communiste.getSatisfaction() + Answers.thirdteentwo.getEffCom());
                                this.nationaliste.setSatisfaction(this.nationaliste.getSatisfaction() + Answers.thirdteentwo.getEffNat());
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                this.capitaliste.setSatisfaction(this.capitaliste.getSatisfaction() + Answers.thirdteenthree.getEffCap());
                                this.militariste.setSatisfaction(this.militariste.getSatisfaction() + Answers.thirdteenthree.getEffMil());
                                this.loyaliste.setSatisfaction(this.loyaliste.getSatisfaction() + Answers.thirdteenthree.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                }else return false;
                break;
            case 14:
                if(Events.FOURTEEN.getAlused() == 0 && (Events.FOURTEEN.getconstraint() != seas)) {
                    System.out.println("Voici le scénario qui ce présente à vous :");
                    System.out.println(Events.FOURTEEN.getSpecs() + "\n");
                    System.out.print(Answers.fourteenone.getText());
                    System.out.println("(Communiste : " + Answers.fourteenone.getEffCom() + " | Libéraux : " + Answers.fourteenone.getEffLib() + " | Nationaliste : " + Answers.fourteenone.getEffNat() + " | Loyaliste : " + Answers.fourteenone.getEffLoy() + " )\n");
                    System.out.print(Answers.fourteentwo.getText());
                    System.out.println("(Communiste : " + Answers.fourteentwo.getEffCom() + " | Libéraux : " + Answers.fourteentwo.getEffLib() + " | Nationaliste : " + Answers.fourteentwo.getEffNat() + " )\n");
                    System.out.print(Answers.fourteenthree.getText());
                    System.out.println("(Religieux : " + Answers.fourteenthree.getEffRel() + " | Ecologiste : " + Answers.fourteenthree.getEffEco() + " | Nationaliste : " + Answers.fourteenthree.getEffNat() + " | Loyaliste : " + Answers.fourteenthree.getEffLoy() + " )\n");
                    System.out.println("Quel scénario sélectionnez vous ?");
                    choicevalueScenario = false;
                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                this.communiste.setSatisfaction(this.communiste.getSatisfaction() + Answers.fourteenone.getEffCom());
                                this.liberaux.setSatisfaction(this.liberaux.getSatisfaction() + Answers.fourteenone.getEffLib());
                                this.nationaliste.setSatisfaction(this.nationaliste.getSatisfaction() + Answers.fourteenone.getEffNat());
                                this.loyaliste.setSatisfaction(this.loyaliste.getSatisfaction() + Answers.fourteenone.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                this.communiste.setSatisfaction(this.communiste.getSatisfaction() + Answers.fourteentwo.getEffCom());
                                this.liberaux.setSatisfaction(this.liberaux.getSatisfaction() + Answers.fourteentwo.getEffLib());
                                this.nationaliste.setSatisfaction(this.nationaliste.getSatisfaction() + Answers.fourteentwo.getEffNat());
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                this.religieux.setSatisfaction(this.religieux.getSatisfaction() + Answers.fourteenthree.getEffRel());
                                this.ecologiste.setSatisfaction(this.ecologiste.getSatisfaction() + Answers.fourteenthree.getEffEco());
                                this.nationaliste.setSatisfaction(this.nationaliste.getSatisfaction() + Answers.fourteenthree.getEffNat());
                                this.loyaliste.setSatisfaction(this.loyaliste.getSatisfaction() + Answers.fourteenthree.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                }else return false;
                break;
            case 15:
                if(Events.FIFTEEN.getAlused() == 0 && (Events.FIFTEEN.getconstraint() != seas)) {
                    System.out.println("Coup de thêatre ! " + Events.FIFTEEN.getSpecs() + "\n");
                    System.out.print(Answers.fifteenone.getText());
                    System.out.println("(Capitaliste : " + Answers.fifteenone.getEffCap() + " | Communiste : " + Answers.fifteenone.getEffCom() + " | Libéraux : " + Answers.fifteenone.getEffLib() + " | Religieux : " + Answers.fifteenone.getEffRel() + " | Militariste : " + Answers.fifteenone.getEffMil() + " | Ecologiste : " + Answers.fifteenone.getEffEco() + " | Nationaliste : " + Answers.fifteenone.getEffNat() + " | Loyaliste : " + Answers.fifteenone.getEffLoy() + " )\n");
                    System.out.print(Answers.fifteentwo.getText());
                    System.out.println("(Capitaliste : " + Answers.fifteentwo.getEffCap() + " | Communiste : " + Answers.fifteentwo.getEffCom() + " | Libéraux : " + Answers.fifteentwo.getEffLib() + " | Religieux : " + Answers.fifteentwo.getEffRel() + " | Militariste : " + Answers.fifteentwo.getEffMil() + " | Ecologiste : " + Answers.fifteentwo.getEffEco() + " | Nationaliste : " + Answers.fifteentwo.getEffNat() + " | Loyaliste : " + Answers.fifteentwo.getEffLoy() + " )\n");
                    System.out.println("Quel scénario sélectionnez vous ?");
                    choicevalueScenario = false;
                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                updateFromEvent(Answers.fifteenone);
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                updateFromEvent(Answers.fifteentwo);
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                }else return false;
                break;
            case 16:
                if(Events.SIXTEEN.getAlused() == 0 && (Events.SIXTEEN.getconstraint() != seas)) {
                    System.out.println("Voici le scénario qui ce présente à vous :");
                    System.out.println(Events.SIXTEEN.getSpecs() + "\n");
                    System.out.print(Answers.sixteenone.getText());
                    System.out.println("(Capitaliste : " + Answers.sixteenone.getEffCap() + " | Religieux : " + Answers.sixteenone.getEffRel() + " | Ecologiste : " + Answers.sixteenone.getEffEco() + " | Nationaliste : " + Answers.sixteenone.getEffNat() + " | Loyaliste : " + Answers.sixteenone.getEffLoy() + " )\n");
                    System.out.print(Answers.sixteentwo.getText());
                    System.out.println("(Capitaliste : " + Answers.sixteentwo.getEffCap() + " | Libéraux : " + Answers.sixteentwo.getEffLib() + " | Loyaliste : " + Answers.sixteentwo.getEffLoy() + " )\n");
                    System.out.print(Answers.sixteenthree.getText());
                    System.out.println("(Capitaliste : " + Answers.sixteenthree.getEffCap() + " | Communiste : " + Answers.sixteenthree.getEffCom() + " | Libéraux : " + Answers.sixteenthree.getEffLib() + " | Religieux : " + Answers.sixteenthree.getEffRel() + " | Militariste : " + Answers.sixteenthree.getEffMil() + " | Ecologiste : " + Answers.sixteenthree.getEffEco() + " | Nationaliste : " + Answers.sixteenthree.getEffNat() + " | Loyaliste : " + Answers.sixteenthree.getEffLoy() + " )\n");
                    System.out.println("Quel scénario sélectionnez vous ?");
                    choicevalueScenario = false;
                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                this.capitaliste.setSatisfaction(this.capitaliste.getSatisfaction() + Answers.sixteenone.getEffCap());
                                this.religieux.setSatisfaction(this.religieux.getSatisfaction() + Answers.sixteenone.getEffRel());
                                this.ecologiste.setSatisfaction(this.ecologiste.getSatisfaction() + Answers.sixteenone.getEffEco());
                                this.nationaliste.setSatisfaction(this.nationaliste.getSatisfaction() + Answers.sixteenone.getEffNat());
                                this.loyaliste.setSatisfaction(this.loyaliste.getSatisfaction() + Answers.sixteenone.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                this.capitaliste.setSatisfaction(this.capitaliste.getSatisfaction() + Answers.sixteentwo.getEffCap());
                                this.liberaux.setSatisfaction(this.liberaux.getSatisfaction() + Answers.sixteentwo.getEffLib());
                                this.loyaliste.setSatisfaction(this.loyaliste.getSatisfaction() + Answers.sixteentwo.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                updateFromEvent(Answers.sixteenthree);
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                }else return false;
                break;
            case 17:
                if(Events.SEVENTEEN.getAlused() == 0 && (Events.SEVENTEEN.getconstraint() != seas)) {
                    System.out.println("Vous apprenez qu'"+Events.SEVENTEEN.getSpecs() + "\n");
                    System.out.print(Answers.seventeenone.getText());
                    System.out.println("(Capitaliste : " + Answers.seventeenone.getEffCap() + " | Communiste : " + Answers.seventeenone.getEffCom() + " | Libéraux : " + Answers.seventeenone.getEffLib() + " | Religieux : " +Answers.seventeenone.getEffRel() + " | Militariste : " + Answers.seventeenone.getEffMil() + " | Ecologiste : " + Answers.seventeenone.getEffEco() + " | Nationaliste : " + Answers.seventeenone.getEffNat() + " | Loyaliste : " + Answers.seventeenone.getEffLoy() + " )\n");
                    System.out.print(Answers.seventeentwo.getText());
                    System.out.println("(Capitaliste : " + Answers.seventeentwo.getEffCap() + " | Communiste : " + Answers.seventeentwo.getEffCom() + " | Libéraux : " + Answers.seventeentwo.getEffLib() + " | Religieux : " + Answers.seventeentwo.getEffRel() + " | Militariste : " + Answers.seventeentwo.getEffMil() + " | Ecologiste : " + Answers.seventeentwo.getEffEco() + " | Nationaliste : " + Answers.seventeentwo.getEffNat() + " | Loyaliste : " + Answers.seventeentwo.getEffLoy() + " )\n");
                    System.out.print(Answers.seventeenthree.getText());
                    System.out.println("(Capitaliste : " + Answers.seventeenthree.getEffCap() + " | Communiste : " + Answers.seventeenthree.getEffCom() + " | Libéraux : " + Answers.seventeenthree.getEffLib() + " | Religieux : " + Answers.seventeenthree.getEffRel() + " | Militariste : " + Answers.seventeenthree.getEffMil() + " | Ecologiste : " + Answers.seventeenthree.getEffEco() + " | Nationaliste : " + Answers.seventeenthree.getEffNat() + " | Loyaliste : " + Answers.seventeenthree.getEffLoy() + " )\n");
                    System.out.println("Quel scénario sélectionnez vous ?");
                    choicevalueScenario = false;
                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                updateFromEvent(Answers.thirdteenone);
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                updateFromEvent(Answers.seventeentwo);
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                updateFromEvent(Answers.seventeenthree);
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                }else return false;
                break;
            case 18:
                if(Events.EIGHTEEN.getAlused() == 0 && (Events.EIGHTEEN.getconstraint() != seas)) {
                    System.out.println("Voici le scénario qui ce présente à vous :");
                    System.out.println(Events.EIGHTEEN.getSpecs() + "\n");
                    System.out.print(Answers.eighteenone.getText());
                    System.out.println("(Ecologiste : " + Answers.eighteenone.getEffEco() + " | Loyaliste : " + Answers.eighteenone.getEffLoy() + ")\n");
                    System.out.print(Answers.eighteentwo.getText());
                    System.out.println("(Capitaliste : " + Answers.eighteentwo.getEffCap() + " | Communiste : " + Answers.eighteentwo.getEffCom() + " | Libéraux : " + Answers.eighteentwo.getEffLib() + " | Militariste : " + Answers.eighteentwo.getEffMil() + " | Loyaliste : " + Answers.eighteentwo.getEffLoy() + " )\n");
                    System.out.print(Answers.eighteenthree.getText());
                    System.out.println("(Capitaliste : " + Answers.eighteenthree.getEffCap() + " | Communiste : " + Answers.eighteenthree.getEffCom() + " | Libéraux : " + Answers.eighteenthree.getEffLib() + " | Religieux : " + Answers.eighteenthree.getEffRel() + " | Militariste : " + Answers.eighteenthree.getEffMil() + " | Ecologiste : " + Answers.eighteenthree.getEffEco() + " | Nationaliste : " + Answers.eighteenthree.getEffNat() + " | Loyaliste : " + Answers.eighteenthree.getEffLoy() + " )\n");
                    System.out.println("Quel scénario sélectionnez vous ?");
                    choicevalueScenario = false;
                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                this.ecologiste.setSatisfaction(this.ecologiste.getSatisfaction() + Answers.eighteenone.getEffEco());
                                this.loyaliste.setSatisfaction(this.loyaliste.getSatisfaction() + Answers.eighteenone.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                this.capitaliste.setSatisfaction(this.capitaliste.getSatisfaction() + Answers.eighteentwo.getEffCap());
                                this.communiste.setSatisfaction(this.communiste.getSatisfaction() + Answers.eighteentwo.getEffCom());
                                this.liberaux.setSatisfaction(this.liberaux.getSatisfaction() + Answers.eighteentwo.getEffLib());
                                this.militariste.setSatisfaction(this.militariste.getSatisfaction() + Answers.eighteentwo.getEffMil());
                                this.loyaliste.setSatisfaction(this.loyaliste.getSatisfaction() + Answers.eighteentwo.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                updateFromEvent(Answers.eighteenthree);
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                }else return false;
                break;
            case 19:
                if(Events.NINETEEN.getAlused() == 0 && (Events.NINETEEN.getconstraint() != seas)) {
                    System.out.println("Voici le scénario qui ce présente à vous :");
                    System.out.println(Events.NINETEEN.getSpecs() + "\n");
                    System.out.print(Answers.nineteenone.getText());
                    System.out.println("(Capitaliste : " + Answers.nineteenone.getEffCap() + " | Communiste : " + Answers.nineteenone.getEffCom() + " | Libéraux : " + Answers.nineteenone.getEffLib() + " | Religieux : " + Answers.nineteenone.getEffLoy() + " | Trésorerie : " + Answers.nineteenone.getEffBank() + ")\n");
                    System.out.print(Answers.nineteentwo.getText());
                    System.out.println("(Capitaliste : " + Answers.nineteentwo.getEffCap() + " | Communiste : " + Answers.nineteentwo.getEffCom() + " | Libéraux : " + Answers.nineteentwo.getEffLib() + " | Religieux : " + Answers.nineteentwo.getEffRel() + " | Militariste : " + Answers.nineteentwo.getEffMil() + " | Ecologiste : " + Answers.nineteentwo.getEffEco() + " | Nationaliste : " + Answers.nineteentwo.getEffNat() + " | Loyaliste : " + Answers.nineteentwo.getEffLoy() + " )\n");
                    System.out.print(Answers.nineteenthree.getText());
                    System.out.println("(Capitaliste : " + Answers.nineteenthree.getEffCap() + " | Communiste : " + Answers.nineteenthree.getEffCom() + " | Libéraux : " + Answers.nineteenthree.getEffLib() + " | Religieux : " + Answers.nineteenthree.getEffRel() + " | Militariste : " + Answers.nineteenthree.getEffMil() + " | Ecologiste : " + Answers.nineteenthree.getEffEco() + " | Nationaliste : " + Answers.nineteenthree.getEffNat() + " | Loyaliste : " + Answers.nineteenthree.getEffLoy() + " )\n");
                    System.out.println("Quel scénario sélectionnez vous ?");
                    choicevalueScenario = false;
                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                this.capitaliste.setSatisfaction(this.capitaliste.getSatisfaction() + Answers.nineteenone.getEffCap());
                                this.communiste.setSatisfaction(this.communiste.getSatisfaction() + Answers.nineteenone.getEffCom());
                                this.liberaux.setSatisfaction(this.liberaux.getSatisfaction() + Answers.nineteenone.getEffLib());
                                this.religieux.setSatisfaction(this.religieux.getSatisfaction() + Answers.nineteenone.getEffRel());
                                Tresor.setValue(Tresor.getValue() + Answers.nineteenone.getEffBank());
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                updateFromEvent(Answers.nineteentwo);
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                updateFromEvent(Answers.nineteenthree);
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                }else return false;
                break;
            case 20:
                if(Events.TWENTY.getAlused() == 0 && (Events.TWENTY.getconstraint() != seas)) {
                    System.out.println("Incroyable \uD83E\uDD73\uD83E\uDD73 !" + Events.TWENTY.getSpecs() + "\n");
                    System.out.print(Answers.twentyone.getText());
                    System.out.println("(Capitaliste : " + Answers.twentyone.getEffCap() + " | Libéraux : " + Answers.twentyone.getEffLib() + " | Ecologiste : " + Answers.twentyone.getEffEco() + " | Loyaliste : " + Answers.twentyone.getEffLoy() + ")\n");
                    System.out.print(Answers.twentytwo.getText());
                    System.out.println("(Capitaliste : " + Answers.twentytwo.getEffCap() + " | Communiste : " + Answers.twentytwo.getEffCom() + " | Militarite : " + Answers.twentytwo.getEffMil() + " | Loyaliste : " + Answers.twentytwo.getEffLoy() + ")\n");
                    System.out.print(Answers.twentythree.getText());
                    System.out.println("(Capitaliste : " + Answers.twentythree.getEffCap() + " | Religieux : " + Answers.twentythree.getEffRel() + " | Ecologiste : " + Answers.twentythree.getEffEco() + ")\n");
                    System.out.println("Quel scénario sélectionnez vous ?");
                    choicevalueScenario = false;
                    while (!choicevalueScenario) {
                        valueScenario = scanner.nextInt();
                        switch (valueScenario) {
                            case 1:
                                System.out.println("Choix scénario 1 : Validé.");
                                this.capitaliste.setSatisfaction(this.capitaliste.getSatisfaction() + Answers.twentyone.getEffCap());
                                this.liberaux.setSatisfaction(this.liberaux.getSatisfaction() + Answers.twentyone.getEffLib());
                                this.ecologiste.setSatisfaction(this.ecologiste.getSatisfaction() + Answers.twentyone.getEffEco());
                                this.loyaliste.setSatisfaction(this.loyaliste.getSatisfaction() + Answers.twentyone.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            case 2:
                                System.out.println("Choix scénario 2 : Validé.");
                                this.capitaliste.setSatisfaction(this.capitaliste.getSatisfaction() + Answers.twentytwo.getEffCap());
                                this.communiste.setSatisfaction(this.communiste.getSatisfaction() + Answers.twentytwo.getEffCom());
                                this.militariste.setSatisfaction(this.militariste.getSatisfaction() + Answers.twentytwo.getEffMil());
                                this.loyaliste.setSatisfaction(this.loyaliste.getSatisfaction() + Answers.twentytwo.getEffLoy());
                                choicevalueScenario = true;
                                break;
                            case 3:
                                System.out.println("Choix scénario 3 : Validé.");
                                this.capitaliste.setSatisfaction(this.capitaliste.getSatisfaction() + Answers.twentythree.getEffCap());
                                this.religieux.setSatisfaction(this.religieux.getSatisfaction() + Answers.twentythree.getEffRel());
                                this.ecologiste.setSatisfaction(this.ecologiste.getSatisfaction() + Answers.twentythree.getEffEco());
                                choicevalueScenario = true;
                                break;
                            default:
                                System.out.println("Choissiez parmis les scénarios disponible.");
                                choicevalueScenario = false;
                        }
                    }
                }else return false;
                break;
            default:
                System.out.println("Choissiez parmis les scénarios disponible.");
                choicevalueScenario = false;
        }
        return true;
    }
}
