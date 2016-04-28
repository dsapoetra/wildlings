package com.company.baru.testunit;

import com.company.baru.creatures.Wortel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dimassaputra on 4/19/16.
 */
public class WortelTest {
    Wortel W = new Wortel(2,1);


    @Test
    public void testgetId() throws Exception {
        System.out.println("Running testgetID");
        assertEquals(1,W.getId());
    }

    @Test
    public void testgetUsia() throws Exception {
        System.out.println("Running testgetUsia");
        assertEquals(6,W.getUsia());
    }

    @Test
    public void testgetPosisiX() throws Exception {
        System.out.println("Running Test getPosisiX");
        assertEquals(2,W.getPosisiX());
    }


    @Test
    public void testgetPower() throws Exception {
        System.out.println("Running test getPower");
        assertEquals(5,W.getPower());
    }

    @Test
    public void testsetPosisiX() throws Exception {
        System.out.println("Running test setPosisiX");
        W.setPosisiX(3);
        assertEquals(3,W.getPosisiX());
    }


    @Test
    public void testsetUsia() throws Exception {
        System.out.println("Running test setUsia");
        W.setUsia(1);
        assertEquals(5,W.getUsia());
    }


    @Test
    public void testgetRep() throws Exception {
        System.out.println("Running test setrep");
        W.setRep('x');
        assertEquals('W',W.getRep());
    }


}