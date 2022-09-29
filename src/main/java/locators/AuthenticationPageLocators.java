package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AuthenticationPageLocators {

  @FindBy(how = How.ID, using = "email_create")
  public WebElement emailAddressTextBox;

  @FindBy(how = How.ID, using = "SubmitCreate")
  public WebElement createAnAccountButton;

  @FindBy(how = How.ID, using = "create_account_error")
  public WebElement createAccountValidationError;
}
