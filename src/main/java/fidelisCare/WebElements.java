package fidelisCare;

public class WebElements {
    public static final String languageEspanolXpath = "//*[@id=\"header\"]/div[2]/div[1]/div[2]/a[2]";

    public static final String memberXpath = "//*[@id=\"root-1\"]";

    public static final String memberAndMembersButtonXPath = " //*[@id='megamenu']/div[2]/div[1]/section[1]/div/div[1]/div/a";

    public static final String getCoverageButtonXpath = "//a[@class='btn ng-binding btn-primary']";

    // Contact Me Start ___________________________________________

    public static final String firstNameContactMeID = "firstName";
    public static final String lastNameContactMeID = "lastName";
    public static final String zipCodeContactMeID = "zipCode";
    public static final String countyContactMeID = "county";
    public static final String phoneNumberContactMeID = "phoneNumber";
    public static final String emailContactMeID = "email";
    public static final String contactMeCheckBoxXpath = "//label[contains(text(),'By checking this box you are agreeing to have a Fi')]";

    public static final String contactMeButtonXpath = "//button[@type='submit']";

    public static final String contactFormSendMessageXpath = "//*[@id='dnn_ctr17408_ModuleContent']/cm-root/cm-form/div[2]/div/text()";

    // Contact Me End ___________________________________________

    public static final String shopForAPlanXpath =
            "//span[normalize-space()='Shop For a Plan']";

    public static final String aboutMedicareXPath =
            "//a[@href='https://www.fideliscare.org/WellcareMedicare/About-Medicare'][normalize-space()='About Medicare']";
    public static final String searchFinaPlanXpath=
            "//a[@type='button'][normalize-space()='Search']";

    public static final String selectYearXpath = "//select[@id='year']";

    public static final String selectCountyXpath = "//*[@id='county']";

    public static final String selectWellcareFidelisDualAccessXpad =
            " //*[@id='PlanCoverage']/plan-coverage/div[5]/div[1]/div[1]";
    public static final String learnMoreAboutThisPlanClcickXpath =
            "//*[@id='PlanCoverage']/plan-coverage/div[5]/div[1]/div[2]/div[6]/div/a";
    //Contact Us Start________________________________________
    public static final String contactUsXpath = "//span[normalize-space()='Contact Us']";

    public static final String tellUsAboutYourself = "//*[@id=\"TellUsAboutYourselfDropdown\"]";
    public static final String whatDoYouNeedXpath = "//select[@id='HelpWithDropdown']";
    public static final String whatSpesificIssueXpath = "//select[@id='IssueDropdown']";
    public static final String needMoreHelpXpath = "//a[@id='NeedHelp']";




}
