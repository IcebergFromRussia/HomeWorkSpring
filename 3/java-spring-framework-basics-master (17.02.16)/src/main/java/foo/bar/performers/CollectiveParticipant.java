package foo.bar.performers;

import foo.bar.etc.Song;
import foo.bar.instruments.Instrument;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Albert on 10.03.2016.
 */
public class CollectiveParticipant {


    public void addInstrument(Instrument instrument) {
        instruments.add(instrument);
    }

    public Collection<Instrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }

    private Collection<Instrument> instruments;
    public void play(Song song){
        play(song, 0);
    }

    public void play(Song song, int index){
        ((ArrayList<Instrument>)instruments).get(index).play(song);
    }


}
