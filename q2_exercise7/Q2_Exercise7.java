/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2_exercise7;

/**
 *
 * @author MUON
 */
public class Q2_Exercise7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleMonster brazy = new FireType("Brazodork", "Fire", 20, 4);
        Location little = new Location("LittleRoot Town", "Ginseng");
        Trainer aki = new Trainer("Akixx", little, brazy);
        NPC sorrah = new NPC("Sorrah", little);
        aki.inspect(sorrah);
        aki.inspect(little);
        aki.inspect(brazy);
    }
    
}
