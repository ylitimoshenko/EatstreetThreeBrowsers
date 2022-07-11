package Pages;

import ClasesToAll.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePageEatStreet extends BasePage {
    public HomePageEatStreet(WebDriver driver) {
        super(driver);
    }

    public WebElement takeoutBtn() {
        return findElementByXpath("//label[@for='home-checkbox-takeout']");
    }

    public WebElement deliveryBtn() {
        return findElementByXpath("//label[@for='home-checkbox-delivery']");
    }

    public WebElement EnterYourAdressField() {
        return findElementByXpath("//input[@id='input-food-search']");
    }

    public WebElement getFedBtn() {
        return findElementByXpath("//a[@id='find-restaurants']");
    }

    public WebElement singInBtn() {
        return findElementByXpath("//a[@id='menu-signin']");
    }

    public WebElement cartBtn() {
        return findElementByXpath("//a[contains(text(), 'Cart')]");
    }

    public WebElement partnerWithUs() {
        return findElementByXpath("//a[@class='partners-link ng-scope']");
    }

    public List<WebElement> btnSectionPartners() {
        return findElementsByXpath("//a[@class='how-it-works_link']");
    }

    public WebElement adressInput() {
        return findElementByXpath("//input[@id='address-input']");
    }

    public WebElement searchInput() {
        return findElementByXpath("//input[@placeholder='Restaurant name or Type of food']");
    }

    public WebElement apployYourCity() {
        return findElementByXpath("//option[contains(text(), 'Apply in Your City')]");
    }

    public WebElement selectCityInSectionApploy() {
        return findElementByXpath("//option[contains(text(), 'Madison, WI.')]");
    }

    public void checkAndClousePopUpWindow() {
        if (getSearchAttempt().size() > 0) {
            sleep(2);
            getSearchAttempt().get(0).click();
        }
    }

    public List<WebElement> getSearchAttempt() {
        return findElementsByXpath("//button[@class='btn']");
    }

    public WebElement btnAboutUs() {
        return findElementByXpath("//a[contains(text(), 'About Us')]");
    }

    public WebElement getAdressInput() {
        return findElementByXpath("//input[@ng-model='searchParam']");
    }

    public WebElement getAdressHeaderInput() {
        return findElementByXpath("//input[@id='address-input']");
    }

    public List<WebElement> getMenuLink() {
        return findElementsByXpath("//ul[@class='press__nav__list']//button");
    }

    public List<WebElement> btnShowMore() {
        return findElementsByXpath("//button[contains(text(), 'Show More')]");
    }

    public List<WebElement> connectMenu() {
        return findElementsByXpath("//ul[@class='connect__list']/li");
    }

    public List<WebElement> getMenuLinkBlog() {
        return findElementsByXpath("//ul[@class='press__nav__list']//li");
    }
}
