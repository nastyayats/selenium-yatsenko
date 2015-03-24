package testlink.models;

import org.fluttercode.datafactory.impl.DataFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.xml.datatype.DatatypeFactory;
import java.util.Random;

/**
 * Created by NastyaY on 20.03.2015.
 */
//public class TestSuite {
//
//    protected WebDriver driver;
//
//    private static final By actionsButton = By.xpath("html/body/div[1]/img");
//    private static final By actionsOpened = By.xpath(".//*[@id='name']");
//    private static final By createTestSuiteOpened = By.cssSelector("h1.title#Create Test Suite");
//    private static final By addTestSuite = By.id("new_testsuite");
//    private static final By nameField = By.xpath(".//*[@id='name']");
//    private static final By createButton = By.xpath(".//*[@id='container_new']/div/div[8]/input[1]");
//    private static final By frameMainFrame = By.xpath("");
//
//    public void openActionsMenu() {
//        if (!driver.findElement(actionsOpened).isDisplayed()) {
//            driver.findElement(actionsButton).click();
//        }
//    }
//
//
//    public Boolean createTestSuite() {
//        driver.findElement(addTestSuite).click();
//        driver.findElement(createTestSuiteOpened).isDisplayed();
//        String testSuiteName = new DataFactory().getRandomWord();
//        // TODO verify that there is no test suite with the same name in the project
//        driver.findElement(nameField).sendKeys(testSuiteName);
//        driver.findElement(createButton).click();
//        return true;
//    }
//
//    public void findAndSelectTestSuite(){
////        driver.switchTo().frame(driver.findElement(frame));
//
//        driver.switchTo().defaultContent();
//        driver.switchTo().frame(find(frameMainFrame));
//        driver.switchTo().frame(find(frameWorkFrame));
//
//        driver.findElement(By.id("tree_div").findElement("/span"))
//
//    }
//}
