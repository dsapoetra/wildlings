package com.company.baru;

import com.company.baru.creatures.Hewan;
import com.company.baru.creatures.Makhluk;
import com.company.baru.exception.MoveException;
import com.company.baru.factory.KarnivorFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * Created by dimassaputra on 4/26/16.
 */
public class MakhlukThread extends Thread {

    private final HashMap<Integer, Makhluk> world;
    private final Makhluk makhluk;

    public MakhlukThread(Makhluk makhluk, HashMap<Integer, Makhluk> world) {
        this.makhluk = makhluk;
        this.world = world;
    }

    @Override
    public void run() {
        Random random = new Random(System.currentTimeMillis());
        // randomly gerak2 sendiri
        while (true) {
            try {
                Thread.sleep(random.nextInt(1000));
                // kalau dia hewan, gerak
                if (makhluk instanceof Hewan) {
                    Hewan hewan = (Hewan)makhluk;
                    try {
                        int oldPosition = hewan.getPosisiX();
                        hewan.move(10);
                        System.out.println(makhluk.getId() + " moved to " + makhluk.getPosisiX());
                        int newPosition = hewan.getPosisiX();
                        // update world
                        world.remove(oldPosition);
                        Makhluk inThisPosition = world.get(newPosition);
                        if (inThisPosition != null) {
                            // bandingin kekuatan
                            if (makhluk.getPower() < inThisPosition.getPower()) {
                                // mati
                                makhluk.destruct();
                                break;
                            } else {
                                System.out.println(makhluk.getId() + " has taken position " + makhluk.getPosisiX());
                                inThisPosition.destruct();
                                world.put(newPosition, makhluk);
                            }
                        }
                    } catch (MoveException e) {
                        e.printStackTrace();
                    }
                }
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    public static void main(String[] Args) {
        List<Makhluk> makhluks = new ArrayList<>();
        KarnivorFactory factory = new KarnivorFactory();
        String[] namaMakhluk = {"singa", "serigala"};
        for (int i = 0; i < 10; ++i) {
            makhluks.add(factory.getKarnivor(namaMakhluk[i % 2], i * 10, 1, i));
        }

        HashMap<Integer, Makhluk> world = new HashMap<>();
        for (Makhluk makhluk : makhluks) {
            world.put(makhluk.getPosisiX(), makhluk);
            MakhlukThread thread = new MakhlukThread(makhluk, world);
            thread.start();
        }
    }
}
