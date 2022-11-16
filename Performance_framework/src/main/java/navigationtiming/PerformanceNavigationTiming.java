package navigationtiming;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import pages.BasePage;

import java.io.FileWriter;
import java.util.Map;

import static java.sql.DriverManager.getDriver;

public class PerformanceNavigationTiming extends BasePage {

    public PerformanceNavigationTiming (WebDriver driver) {
        super(driver);
    }

    Map<String, Object> timings = null;

//    private static FileWriter fileWriter;

    private final String javaScriptForPerformance = "var timings = performance.timings || {}; return timings;";

//    public  Map<String, Object> getAllTiming () {
        public void getAllTiming () {

        JavascriptExecutor jsrunner = (JavascriptExecutor) driver;

        timings = (Map<String, Object>) jsrunner.executeScript(javaScriptForPerformance);


//        return timings;

    }


}
