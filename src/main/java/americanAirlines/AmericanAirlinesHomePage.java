package americanAirlines;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static americanAirlines.WebElements.*;

public class AmericanAirlinesHomePage extends WebAPI {

    @FindBy(how = How.XPATH,using = manageTripCheckInXpath)
    public WebElement manageTripCheckIn;

    @FindBy(how = How.XPATH, using = passengerLastNameXpath)
    public WebElement passengerLastName;

    @FindBy(how = How.XPATH, using = confirmationRecordLocatorXpath)
    public WebElement confirmationRecordLocator;

    @FindBy(how = How.XPATH, using = findYourTripXpath)
    public WebElement findYourTripButton;

    @FindBy(how = How.XPATH, using = flightStatuNegativeResultXpath)
    public WebElement negativeFlightSearch;

    /*
    @FindBy(how =How.XPATH, using = aAdvantageXpath)
    public WebElement advantageClick;

    @FindBy(how = How.XPATH, using = aAdvantageProgramXpath)
    public WebElement aAdvantageProgramClick;
    */

    @FindBy(how = How.XPATH, using = bagFeesAndAllowanceXpat)
    public WebElement bagFeesandAllowanceInfoPage;

    @FindBy(how=How.XPATH, using = checkBagPolicyXpath)
    public WebElement checkBackPolicy;

    @FindBy(how = How.XPATH, using = delayOrDemageBagsXpath)
    public WebElement delayOrDamagedBags;

    @FindBy(how=How.XPATH, using =submitAClaimXPath)
    public WebElement submitAClaim;
    @FindBy(how = How.XPATH, using = refundXpath)
    public WebElement refund;



    public void manageTripCheckIn(){
        manageTripCheckIn.click();
    }

    public void inputLastName(){
        passengerLastName.click();
        passengerLastName.sendKeys("Tezir");
    }
    public void inputConfirmation(){
        confirmationRecordLocator.click();
        confirmationRecordLocator.sendKeys("JCQWHF");
    }
    public void clickFindYourTripButton(){
        findYourTripButton.click();
    }

 /*   public void manageTripAllMethods(){
        manageTripCheckIn();
        inputLastName();
        inputConfirmation();
        clickFindYourTripButton();
    }*/

public void validateflytResult(){
    String actualText = negativeFlightSearch.getText();
    String expectedText = "We are unable to retrieve your reservation with the information provided. Please verify your information and re-submit.";
    Assert.assertEquals(actualText,expectedText);
}
/*
public void aAdvantageTopNav(){
    advantageClick.click();
}
public void aAdvantageProgramLink(){
    aAdvantageProgramClick.click();
}
*/
    public void bagAnfFees(){
        bagFeesandAllowanceInfoPage.click();
        checkBackPolicy.click();
    }
    public void delayOrDamageBags(){
        delayOrDamagedBags.click();
    }public void damageBagSubmitClaim(){
        submitAClaim.click();
    }

    public void bagsRefund(){
        refund.click();
    }

    public void refundBagsInfoPageAllMethods(){
        bagFeesandAllowanceInfoPage.click();
        delayOrDamageBags();
        damageBagSubmitClaim();
       // bagsRefund();
       // Assert.assertEquals(driver.getTitle(),"";

    }

}
