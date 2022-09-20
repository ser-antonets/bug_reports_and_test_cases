package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends BasePage {
    @FindBy(xpath = "//input[@class='form-control input-lg']")
    private WebElement searchBar;

    @FindBy(xpath = "//h1")
    private WebElement h1;
    @FindBy (xpath = "//table[@class='list-unstyled chars_list']//td[contains(text(),' TLT-235SB-380 ')]")
    private WebElement article;
    @FindBy (xpath = "//table[@class='list-unstyled chars_list']//a[contains(text(),'LAUNCH')]")
    private WebElement producer;
    @FindBy(xpath = "//li[@class='myprice']")
    private WebElement price;
    @FindBy(xpath = "//button[@class='btn btn-primary btn-lg btn-block 664']")
    private WebElement button;
    @FindBy(xpath = "//div[@class='tabss no-mob ']//a[contains(text(),'Опис')]")
    private WebElement description;

    @FindBy (xpath = "//div[@class='tabss no-mob ']//a[contains(text(),'Характеристики')]")
    private WebElement characteristics;

    @FindBy(xpath = "//table[@class=\"table table-striped table-hover\"]//td[contains(text(),'Відстань між стійками')]")
    private WebElement characteristicsDescription;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void openProductPage(String url) {
        driver.get(url);
    }

    public boolean isH1Visible() {
       return h1.isDisplayed();
    }

    public boolean isArticleVisible() {
        return article.isDisplayed();
    }

    public boolean isProducerVisible() {
        return producer.isDisplayed();
    }

    public boolean isPriceVisible() {
        return price.isDisplayed();
    }

    public boolean isButtonVisible() {
        return button.isDisplayed();
    }

    public boolean isDescriptionVisible() {
        return description.isDisplayed();
    }

    public void clickCharacteristics() {
        characteristics.click();
    }

    public boolean isCharacteristicsDescriptionVisible() {
        return characteristicsDescription.isDisplayed();
    }

}
