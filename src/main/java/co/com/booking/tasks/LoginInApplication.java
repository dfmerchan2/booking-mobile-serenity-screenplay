package co.com.booking.tasks;

import co.com.booking.userinterfaces.LoginPage;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

@AllArgsConstructor
public class LoginInApplication implements Task {
  private final String user;
  private final String password;

  @Step("{0} authenticates with email ******* and password *******")
  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(LoginPage.BTN_LOGIN),
        WaitUntil.the(LoginPage.TXT_EMAIL, isPresent()),
        Enter.keyValues(user).into(LoginPage.TXT_EMAIL),
        Click.on(LoginPage.BTN_CONTINUE));
    actor.attemptsTo(
        WaitUntil.the(LoginPage.TITLE_PASSWORD, isPresent()).forNoMoreThan(60).seconds(),
        WaitUntil.the(LoginPage.TXT_PASSWORD, isPresent()),
        Enter.keyValues(password).into(LoginPage.TXT_PASSWORD),
        Click.on(LoginPage.BTN_LOGIN));
  }

  public static Performable ofBooking(String user, String password) {
    return instrumented(LoginInApplication.class, user, password);
  }
}
