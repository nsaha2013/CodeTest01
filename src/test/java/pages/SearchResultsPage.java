package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends Page {
    public SearchResultsPage(WebDriver driver) {
        super(driver, "MOO | Search | MOO (United Kingdom)");
    }


    @FindBy(xpath = "//div[@class='col-12 page-header']/h1")
    private WebElement resultHeader;

    @FindBy(id = "resInfo-0")
    private WebElement resultInfo;

    @FindBy(xpath = "//div[@class='gsc-webResult gsc-result']/div/div/div[@class='gs-title']/a[@class='gs-title']")
    private List<WebElement> resultTitles;

    @FindBy(xpath = "//div[@class='gs-webResult gs-result gs-no-results-result']")
    private WebElement noResultFoundMessage;

    public String getResultHeader(){
        waitForElementVisible(resultHeader,120);
        return resultHeader.getText();
    }

    public String getResultInfo(){
        waitForElementVisible(resultInfo,120);
        return resultInfo.getText();
    }

    public boolean isResultInfoDisplayed(){
        return resultInfo.isDisplayed();
    }

    public boolean isResultTitlesContain(String searchText){
        boolean statusflag = true;
        for(WebElement title:resultTitles){
            if(!title.getText().toLowerCase().contains(searchText.toLowerCase())){
                System.out.println("Product that doesn't match the search term \"" +searchText +"\"");
                System.out.printf(title.getText());
                statusflag = false;
                break;
            }
        }
        return statusflag;
    }

    public boolean isNoResultFoundMessageDisplayed(){
        return noResultFoundMessage.isDisplayed();
    }

}
