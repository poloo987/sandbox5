package website.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import website.base_page.LoginPage;
import website.utilities.ConfigurationReader;
import website.utilities.Driver;

import java.lang.annotation.ElementType;
import java.util.concurrent.TimeUnit;

public class test_case1 {
// will move this class to the base page
    @Given("the manager has logged in")
public void the_manager_has_logged_in() {
       System.out.println("Entering store manager login info");
        String sUsername = ConfigurationReader.get("store_manager_username");
        String sPassword = ConfigurationReader.get("store_manager_password");

        LoginPage bot1 = new LoginPage(); // Comment
        bot1.login(sUsername, sPassword);
        Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }

    @Given("the manager clicks Calendar Events under Activities")
    public void the_manager_clicks_Calendar_Events_under_Activities() {
////span[@class='title title-level-1'][contains(text(),'Activities')]
        Driver.get().findElement(By.xpath("//span[@class='title title-level-1'][contains(text(),'Activities')]")).click();
       // Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Driver.get().findElement(By.xpath("//span[contains(text(),'Calendar Event')]")).click();
        //span[contains(text(),'Calendar Events')]


//  //span[contains(concat('⦿', @class, '⦿'), '⦿title title-level-1⦿')]
        //<span class="title title-level-1"><i class="fa-puzzle-piece menu-icon"></i>
        //    Activities</span>
    }

    @When("the user hovers over the triple dots")
    public void the_user_hovers_over_the_triple_dots() {
        // <a data-toggle="dropdown" class="dropdown-toggle" href="javascript:void(0);">...</a>
        // //td[contains(text(),'test event')]       -- "test events"
        // //a[contains(text(),'...')]               -- this ...


        throw new cucumber.api.PendingException();
    }

    @Then("the options View,Edit, and Delete will appear")
    public void the_options_View_Edit_and_Delete_will_appear() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
