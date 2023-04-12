package pllaylist;

import songs.Song;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String name;
    private final List<Song> songs = new ArrayList<>();

    public Playlist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSong(Song song) {
        songs.add(song);
    }
}
