package google.stepdefinitions;

import google.tasks.NavigateTo;
import google.tasks.Search;
import google.tasks.ValidateThat;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

public class GoogleSearchStepDefinitions {

    @Given("{actor} is able to open the Google homepage")
    public void isAbleToOpenTheGoogleHomepage(Actor actor) {
        actor.attemptsTo(
                NavigateTo.theGoogleHomePage()
        );
    }

    @When("{actor} searches for {string}")
    public void searchesFor(Actor actor, String searchString) {
        actor.attemptsTo(
                Search.theText(searchString)
        );
    }

    @Then("{actor} should see the {string} section")
    public void shouldSeeTheSection(Actor actor, String sectionName) {
        actor.attemptsTo(
                ValidateThat.theSearchResultsContain(sectionName)
        );
    }

    @Then("{actor} should be able to verify that the videos are relevant to {string}")
    public void shouldBeAbleToFindRelevantSearchResults(Actor actor, String theSearchedForText) {
        actor.attemptsTo(
                ValidateThat.theSearchResultsAreRelevantTo(theSearchedForText)
        );
    }
}
