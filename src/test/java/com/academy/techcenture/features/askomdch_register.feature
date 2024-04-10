@regression
Feature: AskOmDch User Registration Feature

#  @smoke
  Scenario: AskOmDch Register New User
    Given user is on the homepage
    When user clicks on the account link
    Then user should be navigate to account page
    And user should be able to see register button
    Then user adds "Fake" username
    And user adds "fake123@gmail.com" email
    And user adds "Fake123" password
    When user clicks on register button
    Then user should see success registration message
    When user clicks on logout button
    Then user is on the login page
