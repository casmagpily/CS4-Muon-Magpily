/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1_exercise1;

import java.util.Scanner;

/**
 *
 * @author MUON
 */
public class Q1_Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String pokenm1 = "Charmander";
        String pokenm2 = "Cyndaquil";
        String pokenm3 = "Chimchar";
        String pokerg1 = "Kanto";
        String pokerg2 = "Johto";
        String pokerg3 = "Sinnoh";
        int pokelvl1 = 4;
        int pokelvl2 = 5;
        int pokelvl3 = 11;
        int lvlTotal = pokelvl1 + pokelvl2 + pokelvl3;
        boolean rgsame;
        rgsame = pokerg2.equals(pokerg3) && pokerg2.equals(pokerg1);
        boolean fight = pokelvl1 > pokelvl3;
        System.out.printf("PokeName: %s%n Region: %s%n Level: %d%n%n",
                pokenm1,pokerg1,pokelvl1);
        System.out.printf("PokeName: %s%n Region: %s%n Level: %d%n%n",
                pokenm2,pokerg2,pokelvl2);
        System.out.printf("PokeName: %s%n Region: %s%n Level: %d%n%n",
                pokenm3,pokerg3,pokelvl3);
        System.out.printf("What is the total level of the 3 Pokemon?: %d%n", lvlTotal);
        System.out.println("Are all 3 Pokemon from the same reqion?: " + rgsame);
        System.out.println("Does Charmander win against Chimchar?: " + fight);
    }
    
}
