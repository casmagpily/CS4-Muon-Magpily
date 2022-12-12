/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2_exercise9;

/**
 *
 * @author MUON
 */
public class MonsterNotFoundException extends Exception{
    public MonsterNotFoundException() {
    }
    public MonsterNotFoundException(String msg){
        super(msg);
    }
}
