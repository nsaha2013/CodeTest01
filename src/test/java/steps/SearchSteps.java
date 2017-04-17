package steps;

import cucumber.api.java.en.When;

public class SearchSteps extends Step {

    @When("^I search for \"([^\"]*)\"$")
    public void i_search_for(String searchText) throws Throwable {
        homePage.enterSearchText(searchText);
        searchResultsPage = homePage.clickOnSearchButton();
    }

}
