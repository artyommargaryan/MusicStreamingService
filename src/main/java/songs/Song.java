package songs;

public abstract class Song {
    private final String title;
    private final String artist;
    private final int length;

    public Song(String title, String artist, int length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getLength() {
        return length;
    }

    public void play() {
        System.out.println("playing: " + artist + "'s " + title + "length: " + length);
    }

    public abstract String getGenre();
}
