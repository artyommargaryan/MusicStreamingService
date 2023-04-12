package musicoperation;

import album.Album;
import songs.Song;

import java.util.List;

public abstract class MusicOperation {
    public abstract List<Song> searchSong(String name);
    public abstract List<Album> searchAlbum(String name);
    public abstract void play(Song song);
    public abstract void createPlaylist(String name);
    public abstract void addSongToPlaylist(Song song, String playlistName);
    public abstract void addAlbum(Album album);
    public abstract void addSongToAlbum(Song song, Album album);

    public abstract void addSong(Song song1);
}
