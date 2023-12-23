package americanAirlines;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases extends WebAPI {

    static AmericanAirlinesHomePage homePageAmericanAirlines;
    public static void getInitElements(){
        homePageAmericanAirlines = PageFactory.initElements(driver, AmericanAirlinesHomePage.class);

        }

        //TestCase1: Manage trip / Check in>> Fill the form >> Click find your trip button
        @Test (enabled = false)
        public void testCase1(){
        getInitElements();
        //homePageAmericanAirlines.manageTripAllMethods();

            homePageAmericanAirlines.manageTripCheckIn();
            homePageAmericanAirlines.inputLastName();
            homePageAmericanAirlines.inputConfirmation();
            homePageAmericanAirlines.clickFindYourTripButton();
           // Assert.
           // homePageAmericanAirlines.validateflytResult();

    }
    /*@Test
    public void testcase2(){
        getInitElements();
        homePageAmericanAirlines.aAdvantageTopNav();
        homePageAmericanAirlines.aAdvantageProgramLink();
    }*/

    @Test (enabled = false)
    public void testCase3(){
        getInitElements();
        homePageAmericanAirlines.bagAnfFees();
        Assert.assertEquals(driver.getTitle(), "Checked bag policy − Travel information − American Airlines");
    }

    @Test
    public void TestCase3(){
        getInitElements();
        homePageAmericanAirlines.refundBagsInfoPageAllMethods();
    }
}
