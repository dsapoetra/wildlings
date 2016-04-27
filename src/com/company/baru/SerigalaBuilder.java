package com.company.baru;

import com.company.baru.creatures.Serigala;

/**
 * Created by dimassaputra on 4/26/16.
 */
public class SerigalaBuilder {
    private int power = 90;
    private int posisiX = 0;
    private int usia;
    private char rep;
    private int arahGerak = -1;
    private int id;

    public SerigalaBuilder power(int power) {
        this.power = power;
        return this;
    }

    public SerigalaBuilder posisiX(int posisiX) {
        this.posisiX = posisiX;
        return this;
    }

    public SerigalaBuilder usia(int usia) {
        this.usia = usia;
        return this;
    }

    public SerigalaBuilder rep(char rep) {
        this.rep = rep;
        return this;
    }

    public SerigalaBuilder arahGerak(int arahGerak) {
        this.arahGerak = arahGerak;
        return this;
    }

    public SerigalaBuilder id(int id) {
        this.id = id;
        return this;
    }

    public Serigala build() {
        return new Serigala(posisiX, arahGerak, id);
    }

    public static void main() {
        Serigala serigala = new Serigala(4, 5, 9);
        Serigala newSerigala = new SerigalaBuilder()
                .id(0)
                .arahGerak(1)
                .posisiX(25)
                .build();
        SerigalaBuilder builder = new SerigalaBuilder();
        builder.arahGerak(1).posisiX(10);
        Serigala serigala1 = builder.id(1).build();
        Serigala serigala2 = builder.id(2).build();
        Serigala serigala3 = builder.id(3).build();
    }
}
