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
public abstract class Herbivor extends Hewan {
    /**
     * @param null, will make herbivor pass each other,
     *              TODO : implement this
     */

    /**
     * Default constructor.
     */
    public Herbivor() {
        super();
    }

    /**
     * Constructor with parameter.
     * @param powerx int
     * @param posisiXx int
     * @param usiax int
     * @param repx char
     * @param arahGerak int
     */
    public Herbivor(int powerx, int posisiXx, int usiax, char repx, int arahGerak) {
        super(powerx, posisiXx, usiax, repx, arahGerak);
    }

    /**
     * Implement later,
     * interaction beetween 2 herbivore.
     */
    public abstract void pass();
}
