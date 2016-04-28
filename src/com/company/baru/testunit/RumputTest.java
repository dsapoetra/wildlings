package com.company.baru.testunit;

import com.company.baru.creatures.Rumput;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dimassaputra on 4/19/16.
 */
public class RumputTest {

    Rumput R = new Rumput(2,1);


    @Test
    public void testgetId() throws Exception {
        System.out.println("Running testgetID");
        assertEquals(1,R.getId());
    }

    @Test
    public void testgetUsia() throws Exception {
        System.out.println("Running testgetUsia");
        assertEquals(4,R.getUsia());
    }

    @Test
    public void testgetPosisiX() throws Exception {
        System.out.println("Running Test getPosisiX");
        assertEquals(2,R.getPosisiX());
    }


    @Test
    public void testgetPower() throws Exception {
        System.out.println("Running test getPower");
        assertEquals(6,R.getPower());
    }

    @Test
    public void testsetPosisiX() throws Exception {
        System.out.println("Running test setPosisiX");
        R.setPosisiX(3);
        assertEquals(3,R.getPosisiX());
    }


    @Test
    public void testsetUsia() throws Exception {
        System.out.println("Running test setUsia");
        R.setUsia(1);
        assertEquals(3,R.getUsia());
    }


    @Test
    public void testgetRep() throws Exception {
        System.out.println("Running test setrep");
        //R.setRep('x');
        assertEquals('R',R.getRep());
    }

}