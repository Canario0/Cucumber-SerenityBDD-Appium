package com.adidas.customWebDriver;

import io.appium.java_client.android.AndroidDriver;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumDriver implements DriverSource {
    @Override
    public WebDriver newDriver() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
            capabilities.setCapability("deviceName", "ALTEN Galaxy S5");
            capabilities.setCapability("platformVersion", "6.0.1");
            capabilities.setCapability("platformName", System.getProperty("DRIVER_TYPE"));
            capabilities.setCapability("noReset", "true");
            capabilities.setCapability("appPackage", "com.amazon.mShop.android.shopping");
            capabilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");

            return new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}
