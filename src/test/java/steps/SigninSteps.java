package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SigninSteps extends Step {

    @When("^I choose to signin$")
    public void i_choose_to_signin() throws Throwable {
        signinPage = homePage.clickOnSigninButton();
    }

    @When("^I choose the option to signup$")
    public void i_choose_the_option_to_signup() throws Throwable {
        signinPage.clickOnSignupRadioButton();
    }

    @When("^I enter First Name as \"([^\"]*)\"$")
    public void i_enter_First_Name_as(String firstname) throws Throwable {
       signinPage.enterFirstNameText(firstname);
    }

    @When("^I enter Last Name as \"([^\"]*)\"$")
    public void i_enter_Last_Name_as(String lastname) throws Throwable {
        signinPage.enterLastNameText(lastname);
    }

    @When("^I enter Email Address as \"([^\"]*)\"$")
    public void i_enter_Email_Address_as(String email) throws Throwable {
        signinPage.enterEmailText(email);
    }

    @When("^I enter Password as \"([^\"]*)\"$")
    public void i_enter_Password_as(String password) throws Throwable {
        signinPage.enterPasswordText(password);
    }

    @When("^I enter Confirm password as \"([^\"]*)\"$")
    public void i_enter_Confirm_password_as(String confirmPassword) throws Throwable {
        signinPage.enterConfirmPasswordText(confirmPassword);
    }

    @When("^I select country as \"([^\"]*)\"$")
    public void i_select_country_as(String countryName) throws Throwable {
        signinPage.selectCountry(countryName);
    }

    @When("^I select Industry as \"([^\"]*)\"$")
    public void i_select_Industry_as(String industry) throws Throwable {
        signinPage.selectIndustry(industry);
    }

    @When("^I select Business type as \"([^\"]*)\"$")
    public void i_select_Business_type_as(String businessType) throws Throwable {
        signinPage.selectBusinessType(businessType);
    }

    @When("^I select size of business as \"([^\"]*)\"$")
    public void i_select_size_of_business_as(String companySize) throws Throwable {
        signinPage.selectCompanySize(companySize);
    }

    @When("^I choose to signup for Moo emails$")
    public void i_choose_to_signup_for_Moo_emails() throws Throwable {
        signinPage.checkMooEmailsCheckBox();
    }

    @When("^I click on Create Account button expecting error$")
    public void i_click_on_Create_Account_button_expecting_error() throws Throwable {
        signinPage.clickOnCreateAccountButtonExpectError();
    }

    @Then("^I should see an error message for the email field$")
    public void i_should_see_an_error_message_for_email_field() throws Throwable {
        Assert.assertTrue(signinPage.isEmailErrorMessageDisplayed());
    }

    @When("^I enter Email Address as a valid random email$")
    public void i_enter_Email_Address_as_a_valid_random_email() throws Throwable {
        signinPage.enterEmailText(getRandomEmail());
    }

    @When("^I click on Create Account button$")
    public void i_click_on_Create_Account_button() throws Throwable {
       dashboardPage = signinPage.clickOnCreateAccountButton();
    }

    @Then("^I should be on Dashboard Page$")
    public void i_should_be_on_Dashboard_Page() throws Throwable {
        Assert.assertEquals("Your account | MOO (United Kingdom)",dashboardPage.getPageTitle());
    }

    @Then("^I should see the welcome message \"([^\"]*)\"$")
    public void i_should_see_the_welcome_message(String welcomeMessage) throws Throwable {
        Assert.assertEquals(welcomeMessage,dashboardPage.getUserGreetingMessage());
    }


}
