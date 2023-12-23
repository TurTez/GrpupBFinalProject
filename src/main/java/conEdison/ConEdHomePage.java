package conEdison;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.AbstractFindByBuilder;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static conEdison.WebElements.*;

public class ConEdHomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = cleanEnergyWpath)
    public WebElement cleanEnergy;

    @FindBy(how = How.XPATH, using = sustainabilityReportXpath)
    public WebElement sustainabilityReport;

    @FindBy(how = How.XPATH, using = startOrStopServiceXpath)
    public WebElement startOrStopService;

    @FindBy(how = How.XPATH, using = moveServiceXpath)
    public WebElement moveService;

    @FindBy(how = How.XPATH, using = newZipCodeXpath)
    public WebElement newZipCode;

    @FindBy(how = How.XPATH, using =continueButtonXpath)
    public WebElement continueButton;

    @FindBy(how = How.XPATH, using = registerXpath)
    public WebElement register;

    @FindBy(how = How.XPATH, using =firstNameXpath)
    public WebElement insertFirstName;

    @FindBy(how = How.XPATH, using = lastNameXpath)
    public WebElement insertLastName;

    @FindBy(how = How.XPATH, using =emailXpath)
    public WebElement insertEmail;

    @FindBy(how = How.XPATH, using = submitXpath)
    public WebElement submitForm;
    //____________________________________________
    @FindBy(how = How.XPATH, using = stopServiceXpath)
    public WebElement stopService;

    @FindBy(how = How.XPATH, using = noLongerServiceNeededXpath)
    public WebElement noLongerServiceNeed;

    @FindBy(how = How.XPATH, using = stopServiceButtonXpath)
    public WebElement clickStopServiceButton;

    public void sustainabilityHighlights(){
        mouseHover(cleanEnergy);
        //cleanEnergy.click();
        sustainabilityReport.click();

    }

    public void changingServiceAddress(){
        startOrStopService.click();
        moveService.click();
        newZipCode.sendKeys("11104");
        continueButton.click();
     /*   register.click();
        insertFirstName.sendKeys("Tom");
        insertLastName.sendKeys("Reg");
        insertEmail.sendKeys("TomReg@gmail.com");
        submitForm.click();
*/
    }
    public void stopServiceCurrentLocation(){
        startOrStopService.click();
        stopService.click();
        noLongerServiceNeed.click();
        clickStopServiceButton.click();

    }



}
