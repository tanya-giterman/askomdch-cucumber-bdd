package com.academy.techcenture.step_definitions;

import com.academy.techcenture.config.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.academy.techcenture.driver.Driver.getDriver;

public class AskOmDchLoginStepsDefintions {
    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
        getDriver().get(ConfigReader.getProperty("url"));
        String actualTitle = getDriver().getTitle();
        Assert.assertEquals("Home page titles do not match", actualTitle, "AskOmDch – Become a Selenium automation expert!");
    }
    @When("user clicks on the account link")
    public void user_clicks_on_the_account_link() {
        WebElement accountLink = getDriver().findElement(By.xpath("//a[text()='Account']"));
        Assert.assertTrue("Account link is not displayed", accountLink.isDisplayed());
        accountLink.click();
    }
    @Then("user should be navigate to account page")
    public void user_should_be_navigate_to_account_page() {
        String actualTitle = getDriver().getTitle();
        Assert.assertEquals("Account page titles do not match", actualTitle, "Account – AskOmDch");
        WebElement accountHeader = getDriver().findElement(By.xpath("/html/body/div/div[1]/div/div/main/article/div/div[1]/div/h1"));
        Assert.assertTrue("Account Header is not displayed",accountHeader.isDisplayed());
    }
    @When("user uses login credentials {string} and {string} and clicks on login button")
    public void user_uses_login_credentials_and_and_clicks_on_login_button(String username, String password) {
        WebElement usernameInput = getDriver().findElement(By.id("username"));
        usernameInput.sendKeys(username);
        WebElement passwordInput = getDriver().findElement(By.id("password"));
        passwordInput.sendKeys(password);

        WebElement loginButton = getDriver().findElement(By.xpath("//button[text()='Log in']"));
        Assert.assertTrue(loginButton.isEnabled());
        loginButton.click();
    }
    @Then("user should see the account and logout link on top")
    public void user_should_see_the_account_and_logout_link_on_top() {
         WebElement logOutLink = getDriver().findElement(By.xpath("//*[@id=\"post-1235\"]/div/div[2]/div/div[2]/div/p[1]/a"));
        Assert.assertTrue(logOutLink.isDisplayed());
    }
    @Then("user should see unsuccessful error message")
    public void user_should_see_unsuccessful_error_message() {
        WebElement error = getDriver().findElement(By.xpath("//*[@id=\"post-1235\"]/div/div[2]/div/div[2]/div[1]/ul/li"));
        Assert.assertTrue(error.isDisplayed());
    }

}
