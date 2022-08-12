package com.lambdatest.pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

  private By bootstrapProgressBar = By.linkText("Bootstrap Progress bar");

  public BootstrapProgressBarPage clickBootstrapProgressBar() {
    click(bootstrapProgressBar);
    return new BootstrapProgressBarPage();
  }
}
