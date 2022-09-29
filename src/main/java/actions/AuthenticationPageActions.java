package actions;

import locators.AuthenticationPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumHelper;
import utils.TestDataLoader;
import org.testng.Assert;

public class AuthenticationPageActions extends AuthenticationPageLocators {
  WebDriver driver;
  SeleniumHelper seleniumHelper;

  public AuthenticationPageActions(WebDriver driver) {
    PageFactory.initElements(driver, this);
    seleniumHelper = new SeleniumHelper(driver);
    this.driver = driver;
  }

  public void openAuthenticationPage() {
    seleniumHelper.openURL(TestDataLoader.getProperty("myAccountUrl"));
  }

  public void enterEmailAddress(String email) {
    emailAddressTextBox.sendKeys(email);
  }

  public void clickCreateAnAccountButton() {
    createAnAccountButton.click();
  }

  public void verifyAccountCreationErrorMessageIsDisplayed() {
    boolean isErrorDisplayed = seleniumHelper.isElementDisplayed(createAccountValidationError, 30);
    Assert.assertTrue(isErrorDisplayed, "Create account error message should be displayed");
  }

}
