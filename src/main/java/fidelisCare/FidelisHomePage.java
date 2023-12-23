package fidelisCare;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static fidelisCare.WebElements.*;

public class FidelisHomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = languageEspanolXpath)
    public WebElement languageEspanol;

    @FindBy(how = How.XPATH, using = memberXpath)
    public WebElement hoverMember;

    @FindBy(how = How.XPATH, using = memberAndMembersButtonXPath)
    public WebElement clickMemberResources;

    @FindBy(how = How.XPATH,using = getCoverageButtonXpath)
    public WebElement clickGetCoverage;

    // Contact Me Start ___________________________________________
    @FindBy(how = How.ID, using = firstNameContactMeID)
    public WebElement clickFirstName;

    @FindBy(how = How.ID, using = lastNameContactMeID)
    public WebElement clickLastName;
    @FindBy(how = How.ID, using = zipCodeContactMeID)
    public WebElement clickZipCode;

    @FindBy(how = How.ID, using = countyContactMeID)
    public WebElement clickCounty;

    @FindBy(how = How.ID, using = phoneNumberContactMeID)
    public WebElement clickPhoneNumber;

    @FindBy(how= How.ID, using = emailContactMeID)
    public WebElement clickEmail;

    @FindBy(how = How.XPATH, using = contactMeCheckBoxXpath)
    public WebElement clickContactMeCheckBox;

    @FindBy(how = How.XPATH, using = contactMeButtonXpath)
    public WebElement clickContactMeButton;

    @FindBy(how=How.XPATH, using = contactFormSendMessageXpath)
    public WebElement positiveMessage;

    // Contact Me End ___________________________________________

    @FindBy(how = How.XPATH, using = shopForAPlanXpath)
    public WebElement hoverShopForPlan;

    @FindBy(how = How.XPATH, using = aboutMedicareXPath)
    public WebElement clickAboutMedicare;

    @FindBy(how = How.XPATH, using = searchFinaPlanXpath)
    public WebElement clickSearchToFindPlan;

    @FindBy(how = How.XPATH, using = selectYearXpath)
    public WebElement selectYear;

    @FindBy(how = How.XPATH, using =selectCountyXpath)
    public WebElement selectCounty;

    @FindBy(how = How.XPATH, using = selectWellcareFidelisDualAccessXpad)
    public WebElement wellcareFidelisDualAccessClick;
    @FindBy(how = How.XPATH, using = learnMoreAboutThisPlanClcickXpath)
    public WebElement moreInfoWelcareFidelisDualAccess;

    //Contact Us Start________________________________________
    @FindBy(how = How.XPATH, using = contactUsXpath)
    public WebElement contactUsClick;

    @FindBy(how = How.XPATH, using = tellUsAboutYourself)
    public WebElement tellAboutYourselfTextBox;

    @FindBy(how= How.XPATH, using = whatDoYouNeedXpath)
    public WebElement whatDoYouNeedTextBox;

    @FindBy(how=How.XPATH, using = whatSpesificIssueXpath)
    public WebElement issueTextBox;

    @FindBy(how=How.XPATH, using = needMoreHelpXpath)
    public WebElement iNeedMoreHelpButton;



    public void changeLanguageToEspanol(){
        languageEspanol.click();
    }

    public void mouseHoverMember(){
       mouseHover(hoverMember);
    }

    public void memberButtonClick(){
        clickMemberResources.click();
    }

    public void getCoverageClick(){
        clickGetCoverage.click();
    }

    // Contact Me Start ___________________________________________
   public void firstNameTextBoxClick() {
       clickFirstName.click();
       clickFirstName.sendKeys("Tur");
   }
   public void lastNameTextBoxClick(){
       clickLastName.click();
       clickLastName.sendKeys("Tez");
   }
   public void zipCodeTextBozClick(){
        clickZipCode.click();
        clickZipCode.sendKeys("11104");
   }

   public void countyTextBoxClick(){
        selectDropDownByIndex(clickCounty, 41);
   }

   public void phoneNumberTextBoxClick(){
        clickPhoneNumber.click();
        clickPhoneNumber.sendKeys("6315228768");
   }
public void emailTextBoxClick(){
        clickEmail.click();
        clickEmail.sendKeys("tirturget@hotmail.com");
}

public void selectContactMeSelection(){
        clickContactMeCheckBox.click();
}
public void contactMeButtonClick(){
        clickContactMeButton.click();

}

public void summitContactMeForm() {
    firstNameTextBoxClick();
    lastNameTextBoxClick();
    zipCodeTextBozClick();
    countyTextBoxClick();
    phoneNumberTextBoxClick();
    emailTextBoxClick();
    selectContactMeSelection();
    contactMeButtonClick();

    // Contact Me End ___________________________________________
}
public void mouseHoverShopForPlan(){
        mouseHover(hoverShopForPlan);
}
public void aboutMedicareClick(){
        clickAboutMedicare.click();
}

public void findPlanClickSearch(){
        clickSearchToFindPlan.click();
}
/*public void selectYearDropDown(){
        selectYear.click();
        selectDropDownByIndex(selectYear,2024);
}*/
    public void selectYearDropdown(){
        selectDropDownByStringValue(selectYear,"number:2024");
    }
public void selectYourCounty(){
        selectDropDownByStringValue(selectCounty, "Queens");
}
public void welcareFicelisDualAccess(){
        wellcareFidelisDualAccessClick.click();
}

public void moreInfoWelcareDualAccess(){
        moreInfoWelcareFidelisDualAccess.click();
}

/*public void welcareDualAccessPlan(){
        mouseHoverShopForPlan();
        aboutMedicareClick();
        findPlanClickSearch();
        selectYearDropdown();
        selectYourCounty();
        welcareFicelisDualAccess();
        moreInfoWelcareDualAccess();
}*/
    public void contactUs(){
        contactUsClick.click();
    }
    public void inputBoxTellAboutYourself(){
        //tellAboutYourselfTextBox.click();
        selectDropDownByIndex(tellAboutYourselfTextBox, 1);
    }
    public void inputBoxWhatDoYouNeed(){
        selectDropDownByIndex(whatDoYouNeedTextBox, 2);
    }
    public void inputBoxIssue(){
        selectDropDownByIndex(issueTextBox, 3);
    }
    public void needHelp(){
        iNeedMoreHelpButton.click();
    }


}
