package fidelisCare;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases extends WebAPI {

    static FidelisHomePage homePageFidelis;

    public static void getInitElements(){
        homePageFidelis = PageFactory.initElements(driver, FidelisHomePage.class);
    }

    // TestCase1: Change language English to Espanol
    @Test (enabled = false)
    public void testCase1(){
        getInitElements();
        homePageFidelis.changeLanguageToEspanol();
       // Assert.assertEquals(driver.getTitle(), " Seguro | Fidelis Care");
    }

    //TestCase2: Hover Member Dropdown and click MemberResource, Validate
    @Test (enabled = false)
    public void TestCase2(){
        getInitElements();
        homePageFidelis.mouseHoverMember();
        homePageFidelis.memberButtonClick();
        Assert.assertEquals(driver.getTitle(), "Member");
    }

    //Test3: Click get Coverage and fill ContactMe Form, Summit Form and Validate result
    @Test (enabled = false)
    public void TestCase3(){
        getInitElements();
        homePageFidelis.getCoverageClick();
        homePageFidelis.summitContactMeForm();

        //Assert.assertEquals("");
    }

  /*  Test Case 4: Hover Shop ForPlan and click on About Medicare >> Help Me Find a Plan >>
    Fill the form year and country>> Click on the result "WellCare Fidelis Dual Access>>
    Click to learn more and Validate the result */
    @Test (enabled = false)
    public void TestCase4(){
        getInitElements();
        homePageFidelis.mouseHoverShopForPlan();
        homePageFidelis.aboutMedicareClick();
        homePageFidelis.findPlanClickSearch();
        Assert.assertEquals(driver.getTitle(), "Help Me Find a Plan");
        //homePageFidelis.selectYearDropdown();
        homePageFidelis.selectYourCounty();
        homePageFidelis.welcareFicelisDualAccess();
        homePageFidelis.moreInfoWelcareDualAccess();
        Assert.assertEquals(driver.getTitle(), "Medicare and Dual Advantage");
    }
            /*@Test
            public void TestCase4(){
                getInitElements();
                homePageFidelis.welcareDualAccessPlan();
                Assert.assertEquals(driver.getTitle(), "Medicare and Dual Advantage");

            }*/

    /*Test Case 5: Click on Contact Us Fill the form and chose from drop down menue click on more help
    Validate the result  */
    @Test
    public void testCase5(){
        getInitElements();
        homePageFidelis.contactUs();
        homePageFidelis.inputBoxTellAboutYourself();
        homePageFidelis.inputBoxWhatDoYouNeed();
        homePageFidelis.inputBoxIssue();
        homePageFidelis.needHelp();
        Assert.assertEquals(driver.getTitle(),"Contact Us | Fidelis Care");
    }
}
