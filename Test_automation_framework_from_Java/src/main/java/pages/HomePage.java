package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//header/div[@class='shadow00 no-mob']")
    private WebElement header;

    @FindBy(xpath = "//aside[@class='col-sm-3 hidden-xs']")
    private WebElement menu;

    @FindBy(xpath = "//div[@class='col-sm-9 no-mob']")
    private WebElement content;

    @FindBy(xpath = "//footer[@class='mf_footer no-mob']")
    private WebElement footer;

    @FindBy(xpath = "//span[@class='hidden-xs hidden-sm']")
    private WebElement telephone;

    @FindBy(xpath = "//a[@class='text-right']/span[contains(text(),'098 304-0-305')]")
    private WebElement telephones;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openHomePage(String url) {
        driver.get(url);
    }

    public boolean isHeaderVisible() {
        return header.isDisplayed();
    }

    public boolean isMenuVisible() {
        return menu.isDisplayed();
    }

    public boolean isContentVisible() {
        return content.isDisplayed();
    }

    public boolean isFootertVisible() {
        return footer.isDisplayed();
    }

    public void clickTelephone() {
        telephone.click();
    }

    public boolean isTelephonesVisible() {
        return telephones.isDisplayed();
    }


}
