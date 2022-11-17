package q2_exercise6;

import java.util.ArrayList;

public class SimpleMonster {
    //changed from private to protected
    protected final String name, type, strongAgainst, weakAgainst;
    protected int maxHP, hp, atk, def, xp, lvl;
    // all "Monster" changed to "SimpleMonster" starting here
    private static ArrayList<SimpleMonster> monsterList = new ArrayList<>();

    public SimpleMonster(String n, String t, String s, String w, int m, int base){
        name = n;
        type = t;
        strongAgainst = s;
        weakAgainst = w;
        maxHP = m;
        hp = m;
        atk = base;
        def = base;
        monsterList.add(this);
    }

    public String getName() {
        return name;
    }
    public int getMaxHP() {
        return maxHP;
    }
    public int getHP() {
        return hp;
    }
    public int getAtk() {
        return atk;
    }
    public int getDef() {
        return def;
    }
    public static ArrayList<SimpleMonster> getMonsterList() {
        return monsterList;
    }

    public void attack(SimpleMonster m){
        int damage = (int) ((atk*atk)/(double)(atk+m.getDef()));    // damage is calculated as  double, then cast as int
        boolean strong = false, weak = false;
        if(strongAgainst.equals(m.type)){
            damage *= 2;
            strong = true;
        }
        if(weakAgainst.equals(m.type)){
            damage *= 0.5;
            weak = true;
        }
        m.hp -= damage;
        if(m.hp < 0) m.hp = 0;
            System.out.println(name  + " attacked " + m.getName() +
            " and dealt " + damage + " damage, reducing it to " + m.getHP() + "HP.");
        if(strong) System.out.println("It was super effective!");
        if(weak) System.out.println("It's not very effective...");

        if(m.hp <= 0){
            m.hp = 0;
            System.out.println(m.getName() + " fainted.");
        }
    }

    public void special(){
        System.out.println(name + " did a pose.");
    }

    public void rest(){
        hp = maxHP;
    }
    public void move(SimpleMonster n, SimpleMonster y){
        int choice = (int)Math.floor(Math.random() * 3) + 1;
        switch (choice){
            case 1:
                n.attack(y);
            case 2:
                n.rest();
            case 3:
                n.special();
        }
    }
    public static void fight(SimpleMonster m, SimpleMonster x){
        System.out.println(m.name + " VS. " + x.name + "\n");
        while(x.hp > 0 || m.hp > 0){
            m.move(m, y);
            y.move(y, m);
            if(m.hp == 0 || x.hp == 0){
                break;
            }
        }
        
    }
}
