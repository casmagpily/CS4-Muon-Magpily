/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1_exercise3;

/**
 *
 * @author MUON
 */
public class Q1_Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Song pop = new Song("..?");
        Song classical = new Song("..!");
        Song game = new Song("...");
        pop.introduce();  
        classical.introduce();
        System.out.println("");
    }
    
}
