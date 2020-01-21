package ca.cmpt276A2;

import java.util.ArrayList;
import java.util.List;

public class LensM {
    private List<Lens> lensList = new ArrayList<>();
    private static LensM INSTANCE = new LensM();

    public static LensM getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LensM();
        }
        return INSTANCE;
    }

    private LensM() {
        add(new Lens("Canon", 1.8, 50));
        add(new Lens("Tamron", 2.8, 90));
        add(new Lens("Sigma", 2.8, 200));
        add(new Lens("Nikon", 4, 200));
    }

    public void add(Lens lens) {
        lensList.add(lens);
    }

    public Lens retrieve(int index) {
        return lensList.get(index);
    }
}
