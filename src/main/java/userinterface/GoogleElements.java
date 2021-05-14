package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class GoogleElements extends PageObject {

    public static final Target GOOGLE_INPUT = Target.the("Google Input")
            .locatedBy("//input[@class='gLFyf gsfi']");

    public static final Target FIRST_RESULT = Target.the("First result")
            .locatedBy("//h3[@class='LC20lb DKV0Md']");

    public static final Target VERIFY_VIDEO = Target.the("Verify Video")
            .locatedBy("//h1[@class='firstHeading']");
}
