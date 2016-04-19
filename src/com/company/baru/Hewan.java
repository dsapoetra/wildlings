package com.company.baru;

/**
 * @author dimassaputra
 */
public abstract class Hewan extends Makhluk {
	/* data member */
	protected int ArahGerak;

	/**
	 *
	 * @param num is direction to where this animal willmove
     */
	public abstract void move(int num);

	/**
	 * this will group animal, please implement later
	 * TODO : implement this
	 */
	public abstract void grouping();
}