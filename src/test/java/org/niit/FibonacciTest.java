package org.niit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    Fibonacci fib = null;
    @Before
    public void setUp(){
        fib = new Fibonacci();
    }

    @Test
    public  void checkFibonacciSeries(){
        int[] fiboseries = fib.fibonacciNumber(10);
        int[] expected = {0,1,1,2,3,5,8,13,21,34,};
        assertArrayEquals(expected,fiboseries);
    }

    @After
    public void tearDown(){
        fib = null;
    }
}
