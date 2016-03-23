package foo.bar.performers;

import java.util.Collection;

/**
 * Created by Albert on 14.03.2016.
 */
public class BandList {
    public Collection<Collective> getCollectives() {
        return collectives;
    }

    public void setCollectives(Collection<Collective> collectives) {
        this.collectives = collectives;
    }

    private Collection<Collective> collectives;
}
