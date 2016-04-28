package com.company.baru.factory;

import com.company.baru.creatures.Karnivor;
import com.company.baru.creatures.Serigala;
import com.company.baru.creatures.Singa;

/** Factory of karnivor.
 * @author dimassaputra
 * Created by dimassaputra on 4/26/16.
 */
public class KarnivorFactory {

    int DEFAULT_POSITION = 0;
    int DEFAULT_ARAH_GERAK = 1;
    int DEFAULT_ID = 0;

    /**
     * Default ctor
     */
    public KarnivorFactory() {}

    /**
     * Params ctor.
     * @param defaultPosition int.
     * @param defaultArahGerak int.
     * @param defaultId int.
     */
    public KarnivorFactory(int defaultPosition, int defaultArahGerak, int defaultId) {
        this.DEFAULT_POSITION = defaultPosition;
        this.DEFAULT_ARAH_GERAK = defaultArahGerak;
        this.DEFAULT_ID = defaultId;
    }

    /**
     * Send default params.
     * @param jenis String.
     * @return karnivor.
     */
    public Karnivor getKarnivor(String jenis) {
        return getKarnivor(jenis, DEFAULT_POSITION, DEFAULT_ARAH_GERAK, DEFAULT_ID);
    }

    /**
     * Calling instance of karnivor ctor.
     * @param jenis String.
     * @param posisiX int.
     * @param arahGerak int.
     * @param id int.
     * @return karnivor.
     */
    public Karnivor getKarnivor(String jenis, int posisiX, int arahGerak, int id) {
        if (jenis.equalsIgnoreCase("serigala")) {
            return new Serigala(posisiX, arahGerak, id);
        } else if (jenis.equalsIgnoreCase("singa")) {
            return new Singa(posisiX, arahGerak, id);
        } else {
            throw new IllegalArgumentException(jenis + " is an unknown Karnivor");
        }
    }

    public static void main() {
        KarnivorFactory factory = new KarnivorFactory();
        Karnivor serigala = factory.getKarnivor("serigala");
        Karnivor serigala2 = factory.getKarnivor("singa", 10, -1, 256);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };
    }
}
