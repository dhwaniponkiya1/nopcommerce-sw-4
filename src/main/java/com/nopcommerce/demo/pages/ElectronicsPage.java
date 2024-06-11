package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {
    CheckoutPage checkoutPage = new CheckoutPage();

    public By listTab = By.xpath("//a[normalize-space()='List']");
    public By cellPhoneHeadingText = By.xpath("//h1[normalize-space()='Cell phones']");
    public By nokiaLumia1020Link = By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");
    public By nokiaLumia1020Text = By.xpath("//h1[normalize-space()='Nokia Lumia 1020']");
    public By priceText = By.id("price-value-20");
    public By qtyBox = By.id("product_enteredQuantity_20");
    public By addToCartButton = By.id("add-to-cart-button-20");
    public By confirmationMessage = By.xpath("//p[@class='content']");
    public By closeButton = By.xpath("//span[@title='Close']");
    public By shoppingCartTab = By.xpath("//span[contains(text(),'Shopping cart')]");
    public By goToCartButton = By.xpath("//button[normalize-space()='Go to cart']");
    public By shoppingCartText = By.xpath("//h1[normalize-space()='Shopping cart']");
    public By qty = By.xpath("//div[@class='product-quantity']//input");
    public By welcomeMessage = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    public By registerTab = By.xpath("//button[normalize-space()='Register']");
    public By registerHeadingText = By.xpath("//h1[normalize-space()='Register']");
    public By maleGenderRadio = By.id("gender-male");
    public By firstName = By.id("FirstName");
    public By lastName = By.id("LastName");
    public By emailId = By.id("Email");
    public By password = By.id("Password");
    public By confirmPassword = By.id("ConfirmPassword");
    public By dateDropdown = By.name("DateOfBirthDay");
    public By monthDropdown = By.name("DateOfBirthMonth");
    public By yearDropdown = By.name("DateOfBirthYear");
    public By registerButton = By.xpath("//button[@id='register-button']");
    public By completeRegistrationText = By.xpath("//div[@class='result']");
    public By continueTab = By.xpath("//a[normalize-space()='Continue']");
    public By continueButton = By.name("save");
    public By continuePaymentNext = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    public By continueDeliveryButton = By.cssSelector(".button-1.shipping-method-next-step-button");
    public By continueToPaymentButton = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");
    public By creditCardDropdown = By.id("CreditCardType");
    public By cardHolderNameTextBox = By.id("CardholderName");
    public By creditCardNumberTextBox = By.id("CardNumber");
    public By expiryMonthDropdown = By.id("ExpireMonth");
    public By expiryYearDropdown = By.id("ExpireYear");
    public By cardCVVTextBox = By.id("CardCode");
    public By continueToPaymentButton2 = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    public By shippingMethodText = By.xpath("//span[normalize-space()='2nd Day Air']");
    public By totalAmountText = By.xpath("//span[@class='value-summary']//strong");
    public By proceedMessage = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    public By finalContinue = By.xpath("//button[contains(text(),'Continue')]");
    public By welcomeText = By.xpath("//h2[normalize-space()='Welcome to our store']");


    public void clickOnListTab() {
        clickOnElement(listTab);
    }

    public String getCellPhoneHeadingText() {
        return getTextFromElement(cellPhoneHeadingText);
    }

    public void clickOnNokiaLumia() {
        clickOnElement(nokiaLumia1020Link);
    }

    public String getNokiaLumia1020Text() {
        return getTextFromElement(nokiaLumia1020Text);
    }

    public String getPriceText() {
        return getTextFromElement(priceText);
    }

    public void clearAndSendText(By by, String value) {
        driver.findElement(by).clear();
        sendTextToElement(by, value);
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCartButton);
    }

    public String getConfirmationMessage() {
        return getTextFromElement(confirmationMessage);
    }

    public void clickOnCloseButton() {
        clickOnElement(closeButton);
    }

    public void mouseHoverAndClickOnShoppingCart() {
        mouseHoverToElementAndClick(shoppingCartTab);
    }

    public void clickOnGoToCartButton() {
        clickOnElement(goToCartButton);
    }

    public String getShoppingCartText() {
        return getTextFromElement(shoppingCartText);
    }

    public String getQtyText() {
        return getTextFromElement(qty);
    }

    public String getWelcomeMessage() {
        return getTextFromElement(welcomeMessage);
    }

    public void clickOnRegisterTab() {
        clickOnElement(registerTab);
    }

    public String getRegisterHeadingText() {
        return getTextFromElement(registerHeadingText);
    }

    public void clickOnMaleGender() {
        clickOnElement(maleGenderRadio);
    }

    public void enterFirstName(String fName) {
        sendTextToElement(firstName, fName);
    }

    public void enterLastName(String lName) {
        sendTextToElement(lastName, lName);
    }

    public void selectDate(String value) {
        selectByVisibleTextFromDropDown(dateDropdown, value);
    }

    public void selectMonth(String value) {
        selectByVisibleTextFromDropDown(monthDropdown, value);
    }

    public void selectYear(String value) {
        selectByVisibleTextFromDropDown(yearDropdown, value);
    }

    public void enterEmail(String email) {
        sendTextToElement(emailId, email);
    }

    public void enterPassword(String pwd) {
        sendTextToElement(password, pwd);
    }

    public void enterConfirmPassword(String cpwd) {
        sendTextToElement(confirmPassword, cpwd);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
    }

    public String getRegistrationSuccessText() {
        return getTextFromElement(completeRegistrationText);
    }

    public void clickOnContinueTab() {
        clickOnElement(continueTab);
    }


}
