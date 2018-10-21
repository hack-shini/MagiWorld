package com.comenda.magiWorld;

import java.util.Scanner;

public class Player extends Skills {

    Scanner clavier = new Scanner(System.in);

    protected int choiceCharacter(){

        System.out.println("Création du joueur 1");
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
}
