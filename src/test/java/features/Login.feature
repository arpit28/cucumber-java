Feature: LoginFeature
  This feature deals with the login functionality of the application

#  Scenario: Login with correct username, password and branch
#    Given I navigate to the login page
#    When I enter the following for Login
#      | username | password     | branchname          |
#      | 40203    | February2017 | Lower Baggot Street |
#    And  I click login button
#    Then I should be on the dashboard
#    Then I should be on the dashboard fail on purpose
#
#
  Scenario Outline: Login with correct username, password and branch using Scenario outline
    Given I navigate to the login page
    When I enter <username> , <password> and <branchname>
    And  I click login button
    Then I should be on the dashboard

    Examples:
      | username | password     | branchname          |
      | 40203    | February2017 | Lower Baggot Street |
      | 53852    | Summer12     | Lower Baggot Street |


  Scenario: Adult ETB customer finishes main process, confirms details and accepts all T&Cs, IBAN & BIC returned immediately
    Given I navigate to the login page
    When I enter the following for Login
      | username | password     | branchname          |
      | 40203    | February2017 | Lower Baggot Street |
    And  I click login button
    Then I should be on the dashboard
    And I have started the engagement following customer
      | Customer Name | DOB        |
      | Arpit Khurana | 28/10/1989 |
    And I am ready to open a Personal Bank Account
    And I authenticate the customer
    And I follow the steps till Terms and conditions
    And The customer reads and accepts the Electronic Consent Terms & Conditions document
    And The customer reads and accepts the Data Protection Notice document
    And I enter my password
    And I start the next step in the process
    And I confirm customer details
    And I confirm the Account and Debit Card Details
    And I start the next step in the process
    And I select to view the terms and conditions Documents
    And customer gives electronic consent
    And I enter my password
    When I try to open the account
    Then I should see that the request to open the account was successful
   








