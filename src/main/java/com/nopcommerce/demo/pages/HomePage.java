package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends Utility {
    public By topMenu = By.xpath("//ul[@class='top-menu notmobile']/li");
    public By computerMenu = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    public By electronicsMenuLink = By.linkText("Electronics");
    public By cellPhonesMenuLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");

    public void clickOnComputerMenu() {
        clickOnElement(computerMenu);
    }

    public void selectMenu(String menu) {

        List<WebElement> topMenuElements = driver.findElements(topMenu);

        for (WebElement e : topMenuElements) {
            System.out.println("select menu " + e.getText());
            if (e.getText().equalsIgnoreCase(menu)) {
                e.click();
                break;
            }
        }
    }

    public List<String> getHeadingTextFromAllMenu() {
        List<WebElement> topMenuElements = driver.findElements(topMenu);

        List<String> printAllMenuNames = new ArrayList<>();
        for (WebElement e : topMenuElements) {
            printAllMenuNames.add(e.getText());
        }
        List<String> headingList = new ArrayList<>();
        for (int i = 0; i < printAllMenuNames.size(); i++) {
            selectMenu(printAllMenuNames.get(i));
            System.out.println("______"+printAllMenuNames.get(i));
            headingList.add(getTextFromElement(By.xpath("//h1[contains(text(),'" + printAllMenuNames.get(i) + "')]")));
        }

        return headingList;
    }

    public void mouseHoverToElectronics() {
        mouseHoverToElement(electronicsMenuLink);
    }

    public void mouseHoverAndClickToCellPhones() {
        mouseHoverToElementAndClick(cellPhonesMenuLink);
    }

}
