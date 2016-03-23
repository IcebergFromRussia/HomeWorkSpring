package foo.bar.instruments;

import foo.bar.etc.Song;

/**
 * Created by etc on 20.03.2015.
 */
public interface Instrument {  //В общем, я подумал, что у каждой песни свояпартия на каждом инструменте
    void play();        // поэтому логичнее в метод подавать песню, а в песне по необходимости можно добавлять партии
    void play(Song song);
}
