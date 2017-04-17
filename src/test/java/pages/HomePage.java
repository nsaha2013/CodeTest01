package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Page {
    public HomePage(WebDriver driver) {
        super(driver, "MOO | Custom Online Business Printing & Design | MOO (United Kingdom)");
    }

    @FindBy(id = "query")
    private WebElement searchField;

    @FindBy(xpath = "//form[@id='search']/div/button")
    private WebElement searchButton;

    @FindBy(xpath = "//li[@class='nav-main__item -l1 -tools -sign-in js-header-sign-in js-header-sign-in-primary-link']/a[@data-ga-label='Sign in']")
    private WebElement signinButton;


    public void enterSearchText(String searchText){
        enterText(searchField,searchText);
    }

    public SearchResultsPage clickOnSearchButton(){
        clickOn(searchButton);
        return PageFactory.initElements(driver,SearchResultsPage.class);
    }

    public SigninPage clickOnSigninButton(){
        clickOn(signinButton);
        return PageFactory.initElements(driver,SigninPage.class);
    }

}
