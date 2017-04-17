package steps;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import pages.DashboardPage;
import pages.HomePage;
import pages.SearchResultsPage;
import pages.SigninPage;

public class Step {
    static WebDriver driver;
    static HomePage homePage;
    static SearchResultsPage searchResultsPage;
    static SigninPage signinPage;
    static DashboardPage dashboardPage;

    protected String getRandomEmail(){
        return RandomStringUtils.randomAlphanumeric(12) + "@test.com";
    }
}
