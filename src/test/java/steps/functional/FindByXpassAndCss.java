package steps.functional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.NoSuchElementException;

/**
 * Created by NastyaY on 17.03.2015.
 */
public class FindByXpassAndCss {

//    protected ThreadLocal<WebDriver> threadDriver = null;
//    public static final String hubUrl = "http://localhost:9999/wd/hub";
    WebDriver driver;

    @BeforeSuite
    public void startDriver() {
        driver = new FirefoxDriver();
    }

    @AfterSuite
    public void stopDriver(){
        driver.quit();
    }

    @Test (expectedExceptions = NoSuchElementException.class)
    public void failsWithoutException(){
        driver.get("http://www.valvesoftware.com/jobs/job_postings.html");

//        try {
            driver.findElement(By.xpath(".//*[contains(@id,'software_enginr')]/div[1]"));
//        } catch (NoSuchElementException e) {
//            e.printStackTrace();
//        }
    }

//    @Test
//    public void firstTest() {
//        driver.get("http://www.valvesoftware.com/jobs/job_postings.html");
//
//        Assert.assertTrue(driver.findElement(By.xpath(".//*[contains(@id,'software_engineer')]/div[1]")).isDisplayed());
//        Assert.assertTrue(driver.findElement(By.cssSelector(".job_position_container[id*='psychologist']")).isDisplayed());
//
//        Assert.assertTrue(driver.findElement(By.cssSelector("#software_engineer_steam")).isDisplayed());
//        Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='psychologist_(research/experimental)']/div[1]")).isDisplayed());
//
//    }
//
    @Test
    public void failsWithException(){
        driver.get("http://www.valvesoftware.com/jobs/job_postings.html");

        Assert.assertTrue(driver.findElement(By.xpath(".//*[contains(@id,'software_enginr')]/div[1]")).isDisplayed());

    }

}
