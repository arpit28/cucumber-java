$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "LoginFeature",
  "description": "This feature deals with the login functionality of the application",
  "id": "loginfeature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3134639184,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login with correct username, password and branch",
  "description": "",
  "id": "loginfeature;login-with-correct-username,-password-and-branch",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I navigate to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter the following for Login",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "branchname"
      ],
      "line": 7
    },
    {
      "cells": [
        "40203",
        "February2017",
        "Lower Baggot Street"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should be on the dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.iNavigateToTheLoginPage()"
});
formatter.result({
  "duration": 2152269489,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iEnterTheFollowingForLogin(DataTable)"
});
formatter.result({
  "duration": 644909321,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iClickLoginButton()"
});
formatter.result({
  "duration": 100513257,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iShouldBeOnTheDashboard()"
});
formatter.result({
  "duration": 517333377,
  "status": "passed"
});
formatter.after({
  "duration": 975987549,
  "status": "passed"
});
formatter.before({
  "duration": 2259045152,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 11,
      "value": "#    Then I should be on the dashboard fail on purpose"
    },
    {
      "line": 12,
      "value": "#"
    },
    {
      "line": 13,
      "value": "#"
    },
    {
      "line": 14,
      "value": "#  Scenario Outline: Login with correct username, password and branch using Scenario outline"
    },
    {
      "line": 15,
      "value": "#    Given I navigate to the login page"
    },
    {
      "line": 16,
      "value": "#    When I enter \u003cusername\u003e , \u003cpassword\u003e and \u003cbranchname\u003e"
    },
    {
      "line": 17,
      "value": "#    And  I click login button"
    },
    {
      "line": 18,
      "value": "#    Then I should be on the dashboard"
    },
    {
      "line": 19,
      "value": "#"
    },
    {
      "line": 20,
      "value": "#    Examples:"
    },
    {
      "line": 21,
      "value": "#      | username | password     | branchname          |"
    },
    {
      "line": 22,
      "value": "#      | 40203    | February2017 | Lower Baggot Street |"
    },
    {
      "line": 23,
      "value": "#      | 53852    | Summer12     | Lower Baggot Street |"
    }
  ],
  "line": 26,
  "name": "Adult ETB customer finishes main process, confirms details and accepts all T\u0026Cs, IBAN \u0026 BIC returned immediately",
  "description": "",
  "id": "loginfeature;adult-etb-customer-finishes-main-process,-confirms-details-and-accepts-all-t\u0026cs,-iban-\u0026-bic-returned-immediately",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "I navigate to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "I enter the following for Login",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "branchname"
      ],
      "line": 29
    },
    {
      "cells": [
        "40203",
        "February2017",
        "Lower Baggot Street"
      ],
      "line": 30
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "I click login button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I should be on the dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "I have started the engagement following customer",
  "rows": [
    {
      "cells": [
        "Customer Name",
        "DOB"
      ],
      "line": 34
    },
    {
      "cells": [
        "Arpit Khurana",
        "28/10/1989"
      ],
      "line": 35
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I am ready to open a Personal Bank Account",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I authenticate the customer",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I follow the steps till Terms and conditions",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "The customer reads and accepts the Electronic Consent Terms \u0026 Conditions document",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "The customer reads and accepts the Data Protection Notice document",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I enter my password",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I start the next step in the process",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I confirm customer details",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I confirm the Account and Debit Card Details",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I start the next step in the process",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "I select to view the terms and conditions Documents",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "customer gives electronic consent",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "I enter my password",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "I try to open the account",
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "I should see that the request to open the account was successful",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.iNavigateToTheLoginPage()"
});
formatter.result({
  "duration": 3107863874,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iEnterTheFollowingForLogin(DataTable)"
});
formatter.result({
  "duration": 439671376,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iClickLoginButton()"
});
formatter.result({
  "duration": 85737045,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iShouldBeOnTheDashboard()"
});
formatter.result({
  "duration": 518889142,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iHaveStartedTheEngagementFollowingCustomer(DataTable)"
});
formatter.result({
  "duration": 8723811487,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iAmReadyToOpenAPersonalBankAccount()"
});
formatter.result({
  "duration": 5705473861,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iAuthenticateTheCustomer()"
});
formatter.result({
  "duration": 151217486,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iFollowTheStepsTillTermsAndConditions()"
});
formatter.result({
  "duration": 6473346853,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.theCustomerReadsAndAcceptsTheElectronicConsentTermsConditionsDocument()"
});
formatter.result({
  "duration": 10054395360,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\".electronicAcceptanceLabel\"}\n  (Session info: chrome\u003d60.0.3112.113)\n  (Driver info: chromedriver\u003d2.30.477700 (0057494ad8732195794a7b32078424f92a5fce41),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 10.04 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027DSK-91HXG62\u0027, ip: \u002710.28.113.160\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_111\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.30.477700 (0057494ad8732195794a7b32078424f92a5fce41), userDataDir\u003dC:\\Users\\40203\\AppData\\Local\\Temp\\scoped_dir10052_19623}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d60.0.3112.113, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: c8bbb73dbe422c1b0f9597275129433b\n*** Element info: {Using\u003dcss selector, value\u003d.electronicAcceptanceLabel}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:671)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:410)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:501)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:430)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:402)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat pages.LoginPage.clickOnElectronicAcceptance(LoginPage.java:136)\r\n\tat steps.LoginStep.theCustomerReadsAndAcceptsTheElectronicConsentTermsConditionsDocument(LoginStep.java:146)\r\n\tat ✽.And The customer reads and accepts the Electronic Consent Terms \u0026 Conditions document(Login.feature:39)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStep.theCustomerReadsAndAcceptsTheDataProtectionNoticeDocument()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStep.iEnterMyPassword()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStep.iStartTheNextStepInTheProcess()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStep.iConfirmCustomerDetails()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStep.iConfirmTheAccountAndDebitCardDetails()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStep.iStartTheNextStepInTheProcess()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStep.iSelectToViewTheTermsAndConditions()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStep.customerGivesElectronicConsent()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStep.iEnterMyPassword()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStep.iTryToOpenTheAccount()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStep.iShouldSeeThatTheRequestToOpenTheAccountWasSuccessful()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 828139607,
  "status": "passed"
});
});