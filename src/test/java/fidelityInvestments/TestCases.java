package fidelityInvestments;

import common.WebAPI;
import fidelity.FidelityInvestmentsHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestCases extends WebAPI {

    static FidelityInvestmentsHomePage homeFidelity;

    public static void getInitElements(){
        homeFidelity = PageFactory.initElements(driver, FidelityInvestmentsHomePage.class);

    }

    @Test (enabled = false)
    public void testCase1(){
        getInitElements();
        homeFidelity.accountAndTrade();
        Assert.assertEquals(driver.getTitle(), "Log in to Fidelity");
    }

    @Test (enabled = false)
    public void testCase2(){
        getInitElements();
        homeFidelity.whyFidelity();
        Assert.assertEquals(driver.getTitle(), "The Fidelity Advantage - Why Fidelity");
    }

    @Test (enabled = false)
    public void testCase3(){
        getInitElements();
        homeFidelity.lifeInsuranceInfo();
       // homeFidelity.validateLifeInsuranceInfo();
        /*String actualText = homeFidelity.getYourQuotePageTitle.getText();
        String expectedText = "Get your quote";
        Assert.assertEquals(actualText, expectedText);*/
    }

    @Test (enabled = false)
    public void testCase4(){
        getInitElements();
        homeFidelity.researchAndQuotes();
        Assert.assertEquals(driver.getTitle(),"Stock Research");
    }

    @Test
    public void testCase5(){
        getInitElements();
        homeFidelity.learnToSearch();
    }
}
