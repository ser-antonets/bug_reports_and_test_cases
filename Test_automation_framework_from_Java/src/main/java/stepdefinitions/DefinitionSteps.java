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
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class DefinitionSteps {

    WebDriver driver;
    HomePage homePage;
    SearchPage searchPage;
    ProductPage productPage;
    CartPage cartPage;
    CategoryPage categoryPage;
    PageFactoryManager pageFactoryManager;

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

    @Given("User opens {string} page")
    public void openPage(final String url) {
        homePage = pageFactoryManager.getHomePage();
        homePage.openHomePage(url);
    }

    @When("User checks header")
    public void userChecksHeader() {
        assertTrue(homePage.isHeaderVisible());
    }


    @And("User checks menu")
    public void userChecksMenu() {
        assertTrue(homePage.isMenuVisible());
    }

    @And("User checks content")
    public void userChecksContent() {
        assertTrue(homePage.isContentVisible());
    }

    @Then("User checks footer")
    public void userChecksFooter() {
        assertTrue(homePage.isFootertVisible());
    }

    @When("User  enter a {string} in the search field")
    public void userEnterAInTheSearchField(String arg0) {
        searchPage.search(arg0);
    }

    @And("User sees a list of products")
    public void userSeesAListOfProducts() {
        assertTrue(searchPage.isProductVisible());
    }

    @And("User click a search button")
    public void userClickASearchButton() {
        searchPage.clickSearchButton();
    }

    @Given("User opens {string} search page")
    public void userOpensSearchPage(String url) {
        searchPage = pageFactoryManager.getSearchPage();
        searchPage.openSearchPage(url);
    }

    @Then("User sees the products page")
    public void userSeesTheProductsPage() {
        assertEquals("œŒÿ”  - TLT-235SB-380", searchPage.getTitle());
    }

    @When("User click telephone number")
    public void userClickTelephoneNumber() {
        homePage.clickTelephone();
    }

    @Then("User sees telephone numbers")
    public void userSeesTelephoneNumbers() {
        assertTrue(homePage.isTelephonesVisible());
    }

    @Given("User opens {string} product page")
    public void userOpensProductPage(String url) {
        productPage = pageFactoryManager.getProductPage();
        productPage.openProductPage(url);
    }


    @When("User checks hOne")
    public void userChecksHOne() {
        assertTrue(productPage.isH1Visible());
    }


    @And("User checks article")
    public void userChecksArticle() {
        assertTrue(productPage.isArticleVisible());
    }

    @And("User checks producer")
    public void userChecksProducer() {
        assertTrue(productPage.isProducerVisible());
    }

    @And("User checks price")
    public void userChecksPrice() {
        assertTrue(productPage.isPriceVisible());
    }

    @And("User checks button")
    public void userChecksButton() {
        assertTrue(productPage.isButtonVisible());
    }

    @Then("User checks description")
    public void userChecksDescription() {
        assertTrue(productPage.isDescriptionVisible());
    }

    @When("User click characteristics tab")
    public void userClickCharacteristicsTab() {
        productPage.clickCharacteristics();
    }

    @Then("User sees characteristics")
    public void userSeesCharacteristics() {
        assertTrue(productPage.isCharacteristicsDescriptionVisible());
    }

    @Given("User opens {string} category page")
    public void userOpensCategoryPage(String url) {
        categoryPage = pageFactoryManager.getCategoryPage();
        categoryPage.openCategoryPage(url);
    }


    @When("User click filter")
    public void userClickFilter() {
        categoryPage.clickCheckBox();
    }

    @Then("User sees filtered products")
    public void userSeesFilteredProducts() {
        assertTrue(categoryPage.isProductsVisible());
    }

    @When("User click sort in descending order")
    public void userClickSortInDescendingOrder() {
        categoryPage.clickSort();
        categoryPage.clickSortMaxToMin();
    }

    @Then("User sees sorted products")
    public void userSeesSortedProducts() {
        assertTrue(categoryPage.isProductsNextVisible());
    }

    @Given("User opens {string} cart page")
    public void userOpensCartPage(String url) {
        cartPage = pageFactoryManager.getCartPage();
        cartPage.openCartPage(url);
    }

    @When("User click button cart")
    public void userClickButtonCart() {
        cartPage.clickButtonProductAddToCart();
    }

    @Then("User sees the product has been added to the cart")
    public void userSeesTheProductHasBeenAddedToTheCart() {
        assertTrue(cartPage.isCartNumberVisible());
    }

    @And("User opens cart page")
    public void userOpensCartPage() {
        cartPage.clickCartButton();
    }

    @And("User click button +")
    public void userClickButton() {
        cartPage.clickCartButtonNext();
    }


    @Then("User sees the quantity of the product has changed by two pcs")
    public void userSeesTheQuantityOfTheProductHasChangedByTwoPcs() {
        assertEquals("Œ‘Œ–ÃÀ≈ÕÕﬂ «¿ÃŒ¬À≈ÕÕﬂ", cartPage.getTitle());

    }
}
