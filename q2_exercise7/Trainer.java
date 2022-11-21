package q2_exercise7;
import java.util.ArrayList;

public class Trainer extends Character{
    private SimpleMonster activeMonster;
    private ArrayList<SimpleMonster> team;

    public Trainer(String n, SimpleMonster m){
        super(n);
        this.activeMonster = m;
        this.team = new ArrayList<>();
    }
    public Trainer(String n, Location l, SimpleMonster m){
        super(n, l);
        this.activeMonster = m;
        this.team = new ArrayList<>();
    }
    public SimpleMonster getActiveMonster(){
        return activeMonster;
    }
    public ArrayList<SimpleMonster> getTeam(){
        return team;
    }

    public void capture(SimpleMonster m){
        if(m.getHP() < m.getMaxHP()*0.2){
            team.add(m);
            System.out.println(this.getName() + " caught " + m.getName() + ".");
        }
        else{
            System.out.println(this.getName() + " failed to catch " + m.getName() + ".");
        }
    }
    public void battle(SimpleMonster m){
        activeMonster.attack(m);
    }
    public void battle(Trainer t){
        activeMonster.attack(t.getActiveMonster());
    }
    public void inspect(Interactive i){
        i.interact();
    }
}
