package Gun13;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class _05_ShadowContent extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://www.akakce.com/");
        MyFunc.Bekle(2);

        WebElement shadowWebParent = driver.findElement(By.cssSelector("[class='efilli-layout-tuttur']"));

        SearchContext shadowContent = shadowWebParent.getShadowRoot(); // shadow u aldım

        WebElement kabulBtn = shadowContent.findElement(By.cssSelector("div+div > div+div"));
        System.out.println("kabulBtn.getText() = " + kabulBtn.getText());
        kabulBtn.click();

        BekleVeKapat();
    }


}









