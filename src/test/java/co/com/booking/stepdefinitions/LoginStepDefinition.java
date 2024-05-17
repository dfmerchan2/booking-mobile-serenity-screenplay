package co.com.booking.stepdefinitions;

import co.com.booking.questions.TheMessage;
import co.com.booking.tasks.LoginInApplication;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.booking.userinterfaces.HomePage.BTN_WELCOME_MESSAGE;
import static co.com.booking.userinterfaces.LoginPage.LBL_MESSAGE_ERROR;

import static co.com.booking.utilities.enums.ActorNotepad.USER_NAME;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class LoginStepDefinition {

  @When("that {string} authenticated with user {string} and password {string}")
  public static void theUserHasCredentialsAndDoesTheLogin(String actor, String user, String pass) {
    theActorCalled(actor).attemptsTo(LoginInApplication.ofBooking(user, pass));
    theActorCalled(actor).remember(USER_NAME.getKey(), user);
  }

  @Then("should see the message of welcoming {string}")
  public static void shouldSeeTheMessageOfWelcoming(String message) {
    String userName = theActorInTheSpotlight().recall(USER_NAME.getKey());
    theActorInTheSpotlight().should(seeThat(TheMessage.is(BTN_WELCOME_MESSAGE), equalTo(userName)));
  }

  @Then("should see the authentication error message {string}")
  public static void shouldSeeTheMessageError(String message) {
    theActorInTheSpotlight().should(seeThat(TheMessage.is(LBL_MESSAGE_ERROR), equalTo(message)));
  }
}
