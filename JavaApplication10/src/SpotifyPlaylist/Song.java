package SpotifyPlaylist;

class Song {
    private String title;
    private String artist;
    private int playCount;
    // used to print out the song list with different statistics.
    public Song(String title, String artist, int playCount) {
        this.title = title;
        this.artist = artist;
        this.playCount = playCount;
    }
    // gets the title of the song.
    public String getTitle() {
        return title;
    }
    // gets the artists name.
    public String getArtist() {
        return artist;
    }
    // gets the songs play count.
    public int getPlayCount() {
        return playCount;
    }
 
    public void incrementPlayCount() {
        playCount++;
    }
     
    @Override
    // returns the artist and play count.
    public String toString() {
        return title + " by " + artist + " (Play Count: " + playCount + ")";
    }
}
