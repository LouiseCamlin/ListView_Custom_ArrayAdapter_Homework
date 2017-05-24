package com.codeclan.example.topdogs;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Louise on 24/05/2017.
 */
public class DogTest {

    Dog dog;

    @Before
    public void before() {
        dog = new Dog(35, "Chihuahua", "pupperino");
    }

    @Test
    public void getRankingTest() {
        assertEquals((Integer)35, dog.getRanking());

    }

    @Test
    public void getTitleTest() {
        assertEquals("Chihuahua", dog.getBreed());

    }

    @Test
    public void getYearTest() {
        assertEquals("pupperino", dog.getStatus());

    }

}