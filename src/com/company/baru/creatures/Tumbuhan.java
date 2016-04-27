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
public abstract class Tumbuhan extends Makhluk {
    /**
     * Obviously Tumbuhan(plant), can't move
     * So they don't have move or arahgerak.
     */

    /**
     * Default constructor.
     */
    public Tumbuhan() {
        super();
    }

    /**
     * Contructor that takes params.
     * @param powerx  int
     * @param usiax int
     * @param posisiXx int
     * @param repx char
     */
    public Tumbuhan(int powerx, int usiax, int posisiXx, char repx) {
        super(powerx, usiax, posisiXx, repx);
    }

    /**
     * @deprecated supposed to be self replicate.
     */
    public abstract void seed();
}
