package com.company.baru;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dimassaputra on 4/19/16.
 */
public class WortelTest {
    Wortel W = new Wortel();

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetId() throws Exception {
        System.out.println("Running testGetID");
        assertEquals(1,W.GetId());
    }

    @Test
    public void testGetUsia() throws Exception {
        System.out.println("Running testGetUsia");
        assertEquals(6,W.GetUsia());
    }

    @Test
    public void testGetPosisiX() throws Exception {
        System.out.println("Running Test GetPosisiX");
        assertEquals(2,W.GetPosisiX());
    }

    @Test
    public void testGetPosisiY() throws Exception {
        System.out.println("Running test GetPosisiY");
        assertEquals(2,W.GetPosisiY());
    }

    @Test
    public void testGetPower() throws Exception {
        System.out.println("Running test GetPower");
        assertEquals(5,W.GetPower());
    }

    @Test
    public void testSetPosisiX() throws Exception {
        System.out.println("Running test SetPosisiX");
        W.SetPosisiX(3);
        assertEquals(3,W.GetPosisiX());
    }

    @Test
    public void testSetPosisiY() throws Exception {
        System.out.println("Running test SetPosisiY");
        W.SetPosisiY(3);
        assertEquals(3,W.GetPosisiY());
    }

    @Test
    public void testSetUsia() throws Exception {
        System.out.println("Running test SetUsia");
        W.SetUsia(1);
        assertEquals(5,W.GetUsia());
    }

    @Test
    public void testSeed() throws Exception {

    }

    @Test
    public void testKill() throws Exception {

    }

    @Test
    public void testDestruct() throws Exception {

    }

    @Test
    public void testSetRep() throws Exception {

    }

    @Test
    public void testGetRep() throws Exception {

    }

    @Test
    public void testSeed1() throws Exception {

    }

    @Test
    public void testGetPosisiX1() throws Exception {

    }

    @Test
    public void testGetPosisiY1() throws Exception {

    }

    @Test
    public void testGetPower1() throws Exception {

    }

    @Test
    public void testGetUsia1() throws Exception {

    }

    @Test
    public void testGetId1() throws Exception {

    }

    @Test
    public void testGetRep1() throws Exception {

    }

    @Test
    public void testSetPosisiX1() throws Exception {

    }

    @Test
    public void testSetPosisiY1() throws Exception {

    }

    @Test
    public void testSetRep1() throws Exception {

    }

    @Test
    public void testKill1() throws Exception {

    }

    @Test
    public void testDestruct1() throws Exception {

    }
}