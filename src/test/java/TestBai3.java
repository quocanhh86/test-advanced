import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBai3 {
//    ChromeDriver chromeDriver;
//        @BeforeEach
//        public void setUp(){
//            WebDriverManager.chromedriver().setup();
//            chromeDriver = new ChromeDriver();
//        }
//
//        @Test
//        public void test() throws InterruptedException {
//            chromeDriver.get("https://lamia.com.vn/danh-muc/dam");
//            WebElement btnImage = chromeDriver.findElement(By.xpath("(//i[@class='feather icon icon-shopping-cart'])[3]"));
//            btnImage.click();
//
//            WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(10));
////            Thread.sleep(2000);
//            WebElement inputPhone = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("cus_phone")));
//            inputPhone.sendKeys("0123456389");
//
//            WebElement btnAdd = chromeDriver.findElement(By.xpath("(//button[@type='submit'][contains(text(),'Gửi')])[2]"));
//            btnAdd.click();
//
////            WebElement webElement = chromeDriver.findElement(By.xpath("//*[@id=\"ShoeType\"]"));
////
////            String actualFirstCategory = webElement.getText(); so sánh
////            String expectedFirstCategory = "Formal Shoes";
////            assertEquals(expectedFirstCategory, actualFirstCategory);
//
//        }
}
