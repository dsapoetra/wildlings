/**
 * * Domain classes used to produce .....
 * <p>
 * These classes contain the ......
 * </p>
 *
 * @author somebody
 * @version 1.0
 * @since 1.0
 */

package com.company.baru.creatures;


import com.company.baru.exception.MoveException;

/**
 * Class that represent singa.
 * @author dimassaputra
 */
public class Singa extends Karnivor {

    /**
     * id that differ from one creature and another.
     */
    private int id;

    /**
     * Default constructor.
     */
    public Singa() {
        super();
        this.id = 1;
    }

    /**
     * Constructor with parameter.
     * Power, usia, rep, is default for Singa.
     * @param posisiXx int
     * @param arahGerak int
     * @param id int
     */
    public Singa(int posisiXx, int arahGerak, int id) {
        super(10, posisiXx, 8, 'S', arahGerak);
        this.id = id;
    }

    /**
     * Just to get id.
     * @return int
     */
    public final int getId() {
        return id;
    }

    /**
     * Get usia.
     * @return int
     */
    public final int getUsia() {
        return super.getUsia();
    }


    /**
     * decrease usia of singa,
     * as much as decreaser.
     * @param decreaser int
     */
    public final void setUsia(int decreaser) {
        super.setUsia(super.getUsia() - decreaser);
    }

    /**
     * Get singa posisition.
     * @Override
     * @return int
     */
    @Override
    public final int getPosisiX() {
        return super.getPosisiX();
    }

    /**
     *  Get where singa is heading.
     * @return int
     */
    public final int getArahGerak() {
        return super.getArahGerak();
    }

    /**
     * Get power of singa,
     * Useful for polymorphism.
     * @return int
     */
    public final int getPower() {
        return super.getPower();
    }


    /**
     *
     * @param posisiX int.
     *      a new position of one creature,
     */
    public final void setPosisiX(int posisiX) {
        super.setPosisiX(posisiX);
    }

    /**
     *
     * @param arahGerak int set new arahgerak.
     */
    public final void setArahGerak(int arahGerak) {
        super.setArahGerak(arahGerak);
    }

    /**
     * @param num int
     */
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
     * method fight.
     */
    public void fight() {
        System.out.println("will implemented with Serigala class using thread");
    }

    /**
     * Method grouping.
     */
    public void grouping(Hewan H) {
        System.out.println("will implemented with thread later");
    }

    /**
     * TODO : ubah dikit.
     */
    public void kill() {
        System.out.println("Dummy kill, will implement thread to invoke other Makhluk destruct()");
    }

    /**
     * TODO : ubah dikit biar auto setrep.
     */
    public void destruct() {

        setRep('*');
    }

    /**
     *
     * @param rep char
     * new char that will be shown to world,
     */
    public void setRep(char rep) {
        if (super.getUsia() <= 0) {
            super.setRep(rep);
        }
    }

    /**
     *  get rep of singa.
     * @return char
     */
    public char getRep() {
        return super.getRep();
    }
}
