package com.epam.mentoringportal.fifthtask;

import com.epam.mentoring.annotation.Description;
import com.epam.mentoring.listener.SuiteListener;
import com.epam.mentoring.listener.TestListener;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestListener.class, SuiteListener.class})
public class ColorComparatorTest {

    @Description(description = "compare colors")
    @Test
    public void compareColors(String actualColor, String expectedColor) {
        Assert.assertEquals(actualColor, expectedColor, "colors don't match");
    }

    @DataProvider(name = "colors")
    public Object[][] data() {
        return new Object[][]{
                {"red", "red"},
                {"black", "blake"}
        };
    }

}
