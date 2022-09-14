package createaccount;

import actions.AuthenticationPageActions;
import actions.CreateAccountPageActions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.DriverSetup;
import utils.TestDataLoader;

public class AuthenticationPageTests extends DriverSetup {

  @BeforeMethod
  public void openAuthenticationPage() {
    AuthenticationPageActions authenticationPageActions = new AuthenticationPageActions(getDriver());
    authenticationPageActions.openAuthenticationPage();
  }

  @Test
  public void createAnAccountBlankEmailTest() {
    AuthenticationPageActions authenticationPageActions = new AuthenticationPageActions(getDriver());
    authenticationPageActions.clickCreateAnAccountButton();
    authenticationPageActions.verifyAccountCreationErrorMessageIsDisplayed();
  }

  @Test
  public void createAnAccountInvalidEmailTest() {
    AuthenticationPageActions authenticationPageActions = new AuthenticationPageActions(getDriver());
    authenticationPageActions.enterEmailAddress(TestDataLoader.getProperty("invalidEmail"));
    authenticationPageActions.clickCreateAnAccountButton();
    authenticationPageActions.verifyAccountCreationErrorMessageIsDisplayed();
  }

  @Test
  public void createAnAccountExistingEmailTest() {
    AuthenticationPageActions authenticationPageActions = new AuthenticationPageActions(getDriver());
    authenticationPageActions.enterEmailAddress(TestDataLoader.getProperty("existingEmail"));
    authenticationPageActions.clickCreateAnAccountButton();
    authenticationPageActions.verifyAccountCreationErrorMessageIsDisplayed();
  }

  @Test
  public void createAnAccountValidEmailTest() {
    AuthenticationPageActions authenticationPageActions = new AuthenticationPageActions(getDriver());
    authenticationPageActions.enterEmailAddress(TestDataLoader.getProperty("validEmail"));
    authenticationPageActions.clickCreateAnAccountButton();
    CreateAccountPageActions createAccountPageActions = new CreateAccountPageActions(getDriver());
    createAccountPageActions.verifyAccountCreationFormIsDisplayed();
  }
}
