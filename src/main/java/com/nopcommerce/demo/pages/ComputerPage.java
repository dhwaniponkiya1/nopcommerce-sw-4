package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class ComputerPage extends Utility {
    public By dropDownSortByLink = By.id("products-orderby");
    public By menuTitle = By.xpath("//h2[@class='product-title']");
    public By desktopLink = By.xpath("//a[@title='Show products in category Desktops'][normalize-space()='Desktops']");
    public By addToCartButton = By.xpath("//div[@class='buttons']");
    public By addToCartButton1 = By.id("add-to-cart-button-1");
    public By productTitle = By.xpath("//div[@class='product-name']");
    public By dropDownProcessorLink = By.id("product_attribute_1");
    public By dropDownRamLink = By.id("product_attribute_2");
    public By hdd400GBRadio = By.id("product_attribute_3_7");
    public By osVistaPremiumRadio = By.id("product_attribute_4_9");
    public By softwareMicrosoftCheckbox = By.id("product_attribute_5_10");
    public By softwareTotalCommanderCheckbox = By.id("product_attribute_5_12");
    public By priceValueLabel = By.id("price-value-1");
    public By cartMessageBar = By.xpath("//p[@class='content']");
    public By closeButtonOnCartMessage = By.xpath("//span[@title='Close']");
    public By shoppingCartLink = By.xpath("//a[@class='ico-cart']");
    public By goToCartButton = By.xpath("//button[text()='Go to cart']");

    public void selectFromDropDownSortBy(String value){
        selectByVisibleTextFromDropDown(dropDownSortByLink, value);
    }
    public void clickOnDesktopLink() {
        clickOnElement(desktopLink);
    }

    public void clickOnAddToCart(){
        clickOnElement(addToCartButton);
    }

    public void clickOnAddToCart1(){
        clickOnElement(addToCartButton1);
    }

    public String getProductTitle(){
        return getTextFromElement(productTitle);
    }

    public List<String> getProductList(){
        List<WebElement> productList = driver.findElements(menuTitle);
        List<String> originalList = new ArrayList<>();
        for (WebElement element:productList){
            originalList.add(element.getText());
        }
        return originalList;
    }

    public void selectFromDropDownProcessor(String value){
        selectByVisibleTextFromDropDown(dropDownProcessorLink, value);
    }
    public void selectFromDropDownRam(String value){
        selectByVisibleTextFromDropDown(dropDownRamLink, value);
    }

    public void clickOnHDD400GBRadio(){
        clickOnElement(hdd400GBRadio);
    }

    public void clickOnOSVistaPremiumRadio(){
        clickOnElement(osVistaPremiumRadio);
    }

    public void clickOnSoftwareMicrosoftCheckbox(){
        clickOnElement(softwareMicrosoftCheckbox);
    }

    public void clickOnSoftwareTotalCommanderCheckbox(){
        clickOnElement(softwareTotalCommanderCheckbox);
    }

    public String getPriceOfProduct(){
        return getTextFromElement(priceValueLabel);
    }
    public String getCartMessage(){
        return getTextFromElement(cartMessageBar);
    }
    public void clickOnCloseButtonOnCartMessage(){
        clickOnElement(closeButtonOnCartMessage);
    }
    public void mouseHoverOnShoppingCartAndClickOnGoToCart(){
        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(shoppingCartLink)).moveToElement(driver.findElement(goToCartButton)).click().build().perform();
    }

}
