package com.nopcommerce.testng.testbase;

import com.nopcommerce.testng.basepage.BasePage;
import com.nopcommerce.testng.browserselector.BrowserSelector;
import com.nopcommerce.testng.loadproperty.LoadProperty;
import org.openqa.selenium.Point;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    String baseUrl = loadProperty.getProperty("baseUrl");

    String browser = loadProperty.getProperty("browser");

    @BeforeMethod(groups ={"regression","smoke","sanity"})
    public void openBrowser(){
        browserSelector.selectBrowser(browser);
        driver.manage().window().setPosition(new Point(-2000, 0));//display into second screen
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @AfterMethod(groups ={"regression","smoke","sanity"})
    public void tearDown(){
        driver.quit();;
    }
}

