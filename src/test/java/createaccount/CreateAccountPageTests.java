package createaccount;

import actions.AuthenticationPageActions;
import actions.CreateAccountPageActions;
import org.apache.commons.lang.RandomStringUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.DriverSetup;
import utils.TestDataLoader;

public class CreateAccountPageTests extends DriverSetup {

  @BeforeMethod
  public void openCreateAccountPage() {
    AuthenticationPageActions authenticationPageActions = new AuthenticationPageActions(getDriver());
    authenticationPageActions.openAuthenticationPage();
    authenticationPageActions.enterEmailAddress(RandomStringUtils.randomAlphanumeric(10) + TestDataLoader.getProperty("validEmail"));
    authenticationPageActions.clickCreateAnAccountButton();
    CreateAccountPageActions createAccountPageActions = new CreateAccountPageActions(getDriver());
    createAccountPageActions.verifyAccountCreationFormIsDisplayed();
  }

  @Test
  public void invalidPersonalInfoTest() {
    CreateAccountPageActions createAccountPageActions = new CreateAccountPageActions(getDriver());
    createAccountPageActions.clickRegisterButton();
    createAccountPageActions.verifyPersonalInfoValidationErrorIsDisplayed();
  }

  @Test
  public void validPersonalInfoTest() {
    CreateAccountPageActions createAccountPageActions = new CreateAccountPageActions(getDriver());
    createAccountPageActions.enterFirstName(TestDataLoader.getProperty("firstname"));
    createAccountPageActions.enterLastName(TestDataLoader.getProperty("lastname"));
    createAccountPageActions.enterPassword(TestDataLoader.getProperty("password"));
    createAccountPageActions.enterAddress(TestDataLoader.getProperty("address"));
    createAccountPageActions.enterCity(TestDataLoader.getProperty("city"));
    createAccountPageActions.selectState(TestDataLoader.getProperty("state"));
    createAccountPageActions.enterZipCode(TestDataLoader.getProperty("zip"));
    createAccountPageActions.selectCountry(TestDataLoader.getProperty("country"));
    createAccountPageActions.enterHomePhone(TestDataLoader.getProperty("phone"));
    createAccountPageActions.clickRegisterButton();
    createAccountPageActions.verifyMyAccountPageIsDisplayed();
  }

}
