package DemoTestNG;

import org.testng.annotations.*;

public class ConfigurationAnnotations_1_DatePickers {
  @Test(groups = "smoke")
  public void test1_BootstrapDatePicker() {
    System.out.println("     (5) Test Method 1: Bootstrap Date Picker");
  }

  @Test(groups = {"regression", "e2e"})
  public void test2_JQueryDatePicker() {
    System.out.println("     (5) Test Method 2: JQuery Date Picker");
  }

  @BeforeMethod
  public void beforeMethod() {
    System.out.println("    (4) Execute Before Each Test Method");
  }

  @AfterMethod
  public void afterMethod() {
    System.out.println("    (4) Execute After Each Test Method \n");
  }

  @BeforeClass
  public void beforeClass() {
    System.out.println("   (3) Execute Before Class: Date Pickers");
  }

  @AfterClass
  public void afterClass() {
    System.out.println("   (3) Execute After Class: Date Pickers");
  }
}
