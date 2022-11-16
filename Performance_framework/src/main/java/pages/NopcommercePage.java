package pages;

import navigationtiming.PerformanceNavigationTiming;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

public class NopcommercePage extends BasePage {

    PerformanceNavigationTiming performanceNavigationTiming;
    @FindBy(xpath = "//a[contains(text(),'Computers')]")
    private WebElement computers;

    @FindBy(xpath = "//h2[@class='title']/a")
    private WebElement desktops;

    @FindBy(xpath = "//h2[@class='product-title']/a")
    private WebElement computer;


    public NopcommercePage(WebDriver driver) {
        super(driver);
    }

    public void openNopcommercePage(String url) {

        driver.get(url);

        //-----
        Map<String, Object> timings;
        JavascriptExecutor jsrunner = (JavascriptExecutor) driver;

        timings = (Map<String, Object>) jsrunner.executeScript("var timings = performance.timings || {}; return timings;");
        System.out.println("---Start---");

        for(Map.Entry<String, Object> t : timings.entrySet())
        {
            System.out.println(t.getKey() + " " + t.getValue());
        }


        System.out.println("---Finish---");



    }

    public void clickComputers() {
        computers.click();
    }

    public void clickDesktops() {
        desktops.click();
    }

    public void clickComputer() {
        computer.click();
    }





}
