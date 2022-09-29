package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateAccountPageLocators {

  @FindBy(how = How.ID, using = "account-creation_form")
  public WebElement createAccountForm;

  @FindBy(how = How.XPATH, using = "//form[@id='account-creation_form']//preceding-sibling::div[contains(@class,'alert-danger')]")
  public WebElement personalInfoValidationError;

  @FindBy(how = How.ID, using = "submitAccount")
  public WebElement registerButton;

  @FindBy(how = How.ID, using = "customer_firstname")
  public WebElement firstNameTextbox;

  @FindBy(how = How.ID, using = "customer_lastname")
  public WebElement lastNameTextbox;

  @FindBy(how = How.ID, using = "email")
  public WebElement emailTextbox;

  @FindBy(how = How.ID, using = "passwd")
  public WebElement passwordTextbox;

  @FindBy(how = How.ID, using = "address1")
  public WebElement addressTextbox;

  @FindBy(how = How.ID, using = "city")
  public WebElement cityTextbox;

  @FindBy(how = How.ID, using = "id_state")
  public WebElement stateDropdown;

  public static WebElement locateStateDropdownOption(WebDriver driver, String option) {
    return driver.findElement(By.xpath("//select[@id='id_state']/option[text()='" + option + "']"));
  }

  @FindBy(how = How.ID, using = "postcode")
  public WebElement zipCodeTextbox;

  @FindBy(how = How.ID, using = "id_country")
  public WebElement countryDropdown;

  public WebElement locateCountryDropdownOption(WebDriver driver, String option) {
    return driver.findElement(By.xpath("//select[@id='id_country']/option[text()='" + option + "']"));
  }

  @FindBy(how = How.ID, using = "phone")
  public WebElement homePhoneTextbox;

  @FindBy(how = How.ID, using = "my-account")
  public WebElement myAccountPageBody;
}
