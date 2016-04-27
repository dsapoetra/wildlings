package com.company.baru.creatures;

import com.company.baru.exception.MoveException;

/**
 * @author dimassaputra
 */
public abstract class Hewan extends Makhluk {
	/* data member */
	private int arahGerak;

	public Hewan() {
		super();
		arahGerak = 2;
	}

	public Hewan(int powerx, int posisiXx, int usiax, char repx, int arahGerak){
		super(powerx,usiax, posisiXx,repx);
		this.arahGerak = arahGerak;
	}

	public int getArahGerak(){
		return arahGerak;
	}

	public void setArahGerak(int arahGerak){
		this.arahGerak = arahGerak;
	}
	/**
	 *
	 *
	 * @param num is direction to where this animal willmove
     */
	public abstract void move(int num) throws MoveException;

	/**
	 * this will group animal, please implement later
	 * TODO : implement this
	 */
	public abstract void grouping();
}
