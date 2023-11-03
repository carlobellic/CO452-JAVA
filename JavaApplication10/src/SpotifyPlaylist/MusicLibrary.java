package SpotifyPlaylist;

import java.util.List;
import java.util.ArrayList;
public class MusicLibrary {
    private List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    public void printAllSongs() {
        for (Song song : songs) {
            System.out.println(song);
        }
    }

    public void printSongsOverPlayCount(int minPlayCount) {
        for (Song song : songs) {
            if (song.getPlayCount() > minPlayCount) {
                System.out.println(song);
            }
        }
    }
}
