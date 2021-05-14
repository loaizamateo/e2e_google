package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import exceptions.SearchError;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.CheckWord;
import tasks.InputGoogle;
import tasks.OpenGoogle;
import static util.ErrorConstanst.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GoogleSearchStepDefinitions {

    @Managed(driver = "chrome")
    protected WebDriver hisBrowser;

    @Before
    public void configuracionInicial(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("usuario").can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^the user wants open browser an got to google$")
    public void theUserWantsOpenBrowserAnGotToGoogle() {
        // Write code here that turns the phrase above into concrete actions
        theActorInTheSpotlight().wasAbleTo(OpenGoogle.thePageGoogle());
    }

    @When("^he search the word (.*)$")
    public void heSearchTheWordAngeles(String word) {
        theActorInTheSpotlight().attemptsTo(InputGoogle.aWord(word));
    }

    @Then("^he verifies the tittle in the first publication$")
    public void heVerifiesTheTittleInTheFirstPublication() {
        theActorInTheSpotlight().should(seeThat(CheckWord.inTheScreen()).orComplainWith(SearchError.class, SEARCH_FAILED));
    }
}
