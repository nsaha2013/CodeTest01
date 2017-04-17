package steps;

import cucumber.api.java.en.Then;
import org.junit.Assert;

public class SearchResultsSteps extends Step {

    @Then("^I should see text displayed Results for \"([^\"]*)\"$")
    public void i_should_see_text_displayed_Results_for(String searchText) throws Throwable {
        Assert.assertEquals("Results for \"" +searchText +"\"",searchResultsPage.getResultHeader());

    }

    @Then("^I should see text displayed about x results$")
    public void i_should_see_text_displayed_about_x_results() throws Throwable {
        Assert.assertTrue(searchResultsPage.isResultInfoDisplayed());

    }

    @Then("^I should see all the results title contains the text \"([^\"]*)\"$")
    public void i_should_see_all_the_results_title_contains_the_text(String searchText) throws Throwable {
        Assert.assertTrue(searchResultsPage.isResultTitlesContain(searchText));

    }

    @Then("^I should see the no result found message$")
    public void i_should_see_the_no_result_found_message() throws Throwable {
       Assert.assertTrue(searchResultsPage.isNoResultFoundMessageDisplayed());
    }

}
