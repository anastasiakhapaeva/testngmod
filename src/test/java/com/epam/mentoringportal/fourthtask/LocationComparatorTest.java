package com.epam.mentoringportal.fourthtask;

import com.epam.mentoring.annotation.Description;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LocationComparatorTest {

    private static final String EXPECTED_COUNTRY = "Belarus";
    private static final String EXPECTED_TOWN = "Minsk";

    @Parameters({"country", "town"})
    @Description(description = "compare locations")
    @Test
    public void compareLocations(String country, String town) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(country, EXPECTED_COUNTRY, "countries don't match");
        softAssert.assertEquals(town, EXPECTED_TOWN, "towns don't match");
        softAssert.assertAll();

    }

}
