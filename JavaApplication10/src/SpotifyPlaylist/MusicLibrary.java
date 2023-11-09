package SpotifyPlaylist;

import java.util.List;
import java.util.ArrayList;

public class MusicLibrary {
    // Private list to store songs in the music library
    private List<Song> songs = new ArrayList<>();

    // Method to add a song to the music library
    public void addSong(Song song) {
        songs.add(song);
    }

    // Method to remove a song from the music library
    public void removeSong(Song song) {
        songs.remove(song);
    }

    // Method to print all songs in the music library
    public void printAllSongs() {
        for (Song song : songs) {
            System.out.println(song);
        }
    }

    // Method to print songs with a play count greater than a specified minimum play count
    public void printSongsOverPlayCount(int minPlayCount) {
        for (Song song : songs) {
            if (song.getPlayCount() > minPlayCount) {
                System.out.println(song);
            }
        }
    }
}
