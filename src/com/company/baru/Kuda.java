package com.company.baru;
public class Kuda extends Herbivor {
	/* data member */
	private int Id;

	/* constructor */
	public  Kuda() {
		Power=7;
		Usia=7;
		PosisiX = 2;
		PosisiY=2;
		ArahGerak = 2;
		Id = 1;
		rep ='K';

		//System.out.println("Power :"+Power+" Usia : "+Usia+" PosisiX :"+PosisiX+" PosisiY :"+PosisiY+" ArahGerak: "+ArahGerak+" Id: "+Id);
		//System.out.println("ctor");
	}
	public Kuda(int _PosisiX,int _PosisiY, int _ArahGerak, int _Id){
		Power=7;
		Usia=7;
		PosisiX = _PosisiX;
		PosisiY = _PosisiY;
		ArahGerak = _ArahGerak;
		Id = _Id;
		rep ='K';

		//System.out.println("Power :"+Power+" Usia : "+Usia+" PosisiX :"+PosisiX+" PosisiY :"+PosisiY+" ArahGerak: "+ArahGerak+" Id: "+Id);
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
	public int GetArahGerak(){
		return ArahGerak;
	}
	public int GetPower(){
		return Power;
	}

	/* setter */
	public void SetArahGerak(int _ArahGerak){
		ArahGerak=_ArahGerak;
	}
	public void SetPosisiX(int _PosisiX){
		PosisiX = _PosisiX;
	}
	public void SetPosisiY(int _PosisiY){
		PosisiY= _PosisiY;
	}
	public void SetUsia(int _usia){
		Usia--;
	}

	/* methods */
	public void move(int num) {
		switch(ArahGerak){
			case 1:
				PosisiX = PosisiX+1 ;
				break;
			case 2:
				PosisiX = PosisiX+num ;
				break;
			case 3:
				PosisiX = PosisiX+num+1 ;
				break;
			case 4:
				PosisiX = PosisiX-num-1 ;
				break;
			case -1:
				PosisiX = PosisiX-1 ;
				break;
			case -2:
				PosisiX = PosisiX-num ;
				break;
			case -3:
				PosisiX = PosisiX-num+1 ;
				break;
			case -4:
				PosisiX = PosisiX+num-1 ;
				break;
				// this_thread::sleep_for(chrono::milliseconds(2000));
		}
	}
	public void Pass() {
		System.out.println("will implemented with Kuda class using thread");
	}
	public void grouping() {
		System.out.println("will implemented with thread later");
	}
	public void kill() {
		System.out.println("Dummy kill, will implement thread to invoke other Makhluk destruct()");
	}
	public void destruct() {
		//only implement death by age
		if (Usia == 0){
			// destructor Kuda
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
		Makhluk K = new Kuda();
	}
	*/
}



