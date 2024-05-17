package co.com.booking.stepdefinitions;

import co.com.booking.utilities.MyDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hook {

  @Before
  public void beforeScenario() {
    OnStage.setTheStage(OnlineCast.whereEveryoneCan(BrowseTheWeb.with(MyDriver.mobile())));
  }

  @After
  public void afterScenario() {
    MyDriver.getDriverAppium().quit();
  }
}
