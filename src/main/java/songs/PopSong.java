package songs;

public class PopSong extends Song {

    public PopSong(String title, String artist, int time) {
        super(title, artist, time);
    }

    @Override
    public String getGenre() {
        return PopSong.class.toString();
    }
}
