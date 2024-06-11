package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.CartPage;
import com.nopcommerce.demo.pages.CheckoutPage;
import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {
    HomePage homePage = new HomePage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    CartPage cartPage = new CartPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() throws InterruptedException {
        homePage.mouseHoverToElectronics();
        Thread.sleep(3000);
        homePage.mouseHoverAndClickToCellPhones();
        Thread.sleep(3000);
        String expectedText = "Cell phones";
        String actualText = electronicsPage.getCellPhoneHeadingText();
        Assert.assertEquals(actualText, expectedText);

    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        Thread.sleep(3000);
        homePage.mouseHoverToElectronics();
        Thread.sleep(3000);
        homePage.mouseHoverAndClickToCellPhones();
        Thread.sleep(3000);
        String expectedText = "Cell phones";
        String actualText = electronicsPage.getCellPhoneHeadingText();
        Assert.assertEquals(actualText, expectedText);

        electronicsPage.clickOnListTab();
        Thread.sleep(2000);
        electronicsPage.clickOnNokiaLumia();
        expectedText = "Nokia Lumia 1020";
        Assert.assertEquals(electronicsPage.getNokiaLumia1020Text(), expectedText, "Navigation failed");

        expectedText = "$349.00";
        Assert.assertEquals(electronicsPage.getPriceText(), expectedText);

        electronicsPage.clearAndSendText(electronicsPage.qtyBox, "2");
        electronicsPage.clickOnAddToCart();

        expectedText = "The product has been added to your shopping cart";
        actualText = electronicsPage.getConfirmationMessage();
        Assert.assertEquals(actualText, expectedText);

        electronicsPage.clickOnCloseButton();
        electronicsPage.mouseHoverAndClickOnShoppingCart();
        electronicsPage.clickOnGoToCartButton();

        expectedText = "Shopping cart";
        Assert.assertEquals(electronicsPage.getShoppingCartText(), expectedText);

        /*expectedText = "2";
        System.out.println("qty---------"+electronicsPage.getQtyText());
        actualText = electronicsPage.getQtyText();
        Assert.assertEquals(actualText, expectedText);*/

        expectedText = "$698.00";
        Assert.assertEquals(cartPage.getTotalPriceOfProduct(), expectedText);

        cartPage.clickOnAgreeTermsCheckbox();
        cartPage.clickOnCheckoutButton();

        expectedText = "Welcome, Please Sign In!";
        Assert.assertEquals(electronicsPage.getWelcomeMessage(), expectedText);

        electronicsPage.clickOnRegisterTab();
        expectedText = "Register";
        Assert.assertEquals(electronicsPage.getRegisterHeadingText(), expectedText);

        electronicsPage.clickOnMaleGender();
        electronicsPage.enterFirstName("Prime");
        electronicsPage.enterLastName("Testing");
        electronicsPage.selectDate("2");
        electronicsPage.selectMonth("March");
        electronicsPage.selectYear("2001");
        electronicsPage.enterEmail("ptest17@gmail.com");
        electronicsPage.enterPassword("p@111123");
        electronicsPage.enterConfirmPassword("p@111123");
        electronicsPage.clickOnRegisterButton();

        expectedText = "Your registration completed";
        Thread.sleep(2000);
        Assert.assertEquals(electronicsPage.getRegistrationSuccessText(), expectedText);
        electronicsPage.clickOnContinueTab();
        expectedText = "Shopping cart";
        actualText = electronicsPage.getShoppingCartText();
        Assert.assertEquals(actualText, expectedText);

        cartPage.clickOnAgreeTermsCheckbox();
        cartPage.clickOnCheckoutButton();

        Thread.sleep(2000);
        checkoutPage.selectFromDropdownCountry("India");
        checkoutPage.enterCity("Surat");
        checkoutPage.enterAddress1("36, baker st");
        checkoutPage.enterZipCode("ST56S");
        checkoutPage.enterPhoneNumber("9877554412");
        checkoutPage.clickOnContinueBillingAddButton();
        checkoutPage.clickOn2dayAirRadioButton();
        checkoutPage.clickOnContinueToDeliveryButton();
        checkoutPage.clickOnCreditCardRadioButton();
        checkoutPage.clickOnContinueToPaymentButton();
        checkoutPage.selectValueFromCreditCardDropdown("Visa");
        checkoutPage.enterCardHolderName("Prime testing");
        checkoutPage.enterCreditCardNumber("5555 5555 5555 4444");
        checkoutPage.selectValueFromExpiryMonthDropdown("10");
        checkoutPage.selectValueFromExpiryYearDropdown("2029");
        checkoutPage.enterCVV("555");
        checkoutPage.clickOnContinueToPaymentButton2();

        expectedText = "Credit Card";
        actualText = checkoutPage.getPaymentMethodText();
        Assert.assertEquals(actualText, expectedText);

        Thread.sleep(3000);
        expectedText = "2nd Day Air";
        actualText = checkoutPage.getShippingMethod2ndDayText();
        Assert.assertEquals(actualText, expectedText);

        expectedText = "$698.00";
        actualText = checkoutPage.getTotalAmountText();
        Assert.assertEquals(actualText, expectedText);
        checkoutPage.clickOnConfirmButton();

        expectedText = "Thank you";
        actualText = checkoutPage.getThankYouText();
        Assert.assertEquals(actualText, expectedText);

        expectedText = "Your order has been successfully processed!";
        actualText = checkoutPage.getOrderProceedText();
        Assert.assertEquals(actualText, expectedText);

        checkoutPage.clickOnFinalContinue();
        expectedText = "Welcome to our store";
        actualText = checkoutPage.getWelcomeText();
        Assert.assertEquals(actualText, expectedText);

        checkoutPage.clickOnLogoutLink();


    }


}
