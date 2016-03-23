package foo.bar.instruments;

import foo.bar.etc.Song;

/**
 * Created by aur on 15.02.2016.
 */
public class Drums implements Instrument {
    @Override
    public void play() {
        System.out.println("crazy blastbits, yeah");
    }

    @Override
    public void play(Song song) {
        System.out.println("crazy blastbits, yeah");
    }
}
