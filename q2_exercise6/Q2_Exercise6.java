/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2_exercise6;

/**
 *
 * @author MUON
 */
public class Q2_Exercise6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleMonster fire = new SimpleMonster("Brazodork", "Fire", "Grass", "Water", 20, 4);
        FireType brazy = fire;
        
        SimpleMonster water = new SimpleMonster("Drizzapear", "Water", "Fire", "Grass", 25, 4);
        WaterType driz = water;
        
        SimpleMonster grass = new SimpleMonster("Lilacrie", "Grass", "Water", "Fire", 20, 5);
        GrassType lilac = grass;
        
        lilac.fight(lilac, brazy);
        
        brazy.fight(brazy, driz);
        
        driz.battle(driz, lilac);
    }
    
}
