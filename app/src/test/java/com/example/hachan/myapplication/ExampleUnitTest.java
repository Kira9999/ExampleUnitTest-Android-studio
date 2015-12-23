package com.example.hachan.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    Math mMath = new Math();

    @Test
    public void Char1() throws Exception {
        assertEquals(2, mMath.add(2, 2));
    }


}