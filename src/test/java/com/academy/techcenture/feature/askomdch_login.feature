@regression
Feature: Askomdch Login Feature
  Background: Askomdch User Login Common Steps
    Given user is on the homepage
    When user clicks on the login link
    Then user should be navigate to login page

  @smoke
  Scenario: Askomdch User Login Positive Scenario
    When user uses login credentials "12345@gmail.com" and "12345" and clicks on login button
    Then user should see my account and logout links on top

  @smoke
  Scenario: Askomdch User Login Negative Scenario
    When user uses login credentials "12345@gmail.com" and "12344" and clicks on login button
    Then user should see error "Login was unsuccessful. Please correct the errors and try again."