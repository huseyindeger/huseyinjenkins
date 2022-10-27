package Code.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",  //this is to connect feature files with runner class
        //we need to copy path from content root
        glue = "Code/stepsDefinitions",  //this is to connect steps  with runner class
        //we need to copy path from source root
        tags = "",
        dryRun = false, //this is to get undefined steps without
        plugin = {
        "pretty",  //this is to have more understandable console logs.
        "rerun:target/rerun.txt", //this will help us to store failed scenarios in rerun.txt file so that we
                //we can run them from FiledRunner class.
        "html:target/default-cucumber-reports.html",
        "json:target/cucumber.json",
}
)
public class TestRunner {

}
