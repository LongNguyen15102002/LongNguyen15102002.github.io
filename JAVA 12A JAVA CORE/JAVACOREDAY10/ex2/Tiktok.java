package JAVACOREDAY10.ex2;

import java.util.ArrayList;
import java.util.List;

public class Tiktok {
    private List<Idol> idols = new ArrayList<>();
    private ArrayList<Song> songs = new ArrayList<>();

    public Tiktok(List<Idol> idols, ArrayList<Song> songs) {
        this.idols = idols;
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "Tiktok [idols=" + idols + ", songs=" + songs + "]";
    }

}
