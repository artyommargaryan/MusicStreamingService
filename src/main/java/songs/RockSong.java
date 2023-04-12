package songs;

public class RockSong extends Song{
    public RockSong(String title, String artist, int time) {
        super(title, artist, time);
    }

    @Override
    public String getGenre() {
        return RockSong.class.toString();
    }
}
