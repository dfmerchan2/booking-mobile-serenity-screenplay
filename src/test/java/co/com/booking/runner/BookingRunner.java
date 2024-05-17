package co.com.booking.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/Booking.feature",
    plugin = {"pretty", "summary"},
    glue = "co.com.booking.stepdefinitions",
    snippets = CucumberOptions.SnippetType.CAMELCASE)
public class BookingRunner {}
