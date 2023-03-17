package com.upgenix.utilities;

import org.junit.Assert;

import java.util.Set;

public class BrowserUtils {

    public static void switchWindowAndVerify(String expectedInUrl, String expectedTitle) {

        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

        for (String each : allWindowHandles) {

            Driver.getDriver().switchTo().window(each);

            System.out.println("Current URL = " + Driver.getDriver().getCurrentUrl());

            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)) {
                break;
            }

        }
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }

    /*
    This method accepts a String "expectedTitle" and Asserts if it is true
     */

    public static void verifyTitle(String expectedTitle) {

        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
    }

    /**
     * This method will verify if the current URL contains expected value.
     *
     * @param expectedInUrl
     */
    public static void verifyUrlContains(String expectedInUrl) {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedInUrl));

    }

}
