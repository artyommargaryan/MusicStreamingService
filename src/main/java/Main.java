import musicoperation.MusicOperation;
import musicoperation.Spotify;
import songs.PopSong;
import songs.RockSong;
import songs.Song;

public class Main {
    public static void main(String[] args) {
        MusicOperation spotify = new Spotify();
        Song song1 = new RockSong("r1", "a1", 3);
        Song song2 = new RockSong("r2", "a2", 3);
        Song song3 = new PopSong("r1", "a1", 3);
        Song song4 = new PopSong("r2", "a2", 3);

        spotify.addSong(song1);
        spotify.addSong(song3);
        spotify.addSong(song2);

        spotify.createPlaylist("some");
        spotify.addSongToPlaylist(song1, "some");
        spotify.play(song1);
    }
}
