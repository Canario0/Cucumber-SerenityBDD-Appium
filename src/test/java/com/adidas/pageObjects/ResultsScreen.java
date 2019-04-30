package com.adidas.pageObjects;

import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultsScreen extends PageObject {
    private WebDriver driver;

    public ResultsScreen(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void checkBrand(String brand) {
        WebElement product = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\""+ "de "+ brand + "\"));"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(product));
        Assert.assertTrue("No se ha encontrado un producto con esa marca", product.isDisplayed());
    }
}
