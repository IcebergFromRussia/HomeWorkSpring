package foo.bar.instruments;

import foo.bar.etc.Song;

/**
 * Created by Albert on 10.03.2016.
 */
public class Voice implements Instrument {

    @Override
    public void play() {

    }

    @Override
    public void play(Song song) {
        System.out.println(song.getSongsText());
    }
}
