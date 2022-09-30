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
public class Q1_Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Song pop = new Song("Bang!","AJR","Pop");
        Song classical = new Song("All by myself","Sergei Rachmaninoff","Classical");
        Song game = new Song("Pokemon Red BGS","Junichi Masuda","Game Music"); //BGS = background song
        Song game2 = new Song("Pokemon B2/W2 BGS","Masuda et al.","Game Music");
        Singer haruka = new Singer("Haruka", 17);
        pop.details();  
        classical.details();
        game.details();
        haruka.introduce();
        haruka.changeFavSong(game);
        haruka.changeFavSong(game2);
        haruka.PerformforAudience(pop.songName);
        MyClass prez = new MyClass("Prez");
        prez.Review();
        prez.Rating();
        prez.Applause();
        haruka.PerformforAudience(classical.songName);
        MyClass angelica = new MyClass("Angelica");
        angelica.Review();
        angelica.Rating();
        angelica.Applause();
        haruka.performanceCount();
        haruka.earned();
    }
    
}