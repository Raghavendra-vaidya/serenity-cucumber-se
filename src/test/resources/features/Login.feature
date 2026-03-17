@Login
Feature: Login

  Scenario: Verify login page is loaded and fields are displayed
    Given User launches orangeHRM
    Then Verify login page is loaded and fields are displayed

  Scenario: Verify field validation for username and password
    Given User launches orangeHRM
    Then Click on login button without entering username and password and Verify error message

  Scenario: Verify invalid login password
    Given User launches orangeHRM
    Then Enter invalid password and Verify error message

  Scenario: Verify invalid login username
    Given User launches orangeHRM
    Then Enter invalid username and Verify error message

  Scenario: Verify invalid login username and password both
    Given User launches orangeHRM
    Then Enter invalid username and password and Verify error message

    Scenario: Verify valid login
    Given User launches orangeHRM
    And Enter valid credentials and click on login
    Then Verify dashboard page is displayed
