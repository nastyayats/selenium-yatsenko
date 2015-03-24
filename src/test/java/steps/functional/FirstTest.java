package steps.functional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by NastyaY on 13.03.2015.
 */
public class FirstTest {

    @DataProvider
    public Object[][] keyWords() {

        return new Object[][] {
                new Object[] {"осциллограф‏", "www.tehencom.com"},
//                new Object[] {"осциллограф‏ы", "www.tehencom.com"},
        };
    }

    @Test(dataProvider = "keyWords")
    public void firstTest(String keyWord, String url){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com.ua/");
        driver.findElement(By.id("lst-ib")).clear();
        driver.findElement(By.id("lst-ib")).sendKeys(keyWord);
        driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
//        String pageNumber = driver.getCurrentUrl();

        for (int i = 2; i < 5; i++){
            driver.findElement(By.tagName("cite")).getText().contains(url);
            driver.findElement(By.xpath(".//*[@id='nav']/tbody/tr/td["+i+"]/a"));
        }
//        driver.quit();
    }
}
