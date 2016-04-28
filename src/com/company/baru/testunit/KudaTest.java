package com.company.baru.testunit;

import com.company.baru.creatures.Kuda;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dimassaputra on 4/19/16.
 */
public class KudaTest {

    Kuda K = new Kuda(2,2,1);


    @Test
    public void testgetId() throws Exception {
        System.out.println("Running testgetID");
        assertEquals(1,K.getId());
    }

    @Test
    public void testgetUsia() throws Exception {
        System.out.println("Running testgetUsia");
        assertEquals(7,K.getUsia());
    }

    @Test
    public void testgetPosisiX() throws Exception {
        System.out.println("Running Test getPosisiX");
        assertEquals(2,K.getPosisiX());
    }



    @Test
    public void testgetPower() throws Exception {
        System.out.println("Running test getPower");
        assertEquals(7,K.getPower());
    }

    @Test
    public void testsetPosisiX() throws Exception {
        System.out.println("Running test setPosisiX");
        K.setPosisiX(3);
        assertEquals(3,K.getPosisiX());
    }



    @Test
    public void testsetUsia() throws Exception {
        System.out.println("Running test setUsia");
        K.setUsia(1);
        assertEquals(6,K.getUsia());
    }

    @Test
    public void testMove() throws Exception {
        K.move(2);
        assertEquals(4,K.getPosisiX());
    }


}