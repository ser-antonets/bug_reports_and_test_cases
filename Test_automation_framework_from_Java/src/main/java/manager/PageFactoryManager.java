package manager;

import org.openqa.selenium.WebDriver;
import pages.*;

public class PageFactoryManager {
    WebDriver driver;

    public PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }
    public HomePage getHomePage() {return new HomePage(driver);}
    public SearchPage getSearchPage() {return new SearchPage(driver);}

    public ProductPage getProductPage() {return new ProductPage(driver);}

    public CartPage getCartPage() {return new CartPage(driver);}

    public CategoryPage getCategoryPage() {return new CategoryPage(driver);}

}
