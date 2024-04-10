@regression
Feature: AskOmDch Place Order Feature

Scenario: AskOmDch Place Order
Given user is on the home page
When user clicks on the store link
Then user should be navigate to store page
When user clicks on add to cart button
Then it adds item to the cart
Then user should see proceed to checkout button and click on it
And user should adds billing details
When user clicks on place order button
Then user is done checkout




