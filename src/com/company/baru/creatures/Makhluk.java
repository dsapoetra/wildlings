/**
 * * Domain classes used to produce
 * <p>
 * These classes contain the
 * </p>
 *
 * @author somebody
 * @version 1.0
 * @since 1.0
 */
package com.company.baru.creatures;

/**
 * Class that represent Makhluk.
 * Base of everything.
 * @author dimassaputra.
 */
public abstract class Makhluk {
    /**
     * Power of all creatures, in this app,
     * all creatures differ by their power.
     */
    private int power;
    /**
     * This represent where one creature posistion in the world.
     */

    private int posisiX;
    /**
     * This represent age of one creature, periodically it should decrease.
     */
    private int usia;

    /**
     * Just representation of what one creature shown to the world.
     */
    private char rep;

    /**
     * Default constructor, just set member with zero.
     */
    public Makhluk() {
        power = 0;
        usia = 0;
        posisiX = 0;
        rep = '*';
    }

    /**
     * Constructor with param.
     * @param powerx : to determine creature power,
     *                  this is huge different from one species to another
     * @param usiax initial age,
     *                 will be decreasing periodically
     * @param posisiXx initial position,
     *                    don't put it outside the world
     * @param repx representation,
     *                when one creature reach age zero, change this to '*'
     */
    public Makhluk(int powerx, int usiax, int posisiXx, char repx) {
        power = powerx;
        usia = usiax;
        posisiX = posisiXx;
        rep = repx;
    }

    /**
     * get position where one creature is.
     * @return position where one creature is.
     */
    public int getPosisiX() {
        return posisiX;
    }

    /**
     * a new position of one creature,
     *                be careful not to set outside the world.
     * @param posisiX int.
     * a new position of one creature,
     *                be careful not to set outside the world.
     */
    public void setPosisiX(int posisiX) {
        this.posisiX = posisiX;
    }

    /**
     *power of one creature,
     * useful for determine species.
     * @return int power of one creature,
     * useful for determine species.
     */
    public int getPower() {
        return power;
    }

    /**
     *determine whether,
     * setRep should be called or not.
     * @return usia, determine whether,
     * setRep should be called or not.
     */
    public int getUsia() {
        return usia;
    }

    /**
     *Set usia(age) of creature, please decrement,
     * by time going.
     * @param usia int
     * Set usia(age) of creature, please decrement,
     * by time going.
     */
    public void setUsia(int usia) {
        this.usia = usia;
    }

    /**
     * Get id.
     * @return Id of all creatures
     */
    public abstract int getId();

    /**
     * representation of one creature.
     * @return char representation of one creature.
     */
    public char getRep() {
        return rep;
    }

    /**
     * new char that will be shown to world,
     *             remember to change to '*' when age =0.
     * @param rep
     * new char that will be shown to world,
     *             remember to change to '*' when age =0.
     */
    public void setRep(char rep) {
        this.rep = rep;
    }

    /**
     * Kill
     * @param NULL
     */
    public abstract void kill();

    /**
     * destruct one creature and set the rep to '*'.
     */
    public abstract void destruct();


}
