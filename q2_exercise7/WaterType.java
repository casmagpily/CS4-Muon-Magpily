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
public class WaterType extends SimpleMonster{
    private int truedef;
    public WaterType(String name, String type, int hp, int base){
        super(name, "Water", "Fire", "Grass", hp, base);
        atk *= 0.7;
        def *= 1.3;
        truedef = def;
    }
    @Override
    public void special(){
        if(hp > maxHP *0.10 || def < truedef + 10){
            def += 2;
            hp = (int)(maxHP * 0.9);
            System.out.println(name + " did a pose and it increased its Defense!.");
        }
        else {
            System.out.println(name + " failed to do a pose because his his HP is too low.");
        }
    }
    @Override
    public void rest(){
        hp = maxHP;
        System.out.println(name + " healed up to full HP!");
    }

}