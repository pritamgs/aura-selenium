package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateAccountPageLocators {

  @FindBy(how = How.ID, using = "account-creation_form")
  public static WebElement createAccountForm;

  @FindBy(how = How.XPATH, using = "//form[@id='account-creation_form']//preceding-sibling::div[contains(@class,'alert-danger')]")
  public static WebElement personalInfoValidationError;

  @FindBy(how = How.ID, using = "submitAccount")
  public static WebElement registerButton;

  @FindBy(how = How.ID, using = "customer_firstname")
  public static WebElement firstNameTextbox;

  @FindBy(how = How.ID, using = "customer_lastname")
  public static WebElement lastNameTextbox;

  @FindBy(how = How.ID, using = "email")
  public static WebElement emailTextbox;

  @FindBy(how = How.ID, using = "passwd")
  public static WebElement passwordTextbox;

  @FindBy(how = How.ID, using = "address1")
  public static WebElement addressTextbox;

  @FindBy(how = How.ID, using = "city")
  public static WebElement cityTextbox;

  @FindBy(how = How.ID, using = "id_state")
  public static WebElement stateDropdown;

  public static WebElement locateStateDropdownOption(WebDriver driver, String option) {
    return driver.findElement(By.xpath("//select[@id='id_state']/option[text()='" + option + "']"));
  }

  @FindBy(how = How.ID, using = "postcode")
  public static WebElement zipCodeTextbox;

  @FindBy(how = How.ID, using = "id_country")
  public static WebElement countryDropdown;

  public static WebElement locateCountryDropdownOption(WebDriver driver, String option) {
    return driver.findElement(By.xpath("//select[@id='id_country']/option[text()='" + option + "']"));
  }

  @FindBy(how = How.ID, using = "phone")
  public static WebElement homePhoneTextbox;

  @FindBy(how = How.ID, using = "my-account")
  public static WebElement myAccountPageBody;
}
