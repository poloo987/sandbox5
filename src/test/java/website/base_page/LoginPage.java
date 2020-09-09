package website.base_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import website.utilities.Driver;

public class LoginPage {

    public LoginPage(){
    PageFactory.initElements(Driver.get(), this);
}

    //  element location in html for username
    @FindBy(id="prependedInput")
    public WebElement userName;

    //  element location in html for password
    @FindBy(id="prependedInput2")
    public WebElement password;


    //  element location in html for login
    @FindBy(name = "_submit")
    public WebElement submit;

    // the method that carry out the login action
    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();

    }
}
