package com.academy.techcenture.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.academy.techcenture.driver.Driver.getDriver;

public class AskOmDchRegisterNewUserStepsDefinitions {
    @Then("user should be able to see register button")
    public void user_should_be_able_to_see_register_button() {
        WebElement registerBtn = getDriver().findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/h2"));
        Assert.assertTrue(registerBtn.isEnabled());
        registerBtn.click();
    }

    @Then("user adds {string} username")
    public void userAddsUsername(String username) {
        WebElement usernameInput = getDriver().findElement(By.id("Fake"));
        usernameInput.sendKeys(username);
    }

    @And("user adds {string} email")
    public void userAddsEmail(String email) {
        WebElement emailInput = getDriver().findElement(By.id("fake123@gmail.com"));
        emailInput.sendKeys(email);
    }

    @And("user adds {string} password")
    public void userAddsPassword(String password) {
        WebElement passwordInput = getDriver().findElement(By.id("Fake123"));
        passwordInput.sendKeys(password);
    }

    @When("user clicks on register button")
    public void user_clicks_on_register_button() {
        WebElement registerButton = getDriver().findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/h2"));
        Assert.assertTrue(registerButton.isEnabled());
        registerButton.click();

    }

    @Then("user should see success registration message")
    public void user_should_see_success_registration_message() {
        WebElement successMessage = getDriver().findElement(By.xpath("//*[@id=\"post-1235\"]/div/div[2]/div/div[2]/div/p[2]"));
        Assert.assertTrue(successMessage.isDisplayed());
    }

    @When("user clicks on logout button")
    public void user_clicks_on_logout_button() {
        WebElement logoutBtn = getDriver().findElement(By.xpath("//*[@id=\"post-1235\"]/div/div[2]/div/div[2]/div/p[1]/a"));
        Assert.assertTrue(logoutBtn.isEnabled());
        logoutBtn.click();

    }

    @Then("user is on the login page")
    public void user_is_on_the_login_page() {
        String actualTitle = getDriver().getTitle();
        Assert.assertEquals("Login page titles do not match", actualTitle, "askOmDch demo store. Login");
        WebElement loginHeader = getDriver().findElement(By.className("page-title"));
        Assert.assertTrue("Login Header is not displayed",loginHeader.isDisplayed());

    }
}
