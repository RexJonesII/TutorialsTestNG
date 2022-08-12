package DemoTestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class GeoLocation_Selenium4Feature {
  ChromeDriver driver;

  @BeforeMethod
  public void setUp() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
  }

  @Test
  public void mockGeoLocation_executeCDPCommand(){
    Map coordinates = new HashMap()
    {{
      put("latitude", 25.1972);
      put("longitude", 55.2744);
      put("accuracy", 1);
    }};
    driver.executeCdpCommand(
            "Emulation.setGeolocationOverride",coordinates);
    driver.get("https://where-am-i.org/");
  }
}
