package com.cydeo.step_definitions;

import com.cydeo.page.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.bouncycastle.asn1.crmf.SinglePubInfo.web;

public class WebtableLogi_StepDefinitions {

    WebTableLoginPage webTableLoginPage=new WebTableLoginPage();
    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        String url = ConfigurationReader.getProperty("web.table.url");
        Driver.getDriver().get(url);

    }
    @When("user enters username {string}")
    public void user_enters_username(String string) {

        webTableLoginPage.inputUsername.sendKeys(string);

    }
    @When("user enters password {string}")
    public void user_enters_password(String string) {

        webTableLoginPage.inputPassword.sendKeys(string);
    }
    @When("user clicks the login button")
    public void user_clicks_the_login_button() {

        webTableLoginPage.loginButton.click();

    }
    @Then("user should see url contains orders")
    public void user_should_see_url_contains_order() {
        BrowserUtils.verifyUrlContains("orders");
    }

    @When("user enters username {string} and password {string} and logins")
    public void userEntersUsernameAndPasswordAndLogins(String username, String password) {

        webTableLoginPage.login(username,password);
    }
}
