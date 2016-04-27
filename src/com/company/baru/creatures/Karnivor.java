package com.company.baru.creatures;
public abstract class Karnivor extends Hewan {
	/* methods */
    public Karnivor(){
        super();
    }

    public Karnivor(int powerx, int posisiXx, int usiax, char repx, int arahGerak){
        super(powerx, posisiXx, usiax, repx, arahGerak);
    }

    public abstract void fight();

   /* @Override
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
    }*/
}