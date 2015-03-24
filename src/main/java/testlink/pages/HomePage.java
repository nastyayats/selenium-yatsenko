package testlink.pages;

import com.thoughtworks.selenium.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by NastyaY on 20.03.2015.
 */
public class HomePage {
    protected WebDriver driver;

    private static final By version = By.xpath("//div[@class='menu_title']/span[contains(text(),'TestLink')]");
    private static final By headerFrame = By.name("titlebar");
    private static final By testSpecification = By.xpath("html/body/div[3]/a[3]/img");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isOpened() {
        driver.switchTo().frame(driver.findElement(headerFrame));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(version));
        return !driver.findElements(version).isEmpty();
    }

    public SpecificationPage goToSpecificationPage() {
        driver.findElement(testSpecification);
        return new SpecificationPage(driver);
    }
}