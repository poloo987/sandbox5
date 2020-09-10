package website.base_page;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import website.utilities.Driver;

public class login_page {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        WebDriver driver=new ChromeDriver();
        driver.get("https://qa2.vytrack.com/user/login");

    }
}