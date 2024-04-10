package com.academy.techcenture.step_definitions;

import com.academy.techcenture.config.ConfigReader;
import com.github.javafaker.Faker;
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
        WebElement storeLink = getDriver().findElement(By.xpath("//a[text()='Store']"));
        Assert.assertTrue("Store link is not displayed", storeLink.isDisplayed());
        storeLink.click();
    }
    @Then("user should be navigate to store page")
    public void user_should_be_navigate_to_store_page() {
        String actualTitle = getDriver().getTitle();
        Assert.assertEquals("Products page titles do not match", actualTitle, "Products – AskOmDch");
        WebElement accountHeader = getDriver().findElement(By.xpath("//*[@id=\"ast-desktop-header\"]/div[1]/div/div/div/div[1]/div/div/div/span/a"));
        Assert.assertTrue("Products Header is not displayed",accountHeader.isDisplayed());
    }
    @When("user clicks on add to cart button")
    public void user_clicks_on_add_to_cart_button() {
        WebElement accountLink = getDriver().findElement(By.xpath("//*[@id=\"main\"]/div/ul/li[1]/div[2]/a[2]"));
        Assert.assertTrue("Add to cart link is not displayed", accountLink.isDisplayed());
        accountLink.click();


    }
    @Then("it adds item to the cart")
    public void it_adds_item_to_the_cart() {
        WebElement viewCartLink = getDriver().findElement(By.xpath("//*[@id=\"main\"]/div/ul/li[1]/div[2]/a[3]"));
        Assert.assertTrue("Item is not added to the cart", viewCartLink.isDisplayed());
        viewCartLink.click();
    }

    @When("user should see proceed to checkout button and click on it")
    public void user_should_see_proceed_to_checkout_button_and_click_on_it() {
        WebElement proceedToCheckoutBtn = getDriver().findElement(By.xpath("//*[@id=\"post-1220\"]/div/div/div/div/div[2]/div/div/a"));
        Assert.assertTrue("Proceed to checkout button is not displayed", proceedToCheckoutBtn.isDisplayed());
        proceedToCheckoutBtn.click();
    }
    @Then("user should adds billing details")
    public void user_should_adds_billing_details() {
    Faker faker = new Faker();
    WebElement firstNameInput = getDriver().findElement(By.id("billing_first_name"));
    firstNameInput.sendKeys(faker.name().firstName());
        WebElement lastNameInput = getDriver().findElement(By.id("billing_last_name"));
        lastNameInput.sendKeys(faker.name().lastName());
        WebElement streetInput = getDriver().findElement(By.id("billing_address_1"));
        streetInput.sendKeys(faker.address().streetAddress());
        WebElement townInput = getDriver().findElement(By.id("billing_city"));
        townInput.sendKeys(faker.address().city());
        WebElement zipInput = getDriver().findElement(By.id("billing_postcode"));
        zipInput.sendKeys(faker.address().zipCode());
        WebElement emailInput = getDriver().findElement(By.id("billing_email"));
        emailInput.sendKeys(faker.internet().emailAddress());


    }
    @When("user clicks on place order button")
    public void user_clicks_on_place_order_button() {
        WebElement placeOrderButton = getDriver().findElement(By.id("place_order"));
        Assert.assertTrue(placeOrderButton.isEnabled());
        placeOrderButton.click();
    }
    @Then("user is done checkout")
    public void user_is_done_checkout() {
        String actualTitle = getDriver().getTitle();
        Assert.assertEquals("Account page titles do not match", actualTitle, "Checkout – AskOmDch");
        WebElement accountHeader = getDriver().findElement(By.xpath("//*[@id=\"post-1221\"]/div/div/div/h1"));
        Assert.assertTrue("Account Header is not displayed",accountHeader.isDisplayed());
    }




}
