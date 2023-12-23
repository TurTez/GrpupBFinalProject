package ebay;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases extends WebAPI {

   static EbayHomePage homePageEbay;

    public static void getInitElements(){
        homePageEbay= PageFactory.initElements(driver,EbayHomePage.class);
    }
    @Test (enabled = false)
    public void searchingNikeShoes(){
        getInitElements();
        homePageEbay.searchingNikeShoes();
    }
    @Test (enabled = false)
    public void testCaseNutella(){
        getInitElements();
        homePageEbay.searchNutella();
        Assert.assertEquals(driver.getTitle(),"nutella for sale | eBay");
    }
    @Test (enabled = false)
    public void testCaseCollectablePokemon(){
        getInitElements();
        homePageEbay.clickCollectable();
        homePageEbay.clickPokemon();
        Assert.assertEquals(driver.getTitle(),"Pokémon TCG for sale | eBay" );
    }
    @Test  (enabled = false)
    public void TestCaseSelectingSamsungGlaxyS22(){
        getInitElements();
        homePageEbay.selectSamsungS22Ultra();
        Assert.assertEquals(driver.getTitle(), "samsung galaxy s22 ultra for sale | eBay");
    }
  /*  @Test
    public void testSignInPositive(){
        getInitElements();
        homePageEbay.clickSignIn();
    }*/
    @Test
    public void TestSelectingVideoGame(){
        getInitElements();
        homePageEbay.navigatingToVideoGames();
        Assert.assertEquals(driver.getTitle(),"Nintendo Switch Games for Sale - Shop Switch Video Games - eBay");
    }

}
