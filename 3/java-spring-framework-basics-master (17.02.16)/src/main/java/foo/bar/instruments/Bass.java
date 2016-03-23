package foo.bar.instruments;

import foo.bar.etc.Song;

/**
 * Created by aur on 15.02.2016.
 */
public class Bass implements Instrument {
    @Override
    public void play() {
        System.out.println("some bass");
    }

    @Override
    public void play(Song song) {
        System.out.println("some bass");
    }
}
