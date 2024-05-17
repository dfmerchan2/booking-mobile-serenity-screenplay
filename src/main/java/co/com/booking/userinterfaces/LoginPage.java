package co.com.booking.userinterfaces;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class LoginPage {
  public static final Target BTN_CONTINUE =
      Target.the("Button continue")
          .locatedForAndroid(By.id("com.booking:id/identity_landing_social_button"))
          .locatedForIOS(By.id(""));
  public static final Target BTN_LOGIN =
      Target.the("Button start session")
          .locatedForAndroid(By.id("com.booking:id/identity_landing_social_button_text"))
          .locatedForIOS(By.id(""));
  public static final Target LBL_MESSAGE_ERROR =
      Target.the("Label authentication error message")
          .locatedForAndroid(By.id("com.booking:id/textinput_error"))
          .locatedForIOS(By.id(""));
  public static final Target TXT_EMAIL =
      Target.the("Text box email")
          .locatedForAndroid(By.id("com.booking:id/identity_text_input_edit_text"))
          .locatedForIOS(By.id(""));
  public static final Target TXT_PASSWORD =
      Target.the("Text box password")
          .locatedForAndroid(By.id("com.booking:id/identity_text_input_edit_text"))
          .locatedForIOS(By.id(""));
  public static final Target TITLE_PASSWORD =
      Target.the("Title enter password")
          .locatedForAndroid(
              By.xpath(
                  "//*['com.booking:id/identity_header_title' and contains (@text,'Enter your password')]"))
          .locatedForIOS(By.id(""));
}
