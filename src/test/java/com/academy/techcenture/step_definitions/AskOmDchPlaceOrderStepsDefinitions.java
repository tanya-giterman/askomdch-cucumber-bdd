package com.academy.techcenture.step_definitions;

import com.academy.techcenture.config.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.academy.techcenture.driver.Driver.getDriver;

public class AskOmDchPlaceOrderStepsDefinitions {

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        getDriver().get(ConfigReader.getProperty("url"));
        String actualTitle = getDriver().getTitle();
        Assert.assertEquals("Home page titles do not match", actualTitle, "AskOmDch – Become a Selenium automation expert!");
    }

    @When("user clicks on the store link")
    public void user_clicks_on_the_store_link() {
        WebElement accountLink = getDriver().findElement(By.xpath("//a[text()='Account']"));
        Assert.assertTrue("Store link is not displayed", accountLink.isDisplayed());
        accountLink.click();
    }
    @Then("user should be navigate to store page")
    public void user_should_be_navigate_to_store_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should be able to see search button")
    public void user_should_be_able_to_see_search_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user click on the product")
    public void user_click_on_the_product() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user click on add to cart button")
    public void user_click_on_add_to_cart_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user clicks on view cart button")
    public void user_clicks_on_view_cart_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user should see proceed to checkout button")
    public void user_should_see_proceed_to_checkout_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should adds billing details")
    public void user_should_adds_billing_details() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks on place order button")
    public void user_clicks_on_place_order_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user is done checkout")
    public void user_is_done_checkout() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
