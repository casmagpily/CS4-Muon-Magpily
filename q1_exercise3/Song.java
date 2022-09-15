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
public class Song {
    String songName, artist;
    int id, friendship;
    double grade, money;
    
    public Song(String name){
        this.songName = name;
        friendship = 0;
        money = 0;
        grade = 2.0;
    }
    
    public void introduce(){
            System.out.printf("");           
    }
    public double getGrade(){
        
        return grade;  
    }
    public void talk(int hours){
        friendship += hours;
    }
}
