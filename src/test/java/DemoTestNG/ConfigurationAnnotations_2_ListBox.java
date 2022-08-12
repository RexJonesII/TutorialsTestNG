package DemoTestNG;

import org.testng.annotations.*;

@Test(groups = "smoke")
public class ConfigurationAnnotations_2_ListBox {

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
    System.out.println("   (3) Execute Before Class: List Box");
  }

  @AfterClass
  public void afterClass() {
    System.out.println("   (3) Execute After Class: List Box");
  }

  public void test3_BootstrapListBox() {
    System.out.println("     (5) Test Method 3: Bootstrap List Box");
  }

  public void test4_JQueryListBox() {
    System.out.println("     (5) Test Method 4: JQuery List Box");
  }

  @BeforeTest
  public void beforeTest() {
    System.out.println("  (2) Execute Before Each Test");
  }

  @AfterTest
  public void afterTest() {
    System.out.println("  (2) Execute After Each Test");
  }

  @BeforeSuite
  public void beforeSuite() {
    System.out.println(" (1) Execute Before The Suite");
  }

  @AfterSuite
  public void afterSuite() {
    System.out.println(" (1) Execute After The Suite");
  }

  @BeforeGroups(groups = {"regression", "smoke"})
  public void beforeGroups() {
    System.out.println("Execute Before Group:");
  }

  @AfterGroups(groups = {"regression", "smoke"})
  public void afterGroups() {
    System.out.println("Execute After Group:");
  }
}
