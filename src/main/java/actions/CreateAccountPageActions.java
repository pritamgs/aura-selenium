package actions;

import locators.CreateAccountPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.SeleniumHelper;

public class CreateAccountPageActions {

  WebDriver driver;

  public CreateAccountPageActions(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, CreateAccountPageLocators.class);
  }

  public void enterFirstName(String firstName) {
    CreateAccountPageLocators.firstNameTextbox.sendKeys(firstName);
  }

  public void enterLastName(String lastName) {
    CreateAccountPageLocators.lastNameTextbox.sendKeys(lastName);
  }

  public void enterEmail(String email) {
    CreateAccountPageLocators.emailTextbox.sendKeys(email);
  }

  public void enterPassword(String password) {
    CreateAccountPageLocators.passwordTextbox.sendKeys(password);
  }

  public void enterAddress(String address) {
    CreateAccountPageLocators.addressTextbox.sendKeys(address);
  }

  public void enterCity(String city) {
    CreateAccountPageLocators.cityTextbox.sendKeys(city);
  }

  public void selectState(String state) {
    CreateAccountPageLocators.stateDropdown.click();
    CreateAccountPageLocators.locateStateDropdownOption(driver, state).click();
  }

  public void enterZipCode(String zipCode) {
    CreateAccountPageLocators.zipCodeTextbox.sendKeys(zipCode);
  }

  public void selectCountry(String country) {
    CreateAccountPageLocators.countryDropdown.click();
    CreateAccountPageLocators.locateCountryDropdownOption(driver, country).click();
  }

  public void enterHomePhone(String phone) {
    CreateAccountPageLocators.homePhoneTextbox.sendKeys(phone);
  }

  public void clickRegisterButton() {
    CreateAccountPageLocators.registerButton.click();
  }

  public void verifyAccountCreationFormIsDisplayed() {
    boolean isFormDisplayed = new SeleniumHelper().isElementDisplayed(CreateAccountPageLocators.createAccountForm, 30);
    Assert.assertTrue(isFormDisplayed, "Create account form should be displayed.");
  }

  public void verifyPersonalInfoValidationErrorIsDisplayed() {
    boolean isErrorDisplayed = new SeleniumHelper().isElementDisplayed(CreateAccountPageLocators.personalInfoValidationError, 30);
    Assert.assertTrue(isErrorDisplayed, "Personal Info validation error message should be displayed.");
  }

  public void verifyMyAccountPageIsDisplayed() {
    boolean isPageDisplayed = new SeleniumHelper().isElementDisplayed(CreateAccountPageLocators.myAccountPageBody, 30);
    Assert.assertTrue(isPageDisplayed, "My account page should be displayed.");
  }

}
