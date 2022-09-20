package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CategoryPage extends BasePage {
    public CategoryPage(WebDriver driver) {
        super(driver);
    }

    public void openCategoryPage(String url) {
        driver.get(url);
    }

    @FindBy(xpath = "//span[@class='bf-cell bf-c-2 ']/label[@for='bf-attr-f22_939_93']")
    private WebElement checkBox;

    @FindBy(xpath = "//div[@class='col-xs-12 no-mob']")
    private WebElement products;

    @FindBy(xpath = "//a[contains(text(),' Фільтрувати: ')]")
    private WebElement sort;

    @FindBy(xpath = "//div[@class='dropdown open']//a[contains(text(),'Від дорогих до дешевих')]")
    private WebElement sortMaxToMin;

    @FindBy(xpath = "//div[@class='col-sm-6 col-md-7 c-product-descalt']//div[contains(text(),'Код товару: TLTW-250AT')]")
    private WebElement productsNext;

    public void clickCheckBox() {
        checkBox.click();
    }

    public boolean isProductsVisible() {
        new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfAllElements(products));
        return products.isDisplayed();
    }

    public void clickSort() {
        sort.click();
    }

    public void clickSortMaxToMin() {
        new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfAllElements(sortMaxToMin));
        sortMaxToMin.click();
    }

    public boolean isProductsNextVisible() {
        new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfAllElements(productsNext));
        return productsNext.isDisplayed();
    }

}
