@regression
Feature: AskOmDch Place Order Feature

#  @smoke
Scenario: AskOmDch Place Order
Given user is on the home page
When user clicks on the store link
Then user should be navigate to store page
And user should be able to see search button
Then user click on the product
And user click on add to cart button
And user clicks on view cart button
When user should see proceed to checkout button
Then user should adds billing details
When user clicks on place order button
Then user is done checkout


#Then user should be navigate to account page
#And user should be able to see register button
#Then user adds fake username
#And user adds fake email
#And user adds fake password
#When user clicks on register button
#Then user should see success registration message
#When user clicks on logout button
#Then user is on the login page

