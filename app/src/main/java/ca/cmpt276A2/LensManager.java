package ca.cmpt276A2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LensManager implements Iterable<Lens>{
    private List<Lens> lensList = new ArrayList<>();

    private static LensManager INSTANCE = null;

    private LensManager() {
        add(new Lens("Canon", 1.8, 50));
        add(new Lens("Tamron", 2.8, 90));
        add(new Lens("Sigma", 2.8, 200));
        add(new Lens("Nikon", 4, 200));
    }

    public static LensManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LensManager();
        }
        return INSTANCE;
    }

    public void add(Lens lens) {
        lensList.add(lens);
    }

    public Lens retrieve(int index) {
        return lensList.get(index);
    }

    @Override
    public Iterator<Lens> iterator() {
        return lensList.iterator();
    }
}
