package com.adidas.pageObjects;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeScreen extends PageObject {
    private WebDriver driver;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Inicio\"]")
    private WebElementFacade titulo;

    @AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/action_bar_burger_icon")
    private WebElementFacade panelButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Buscar por Departamento\")")
    private WebElementFacade departments;

    public HomeScreen(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void checkApp() {
        Assert.assertTrue("El titulo debería aparecer y estar enabled", titulo.isEnabled());
    }

    public void menuButton() {
        panelButton.waitUntilClickable();
        Assert.assertTrue("El botón de inicio debería estar visible", panelButton.isVisible());
        Assert.assertTrue("El botón de inicio debería estar habilitado", panelButton.isEnabled());
        panelButton.click();

    }

    public void searchByDepartments() {
        departments.waitUntilClickable();
        Assert.assertTrue("Buscar por departamento debería estar visible", departments.isVisible());
        Assert.assertTrue("Buscar por departamento debería estar habilitado", departments.isEnabled());
        departments.click();
    }

    public ProductClassesScreen selectDepartment(String option) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement aux = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"" + option + "\"));"));
        wait.until(ExpectedConditions.elementToBeClickable(aux));
        Assert.assertTrue(option + " debería estar visible", aux.isDisplayed());
        Assert.assertTrue(option + "debería estar habilitado", aux.isEnabled());
        aux.click();
        return new ProductClassesScreen(driver);
    }

}
