package com.company.baru;


public abstract class Makhluk {
	/* data member */
	protected int Power;
	protected int PosisiX;
	protected int PosisiY;
	protected int Usia;
	protected char rep;

	/* getter */
	public abstract int GetPosisiX();
	public abstract int GetPosisiY();
	public abstract int GetPower();
	public abstract int GetUsia();
	public abstract int GetId();
	public abstract char GetRep();

	/* setter */
	public abstract void SetPosisiX(int _PosisiX);
	public abstract void SetPosisiY(int _PosisiY);
	public abstract void SetRep(char _rep);

	/* methods */
	public abstract void kill();
	public abstract void destruct();


}