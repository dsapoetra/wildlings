package com.company.baru.creatures;

import com.company.baru.exception.MoveException;

/**
 * class that represent Jerapah
 * @author dimassaputra
 */
public class Jerapah extends Herbivor {
    /**
     * Id of jerapah.
     */
    private int id;

    /**
     * Default constructor
     */
    public Jerapah() {
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
    public Jerapah(int posisiXx, int arahGerak, int id) {
        super(8, posisiXx, 7, 'J', arahGerak);
        this.id = id;
    }

    /**
     * get Id.
     * @return int id.
     */
    public int getId() {
        return id;
    }

    /**
     * get Usia.
     * @return int usia.
     */
    public int getUsia() {
        return super.getUsia();
    }

    /**
     * Decrease usia.
     * @param decreaser int.
     *                  Decrease usia as much as decreaser.
     */
    public void setUsia(int decreaser) {
        super.setUsia(super.getUsia() - decreaser);
    }

    /**
     * get posisi.
     * @return int.
     */
    public int getPosisiX() {
        return super.getPosisiX();
    }

    /**
     * get arah gerak.
     * @return int.
     */
    public int getArahGerak() {
        return super.getArahGerak();
    }

    /**
     * get power.
     * @return int.
     * useful for determine species.
     */
    public int getPower() {
        return super.getPower();
    }


    /**
     * set posisix
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