@regression
Feature: AskOmDch Login Feature
  Background: AskOmDch User Login Common Steps
    Given user is on the homepage
    When user clicks on the account link
    Then user should be navigate to account page

  @smoke
  Scenario: AskOmDch User Login Positive Scenario
    When user uses login credentials "12345" and "12345" and clicks on login button
    Then user should see the account and logout link on top

  @smoke
  Scenario: AskOmDch User Login Negative Scenario
    When user uses login credentials "12345" and "12344" and clicks on login button
    Then user should see unsuccessful error message