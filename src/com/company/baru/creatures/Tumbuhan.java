package com.company.baru.creatures;
public abstract class Tumbuhan extends Makhluk {
	/* methods */

	public Tumbuhan(){
		super();
	}

	public Tumbuhan(int powerx, int usiax, int posisiXx, char repx){
		super(powerx,usiax,posisiXx, repx);
	}
	public abstract void Seed();	
}