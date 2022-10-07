/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q1_exercise4;

/**
 *
 * @author Akira
 */
public class Q1_Exercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Song pop = new Song("Bang!","AJR","Pop");
        Song classical = new Song("All by myself","Sergei Rachmaninoff","Classical");
        Song game = new Song("Pokemon Red BGS","Junichi Masuda","Game Music"); //BGS = background song
        Song game2 = new Song("Pokemon B2/W2 BGS","Masuda et al.","Game Music");
        Singer haruka = new Singer("Haruka", 17);
        Singer rimuru = new Singer("Rimuru", 19);
        pop.details();  
        classical.details();
        game.details();
        haruka.introduce();
        rimuru.introduce();
        haruka.changeFavSong(game);
        haruka.changeFavSong(game2);
        haruka.PerformforAudience(haruka, pop.songName);
        System.out.println("The genre of this song is " + pop.getGenre());
        MyClass prez = new MyClass("Prez");
        prez.Review();
        prez.Rating();
        prez.Applause();
        haruka.PerformforAudience(haruka, classical.songName);
        System.out.println("The genre of this song is " + classical.getGenre());
        MyClass angelica = new MyClass("Angelica");
        angelica.Review();        
        angelica.Rating();
        angelica.Applause();
        angelica.setRating(7.0);
        angelica.Applause();
        haruka.PerformforAudience(rimuru, haruka, pop.songName);
        System.out.println("The genre of this song is " + pop.getGenre());
        prez.Review();
        prez.Rating();
        prez.Applause();
        angelica.Review();        
        angelica.Rating();
        angelica.Applause();
        haruka.performanceTotal();
        haruka.performanceCount(haruka, rimuru);
        haruka.earned();
        rimuru.earned();
    }
}