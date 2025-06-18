
# How to Write a Page Object with PageFactory

 Introduction

This readme demonstrates how to implement the Page Object Model (POM) using Selenium PageFactory in Java. PageFactory helps initialize web elements defined in your page classes, making test code cleaner and more maintainable.

* Import Required Packages

```
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.eox.utils.CommonFunctionUtils;

```
* Define Your Page Class

```
public class LoginPage {
    
    private WebDriver driver;

        // Constructor to initialize web elements
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Initialize elements using @FindBy annotation if they are buttons like submit or create
    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "loginBtn")
    private WebElement loginButton;

    // Page methods (actions)
    public void username(String usernameValue){
        CommonFunctionUtils.addTextToTheInputField()
    }

    public void passsword(String passwordValue){
        usernameField.sendKeys(passwordValue);
    }
}
```
