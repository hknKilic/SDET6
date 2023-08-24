package Gun12;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

public class _04_RobotFileUpload extends BaseDriver {

    @Test
    public void Test1() throws AWTException {
        driver.get("http://demo.guru99.com/test/upload/");
        MyFunc.Bekle(2);

        // acceptAll
        WebElement acceptAllFrame=driver.findElement(By.id("gdpr-consent-notice"));
        driver.switchTo().frame(acceptAllFrame);

        List<WebElement> acceptAll=
                wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[text()='Accept All']")));

        if (acceptAll.size() > 0)
            acceptAll.get(0).click();

        /*********************/
//
//
//        Robot robot = new Robot();
//
//        for(int i=0;i<21;i++){
//            robot.keyPress(KeyEvent.VK_TAB);
//            robot.keyRelease(KeyEvent.VK_TAB);
//        }
//
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);



    //   BekleVeKapat();
    }


}
