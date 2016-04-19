package com.company.baru;

/**
 * Class that represent wortel
 */

public class Wortel extends Tumbuhan {
	/* data member */
	private int Id;

	/* constructor */
	public  Wortel() {
		Power = 5;
		Usia = 6;
		PosisiX = 2;
		PosisiY=2;
		//ArahGerak = 2;
		Id = 1;
		rep ='W';

		//System.out.println("Power :"+Power+" Usia : "+Usia+" Posisi :"+PosisiX+" PosisiY :"+PosisiY+" Id: "+Id);
		//System.out.println("ctor");
	}
	public Wortel(int _PosisiX,int _PosisiY, int _Id){
		Power = 5;
		Usia = 6;
		PosisiX = _PosisiX;
		PosisiY = _PosisiY;
		//  ArahGerak = _ArahGerak;
		Id = _Id;
		rep = 'W';

		//System.out.println("Power :"+Power+" Usia:"+Usia+"Posisi :"+PosisiX+"Id: "+Id);
		//System.out.println("ctor by parameter");
	}

	/* getter */
	public int GetId(){
		return Id;
	}
	public int GetUsia(){
		return Usia;
	}
	public int GetPosisiX(){
		return PosisiX;
	}
	public int GetPosisiY(){
		return PosisiY;
	}
	public int GetPower(){
		return Power;
	}

	/* setter */
	public void SetPosisiX(int _PosisiX){
		PosisiX = _PosisiX;
	}
	public void SetPosisiY(int _PosisiY){
		PosisiY = _PosisiY;
	}
	public void SetUsia(int _usia){
		Usia--;
	}

	/* methods */
	public void Seed() {

	}
	public void kill() {
		System.out.println("Dummy kill, will implement thread to invoke other Makhluk destruct()");
	}
	public void destruct() {
		//only implement death by age
		if (Usia == 0){
			// destructor Wortel
			System.gc();
			try {
				finalize();
			} catch (Throwable throwable) {
				throwable.printStackTrace();
			}
		}
	}

	public void SetRep(char _rep){
		if (Usia <=0){
			rep = '*';
		}
	}

	public char GetRep(){
		return rep;
	}

	/* unit test */
	/*
	public static void main(String[] args) {
		Makhluk W = new Wortel();
	}
	*/

}