package com.epam.mentoringportal.firsttask;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ComparatorTest {

    private final String EXPECTED_STRING = "Hello";
    private final String ACTUAL_STRING = "Hello";


    @Test(dataProvider = "comparedData")
    public void compareInt(int actual, int expected) {
        Assert.assertEquals(actual, expected, "numbers don't match");
    }

    @Test(dependsOnMethods = "compareInt")
    public void compareString() {
        Assert.assertEquals(ACTUAL_STRING, EXPECTED_STRING, "strings don't match");
    }

    @DataProvider(name = "comparedData")
    public Object[][] intData() {
        return new Object[][]{
                {1, 1},
                {3, 1},
                {4, 4},
                {2, 2}
        };
    }

}
