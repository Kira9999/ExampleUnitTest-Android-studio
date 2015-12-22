package com.example.hachan.myapplication;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {

    private TestClass mTestClass;

    @Before
    public void setCalss() {
        mTestClass = new TestClass(5, 5);

    }

    @Test
    public void test01() throws Exception {

        assertEquals(10, mTestClass.printSum());
    }

    @Test
    public void test02() throws Exception {

        assertEquals(0, mTestClass.printSum());
    }
}