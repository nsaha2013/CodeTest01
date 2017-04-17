package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends Page {
    public DashboardPage(WebDriver driver) {
        super(driver, "Your account | MOO (United Kingdom)");
    }

    @FindBy(xpath = "//li[@class='nav-main__item -l1 -tools -user-greeting js-header-user-greeting']")
    private WebElement userGreetingText;

    public String getUserGreetingMessage(){
        return userGreetingText.getText();
    }
}
