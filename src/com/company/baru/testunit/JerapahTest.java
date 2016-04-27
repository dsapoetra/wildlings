package com.company.baru.testunit;

import com.company.baru.creatures.Jerapah;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

/**
 * Created by dimassaputra on 4/19/16.
 */
public class JerapahTest {

    Jerapah J = new Jerapah(2,2,1);

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testgetId() throws Exception {
        System.out.println("Running testgetID");
        assertEquals(1,J.getId());
    }

    @Test
    public void testgetUsia() throws Exception {
        System.out.println("Running testgetUsia");
        assertEquals(7,J.getUsia());
    }

    @Test
    public void testgetPosisiX() throws Exception {
        System.out.println("Running Test getPosisiX");
        assertEquals(2,J.getPosisiX());
    }



    @Test
    public void testgetPower() throws Exception {
        System.out.println("Running test getPower");
        assertEquals(8,J.getPower());
    }

    @Test
    public void testsetPosisiX() throws Exception {
        System.out.println("Running test setPosisiX");
        J.setPosisiX(3);
        assertEquals(3,J.getPosisiX());
    }



    @Test
    public void testsetUsia() throws Exception {
        System.out.println("Running test setUsia");
        J.setUsia(1);
        assertEquals(6,J.getUsia());
    }

    @Test
    public void testMove() throws Exception {
        J.move(2);
        assertEquals(4,J.getPosisiX());
    }
/*
    @Test
    public void testFight() throws Exception {

    }

    @Test
    public void testGrouping() throws Exception {

    }

    @Test
    public void testKill() throws Exception {

    }

    @Test
    public void testDestruct() throws Exception {

    }

    @Test
    public void testsetRep() throws Exception {

    }

    @Test
    public void testgetRep() throws Exception {

    }*/
}