package com.codeclan.example.topdogs;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Louise on 24/05/2017.
 */
public class TopDogsTest {

    @Test
    public void getListTest() {
        TopDogs topDogs = new TopDogs();
        assertEquals(20, topDogs.getList().size());
    }

}