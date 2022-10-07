/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1_exercise4;

/**
 *
 * @author Akira
 */
public class Song {
    String songName, artist, genre;
    
    public Song(String name, String artistName, String musicGenre){
        this.songName = name;
        artist = artistName;
        genre = musicGenre;
    }
    public void details(){
        System.out.println("The name of the song is " + songName + 
            ". The genre of the music is " + genre + " and made by " + artist);           
    }
    public String getGenre(){
        return genre;
    }
}