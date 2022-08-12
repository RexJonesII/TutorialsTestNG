package com.lambdatest.pages;

import com.google.gson.stream.JsonToken;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
  public static WebDriver driver;

  public void setDriver(WebDriver driver) {
    BasePage.driver = driver;
  }

  protected WebElement find(By locator) {
    return driver.findElement(locator);
  }

  protected void click(By locator) {
    find(locator).click();
  }

  protected String getText(By locator) {
    String text = find(locator).getText();
    System.out.println("Text: " + text);
    return text;
  }
}
