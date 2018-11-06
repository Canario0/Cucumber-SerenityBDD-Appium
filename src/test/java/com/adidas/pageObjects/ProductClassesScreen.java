package com.adidas.pageObjects;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductClassesScreen extends PageObject {
    private WebDriver driver;
    private WebElement productOption;
    public ProductClassesScreen(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void checkProductClasses(String option) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        productOption = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"" + option + "\"));"));
        wait.until(ExpectedConditions.elementToBeClickable(productOption));
        Assert.assertTrue(option + " debería estar visible", productOption.isDisplayed());
        Assert.assertTrue(option + " debería estar habilitada", productOption.isEnabled());
    }

}
