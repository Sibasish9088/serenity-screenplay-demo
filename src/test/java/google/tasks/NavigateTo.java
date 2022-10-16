package google.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {


    public static Performable theGoogleHomePage() {
        return Open.url("https://www.google.co.in/");
    }
}
