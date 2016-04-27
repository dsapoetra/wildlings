package com.company.baru.creatures;

/**
 * Class that represent wortel
 */

public class Wortel extends Tumbuhan {
	/* data member */
	private int Id;

	/* constructor */
	public  Wortel() {
		super();
		Id = 1;


		//System.out.println("Power :"+Power+" Usia : "+Usia+" Posisi :"+PosisiX+" PosisiY :"+PosisiY+" Id: "+Id);
		//System.out.println("ctor");
	}
	public Wortel( int posisiXx, int Id){
		super(5,6,posisiXx, 'W');
		//  ArahGerak = _ArahGerak;
		this.Id = Id;
		//rep = 'W';
		assert (Id >0);

		//System.out.println("Power :"+Power+" Usia:"+Usia+"Posisi :"+PosisiX+"Id: "+Id);
		//System.out.println("ctor by parameter");
	}
	/* getter */
	public int getId() {
		return Id;
	}

	public int getUsia() {
		return super.getUsia();
	}

	public int getPosisiX() {
		return super.getPosisiX();
	}

    /*public int getPosisiY() {
        return super.getPosisiY();
    }*/


	public int GetPower() {
		return super.getPower();
	}

	/* setter */
	public void SetPosisiX(int _PosisiX) {
		super.setPosisiX(_PosisiX);
	}

   /* public void SetPosisiY(int _PosisiY) {
        super.setPosisiY();
    }*/


	public void setUsia(int decreaser) {
		super.setUsia(super.getUsia() - decreaser);
	}
	public void Seed(){

	}

	public void kill() {
		System.out.println("Dummy kill, will implement thread to invoke other Makhluk destruct()");
	}

	public void destruct() {
		//only implement death by age
		if (super.getUsia() == 0) {
			// destructor Singa
			System.gc();
			try {

				finalize();
			} catch (Throwable throwable) {
				throwable.printStackTrace();
			}
		}
	}

	public void SetRep(char _rep) {
		if (super.getUsia() <= 0) {
			super.setRep('*');
		}
	}

	public char GetRep() {
		return super.getRep() ;
	}
	/* unit test */

	/*public static void main(String[] args) {
		Makhluk W = new Wortel(2,2,-6);
	}*/


}