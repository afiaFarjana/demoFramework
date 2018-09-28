package motor;
import motorClass.Motor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import sun.jvm.hotspot.debugger.Page;

public class MotorTest extends Motor{
    Motor obj = PageFactory.initElements(driver,Motor.class);
    @Test
    public void testMotor(){
        motorClick();
    }
}
