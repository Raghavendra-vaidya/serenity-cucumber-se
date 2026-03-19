@Login
Feature: Login module of OrangeHRM application

  @TC_LOGIN_01
  Scenario: Verify login page is loaded and fields are displayed
    Given User launches orangeHRM
    Then Verify login page is loaded and fields are displayed

  @TC_LOGIN_02
  Scenario: Verify field validation for username and password
    Given User launches orangeHRM
    Then Click on login button without entering username and password and Verify error message

  @TC_LOGIN_03, @TC_LOGIN_04, @TC_LOGIN_05
  Scenario Outline: Verify error message for invalid login credentials
    Given User launches orangeHRM
    And Enter username as "<username>" and password as "<password>" and click on login
    Then Verify error message for incorrect username or password

    Examples:
      | username | password |
      | admin    | 123      |
      | abc      | admin123 |
      | a        | a        |

  @TC_LOGIN_06
  Scenario: Verify valid user login to the system
    Given User launches orangeHRM
    And Enter username as "admin" and password as "admin123" and click on login
    Then Verify dashboard page is displayed
