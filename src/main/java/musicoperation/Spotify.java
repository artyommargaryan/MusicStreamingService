package musicoperation;

import album.Album;
import pllaylist.Playlist;
import songs.Song;

import java.util.ArrayList;
import java.util.List;

public class Spotify extends MusicOperation{
    private List<Song> songs =  new ArrayList<>();
    private List<Album> albums = new ArrayList<>();
    private List<Playlist> playlists = new ArrayList<>();
    private List<Playlist> history = new ArrayList<>();

    @Override
    public List<Song> searchSong(String name) {
        List<Song> result = new ArrayList<>();

        for (var song: songs) {
            if(song.getTitle().contains(name) || song.getArtist().contains(name)){
                result.add(song);
            }
        }

        return result;
    }

    @Override
    public List<Album> searchAlbum(String name) {
        List<Album> result = new ArrayList<>();

        for (var album: albums) {
            if(album.getTitle().contains(name) || album.getArtist().contains(name)){
                result.add(album);
            }
        }

        return result;
    }

    @Override
    public void play(Song song) {
        if (!songs.contains(song)){
            throw new IllegalArgumentException("No such song");
        }

        song.play();
    }

    @Override
    public void createPlaylist(String name) {
        playlists.add(new Playlist(name));
    }

    @Override
    public void addSongToPlaylist(Song song, String playlistName) {
        if (!songs.contains(song)){
            throw new IllegalArgumentException("No such song");
        }

        for (var playlist : playlists) {
            if(playlist.getName().equals(playlistName)){
                playlist.addSong(song);
                return;
            }
        }

        throw new IllegalArgumentException("No such playlist");
    }

    @Override
    public void addAlbum(Album album) {
        albums.add(album);
    }

    @Override
    public void addSongToAlbum(Song song, Album album) {
        if (!albums.contains(album)){
            throw new IllegalArgumentException("No such album");
        }

        if (!songs.contains(song)){
            songs.add(song);
        }

        album.addSong(song);
    }

    @Override
    public void addSong(Song song) {
        songs.add(song);
    }
}
