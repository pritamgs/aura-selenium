package actions;

import locators.CreateAccountPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.SeleniumHelper;

public class CreateAccountPageActions extends CreateAccountPageLocators{

  WebDriver driver;
  SeleniumHelper seleniumHelper;

  public CreateAccountPageActions(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
    seleniumHelper = new SeleniumHelper(driver);
  }

  public void enterFirstName(String firstName) {
    firstNameTextbox.sendKeys(firstName);
  }

  public void enterLastName(String lastName) {
    lastNameTextbox.sendKeys(lastName);
  }

  public void enterEmail(String email) {
    emailTextbox.sendKeys(email);
  }

  public void enterPassword(String password) {
    passwordTextbox.sendKeys(password);
  }

  public void enterAddress(String address) {
    addressTextbox.sendKeys(address);
  }

  public void enterCity(String city) {
    cityTextbox.sendKeys(city);
  }

  public void selectState(String state) {
    stateDropdown.click();
    locateStateDropdownOption(driver, state).click();
  }

  public void enterZipCode(String zipCode) {
    zipCodeTextbox.sendKeys(zipCode);
  }

  public void selectCountry(String country) {
    countryDropdown.click();
    locateCountryDropdownOption(driver, country).click();
  }

  public void enterHomePhone(String phone) {
    homePhoneTextbox.sendKeys(phone);
  }

  public void clickRegisterButton() {
    registerButton.click();
  }

  public void verifyAccountCreationFormIsDisplayed() {
    boolean isFormDisplayed = seleniumHelper.isElementDisplayed( createAccountForm, 30);
    Assert.assertTrue(isFormDisplayed, "Create account form should be displayed.");
  }

  public void verifyPersonalInfoValidationErrorIsDisplayed() {
    boolean isErrorDisplayed = seleniumHelper.isElementDisplayed(personalInfoValidationError, 30);
    Assert.assertTrue(isErrorDisplayed, "Personal Info validation error message should be displayed.");
  }

  public void verifyMyAccountPageIsDisplayed() {
    boolean isPageDisplayed = seleniumHelper.isElementDisplayed(myAccountPageBody, 30);
    Assert.assertTrue(isPageDisplayed, "My account page should be displayed.");
  }

}
