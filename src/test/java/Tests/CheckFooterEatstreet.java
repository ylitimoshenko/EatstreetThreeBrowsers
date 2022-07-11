package Tests;

import ClasesToAll.TestInit;
import Pages.HomePageEatStreet;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckFooterEatstreet extends TestInit {

    @Test
    public void checkAboutUs() {
        HomePageEatStreet homePageEatStreet = new HomePageEatStreet(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePageEatStreet.checkAndClousePopUpWindow();
        homePageEatStreet.btnAboutUs().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("about-us"));
    }

    @Test
    public void checkElementsAboutUs() {
        HomePageEatStreet homePageEatStreet = new HomePageEatStreet(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePageEatStreet.checkAndClousePopUpWindow();
        homePageEatStreet.btnAboutUs().click();

        Assert.assertTrue(homePageEatStreet.getAdressInput().isDisplayed());
        Assert.assertTrue(homePageEatStreet.getAdressHeaderInput().isDisplayed());
    }

    @Test
    public void checkElementsMenuAboutUs() {
        HomePageEatStreet homePageEatStreet = new HomePageEatStreet(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePageEatStreet.checkAndClousePopUpWindow();
        homePageEatStreet.btnAboutUs().click();
        homePageEatStreet.getMenuLink().get(2).click();

        Assert.assertEquals(homePageEatStreet.btnShowMore().size(), 2);
    }

    @Test
    public void checkConnectAboutUs() {
        HomePageEatStreet homePageEatStreet = new HomePageEatStreet(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePageEatStreet.checkAndClousePopUpWindow();
        homePageEatStreet.btnAboutUs().click();
        homePageEatStreet.getMenuLink().get(4).click();

        Assert.assertTrue(homePageEatStreet.connectMenu().get(2).isDisplayed());
    }

    @Test
    public void checkBlogAboutUs() {
        HomePageEatStreet homePageEatStreet = new HomePageEatStreet(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePageEatStreet.checkAndClousePopUpWindow();
        homePageEatStreet.btnAboutUs().click();
        homePageEatStreet.getMenuLinkBlog().get(5).click();
        openUrl("https://blog.eatstreet.com/");

        Assert.assertTrue(driver.getCurrentUrl().contains("blog"));
    }
}
