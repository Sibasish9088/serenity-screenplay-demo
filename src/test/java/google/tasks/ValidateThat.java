package google.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.ui.PageElement;

import static google.page.elements.InteractionElements.VIDEO_RESULTS;

public class ValidateThat {

    public static Performable theSearchResultsContain(String sectionName) {
        return Task.where("{0} verify that the Google Search produced results with a " + sectionName + " Section",
                Ensure.that(PageElement.containingText(sectionName)).isDisplayed()
        );
    }

    public static Performable theSearchResultsAreRelevantTo(String theSearchedForText) {
        return Task.where("{0} verify the relevance of the search results with the search string '" + theSearchedForText + "'",
                Ensure.that(VIDEO_RESULTS).isDisplayed(),
                Ensure.that(VIDEO_RESULTS).textContent().containsIgnoringCase(theSearchedForText)
        );
    }
}
