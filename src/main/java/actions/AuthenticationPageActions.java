package actions;

import locators.AuthenticationPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumHelper;
import utils.TestDataLoader;
import org.testng.Assert;

public class AuthenticationPageActions {

  public AuthenticationPageActions(WebDriver driver) {
    PageFactory.initElements(driver, AuthenticationPageLocators.class);
  }

  public void openAuthenticationPage() {
    new SeleniumHelper().openURL(TestDataLoader.getProperty("myAccountUrl"));
  }

  public void enterEmailAddress(String email) {
    AuthenticationPageLocators.emailAddressTextBox.sendKeys(email);
  }

  public void clickCreateAnAccountButton() {
    AuthenticationPageLocators.createAnAccountButton.click();
  }

  public void verifyAccountCreationErrorMessageIsDisplayed() {
    boolean isErrorDisplayed = new SeleniumHelper().isElementDisplayed(AuthenticationPageLocators.createAccountValidationError, 30);
    Assert.assertTrue(isErrorDisplayed, "Create account error message should be displayed");
  }

}
