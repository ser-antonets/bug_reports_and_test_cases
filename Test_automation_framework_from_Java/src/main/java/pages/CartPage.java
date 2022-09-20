package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage extends BasePage {
    @FindBy(xpath = "//button[@class='btn btn-primary btn-lg btn-block 664']")
    private WebElement buttonProductAddToCart;

    @FindBy(xpath = "//div[@id='cart']//span[@id='cart-total'][contains(text(),'1')]")
    private WebElement cartNumber;

    @FindBy(xpath = "//button[@class='btn-cart dropdown-toggle']")
    private WebElement cartButton;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    private WebElement cartButtonNext;

    @FindBy(xpath = "//h1")
    private WebElement title;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void openCartPage(String url) {
        driver.get(url);
    }

    public void clickButtonProductAddToCart() {
        buttonProductAddToCart.click();
    }

    public boolean isCartNumberVisible() {
        new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfAllElements(cartNumber));
        return cartNumber.isDisplayed();
    }

    public void clickCartButton() {
        cartButton.click();
    }

    public void clickCartButtonNext() {
        new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfAllElements(cartButtonNext));
        cartButtonNext.click();
    }

    public String getTitle() {
        new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfAllElements(title));
        return title.getText();
    }

}
