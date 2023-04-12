package album;

import songs.Song;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Album {
    private String title;
    private String artist;
    private Date date;
    private final List<Song> songs = new ArrayList<>();

    public Album(String title, String artist, Date date) {
        this.title = title;
        this.artist = artist;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public Date getDate() {
        return date;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void addSong(Song song) {
        songs.add(song);
    }
}
