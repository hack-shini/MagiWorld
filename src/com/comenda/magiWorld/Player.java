package com.comenda.magiWorld;

import java.util.Scanner;

public class Player extends Skills {
    private int numberPlayer_One_Or_Two;
    private String numberOfPlayer;
    private int choice;

    Scanner clavier = new Scanner(System.in);


    // ------ CONSTRUCTOR ----------

    public Player(String numberOfPlayer, int numberPlayer_One_Or_Two) {
        this.numberOfPlayer = numberOfPlayer;
        this.numberPlayer_One_Or_Two = numberPlayer_One_Or_Two;
    }



    // ---------------- GETTERS AND SETTERS ----------


    public int getChoice() {
        System.out.println("Veuillez choisir la classe de votre Héros : 1 - Guerrier, 2 - Rôdeur, 3 - Magicien");
        int choice = clavier.nextInt();

        switch (choice){
            case 1:
                Warrior warrior = new Warrior();
                break;
            case 2:
                Prowler prowler = new Prowler();
                break;
            case 3:
                Wizard wizzard = new Wizard();
                break;
        }

        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }




    public String getNumberOfPlayer() {
        return numberOfPlayer;
    }


    // -------------- ALL OTHERS METHODS -----------


    /**
     * Choice skills of your Heros
     */

    public void caracteristiques(){

        System.out.println("Veuillez choisir le niveau de votre personnage :");
        choice = clavier.nextInt();
        setLevel(choice);

        System.out.println("Veuillez choisir la force de votre personnage :");
        choice = clavier.nextInt();
        setStrength(choice);

        System.out.println("Veuillez choisir l'agilité de votre personnage :");
        choice = clavier.nextInt();
        setAgility(choice);

        System.out.println("Veuillez choisir l'intelligence de votre personnage :");
        choice = clavier.nextInt();
        setIntelligence(choice);
    }

    @Override
    public String toString() {
        return "Joueur " + numberPlayer_One_Or_Two +
                ", mon niveau est de " + getLevel() +
                ", je possède " + getLife() + " de vitalité " +
                ", ma force est de "+ getStrength()+
                ", mon agilité est de "+ getAgility()+
                ", mon intelligence est de "+ getIntelligence()+" !"+
                '}';
    }
}
