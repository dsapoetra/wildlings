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
 * @author dimassaputra
 */
public abstract class Hewan extends Makhluk {
    /**
     * All hewan(animal) can move,
     * so they have to move at a direction (arahgerak).
     */
    private int arahGerak;

    /**
     * Default constructor, add arahgerak variable besides,
     * invoking parents constructor.
     */
    public Hewan() {
        super();
        arahGerak = 2;
    }

    /**
     *
     * @param powerx int.
     * @param posisiXx int.
     * @param usiax int.
     * @param repx char.
     * @param arahGerak int.
     */
    public Hewan(int powerx, int posisiXx, int usiax, char repx, int arahGerak) {
        super(powerx, usiax, posisiXx, repx);
        this.arahGerak = arahGerak;
    }

    /**
     *
     * @return int arahgerak, show where creature will move.
     */
    public int getArahGerak() {
        return arahGerak;
    }

    /**
     *
     * @param arahGerak int set new arahgerak.
     */
    public void setArahGerak(int arahGerak) {

        this.arahGerak = arahGerak;
    }

    /**
     * @param num is direction to where this animal willmove.
     * @throws MoveException move exception.
     */
    public abstract void move(int num) throws MoveException;

    /**
     * this will group animal, please implement later.
     * TODO : implement this
     */
    public abstract void grouping();
}
