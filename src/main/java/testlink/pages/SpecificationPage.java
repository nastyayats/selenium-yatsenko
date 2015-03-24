package testlink.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by NastyaY on 20.03.2015.
 */
public class SpecificationPage {

    protected WebDriver driver;
    private static final By specificationPageTitle = By.className("ext-gecko ext-gecko3");

    public SpecificationPage(WebDriver driver) {
        this.driver = driver;
    }

    public Boolean isOpened() {
        return !driver.findElements(specificationPageTitle).isEmpty();
    }

}
