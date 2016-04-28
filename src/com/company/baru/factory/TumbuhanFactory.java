package com.company.baru.factory;

import com.company.baru.creatures.Tumbuhan;
import com.company.baru.creatures.Wortel;
import com.company.baru.creatures.Rumput;

/**
 * Factory of Tumbuhan.
 * @author dimassaputra
 * Created by dimassaputra on 4/26/16.
 */
public class TumbuhanFactory {
    int DEFAULT_POSITION = 0;
    int DEFAULT_ID = 0;

    /**
     * Default ctor
     */
    public TumbuhanFactory() {}

    /**
     * Params ctor.
     * @param defaultPosition int.
     * @param defaultId int.
     */
    public TumbuhanFactory(int defaultPosition, int defaultId) {
        this.DEFAULT_POSITION = defaultPosition;
        this.DEFAULT_ID = defaultId;
    }

    /**
     * Send default params.
     * @param jenis String.
     * @return tumbuhan.
     */
    public Tumbuhan getTumbuhan(String jenis) {
        return getTumbuhan(jenis, DEFAULT_POSITION, DEFAULT_ID);
    }

    /**
     * Calling instance of tumbuhan ctor.
     * @param jenis String.
     * @param posisiX int.
     * @param id int.
     * @return tumbuhan.
     */
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
