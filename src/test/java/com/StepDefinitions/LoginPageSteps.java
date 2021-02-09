package com.StepDefinitions;

import org.testng.Assert;

import com.Factory.DriverFactory;
import com.PageObjects.LoginPageObjects;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	
	LoginPageObjects loginPage = new LoginPageObjects(DriverFactory.getDriver());

    @Given("^user is on the login page$")
    public void user_is_on_the_login_page() {
    	DriverFactory.getDriver().get("http://demo.guru99.com/v4/");
        
    }
    
    @When("^user gets the title of the page$")
    public void user_gets_the_title_of_the_page() {
    	String title = loginPage.pageTitle();
    	System.out.println(title); 	
       
    }

    @When("^user enters username \"([^\"]*)\" in the username field$")
    public void user_enters_username_something_in_the_username_field(String userID) {
        loginPage.enterUserID(userID);
    }

    @Then("^user gets the title of the home page$")
    public void user_gets_the_title_of_the_home_page() {
    	String title = loginPage.pageTitle();
    	System.out.println(title);
    }

    @And("^user enters password \"([^\"]*)\" in the password field$")
    public void user_enters_password_something_in_the_password_field(String password) {
        loginPage.enterPassword(password);
    }

    @And("^user clicks on the \"([^\"]*)\" button$")
    public void user_clicks_on_the_something_button(String button) {
        loginPage.clickLogin(button);
    }

    @Then("^the title of the page should be \"([^\"]*)\"$")
    public void the_title_of_the_page_should_be_something(String expectedTitle) {
    	Assert.assertEquals(loginPage.pageTitle(),expectedTitle);
        
    }
    
}

