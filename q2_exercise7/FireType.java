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
public class FireType extends SimpleMonster{
    public FireType(String name, String type, int hp, int base){
        super(name, "Fire", "Grass", "Water", hp, base);
        atk *= 1.3;
        def *= 0.7;
    }
    @Override
    public void special(){
        if(hp > maxHP * 0.10){
            atk += 2;
            hp = (int)(maxHP * 0.9);
            System.out.println(name + " did a pose and it increased its Attack!.");
        }
        else{
            System.out.println(name + " failed to do a pose because his his HP is too low.");
        }
    }
    @Override
    public void rest(){
        hp = maxHP;
        System.out.println(name + " healed up to full HP!");
    }

}