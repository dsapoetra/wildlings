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

/**
 * @author dimassaputra
 */
public abstract class Karnivor extends Hewan {
    /**
     * Default constructor.
     */
    public Karnivor() {
        super();
    }

    /**
     * Constructor with parameter that takes param as data member.
     * @param powerx int
     * @param posisiXx int
     * @param usiax int
     * @param repx char
     * @param arahGerak int
     */
    public Karnivor(int powerx, int posisiXx, int usiax, char repx, int arahGerak) {
        super(powerx, posisiXx, usiax, repx, arahGerak);
    }

    /**
     * void fight, where 2 karnivor fight.
     */
    public abstract void fight();

}
