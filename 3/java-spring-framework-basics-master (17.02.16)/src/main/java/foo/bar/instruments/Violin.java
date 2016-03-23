package foo.bar.instruments;

import foo.bar.etc.Song;

/**
 * Created by Albert on 10.03.2016.
 */
public class Violin implements Instrument {
    @Override
    public void play() {
        System.out.println("Скрип скрип скрип");
    }

    @Override
    public void play(Song song) {
        System.out.println("Скрип скрип скрип");
    }
}
