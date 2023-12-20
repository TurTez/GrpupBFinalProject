package ebay;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static ebay.WebElements.*;


public class EbayHomePage extends WebAPI {

    @FindBy(how = How.XPATH,using = inputSearchFieldXpath)
    public WebElement searchFieldWebElement;

    @FindBy(how = How.XPATH,using = submitButtonXpath)
    public WebElement submitButtonWebElement;

    //Collectible / Pokemon
    @FindBy(how = How.XPATH, using = linkCollectiblesXPath)
    public WebElement collectiblesLink;

    @FindBy(how = How.XPATH, using = linkToPokemonXpath)
    public WebElement pokemonLink;

    @FindBy(how = How.XPATH, using = checkBoxUnlockedXpath)
    public WebElement checkBoxUnlocked;

    @FindBy(how = How.XPATH, using = checkBox256Xpath)
    public WebElement checkBox256;

    @FindBy(how = How.XPATH, using = checkboxConditionNewXpath)
    public WebElement conditionNewCheckbox;

    @FindBy(how = How.XPATH, using = selectGalaxyS22Xpath)
    public WebElement samsungGalaxys22;
/*

    //sigin
    @FindBy(how = How.XPATH, using = signInXpath )
    public WebElement signInWebElement;

    //switch Account
    @FindBy(how = How.ID, using = switchAccountId)
    public WebElement switchAccountWebElement;

    //email or username text box
    @FindBy(how = How.ID, using= emailOrUsenameInputBoxId)
    public WebElement insertEmailOrPswWebElement;

    //continue button for sign in
    @FindBy(how = How.ID, using = continueButtonID)
    public WebElement clickContinueButtonWebElement;

    //Password insert Box
    @FindBy(how = How.ID, using = passwordInsertBoxId)
    public WebElement insertPasswordWebElement;

    //Sign in Button
    @FindBy(how = How.ID, using = clickSignInButtonID)
    public WebElement clickSignInButtonWebElement;
*/



    public void inputSearchField(){

        searchFieldWebElement.click();
        searchFieldWebElement.sendKeys("shirts");

    }

    public void inputSearchFieldNutella(){
        searchFieldWebElement.click();
        searchFieldWebElement.sendKeys("nutella");

    }

    public void inputSearchFieldSamsungGalaxys22(){
        searchFieldWebElement.click();
        searchFieldWebElement.sendKeys("samsung galaxy s22 ultra");
    }
    //search click button
    public void submit(){
        submitButtonWebElement.click();
    }
// Combine two methods
    public void searchItem(){
        inputSearchField();
        submit();
    }

    public void searchNutella(){
        inputSearchFieldNutella();
        submit();
    }
    public void getUrl() throws InterruptedException {
        getCurrentUrl();
        Thread.sleep(4000);
    }

    public void clickCollectable(){
        collectiblesLink.click();

    }
    public void clickPokemon(){
        pokemonLink.click();
    }

    public void checkBoxSelectUnlocked(){
        checkBoxUnlocked.click();

    }

    public void checkBoxSelect256(){
        checkBox256.click();

    }
    public void checkBoxNew(){
        conditionNewCheckbox.click();
    }

    public void selectSamsungGalaxyS22(){
        samsungGalaxys22.click();
    }

    public void selectSamsungS22Ultra(){
        inputSearchFieldSamsungGalaxys22();
        submit();
        checkBoxSelectUnlocked();
        checkBoxSelect256();
        checkBoxNew();
        selectSamsungGalaxyS22();

    }


  /*  public void TestCollectiblePokemon(){
        clickCollectable();
        clickPokemon();
    }*/

  /*  public void clickSignIn(){
        signInWebElement.click();
        switchAccountWebElement.click();

    }*/

}
