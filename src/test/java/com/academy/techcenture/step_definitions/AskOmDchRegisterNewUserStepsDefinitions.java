package com.academy.techcenture.step_definitions;

import com.academy.techcenture.config.ConfigReader;
import com.github.javafaker.Faker;
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

    @Then("user adds fake username")
    public void userAddsFakeUsername() {
        Faker faker = new Faker ();
        WebElement usernameInput = getDriver().findElement(By.id("reg_username"));
        usernameInput.sendKeys(faker.name().username());
    }

    @And("user adds fake email")
    public void userAddsFakeEmail() {
        Faker faker = new Faker ();
        WebElement emailInput = getDriver().findElement(By.id("reg_email"));
        emailInput.sendKeys(faker.internet().emailAddress());
    }

    @And("user adds fake password")
    public void userAddsFakePassword() {
        Faker faker = new Faker ();
        WebElement passwordInput = getDriver().findElement(By.id("reg_password"));
        passwordInput.sendKeys(faker.internet().password());
    }

    @When("user clicks on register button")
    public void user_clicks_on_register_button() {
        WebElement registerButton = getDriver().findElement(By.name("register"));
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

}
