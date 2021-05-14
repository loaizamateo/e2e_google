package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static userinterface.GoogleElements.*;

public class InputGoogle implements Task {

    private String word;

    public InputGoogle (String word) {
        this.word = word;
    }

    public static InputGoogle aWord(String word) {
        return Tasks.instrumented(InputGoogle.class, word);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(word).into(GOOGLE_INPUT).thenHit(Keys.ENTER),
                Click.on(FIRST_RESULT)
        );
    }
}
