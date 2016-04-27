package com.company.baru.factory;

import com.company.baru.creatures.Tumbuhan;
import com.company.baru.creatures.Wortel;
import com.company.baru.creatures.Rumput;

/**
 * Created by dimassaputra on 4/26/16.
 */
public class TumbuhanFactory {
    int DEFAULT_POSITION = 0;
    int DEFAULT_ID = 0;

    public TumbuhanFactory() {}

    public TumbuhanFactory(int defaultPosition, int defaultId) {
        this.DEFAULT_POSITION = defaultPosition;
        this.DEFAULT_ID = defaultId;
    }

    public Tumbuhan getTumbuhan(String jenis) {
        return getTumbuhan(jenis, DEFAULT_POSITION, DEFAULT_ID);
    }

    public Tumbuhan getTumbuhan(String jenis, int posisiX, int id) {
        if (jenis.equalsIgnoreCase("wortel")) {
            return new Wortel(posisiX, id);
        } else if (jenis.equalsIgnoreCase("rumput")) {
            return new Rumput(posisiX, id);
        } else {
            throw new IllegalArgumentException(jenis + " is an unknown tumbuhan");
        }
    }
}
