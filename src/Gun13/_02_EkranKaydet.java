package Gun13;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.util.List;

public class _02_EkranKaydet extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        MyFunc.Bekle(2);

        //kendine kod yazıyorsun
        driver.findElement(By.name("username")).sendKeys("ismet");
        driver.findElement(By.name("password")).sendKeys("1234");

        WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();

        List<WebElement> errorMsj = driver.findElements(By.xpath("//*[text()='Invalid credentials']"));

        if (errorMsj.size() > 0) { // hata olmuşSA

            System.out.println("hata oldu");

            //ekran kaydet.
            //Actions driverAksiyon=new Actions(driver);
            //JavascriptExecutor js= (JavascriptExecutor) driver;

            TakesScreenshot ts=(TakesScreenshot) driver; //1.Aşama ekran görünütü alma değişkenini tanımladım
            File hafidakiHali=ts.getScreenshotAs(OutputType.FILE); //2.Aşama ekran görüntüsü alındı, hafızada
            //3.Aşama hafızadaki ekran görütüsününü fiziksel dosyaya kaydetmem gerekiyor.
            hafızadaki ekran kaydını, yolunu(path) ini ve ismini verdiğim şu dosyaya kaydet


        }


        BekleVeKapat();
    }


}
