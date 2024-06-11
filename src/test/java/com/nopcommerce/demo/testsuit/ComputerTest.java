package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.CartPage;
import com.nopcommerce.demo.pages.CheckoutPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

public class ComputerTest extends BaseTest {
    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    CartPage cartPage = new CartPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Test
    public void verifyProductArrangeInAlphaBeticalOrder() throws InterruptedException {


        homePage.clickOnComputerMenu();
        computerPage.clickOnDesktopLink();
        List<String> expComputerList = computerPage.getProductList();
        Collections.sort(expComputerList, Collections.reverseOrder(String::compareToIgnoreCase));
        computerPage.selectFromDropDownSortBy("Name: Z to A");
        Thread.sleep(3000);
        List<String> actSortedList = computerPage.getProductList();
        Assert.assertEquals(expComputerList, actSortedList);
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        homePage.clickOnComputerMenu();
        computerPage.clickOnDesktopLink();
        computerPage.selectFromDropDownSortBy("Name: A to Z");
        Thread.sleep(2000);
        computerPage.clickOnAddToCart();
        String expectedProductTitle = "Build your own computer";
        String actualProductTitle = computerPage.getProductTitle();
        Assert.assertEquals(actualProductTitle, expectedProductTitle, "Title not displayed");
        computerPage.selectFromDropDownProcessor("2.2 GHz Intel Pentium Dual-Core E2200");
        computerPage.selectFromDropDownRam("8GB [+$60.00]");
        computerPage.clickOnHDD400GBRadio();
        Thread.sleep(2000);
        computerPage.clickOnOSVistaPremiumRadio();
        while (!driver.findElement(computerPage.softwareMicrosoftCheckbox).isSelected())
            computerPage.clickOnSoftwareMicrosoftCheckbox();
        computerPage.clickOnSoftwareTotalCommanderCheckbox();

        Thread.sleep(3000);
        String expectedPrice = "$1,475.00";
        Thread.sleep(3000);
        String actualPrice = computerPage.getPriceOfProduct();
        Assert.assertEquals(actualPrice, expectedPrice, "Price doesn't match");
        computerPage.clickOnAddToCart1();

        String expCartMessage = "The product has been added to your shopping cart";
        String actCartMessage = computerPage.getCartMessage();
        Assert.assertEquals(actCartMessage, expCartMessage);
        computerPage.clickOnCloseButtonOnCartMessage();
        mouseHoverToElement(computerPage.shoppingCartLink);
        clickOnElement(computerPage.goToCartButton);
        String expCartHeading = "Shopping cart";       //verifying heading
        String acCartHeading = cartPage.getCartHeading();
        Assert.assertEquals(expCartHeading, acCartHeading, "Shopping Cart heading is invalid");
        cartPage.clickOnIncreaseQtyButton();            //Increase qty by 2
        expectedPrice = "$2,950.00";
        actualPrice = cartPage.getTotalPriceOfProduct();
        Assert.assertEquals(actualPrice, expectedPrice, "Total price doesn't match");
        cartPage.clickOnAgreeTermsCheckbox();           //Click on checkbox 'I agree with...'
        cartPage.clickOnCheckoutButton();            //Click on checkout button

        String expCheckOutPageHeading = "Welcome, Please Sign In!";
        String actCheckOutPageHeading = checkoutPage.getCheckoutPageHeading();
        Assert.assertEquals(actCheckOutPageHeading, expCheckOutPageHeading);

        checkoutPage.clickOnCheckoutAsGuestButton();            //Click on “CHECKOUT AS GUEST” Tab
        checkoutPage.enterFirstName("Prime");
        checkoutPage.enterLastName("Testing");
        checkoutPage.enterEmail("ptest@gmail.com");
        checkoutPage.selectFromDropdownCountry("India");
        checkoutPage.selectFromDropdownState("Other");
        checkoutPage.enterCity("Surat");
        checkoutPage.enterAddress1("32, vintage street");
        checkoutPage.enterZipCode("232332");
        checkoutPage.enterPhoneNumber("5687897897");
        checkoutPage.clickOnContinueBillingAddButton();

        checkoutPage.clickOnNextDayRadioButton();
        checkoutPage.clickOnContinueToDeliveryButton();
        checkoutPage.clickOnCreditCardRadioButton();
        checkoutPage.clickOnContinueToPaymentButton();
        checkoutPage.selectValueFromCreditCardDropdown("Master card");
        checkoutPage.enterCardHolderName("Prime testing");
        checkoutPage.enterCreditCardNumber("5555 5555 5555 4444");
        checkoutPage.selectValueFromExpiryMonthDropdown("10");
        checkoutPage.selectValueFromExpiryYearDropdown("2029");
        checkoutPage.enterCVV("555");
        checkoutPage.clickOnContinueToPaymentButton2();

        String expectedText = "Credit Card";
        String actualText = checkoutPage.getPaymentMethodText();
        Assert.assertEquals(actualText, expectedText);

        Thread.sleep(3000);
        expectedText = "Next Day Air";
        actualText = checkoutPage.getShippingMethodNextDayText();
        Assert.assertEquals(actualText, expectedText);

        expectedText = "$2,950.00";
        actualText = checkoutPage.getTotalAmountText();
        Assert.assertEquals(actualText, expectedText);
        checkoutPage.clickOnConfirmButton();

        expectedText = "Thank you";
        actualText = checkoutPage.getThankYouText();
        Assert.assertEquals(actualText, expectedText);

        expectedText = "Your order has been successfully processed!";
        actualText = checkoutPage.getOrderProceedText();
        Assert.assertEquals(actualText, expectedText);
        Thread.sleep(2000);
        checkoutPage.clickOnFinalContinue();
        expectedText = "Welcome to our store";
        actualText = checkoutPage.getWelcomeText();
        Assert.assertEquals(actualText, expectedText);

    }
}
