package com.michael.learnjava.ch07_Libraries;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class Class1Test {

    @Test
    public void multiplyByTwo() {
        Class2 class2Mock = Mockito.mock(Class2.class);

        Mockito.when(class2Mock.getValue()).thenReturn(5);

        Class1 class1 = new Class1();

        int actualResult = class1.multiplyByTwo(class2Mock);

        Assert.assertEquals(10, actualResult);
    }
}

// Create class3 and class4 and divide by 2
// CLass 3 will have field, constructor, getter and setter, that field has to be an integer
// Class 4 will have the mock object