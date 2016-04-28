package com.company.baru.creatures;

import com.company.baru.exception.MoveException;

/**
 * class that represent Kuda.
 * @author dimassaputra
 */
public class Kuda extends Herbivor {
    /**
     * Id of kuda.
     */
    private int id;

    /**
     * Default constructor
     */
    public Kuda() {
        super();
        id = 1;
    }

    /**
     * Constructor with parameter.
     * power,age, rep is default.
     * @param posisiXx
     * @param arahGerak
     * @param id
     */
    public Kuda(int posisiXx, int arahGerak, int id) {
        super(7, posisiXx, 7, 'K', arahGerak);
        this.id = id;
    }

    /**
     *
     * @return int id.
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return int, the age.
     */
    public int getUsia() {
        return super.getUsia();
    }

    /**
     *
     * @param decreaser int.
     *                  Decrease usia as much as decreaser.
     */
    public void setUsia(int decreaser) {
        super.setUsia(super.getUsia() - decreaser);
    }

    /**
     *
     * @return int.
     * The current position of this.
     */
    @Override
    public int getPosisiX() {
        return super.getPosisiX();
    }

    /**
     *
     * @return int arahgerak.
     * the direction of this.
     */
    public int getArahGerak() {
        return super.getArahGerak();
    }

    /**
     * get the power,useful for determine species.
     * @return int
     */
    public int getPower() {
        return super.getPower();
    }


    /**
     *
     * @param posisiX int.
     *                new position of singa.
     */
    public void setPosisiX(int posisiX) {
        super.setPosisiX(posisiX);
    }

    /**
     *
     * @param arahGerak int
     *                  Set new direction.
     */
    public void setArahGerak(int arahGerak) {
        super.setArahGerak(arahGerak);
    }

    /**
     * @param num int.
     *            move by number of column of the world.
     *
     */
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
            default:
                super.setPosisiX(super.getPosisiX());
        }
        if (this.getPosisiX() > num * num) {
            this.setPosisiX(temp);
            this.setRep('*');
            throw new MoveException("Out of border");
        }
    }

    /**
     * pass other herbivor.
     */
    public void pass() {
        System.out.println("will implemented with Serigala class using thread");
    }

    /**
     * group with same species.
     */
    public void grouping(Hewan H) {
        setArahGerak(H.getArahGerak());
    }

    /**
     * kill.
     */
    public void kill() {
        System.out.println("Dummy kill, will implement thread to invoke other Makhluk destruct()");
    }

    /**
     * destruct. TODO: auto setrep.
     */
    public void destruct() {
        //only implement death by age
       /* if (super.getUsia() == 0) {
            // destructor Singa
            System.gc();
            try {

                finalize();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }*/
        setRep('*');
    }

    /**
     *
     * @param rep char.
     */
    public void setRep(char rep) {
        if (super.getUsia() <= 0) {
            super.setRep(rep);
        }
    }

    /**
     *
     * @return char, the rep.
     */
    public char getRep() {
        return super.getRep();
    }

}



