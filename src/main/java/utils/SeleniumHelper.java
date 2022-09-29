package utils;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumHelper {
  WebDriver driver;

  public SeleniumHelper(WebDriver driver){
    this.driver = driver;
  }

  public void openURL(String url) {
    driver.get(url);
  }

  public WebElement waitForElementToBeDisplayed(WebElement element, long timeoutInSeconds) {
    return new WebDriverWait(driver, timeoutInSeconds).until(ExpectedConditions.visibilityOf(element));
  }

  public boolean isElementDisplayed(WebElement element) {
    try {
      return element.isDisplayed();
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  public boolean isElementDisplayed(WebElement element, long timeoutInSeconds) {
    try {
      return waitForElementToBeDisplayed(element, timeoutInSeconds).isDisplayed();
    } catch (NoSuchElementException e) {
      return false;
    }
  }
}
