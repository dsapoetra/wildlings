package com.company.baru.creatures;

/**
 * Class that represent rumput
 * @author dimassaputra
 */

public class Rumput extends Tumbuhan {
    /**
     * id of rumput
     */
    private int id;

    /**
     * Default constructor.
     */
    public Rumput() {
        super();
        id = 1;
    }
    /**
     * Constructor with parameter.
     * Power, usia, rep, is default for Wortel.
     * @param posisiXx int
     * @param id int
     */
    public Rumput(int posisiXx, int id) {
        super(6, 4, posisiXx, 'R');
        this.id = id;
        assert (this.id > 0);
    }


    /**
     * Just to get id.
     * @return int
     */
    public int getId() {
        return id;
    }

    /**
     * Get usia.
     * @return int
     */
    public int getUsia() {
        return super.getUsia();
    }

    /**
     * decrease usia of wortel,
     * as much as decreaser.
     * @param decreaser int
     */
    public void setUsia(int decreaser) {
        super.setUsia(super.getUsia() - decreaser);
    }

    /**
     * Get wortel posisition.
     * @Override
     * @return int
     */
    public int getPosisiX() {
        return super.getPosisiX();
    }

    /**
     * Get power of wortel,
     * Useful for polymorphism.
     * @return int
     */
    public int getPower() {
        return super.getPower();
    }

    /**
     *
     * @param posisiX int.
     *      a new position of one creature,
     */
    public void setPosisiX(int posisiX) {
        super.setPosisiX(posisiX);
    }

    /**
     * seed.
     */
    public void seed() {

    }

    /**
     * kiil.
     */
    public void kill() {
        System.out.println("Dummy kill, will implement thread to invoke other Makhluk destruct()");
    }

    /**
     * destruct.
     */
    public void destruct() {
        //only implement death by age
       /* if (super.getUsia() == 0) {
            // destructor Singa
            System.gc();
            try {

                finalize();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }*/
        setRep('*');
    }

    /**
     *
     * @param rep char
     * new char that will be shown to world,
     */
    public void SetRep(char rep) {
        if (super.getUsia() <= 0) {
            super.setRep(rep);
        }
    }

    /**
     *  get rep of wortel.
     * @return char
     */
    public char getRep() {
        return super.getRep();
    }

}