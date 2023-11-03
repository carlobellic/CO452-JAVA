package SpotifyPlaylist;

class Song {
    private String title;
    private String artist;
    private int playCount;

    public Song(String title, String artist, int playCount) {
        this.title = title;
        this.artist = artist;
        this.playCount = playCount;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getPlayCount() {
        return playCount;
    }

    public void incrementPlayCount() {
        playCount++;
    }

    @Override
    public String toString() {
        return title + " by " + artist + " (Play Count: " + playCount + ")";
    }
}