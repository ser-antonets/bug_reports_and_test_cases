package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends BasePage {
    @FindBy(xpath = "//input[@class='form-control input-lg']")
    private WebElement searchBar;

    @FindBy(xpath = "//span[contains(text(),'TLT-235SB-380')]")
    private WebElement product;

    @FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
    private WebElement buttonSearch;

    @FindBy(xpath = "//h1[contains(text(),'Пошук - tlt-235sb-380')]")
    private WebElement titlePage;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void openSearchPage(String url) {
        driver.get(url);
    }

    public void search(String query) {

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(searchBar)).click();
        searchBar.sendKeys(query);
    }

    public boolean isProductVisible() {
        new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfAllElements(product));
       return product.isDisplayed();
    }

    public void clickSearchButton() { buttonSearch.click(); }

    public String getTitle() {
        return titlePage.getText();
    }








}
