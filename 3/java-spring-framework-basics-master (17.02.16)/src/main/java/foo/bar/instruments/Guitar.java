package foo.bar.instruments;

import foo.bar.etc.Song;

/**
 * Created by aur on 15.02.2016.
 */
public class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("amazing guitar solo");
    }

    @Override
    public void play(Song song) {
        System.out.println("amazing guitar solo");
    }
}
