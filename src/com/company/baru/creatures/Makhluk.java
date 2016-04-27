package com.company.baru.creatures;

/**
 * @author dimassaputra
 */
public abstract class Makhluk {
	/* data member */
	private int power;
	private int posisiX;
	//private int posisiY;
	private int usia;
	private char rep;

	public Makhluk() {
		power = 0;
		usia = 0;
		posisiX = 0;
		//posisiY = 0;
		rep = '*';
	}

	public Makhluk(int powerx, int usiax, int posisiXx, char repx) {
		power = powerx;
		usia = usiax;
		posisiX = posisiXx;
		//posisiY = posisiYx;
		rep = repx;
	}

	/* getter */
	public  int getPosisiX(){
		return posisiX;
	}
	/*public  int getPosisiY(){
		return posisiY;
	}*/
	public  int getPower(){
		return power;
	}
	public int getUsia(){return usia;}

	public abstract int getId();
	public  char getRep(){
		return rep;
	}

	/* setter */
	public  void setPosisiX(int _PosisiX){
		posisiX = _PosisiX;
	}
	/*public  void setPosisiY(int _PosisiY){
		posisiY = _PosisiY;
	}*/
	public  void setRep(char _rep){
		rep =_rep;
	}

	public void setUsia(int usia){
		this.usia = usia;
	}

	/* methods */
	public abstract void kill();
	public abstract void destruct();


}
