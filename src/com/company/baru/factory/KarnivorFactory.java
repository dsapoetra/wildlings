package com.company.baru.factory;

import com.company.baru.creatures.Karnivor;
import com.company.baru.creatures.Serigala;
import com.company.baru.creatures.Singa;

/**
 * Created by dimassaputra on 4/26/16.
 */
public class KarnivorFactory {

    int DEFAULT_POSITION = 0;
    int DEFAULT_ARAH_GERAK = 1;
    int DEFAULT_ID = 0;

    public KarnivorFactory() {}

    public KarnivorFactory(int defaultPosition, int defaultArahGerak, int defaultId) {
        this.DEFAULT_POSITION = defaultPosition;
        this.DEFAULT_ARAH_GERAK = defaultArahGerak;
        this.DEFAULT_ID = defaultId;
    }

    public Karnivor getKarnivor(String jenis) {
        return getKarnivor(jenis, DEFAULT_POSITION, DEFAULT_ARAH_GERAK, DEFAULT_ID);
    }

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
