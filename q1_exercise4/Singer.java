/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1_exercise4;

/**
 *
 * @author Akira
 */
public class Singer {
    String name;
    int age;
    private int noOfPerformances, earnings;
    private static int totalPerformances = 0;
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
    public void PerformforAudience(Singer singer, String song){
        System.out.println("\n" + name + " started to perform and sang " + song);
        noOfPerformances += 1;
        earnings += 500;
        singer.totalPerformances++;
    }
    public void PerformforAudience(Singer singer, Singer duet, String song){
        System.out.println("\n" + singer.name + " and " + duet.name + 
                " started to perform a duet and sang " + song);
        singer.earnings += 250;
        duet.earnings += 250;
        singer.noOfPerformances += 1;
        duet.noOfPerformances += 1;
        singer.totalPerformances += 1;
        duet.totalPerformances += 1;
    }
    public void changeFavSong(Song favoriteSong){
        this.favoritesong = favoriteSong;
        System.out.println(this.favoritesong.songName + " is being played as the"
                + " crew starts setting up the stage.");
    }
    public void performanceCount(Singer singer1, Singer singer2){
        System.out.println(singer1.name + " and " + singer2.name + " performed " 
                + totalPerformances + " times in total");
    }
    public void performanceTotal(){
        System.out.println("\nThe singers performed " + noOfPerformances 
                + " times tonight");
    }
    public void earned(){
        System.out.println(name + " earned a total of " + earnings + " Php after just "
                + noOfPerformances + " performances");
    }
}
