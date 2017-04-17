package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SigninPage extends Page{
    public SigninPage(WebDriver driver) {
        super(driver, "Sign in | MOO (United Kingdom)");
    }

    @FindBy(id = "lblLogin")
    private WebElement signinRadioButton;

    @FindBy(id = "lblSignup")
    private WebElement signupRadioButton;

    @FindBy(id = "txtFirstName")
    private WebElement firstnameField;

    @FindBy(id = "txtLastName")
    private WebElement lastnameField;

    @FindBy(id = "txtEmailSignUp")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='txtEmailSignUp']/../../div[@class='has-error-msg']")
    private WebElement emailErrorMsg;

    @FindBy(id = "txtPasswordSignUp")
    private WebElement passwordField;

    @FindBy(id = "txtPassword2SignUp")
    private WebElement confirmPasswordField;

    @FindBy(id = "ddlCountry")
    private WebElement countryDropdown;

    @FindBy(id = "ddlIdentityIndustry")
    private WebElement industryDropdown;

    @FindBy(id = "ddlIdentityProfession33")
    private WebElement businessTypeDropdown;

    @FindBy(id = "ddlIdentityCompanySize")
    private WebElement companySizeDropdown;

    @FindBy(id = "chkNewsletter")
    private WebElement mooEmailCheckBox;

    @FindBy(id = "btnSignup")
    private WebElement createAccountButton;



    public void clickOnSignupRadioButton(){
        clickOn(signupRadioButton);
    }

    public void enterFirstNameText(String firstnameText){
        enterText(firstnameField,firstnameText);
    }

    public void enterLastNameText(String lastnameText){
        enterText(lastnameField,lastnameText);
    }

    public void enterEmailText(String emailText){
        enterText(emailField,emailText);
    }

    public void enterPasswordText(String passwordText){
        enterText(passwordField,passwordText);
    }

    public void enterConfirmPasswordText(String confirmPasswordText){
        enterText(confirmPasswordField,confirmPasswordText);
    }

    public void selectCountry(String countryName){
        selectFromDropDown(new Select(countryDropdown),countryName);
    }

    public void selectIndustry(String indusrtyName){
        selectFromDropDown(new Select(industryDropdown),indusrtyName);
    }

    public void selectBusinessType(String businessType){
        selectFromDropDown(new Select(businessTypeDropdown),businessType);
    }

    public void selectCompanySize(String companySize){
        selectFromDropDown(new Select(companySizeDropdown),companySize);
    }

    public void checkMooEmailsCheckBox(){
        if(!mooEmailCheckBox.getAttribute("checked").equalsIgnoreCase("true")){
            clickOn(mooEmailCheckBox);
        }
    }

    public void clickOnCreateAccountButtonExpectError(){
        clickOn(createAccountButton);
    }

    public DashboardPage clickOnCreateAccountButton(){
        clickOn(createAccountButton);
        return PageFactory.initElements(driver,DashboardPage.class);
    }

    public boolean isEmailErrorMessageDisplayed(){
        return emailErrorMsg.isDisplayed();
    }
}
