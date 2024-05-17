package co.com.booking.utilities;

import io.appium.java_client.AppiumDriver;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

import static co.com.booking.utilities.Capabilities.getPathApp;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class MyDriver {

  private static AppiumDriver driver;

  public static AppiumDriver getDriverAppium() {
    return driver;
  }

  @SneakyThrows
  public static AppiumDriver mobile() {
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("platformName", "Android");
    capabilities.setCapability("appActivity", "com.booking.startup.HomeActivity");
    capabilities.setCapability("appPackage", "com.booking");
    capabilities.setCapability("automationName", "UiAutomator2");
    capabilities.setCapability("autoGrantPermissions", "true");
    capabilities.setCapability("noReset", "false");
    capabilities.setCapability("autoDismissAlerts", "true");
    capabilities.setCapability("unicodeKeyboard", "true");
    capabilities.setCapability("appWaitDuration", "80000");
    capabilities.setCapability("app", getPathApp());
    driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    return driver;
  }
}
