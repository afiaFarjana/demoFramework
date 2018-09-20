package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class AmazonTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/afia/my-app-java/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.geico.com/");
        //driver.findElement(By.cssSelector(".login header-right-label open")).sendKeys(Keys.ENTER);
        WebElement information = ((ChromeDriver) driver).findElementByCssSelector("ul.desktop-links > li:nth-child(2)>a");
        information.click();
        //driver.quit();
    }
}
