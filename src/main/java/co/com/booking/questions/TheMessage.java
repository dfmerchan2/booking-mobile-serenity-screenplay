package co.com.booking.questions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

@AllArgsConstructor
public class TheMessage implements Question<String> {

  private final Target element;

  @Override
  public String answeredBy(Actor actor) {
    actor.attemptsTo(WaitUntil.the(element, isPresent()).forNoMoreThan(60).seconds());
    return element.resolveFor(actor).getText();
  }

  public static TheMessage is(Target element) {
    return new TheMessage(element);
  }
}
