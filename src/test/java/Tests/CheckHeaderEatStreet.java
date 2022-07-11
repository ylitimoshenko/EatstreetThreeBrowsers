package Tests;

import ClasesToAll.TestInit;
import Pages.HomePageEatStreet;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckHeaderEatStreet extends TestInit {

    @Test
    public void checkHeaderEatStreet(){
        HomePageEatStreet homePageEatStreet = new HomePageEatStreet(driver);
        openUrl("https://eatstreet.com/");
        homePageEatStreet.takeoutBtn().click();
        homePageEatStreet.deliveryBtn().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("eatstreet"));
        Assert.assertTrue(homePageEatStreet.EnterYourAdressField().isDisplayed());
        Assert.assertTrue(homePageEatStreet.getFedBtn().isDisplayed());
        Assert.assertTrue(homePageEatStreet.singInBtn().isDisplayed());
        Assert.assertTrue(homePageEatStreet.cartBtn().isDisplayed());
    }

    @Test
    public void checkSectionPartnerWithUs(){
        HomePageEatStreet homePageEatStreet =new HomePageEatStreet(driver);
        openUrl("https://eatstreet.com/");
        homePageEatStreet.partnerWithUs().click();

        Assert.assertTrue(homePageEatStreet.btnSectionPartners().get(0).isDisplayed());
        Assert.assertTrue(homePageEatStreet.btnSectionPartners().get(1).isDisplayed());
        Assert.assertTrue(homePageEatStreet.btnSectionPartners().get(2).isDisplayed());
    }

    @Test
    public void checkItemApployNow(){
        HomePageEatStreet homePageEatStreet =new HomePageEatStreet(driver);
        openUrl("https://eatstreet.com/");
        homePageEatStreet.partnerWithUs().click();
        homePageEatStreet.btnSectionPartners().get(1).click();
        homePageEatStreet.apployYourCity().click();
        homePageEatStreet.selectCityInSectionApploy().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("delivery-driver"));
    }

}