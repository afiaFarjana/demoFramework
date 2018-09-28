package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public static WebDriver driver = null;
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/Users/afia/IdeaProjects/webapp/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        //builder = new Actions(driver);
        //wait = new WebDriverWait(driver,10);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.ebay.com/");
    }
    @AfterMethod
    public void close(){
        driver.close();
    }
}
