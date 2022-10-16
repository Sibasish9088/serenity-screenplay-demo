package google.page.elements;

import net.serenitybdd.screenplay.ensure.web.ElementsLocated;
import net.serenitybdd.screenplay.targets.SearchableTarget;
import net.serenitybdd.screenplay.ui.InputField;
import org.openqa.selenium.By;

public class InteractionElements {

    public static SearchableTarget GOOGLE_SEARCH_BUTTON = InputField.located(By
                                                                    .xpath("(//input[@aria-label='Google Search'])[2]"))
                                                                    .called("Google Search Button");

    public static SearchableTarget VIDEO_RESULTS = (SearchableTarget) ElementsLocated.by(By
                                                                    .tagName("video-voyager"))
                                                                    .called("Video Results");
}
