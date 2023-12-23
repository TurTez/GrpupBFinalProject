package conEdison;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases extends WebAPI {

    static ConEdHomePage homePageConEd;

    public static void getInitElements(){
        homePageConEd = PageFactory.initElements(driver,ConEdHomePage.class);

    }
    @Test (enabled = false)
    public void testCase1(){
        getInitElements();
        homePageConEd.sustainabilityHighlights();
        Assert.assertEquals(driver.getTitle(),"Our Clean Energy Commitment | Con Edison");
    }
    @Test (enabled = false)
    public void testCase2(){
        getInitElements();
        homePageConEd.changingServiceAddress();
      Assert.assertEquals(driver.getTitle(),"Start, Move, or Stop Service | Con Edison");
    }
    @Test
    public void testCase3(){
        getInitElements();
        homePageConEd.stopServiceCurrentLocation();
        Assert.assertEquals(driver.getTitle(),"Start, Move, or Stop Service | Con Edison");
    }
}
