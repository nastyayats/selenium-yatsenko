package testlink.pages;

import com.thoughtworks.selenium.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by NastyaY on 20.03.2015.
 */
public class HomePage extends AbstractPage {
    private static final By version = By.xpath("//div[@class='menu_title']/span[contains(text(),'TestLink')]");

    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    public boolean isOpened(){
        switchToTitleBar();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(version));
        return !driver.findElements(version).isEmpty();
    }
}