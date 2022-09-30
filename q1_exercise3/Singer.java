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
public class Singer {
    String name;
    int age;
    int noOfPerformances;
    int earnings;
    Song favoritesong;
    public Singer(String singerName,int singerAge){
        name = singerName;
        age = singerAge;
        noOfPerformances = 0;
        earnings = 0;
    }
    public void introduce(){
        System.out.println("\n" + "Hello! My name is " + name + ", and I'm a " 
                + age + " year old singer! Thank you for having me!" + "\n");
    }
    public void PerformforAudience(String song){
        System.out.println("\n" + name + " started to perform and sang " + song);
        noOfPerformances += 1;
        earnings += 500;
    }
    public void changeFavSong(Song favoriteSong){
        this.favoritesong = favoriteSong;
        System.out.println(this.favoritesong.songName + " is being played as the"
                + " crew starts setting up the stage.");
    }
    public void performanceCount(){
        System.out.println("\n" + name + " performed " + noOfPerformances 
                + " times tonight");
    }
    public void earned(){
        System.out.println(name + " earned a total of " + earnings + " Php after just "
                + noOfPerformances + " performances");
    }
}
