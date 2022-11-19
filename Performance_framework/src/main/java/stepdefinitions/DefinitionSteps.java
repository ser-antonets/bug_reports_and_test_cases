package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.PageFactoryManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;


public class DefinitionSteps {

    WebDriver driver;

    PageFactoryManager pageFactoryManager;

    NopcommercePage nopcommercePage;



    @Before
    public void testsSetUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageFactoryManager = new PageFactoryManager(driver);
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Given("User opens {string} page_")
    public void userOpensPage_(String arg0) {
        nopcommercePage = pageFactoryManager.getNopcommercePage();
        nopcommercePage.openNopcommercePage(arg0);

    }

    @When("User click Computers link")
    public void userClickComputersLink() {
        nopcommercePage.clickComputers();
    }

    @And("User click Desktops link")
    public void userClickDesktopsLink() {
        nopcommercePage.clickDesktops();
    }

    @Then("User clickBuild your own computer link")
    public void userClickBuildYourOwnComputerLink() {
        nopcommercePage.clickComputer();
    }
}
