package com.company.baru.creatures;

import com.company.baru.exception.MoveException;

public class Kuda extends Herbivor {
    /* data member */
    private int id;

    /* constructor */
    public Kuda() {
        super();
        id = 1;
        //System.out.println("Power :"+Power+" Usia : "+Usia+" Posisi :"+PosisiX+" PosisiY :"+PosisiY+" ArahGerak: "+ArahGerak+" Id: "+Id);
        //System.out.println("ctor");
    }

    public Kuda(int posisiXx, int arahGerak, int _Id) {
        super(7, posisiXx, 7, 'K', arahGerak);
        id = _Id;

        //System.out.println("Power :"+Power+" Usia : "+Usia+" Posisi :"+PosisiX+" PosisiY :"+PosisiY+" ArahGerak: "+ArahGerak+" Id: "+Id);
        //System.out.println("ctor by parameter");
    }

    /* getter */
    public int getId() {
        return id;
    }

    public int getUsia() {
        return super.getUsia();
    }

    public void setUsia(int decreaser) {
        super.setUsia(super.getUsia() - decreaser);
    }

    @Override
    public int getPosisiX() {
        return super.getPosisiX();
    }

    public int getArahGerak() {
        return super.getArahGerak();
    }

    public int GetPower() {
        return super.getPower();
    }


    /* setter */
    public void SetPosisiX(int _PosisiX) {
        super.setPosisiX(_PosisiX);
    }

    public void SetArahGerak(int _ArahGerak) {
        super.setArahGerak(_ArahGerak);
    }

    /**
     * @param num
     */
    /* methods */
    //@Override
    public void move(int num) throws MoveException {
        int temp = this.getPosisiX();
        switch (super.getArahGerak()) {
            case 1:
                super.setPosisiX(super.getPosisiX() + 1);
                break;
            case 2:
                super.setPosisiX(super.getPosisiX() + num);
                break;
            case 3:
                super.setPosisiX(super.getPosisiX() + 1 + num);
                break;
            case 4:
                super.setPosisiX(super.getPosisiX() - 1 - num);
                break;
            case -1:
                super.setPosisiX(super.getPosisiX() - 1);
                break;
            case -2:
                super.setPosisiX(super.getPosisiX() - num);
                break;
            case -3:
                super.setPosisiX(super.getPosisiX() - num + 1);
                break;
            case -4:
                super.setPosisiX(super.getPosisiX() + num - 1);
                break;
        }
        if (this.getPosisiX() > num * num) {
            this.setPosisiX(temp);
            this.setRep('*');
            throw new MoveException("Out of border");
        }
    }

    public void pass() {
        System.out.println("will implemented with Serigala class using thread");
    }

    public void grouping() {
        System.out.println("will implemented with thread later");
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
