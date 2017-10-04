package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by 40203 on 04/09/2017.
 */
public class LoginPage {


    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "staff-id")
    public WebElement txtUserName;

    @FindBy(how = How.ID, using = "password")
    public WebElement txtPassword;

    @FindBy(how = How.ID, using = "login-button")
    public WebElement btnLogin;

    @FindBy(how = How.CSS, using = "[name='branch']")
    public WebElement ddBranch;

    public void Login(String staffID, String pass, String branch) {
        txtUserName.sendKeys(staffID);
        txtPassword.sendKeys(pass);
        Select sel = new Select(ddBranch);
        sel.selectByVisibleText(branch);
    }

    public void enterPassword(String pass) {
        txtPassword.sendKeys(pass);
    }

    public void clickOnLoginButton() {
        btnLogin.click();
    }

    @FindBy(how = How.CSS, using = "button.findCustomerBtn")
    public WebElement btnFindCustomer;


    public void clickOnBtnFindCustomer() {
        btnFindCustomer.click();
    }

//    @FindBy(how = How.CLASS_NAME, using = "waves-effect waves-green truncate search-by-name-dob ng-pristine ng-untouched ng-valid ng-not-empty")
//    public WebElement tabNameNDob;

    @FindBy(css = "a.search-by-name-dob")
    public WebElement tabNameNDob;

    public void clickOnTabNameNDob() {
        tabNameNDob.click();
    }

    @FindBy(css = "#name")
    public WebElement txtName;

    @FindBy(css = "#dateOfBirth")
    public WebElement txtDOB;

    @FindBy(css = "#searchCustomerButton")
    public WebElement btnSearch;

    public void enterNameAndDob(String name, String dob) {
        txtName.sendKeys(name);
        txtDOB.sendKeys(dob);
        btnSearch.submit();
    }

    @FindBy(css = "#showSearchResultsBtn")
    public WebElement btnShowResults;

    @FindBy(css = "#searchResults button")
    public WebElement searchResults;

    public void clickSearchResults() throws InterruptedException {
        btnShowResults.click();
        Thread.sleep(2000);
        searchResults.click();
    }

    @FindBy(className = "currentAccountEligibility")
    public WebElement btnApplyForProduct;

    public void clickOnApplyForProduct() {
        btnApplyForProduct.click();
    }

    @FindBy(css = "#authKnown")
    public WebElement btnKnown;

    @FindBy(css = "#submitButtonKnown")
    public WebElement btnAccept;

    public void authenticateTheCustomer() {
        btnKnown.click();
        btnAccept.click();
    }

    @FindBy(css = "#customerNeedType")
    public WebElement ddCustomerNeed;

    public void selectCustomerNeedType(String Need) {
        Select sel = new Select(ddCustomerNeed);
        sel.selectByVisibleText(Need);
    }

    @FindBy(css = "#findSuitableProductsButtton")
    public WebElement btnNext;

    public void clickNext() {
        btnNext.click();
    }

    @FindBy(css = "button.selectAccountAIBPersonalBankAccount")
    public WebElement btnSelectAndApply;

    public void clickOnApply() {
        btnSelectAndApply.click();
    }

    @FindBy(css = ".electronicAcceptanceLabel")
    public WebElement chkElectronicAcceptance;

    public void clickOnElectronicAcceptance() {
        chkElectronicAcceptance.click();
    }

    @FindBy(css = "button.green")
    public WebElement btnAcceptTNC;

    public void clickOnAcceptButton() {
        btnAcceptTNC.click();
    }

    @FindBy(css = "#nextButton")
    public WebElement btnNextPrerequisites;

    public void clickOnNextPrerequisites() {
        btnNextPrerequisites.click();
    }

    @FindBy(css = "#unlockButton")
    public WebElement btnUnlock;

    public void clickOnUnlock() {
        btnUnlock.click();
    }

    @FindBy(css = ".radio")
    public WebElement chkYes;

    public void clickOnYesCheckBox() {
        chkYes.click();
    }

    @FindBy(css = "#accountPurpose")
    public WebElement ddPurposeOfAccount;

    @FindBy(css = "#fundingSource")
    public WebElement ddSourceOfFunds;

    @FindBy(css = "#annualTurnover")
    public WebElement ddAnnualTurnOver;

    public void selectDropDownsAccountsAndDebitCard(String purposeOfAccount, String sourceOfAccount, String annualTurnover) {
        Select sel = new Select(ddPurposeOfAccount);
        Select sel1 = new Select(ddSourceOfFunds);
        Select sel2 = new Select(ddAnnualTurnOver);
        sel.selectByVisibleText(purposeOfAccount);
        sel1.selectByVisibleText(sourceOfAccount);
        sel2.selectByVisibleText(annualTurnover);
    }

    @FindBy(css = "label[for='documentAcceptCheckbox']")
    public WebElement chkDocumentAcceptance;

    public void clickOnDocumentAcceptance() {
        chkDocumentAcceptance.click();
    }

    @FindBy(css = "canvas")
    public WebElement signaturePad;

    @FindBy(css = "#signSignatureButton")
    public WebElement btnConfirmSignature;

    @FindBy(css = "#captureSignatureSaveButton")
    public WebElement btnSaveSignature;

    public void clickOnConfirmSignature() {
        btnConfirmSignature.click();
        btnSaveSignature.click();
    }

    @FindBy(css = "#openAccountButton")
    public WebElement btnOpenAccount;

    public void clickOnOpenAccount() {
        btnOpenAccount.click();
    }

    @FindBy(css = "#createAccountSuccessTitle")
    public WebElement currentAccountOpened;
}
