package com.company.baru.creatures;

/**
 * Class that represent rumput
 */

public class Rumput extends Tumbuhan {
    /* data member */
    private int Id;

    public Rumput() {
        super();
        Id = 1;
    }

    public Rumput(int posisiXx, int Id) {
        super(6, 4, posisiXx, 'R');
        this.Id = Id;
        assert (Id > 0);
    }

    public static void main(String[] args) {
        Makhluk R = new Rumput();
    }

    /* getter */
    public int getId() {
        return Id;
    }

    public int getUsia() {
        return super.getUsia();
    }

    public void setUsia(int decreaser) {
        super.setUsia(super.getUsia() - decreaser);
    }

    public int getPosisiX() {
        return super.getPosisiX();
    }

    public int GetPower() {
        return super.getPower();
    }

    /* setter */
    public void SetPosisiX(int _PosisiX) {
        super.setPosisiX(_PosisiX);
    }

    public void seed() {

    }

    public void kill() {
        System.out.println("Dummy kill, will implement thread to invoke other Makhluk destruct()");
    }

    public void destruct() {
        //only implement death by age
        if (super.getUsia() == 0) {
            // destructor Singa
            System.gc();
            try {

                finalize();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
    }

    public void SetRep(char _rep) {
        if (super.getUsia() <= 0) {
            super.setRep('*');
        }
    }

    public char GetRep() {
        return super.getRep();
    }

}