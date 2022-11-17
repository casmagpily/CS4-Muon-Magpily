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
public class GrassType extends SimpleMonster{
    int baseMaxHP;
    public GrassType(String name, String type, int hp, int base){
        super(name, "Fire", "Grass", "Water", hp, base);
        baseMaxHP = maxHP;
    }
    @Override
    public void special(){
        if(maxHP >= baseMaxHP * 3){
            System.out.println(name + "failed to do a pose! his stats are already maxed out!");
        }
        else{
            maxHP = (int)(baseMaxHP * 1.2);
            System.out.println(name + "did a pose and increased its maxHP to " + maxHP);
        }
    }
    @Override
    public void rest(){
        hp = (int)(maxHP * 0.5);
    }

}