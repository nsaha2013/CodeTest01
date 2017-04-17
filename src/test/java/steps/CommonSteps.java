package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;

public class CommonSteps extends Step {

    @Before
    public void setup(){
        FirefoxDriverManager.getInstance().setup();
        driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        driver.quit();
        driver=null;
    }

    @Given("^I am on Moo homepage$")
    public void i_am_on_Moo_homepage() throws Throwable {
        driver.get("https://www.moo.com/uk/");
        homePage = PageFactory.initElements(driver, HomePage.class);
    }
}
