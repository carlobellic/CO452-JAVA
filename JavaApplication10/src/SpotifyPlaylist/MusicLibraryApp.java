package SpotifyPlaylist;

import java.util.ArrayList;
import java.util.List;

public class MusicLibraryApp {
    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();
        
        Song song1 = new Song("Beautiful", "Anne-Marie", 863015);
        Song song2 = new Song("Bad Habits", "Ed Sheeran", 127191452);
        Song song3 = new Song("Halo", "Beyonce", 991888598);
        Song song4 = new Song("Clash", "Dave (feat. Stormzy)", 7070513);
        Song song5 = new Song("It Gets Better", "Swedish House Mafia", 7563930);

        library.addSong(song1);
        library.addSong(song2);
        library.addSong(song3);
        library.addSong(song4);
        library.addSong(song5);

        System.out.println("All Songs:");
        library.printAllSongs();

        System.out.println("\nSongs with more than 1,000,000 plays:");
        library.printSongsOverPlayCount(1000000);

        library.removeSong(song2);

        System.out.println("\nAfter removing 'Bad Habits':");
        library.printAllSongs();
      
        
    }
}