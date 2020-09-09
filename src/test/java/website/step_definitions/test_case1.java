package website.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import website.base_page.LoginPage;
import website.utilities.ConfigurationReader;
import website.utilities.Driver;

import java.lang.annotation.ElementType;

public class test_case1 {
// will move this class to the base page
    @Given("the manager has logged in")
public void the_manager_has_logged_in() {
        System.out.println("Entering store manager login info");
        String sUsername = ConfigurationReader.get("store_manager_username");
        String sPassword = ConfigurationReader.get("store_manager_password");

        LoginPage bot1 = new LoginPage();
        bot1.login(sUsername, sPassword);

        }

/*
//span[contains(text(),'Activities')]
//a[@href='"/calendar/event"']
//*[contains(concat(' ', @class, ' '), ' title title-level-2 ')]
<a href="/calendar/event"><span class="title title-level-2">Calendar Events</span></a>
*/
    @Given("the manager clicks Calendar Events under Activities")
    public void the_manager_clicks_Calendar_Events_under_Activities() {
        Driver.get().findElement(By.xpath("//span[contains(text(),\'Activities\')]"));
    }

    @When("the user hovers over the triple dots")
    public void the_user_hovers_over_the_triple_dots(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the options View,Edit, and Delete will appear")
    public void the_options_View_Edit_and_Delete_will_appear() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
