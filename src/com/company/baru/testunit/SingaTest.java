package com.company.baru.testunit;

import com.company.baru.creatures.Singa;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dimassaputra on 4/19/16.
 */
public class SingaTest {

    Singa S = new Singa(2,2,1);


    @Test
    public void testgetId() throws Exception {
        System.out.println("Running testgetID");
        assertEquals(1,S.getId());
    }

    @Test
    public void testgetUsia() throws Exception {
        System.out.println("Running testgetUsia");
        assertEquals(8,S.getUsia());
    }

    @Test
    public void testgetPosisiX() throws Exception {
        System.out.println("Running Test getPosisiX");
        assertEquals(2,S.getPosisiX());
    }



    @Test
    public void testgetPower() throws Exception {
        System.out.println("Running test getPower");
        assertEquals(10,S.getPower());
    }

    @Test
    public void testsetPosisiX() throws Exception {
        System.out.println("Running test setPosisiX");
        S.setPosisiX(3);
        assertEquals(3,S.getPosisiX());
    }



    @Test
    public void testsetUsia() throws Exception {
        System.out.println("Running test setUsia");
        S.setUsia(1);
        assertEquals(7,S.getUsia());
    }

    @Test
    public void testMove() throws Exception {
        S.move(2);
        System.out.println(S.getPosisiX());
        assertEquals(4,S.getPosisiX());
    }

}