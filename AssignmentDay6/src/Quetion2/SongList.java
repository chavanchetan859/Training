package Quetion2;

public class SongList {
    private String song;

    public SongList(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public String toString() {
        return "PlayList{" +
                "song='" + song + '\'' +
                '}';
    }
}
