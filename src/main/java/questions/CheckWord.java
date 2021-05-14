package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static userinterface.GoogleElements.*;

public class CheckWord implements Question<Boolean> {

    public static CheckWord inTheScreen() {
        return new CheckWord();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(VERIFY_VIDEO).viewedBy(actor).asBoolean();
    }
}
