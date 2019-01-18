package com.epam.mentoringportal.secondtask;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class NameComparatorTest {

    private String actualName;
    private String expectedName;

    @Factory(dataProvider = "names")
    public NameComparatorTest(String actualName, String expectedName) {
        this.actualName = actualName;
        this.expectedName = expectedName;
    }

    @Test
    public void compareNames() {
        Assert.assertEquals(actualName, expectedName, "names don't match");
    }


    @DataProvider(name = "names")
    public static Object[][] data() {
        return new Object[][]{
                {"Alex", "Alex"},
                {"Mary", "Mary"}
        };
    }

}
