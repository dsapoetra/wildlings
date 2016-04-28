package com.company.baru.factory;

import com.company.baru.creatures.Herbivor;
import com.company.baru.creatures.Jerapah;
import com.company.baru.creatures.Kuda;

/** Factory of herbivor.
 * @author dimassaputra
 * Created by dimassaputra on 4/26/16.
 */
public class HerbivorFactory {
    int DEFAULT_POSITION = 0;
    int DEFAULT_ARAH_GERAK = 1;
    int DEFAULT_ID = 0;

    /**
     * Default ctor
     */
    public HerbivorFactory() {}

    /**
     * Params ctor.
     * @param defaultPosition int.
     * @param defaultArahGerak int.
     * @param defaultId int.
     */
    public HerbivorFactory(int defaultPosition, int defaultArahGerak, int defaultId) {
        this.DEFAULT_POSITION = defaultPosition;
        this.DEFAULT_ARAH_GERAK = defaultArahGerak;
        this.DEFAULT_ID = defaultId;
    }

    /**
     * Send default params.
     * @param jenis String.
     * @return Herbivor.
     */
    public Herbivor getHerbivor(String jenis) {
        return getHerbivor(jenis, DEFAULT_POSITION, DEFAULT_ARAH_GERAK, DEFAULT_ID);
    }

    /**
     * Calling instance of herbivor ctor.
     * @param jenis String.
     * @param posisiX int.
     * @param arahGerak int.
     * @param id int.
     * @return Herbivor.
     */
    public Herbivor getHerbivor(String jenis, int posisiX, int arahGerak, int id) {
        if (jenis.equalsIgnoreCase("kuda")) {
            return new Kuda(posisiX, arahGerak, id);
        } else if (jenis.equalsIgnoreCase("jerapah")) {
            return new Jerapah(posisiX, arahGerak, id);
        } else {
            throw new IllegalArgumentException(jenis + " is an unknown Karnivor");
        }
    }
}
