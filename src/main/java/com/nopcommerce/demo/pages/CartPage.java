package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CartPage extends Utility {
    public By shoppingCartHeading = By.xpath("//h1[text()='Shopping cart']");
    public By increaseQtyButton = By.xpath("//div[@class='quantity up']");
    public By totalPriceOfProduct = By.xpath("//span[@class='product-subtotal']");
    public By agreeTermsCheckbox = By.id("termsofservice");
    public By checkoutButton = By.id("checkout");


    public String getCartHeading() {
        return getTextFromElement(shoppingCartHeading);
    }

    public void clickOnIncreaseQtyButton() {
        clickOnElement(increaseQtyButton);
    }

    public String getTotalPriceOfProduct() {
        return getTextFromElement(totalPriceOfProduct);
    }

    public void clickOnAgreeTermsCheckbox() {
        clickOnElement(agreeTermsCheckbox);
    }

    public void clickOnCheckoutButton() {
        clickOnElement(checkoutButton);
    }
}
