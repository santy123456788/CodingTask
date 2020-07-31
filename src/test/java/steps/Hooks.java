package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class Hooks {
  private static WebDriver driver;

  @Before
  public static void openBrowser(Scenario s) {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
   // DesiredCapabilities cap = DesiredCapabilities.chrome();
   // URL u = new URL("http://0.0.0.0:4444/wd/hub");
   // driver = new RemoteWebDriver(u, cap);
  }

  @After
  public static void tearDown() {
    driver.quit();
  }

  public static WebDriver getDriver() {
    return driver;
  }

}