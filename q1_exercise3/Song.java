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
}