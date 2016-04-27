package com.company.baru.creatures;

/**
 * @author dimassaputra
 */
public abstract class Herbivor extends Hewan {
	/**
	 * @param null, will make herbivor pass each other,
	 *                 TODO : implement this
	 */

	public Herbivor(){
		super();
	}

	public Herbivor(int powerx, int posisiXx, int usiax, char repx, int arahGerak){
		super(powerx, posisiXx, usiax, repx, arahGerak);
	}
	public abstract void Pass();
}
