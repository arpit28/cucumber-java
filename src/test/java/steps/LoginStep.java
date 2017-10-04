package steps;

import base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 40203 on 29/08/2017.
 */
public class LoginStep extends BaseUtil {

    private BaseUtil base;
    private LoginPage page;


    public LoginStep(BaseUtil base) {
        this.base = base;
        this.page = new LoginPage(base.Driver);
    }


    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        System.out.println("Navigate to Login Page -->");
        base.Driver.manage().window().maximize();
        base.Driver.navigate().to("https://oneviewdev.aibtest.ie/release-4.0.1/build-119/#/login");
        base.Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Then("^I should be on the dashboard$")
    public void iShouldBeOnTheDashboard() throws Throwable {
        Assert.assertEquals("Its not displayed", base.Driver.findElement(By.cssSelector("button.findCustomerBtn")).isDisplayed(), true);
    }

    @Then("^I should be on the dashboard fail on purpose$")
    public void iShouldBeOnTheDashboardFailOnPurpose() throws Throwable {
        Assert.assertEquals("Its not displayed", base.Driver.findElement(By.cssSelector("button.findCustomerBtn")).isDisplayed(), false);
    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        page.clickOnLoginButton();
    }


    @When("^I enter the following for Login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {

        /*List<List<String>> data = table.raw();

        System.out.println(data.get(0).get(0));
        System.out.println(data.get(0).get(1));
        System.out.println(data.get(0).get(2));*/

        //Create an arrayList
        List<User> users = new ArrayList<User>();
        //Store all the users
        users = table.asList(User.class);


        for (User user : users) {
            page.Login(user.username, user.password, user.branchname);
        }
    }

    @And("^I enter my password$")
    public void iEnterMyPassword() throws Throwable {
        page.enterPassword("February2017");
        Thread.sleep(5000);
        page.clickOnUnlock();
        Thread.sleep(5000);
    }

    @When("^I enter ([^\"]*) , ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernamePasswordAndBranchname(String userName, String password, String branchName) throws Throwable {
        System.out.println("UserName is : " + userName);
        System.out.println("Password is : " + password);
        System.out.println("BranchName is : " + branchName);
        page.Login(userName, password, branchName);
    }

    @And("^I have started the engagement following customer$")
    public void iHaveStartedTheEngagementFollowingCustomer(DataTable table) throws Throwable {

        page.clickOnBtnFindCustomer();
        Thread.sleep(2000);
        page.clickOnTabNameNDob();
        Thread.sleep(2000);
        List<List<String>> data = table.raw();

        System.out.println(data.get(1).get(0));
        System.out.println(data.get(1).get(1));
        page.enterNameAndDob(data.get(1).get(0), data.get(1).get(1));
        Thread.sleep(2000);
        page.clickSearchResults();
    }

    @And("^I am ready to open a Personal Bank Account$")
    public void iAmReadyToOpenAPersonalBankAccount() throws Throwable {

        WebDriverWait wait = new WebDriverWait(base.Driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(page.btnApplyForProduct));
        Assert.assertEquals("Its not displayed", base.Driver.findElement(By.cssSelector(".btn-card.arrow.customersProductsBtn")).isDisplayed(), true);
        page.clickOnApplyForProduct();
        base.Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);
        Actions click = new Actions(base.Driver);

    }

    @And("^I authenticate the customer$")
    public void iAuthenticateTheCustomer() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        page.authenticateTheCustomer();
    }

    @And("^I follow the steps till Terms and conditions$")
    public void iFollowTheStepsTillTermsAndConditions() throws Throwable {
        page.selectCustomerNeedType("Bank");
        WebDriverWait wait = new WebDriverWait(base.Driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(page.btnNext));
        //Thread.sleep(5000);
        page.clickNext();
        wait.until(ExpectedConditions.elementToBeClickable(page.btnSelectAndApply));
        page.clickOnApply();
    }


    @And("^The customer reads and accepts the Electronic Consent Terms & Conditions document$")
    public void theCustomerReadsAndAcceptsTheElectronicConsentTermsConditionsDocument() throws Throwable {
        page.clickOnElectronicAcceptance();
        WebDriverWait wait = new WebDriverWait(base.Driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(page.btnAcceptTNC));
        page.clickOnAcceptButton();
        Thread.sleep(5000);
    }

    @And("^The customer reads and accepts the Data Protection Notice document$")
    public void theCustomerReadsAndAcceptsTheDataProtectionNoticeDocument() throws Throwable {
        page.clickOnAcceptButton();
    }


    @And("^I start the next step in the process$")
    public void iStartTheNextStepInTheProcess() throws Throwable {
        WebDriverWait wait = new WebDriverWait(base.Driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(page.btnNextPrerequisites));
        Thread.sleep(5000);
        page.clickOnNextPrerequisites();
        Thread.sleep(5000);
    }

    @And("^I confirm customer details$")
    public void iConfirmCustomerDetails() throws Throwable {
        WebDriverWait wait = new WebDriverWait(base.Driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(page.btnNextPrerequisites));
        Thread.sleep(5000);
        page.clickOnNextPrerequisites();
    }

    @And("^I confirm the Account and Debit Card Details$")
    public void iConfirmTheAccountAndDebitCardDetails() throws Throwable {
        Thread.sleep(5000);
        page.clickOnYesCheckBox();
        Thread.sleep(1000);
        page.selectDropDownsAccountsAndDebitCard("Access to Debit Card", "Loan", "1,001 - 5,000");
        Thread.sleep(1000);
        page.clickOnNextPrerequisites();
        Thread.sleep(5000);
    }

    @And("^I select to view the terms and conditions Documents$")
    public void iSelectToViewTheTermsAndConditions() throws Throwable {

        WebDriverWait wait1 = new WebDriverWait(base.Driver, 15);
        wait1.until(ExpectedConditions.elementToBeClickable(page.chkDocumentAcceptance));


        page.clickOnDocumentAcceptance();
        WebDriverWait wait = new WebDriverWait(base.Driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(page.btnAcceptTNC));
        page.clickOnAcceptButton();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(page.btnAcceptTNC));
        page.clickOnAcceptButton();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(page.btnAcceptTNC));
        page.clickOnAcceptButton();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(page.btnAcceptTNC));
        page.clickOnAcceptButton();
        Thread.sleep(5000);

    }

    @And("^The customer reads and accepts the AIB Terms of Business document$")
    public void theCustomerReadsAndAcceptsTheAIBTermsOfBusinessDocument() throws Throwable {

    }

    @And("^The customer reads and accepts the T&C for Current Accounts document$")
    public void theCustomerReadsAndAcceptsTheTCForCurrentAccountsDocument() throws Throwable {

    }

    @And("^The customer reads and accepts the AIB Phone & Internet Banking Terms & Conditions document$")
    public void theCustomerReadsAndAcceptsTheAIBPhoneInternetBankingTermsConditionsDocument() throws Throwable {

    }

    @And("^The customer reads and accepts the Depositor Information Sheet Please Read document$")
    public void theCustomerReadsAndAcceptsTheDepositorInformationSheetPleaseReadDocument() throws Throwable {

    }

    @And("^customer gives electronic consent$")
    public void customerGivesElectronicConsent() throws Throwable {
        Actions actionBuilder = new Actions(base.Driver);
        Action drawAction = actionBuilder.moveToElement(page.signaturePad, 568, 220)
                .click()
                .clickAndHold(page.signaturePad)
                .moveByOffset(120, 120)
                .moveByOffset(60, 70)
                .moveByOffset(-140, 140)
                .release(page.signaturePad)
                .build();

        drawAction.perform();

        page.clickOnConfirmSignature();

    }

    @When("^I try to open the account$")
    public void iTryToOpenTheAccount() throws Throwable {
        WebDriverWait wait1 = new WebDriverWait(base.Driver, 15);
        wait1.until(ExpectedConditions.elementToBeClickable(page.btnOpenAccount));

        page.clickOnOpenAccount();
    }

    @Then("^I should see that the request to open the account was successful$")
    public void iShouldSeeThatTheRequestToOpenTheAccountWasSuccessful() throws Throwable {

        Assert.assertTrue(page.currentAccountOpened.isDisplayed());
        String text = page.currentAccountOpened.getText();
        //Assert.assertTrue(text.matches("[0-9A-Z]{22}"));
        //  Assert.assertThat(text, matchesPattern("/[0-9A-Z]{22}/g"));

        String patternString = "[0-9A-Z]{22}";

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);
        System.out.println("text = " + text);
        System.out.println("lookingAt = " + matcher.lookingAt());
        System.out.println("matches   = " + matcher.matches());
        System.out.println("matcher   = " + matcher);
        System.out.println("matcherToString   = " + matcher.toString());
        Assert.assertThat(text, CoreMatchers.containsString("IE"));
    }


    @And("^I should be informed that the IBAN is IE(\\d+)AIBK(\\d+)$")
    public void iShouldBeInformedThatTheIBANIsIEAIBK(int arg0, int arg1) throws Throwable {

    }

    @And("^I am doing demo$")
    public void iAmDoingDemo() throws Throwable {

    }

    @And("^I am doing demo for ken$")
    public void iAmDoingDemoForKen() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^It is fake$")
    public void itIsFake() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    public class User {
        public String username;
        public String password;
        public String branchname;

        public User(String userName, String passWord, String branchName) {
            username = userName;
            password = passWord;
            branchname = branchName;
        }
    }
}
