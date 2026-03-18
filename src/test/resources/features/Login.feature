@Login
Feature: Login

  Scenario: Verify login page is loaded and fields are displayed
    Given User launches orangeHRM
    Then Verify login page is loaded and fields are displayed

  Scenario: Verify field validation for username and password
    Given User launches orangeHRM
    Then Click on login button without entering username and password and Verify error message

  Scenario Outline: Verify error message for invalid login credentials
    Given User launches orangeHRM
    And Enter username as "<username>" and password as "<password>" and click on login
    Then Verify error message for incorrect username or password

    Examples:
      | username | password |
      | admin    | 123      |
      | abc      | admin123 |
      | a        | a        |

  Scenario: Verify valid user login to the system
    Given User launches orangeHRM
    And Enter username as "admin" and password as "admin123" and click on login
    Then Verify dashboard page is displayed
