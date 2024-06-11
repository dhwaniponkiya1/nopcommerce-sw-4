package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckoutPage extends Utility {
    public By checkoutPageHeading = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    public By checkoutAsGuestButton = By.xpath("//button[normalize-space()='Checkout as Guest']");
    public By firstNameTextBox = By.id("BillingNewAddress_FirstName");
    public By lastNameTextBox = By.id("BillingNewAddress_LastName");
    public By emailTextBox = By.id("BillingNewAddress_Email");
    public By countryDropdown = By.id("BillingNewAddress_CountryId");
    public By stateDropdown = By.id("BillingNewAddress_StateProvinceId");
    public By cityTextBox = By.id("BillingNewAddress_City");
    public By address1TextBox = By.id("BillingNewAddress_Address1");
    public By zipCodeTextBox = By.id("BillingNewAddress_ZipPostalCode");
    public By phoneNumberTextBox = By.id("BillingNewAddress_PhoneNumber");
    public By continueBillingAddressButton = By.xpath("//button[@onclick='if (!window.__cfRLUnblockHandlers) return false; Billing.save()']");
    public By nextDayRadioButton = By.id("shippingoption_1");
    public By radioButton2dayAir = By.id("shippingoption_2");
    public By continueDeliveryButton = By.cssSelector(".button-1.shipping-method-next-step-button");
    public By creditCardRadioButton = By.id("paymentmethod_1");
    public By continueToPaymentButton = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");
    public By creditCardDropdown = By.id("CreditCardType");
    public By cardHolderNameTextBox = By.id("CardholderName");
    public By creditCardNumberTextBox = By.id("CardNumber");
    public By expiryMonthDropdown = By.id("ExpireMonth");
    public By expiryYearDropdown = By.id("ExpireYear");
    public By cardCVVTextBox = By.id("CardCode");
    public By continueToPaymentButton2 = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    public By paymentMethodText = By.xpath("//span[normalize-space()='Credit Card']");
    public By shippingMethodNextDayText = By.xpath("//span[normalize-space()='Next Day Air']");
    public By shippingMethod2ndDayText = By.xpath("//span[normalize-space()='2nd Day Air']");
    public By totalAmountText = By.xpath("//span[@class='value-summary']//strong");
    public By confirmButton = By.xpath("//button[normalize-space()='Confirm']");
    public By thankYouMessage = By.xpath("//h1[normalize-space()='Thank you']");
    public By proceedMessage = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    public By finalContinue = By.xpath("//button[contains(text(),'Continue')]");
    public By welcomeText = By.xpath("//h2[normalize-space()='Welcome to our store']");
    public By logOutLink = By.xpath("//a[normalize-space()='Log out']");



    public String getCheckoutPageHeading() {
        return getTextFromElement(checkoutPageHeading);
    }

    public void clickOnCheckoutAsGuestButton() {
        clickOnElement(checkoutAsGuestButton);
    }

    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameTextBox, firstName);
    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameTextBox, lastName);
    }

    public void enterEmail(String email) {
        sendTextToElement(emailTextBox, email);
    }

    public void selectFromDropdownCountry(String country) {
        selectByVisibleTextFromDropDown(countryDropdown, "India");
    }

    public void selectFromDropdownState(String state) {
        sendTextToElement(stateDropdown, state);
    }

    public void enterCity(String city) {
        sendTextToElement(cityTextBox, "Surat");
    }

    public void enterAddress1(String address1) {
        sendTextToElement(address1TextBox, address1);
    }

    public void enterZipCode(String zipCode) {
        sendTextToElement(zipCodeTextBox, zipCode);
    }

    public void enterPhoneNumber(String phoneNumber) {
        sendTextToElement(phoneNumberTextBox, phoneNumber);
    }

    public void clickOnContinueBillingAddButton() {
        clickOnElement(continueBillingAddressButton);
    }

    public void clickOnNextDayRadioButton() {
        clickOnElement(nextDayRadioButton);
    }

    public void clickOn2dayAirRadioButton() {
        clickOnElement(radioButton2dayAir);
    }

    public void clickOnContinueToDeliveryButton() {
        clickOnElement(continueDeliveryButton);
    }

    public void clickOnCreditCardRadioButton() {
        clickOnElement(creditCardRadioButton);
    }

    public void clickOnContinueToPaymentButton() {
        clickOnElement(continueToPaymentButton);
    }

    public void selectValueFromCreditCardDropdown(String cardType) {
        selectByVisibleTextFromDropDown(creditCardDropdown, cardType);
    }

    public void enterCreditCardNumber(String creditCardNumber) {
        sendTextToElement(creditCardNumberTextBox, creditCardNumber);
    }

    public void enterCardHolderName(String name) {
        sendTextToElement(cardHolderNameTextBox, name);
    }

    public void selectValueFromExpiryMonthDropdown(String month) {
        sendTextToElement(expiryMonthDropdown, month);
    }

    public void selectValueFromExpiryYearDropdown(String year) {
        sendTextToElement(expiryYearDropdown, year);
    }

    public void enterCVV(String cvv) {
        sendTextToElement(cardCVVTextBox, cvv);
    }

    public void clickOnContinueToPaymentButton2() {
        clickOnElement(continueToPaymentButton2);
    }

    public String getPaymentMethodText() {
        return getTextFromElement(paymentMethodText);
    }

    public String getShippingMethodNextDayText() {
        return getTextFromElement(shippingMethodNextDayText);
    }

    public String getShippingMethod2ndDayText() {
        return getTextFromElement(shippingMethod2ndDayText);
    }

    public String getTotalAmountText() {
        return getTextFromElement(totalAmountText);
    }

    public void clickOnConfirmButton() {
        clickOnElement(confirmButton);
    }

    public String getThankYouText() {
        return getTextFromElement(thankYouMessage);
    }

    public String getOrderProceedText() {
        return getTextFromElement(proceedMessage);
    }

    public void clickOnFinalContinue() {
        clickOnElement(finalContinue);
    }

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void clickOnLogoutLink() {
        clickOnElement(logOutLink);
    }
}
