package foo.bar.performers;

import foo.bar.etc.Song;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Albert on 10.03.2016.
 */
public class Collective {

    public Collection<CollectiveParticipant> getCollective() {
        return collective;
    }

    public void setCollective(Collection<CollectiveParticipant> collective) {
        this.collective = collective;
    }

    private Collection<CollectiveParticipant> collective;
    private Collection<Song> songs;

    public void play(int index){
        System.out.println(((ArrayList<Song>)(getSongs())).get(index));
        for (CollectiveParticipant colectiveParticipant: collective) { //
            colectiveParticipant.play(((ArrayList<Song>)(getSongs())).get(index));

        }
    }



    public Collection<Song> getSongs() {
        return songs;
    }

    public void setSongs(Collection<Song> songs) {
        this.songs = songs;
    }
}
