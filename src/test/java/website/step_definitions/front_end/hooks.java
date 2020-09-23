package website.step_definitions.front_end;

import cucumber.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import website.utilities.ConfigurationReader;
import website.utilities.Driver;

import java.util.concurrent.TimeUnit;

public class hooks {
    @Before
    public void setUp() {
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);


    }
    @After
    public void tearDown(Scenario scenario) {
        /* if scenario fails, take a screenshot
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }*/

       // Driver.closeDriver();
    }
}
