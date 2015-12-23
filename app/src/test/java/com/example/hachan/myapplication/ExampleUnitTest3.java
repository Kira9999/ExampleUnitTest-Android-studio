package com.example.hachan.myapplication;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest3 {
    Math mMath = new Math();

    @Test
    public void Char3() throws Exception {
        assertEquals(4, mMath.add(2, 2));
    }


}