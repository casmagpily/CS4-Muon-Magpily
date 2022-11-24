package q2_exercise7;

import java.util.ArrayList;

public abstract class SimpleMonster implements Interactive{
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
        if (damage == 0){
            damage = 1;
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

    public abstract void special();

    public void rest(){
        hp = maxHP;
    }
    public void move(SimpleMonster n, SimpleMonster y){
        int choice = (int)Math.floor(Math.random() * 9) + 1;
        switch (choice){
            case 1:
            case 2:
                n.attack(y);
                break;
            case 3:
                n.rest();
                break;
            case 4:
                n.attack(y);
                break;
            case 5:
                n.special();
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                n.attack(y);
                break;
        }
    }
    public void fight(SimpleMonster m, SimpleMonster x){
        System.out.println(m.name + " VS. " + x.name + "\n");
        x.hp = maxHP; m.hp = maxHP;
        while(x.hp > 0 || m.hp > 0){
            m.move(m, x);
            if(m.hp == 0 || x.hp == 0){
                break;
            }
            x.move(x, m);
            if(m.hp == 0 || x.hp == 0){
                break;
            }
        }
        
    }
    @Override
    public void interact(){
        System.out.printf("%nOpening the MontiSlide... %n%nMonster Name: %s%nIt's categorized as a %s type.%n",
                name, type);
    }
}
