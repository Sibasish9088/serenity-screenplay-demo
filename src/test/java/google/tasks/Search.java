package google.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.InputField;

import static google.page.elements.InteractionElements.GOOGLE_SEARCH_BUTTON;

public class Search {


    public static Performable theText(String searchString) {
        return Task.where("{0} searches for the text " + searchString + " in the Google Search",
                Enter.theValue(searchString).into(InputField.withAriaLabel("Search")),
                Click.on(GOOGLE_SEARCH_BUTTON)
        );
    }
}
