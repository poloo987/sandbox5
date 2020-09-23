package website.step_definitions.front_end;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import website.utilities.ConfigurationReader;
import website.utilities.Driver;
import website.base_page.YT_HomePage;

public class YT_T01 {

    @Given("the user is on home page")
    public void the_user_is_on_home_page() {

      String Case = Driver.get().getCurrentUrl();
        String url = ConfigurationReader.get("url");
      if (Case.equals(url)  ){
          System.out.println("My Thane, we are on the home page and clear for the first run ");

      }else {
          Driver.get().get(url);
      }

    }

    @When("the user type in The Game Theorists in the search box")
    public void the_user_type_in_The_Game_Theorists_in_the_search_box() {
        System.out.println("typing in search ");

        String letters = ConfigurationReader.get("youtuber");
        Driver.get().findElement(By.xpath("//input[@id='search']")).sendKeys(letters);
        Driver.get().findElement(By.xpath("//button[@id='search-icon-legacy']")).click();


    }


    @Then("their  channel should be listed")
    public void their_channel_should_be_listed() {
        String run_url = Driver.get().getCurrentUrl();
        Assert.assertEquals(run_url,"https://www.youtube.com/results?search_query=The+Game+Theorists");

    }


}
