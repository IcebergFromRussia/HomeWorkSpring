package foo.bar;

import java.util.Collection;
import java.util.List;

public class Entertainer {

    public void callPerformer(Performer performer) {
        performer.perform();
    }

    public void callPerformers(Collection<Performer> collection) {
        for (Performer performer : collection) {
            performer.perform();
        }
    }
}
