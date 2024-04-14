package com.michael.learnjava.ch07_Libraries;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class Class3Test {

    @Test
    public void divideByTwo() {
        Class4 class4Mock = Mockito.mock(Class4.class);

        Mockito.when(class4Mock.getValue()).thenReturn(10);

        Class3 class3 = new Class3();

        int actualResult = class3.divideByTwo(class4Mock);

        Assert.assertEquals(5, actualResult);
    }
}