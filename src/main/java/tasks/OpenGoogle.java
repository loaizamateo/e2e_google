package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.GooglePage;

public class OpenGoogle implements Task {

    private GooglePage googlePage;

    public static Performable thePageGoogle() {
        return Tasks.instrumented(OpenGoogle.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(googlePage));
    }
}
