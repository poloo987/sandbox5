package website.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
// need update - will need two glues - glue will inherit the chosen glue from utils
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-cucumber-reports",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features/",
        glue = "website/step_definitions",
        dryRun = false,
        tags = "@franco"
)


public class Main_Runner {
}
