package fidelity;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static fidelity.WebElements.*;


public class FidelityInvestmentsHomePage extends WebAPI {

    @FindBy(how = How.XPATH,using = accountsAndTradeXpath)
    public WebElement accountAndTrade;

    @FindBy(how = How.XPATH, using = whyFidelityXpath)
    public WebElement whyFidelity;

    @FindBy(how = How.XPATH, using = fidelityAdvantageXpath)
    public WebElement fidelityAdvantage;

    @FindBy(how = How.XPATH, using = portfolioXpath)
    public WebElement portfolio;

    @FindBy(how = How.XPATH, using = productXpath)
    public WebElement product;

    @FindBy(how = How.XPATH, using =lifeInsuranceXpath)
    public WebElement lifeInsurance;

    @FindBy(how = How.XPATH, using = getYourQuoteXpath)
    public WebElement getYourQuote;

    @FindBy(how = How.XPATH, using = selectStateXpath)
    public WebElement selectState;

    @FindBy(how = How.XPATH, using = selectbirthMonthXpath)
    public WebElement selectBirthMonth;

    @FindBy(how = How.XPATH, using = getYourQuotePageTitleXpath)
    public WebElement getYourQuotePageTitle;

    @FindBy(how = How.XPATH, using = newsAndResearchXpath)
    public WebElement newsAndResearch;

    @FindBy(how = How.XPATH, using = quotesXpath)
    public WebElement quotesToday;

    @FindBy(how = How.XPATH, using = insertCompanyNameTextBoxXpath)
    public WebElement insertCompanyName;
    //____________________________________________________
    @FindBy(how = How.XPATH, using = planingAndAdviceXpath)
    public WebElement planingAndAdvice;
    @FindBy(how = How.XPATH, using = buildingSavingXpath)
    public WebElement buildingAndSaving;

    @FindBy(how = How.XPATH, using = planningForFutureXpath)
    public WebElement planingForFuture;

    @FindBy(how = How.XPATH, using = fiveThingsToReviewXpath)
    public WebElement fiveThingsToReview;

    @FindBy(how = How.XPATH, using = searchXpath)
    public WebElement search;
    @FindBy(how = How.XPATH, using = searchFunctionXpath)
    public WebElement searchFunction;


    public void accountAndTrade(){
        //accountAndTrade.click();
        implicitWait(20);
        mouseHover(accountAndTrade);
        portfolio.click();
       // selectDropDownByStringValue(accountAndTrade, "Bill Pay");
    }

    public void whyFidelity(){
        implicitWait(20);
        mouseHover(whyFidelity);
        fidelityAdvantage.click();
    }

    public void lifeInsuranceInfo(){
        implicitWait(20);
        mouseHover(product);
        lifeInsurance.click();
        getYourQuote.click();
        //selectState.click();
        //selectDropDownByStringValue(selectState, "DE");
       //selectBirthMonth.click();
       //selectDropDownByIndex(selectBirthMonth, 1 );
    }
   /* public void validateLifeInsuranceInfo(){
        String actualText = getYourQuotePageTitle.getText();
        String expectedText = "Get your quote";
        Assert.assertEquals(actualText, expectedText);

    }*/

    public void researchAndQuotes(){
        mouseHover(newsAndResearch);
        quotesToday.click();
        insertCompanyName.click();
        insertCompanyName.sendKeys("uber");

    }
    public void learnToSearch(){
        implicitWait(20);
        mouseHover(planingAndAdvice);
        buildingAndSaving.click();
        planingForFuture.click();
        fiveThingsToReview.click();
        //search.click();
        //searchFunction.click();
        //search.sendKeys("Buy House");
        //search.click();
        Assert.assertEquals(driver.getTitle(), "Financial planning guide: What to review annually | Fidelity");
    }



}
