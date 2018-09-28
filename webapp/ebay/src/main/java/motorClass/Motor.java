package motorClass;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Motor extends CommonAPI {
    @FindBy(xpath= "//li[@class='hl-cat-nav__js-tab']/a")
    public static WebElement motorIcon;
    public void motorClick(){
        motorIcon.click();
    }

}
