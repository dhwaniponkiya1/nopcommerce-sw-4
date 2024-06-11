package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TopMenuTest extends BaseTest {



    @Test
    public void verifyPageNavigation() throws InterruptedException {
        HomePage homePage = new HomePage();
        List<String> expectedList = Arrays.asList(
                "Computers",
                "Electronics",
                "Apparel",
                "Digital downloads",
                "Books",
                "Jewelry",
                "Gift Cards"
        );
        List<String> actualList = homePage.getHeadingTextFromAllMenu();
        Thread.sleep(3000);
        Assert.assertEquals(actualList,expectedList,"Navigation failed");
    }

}
