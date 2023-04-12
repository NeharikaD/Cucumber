package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Tech Pundits\\IdeaProjects\\CucumberSelenium\\src\\test\\java\\feature",
        glue = "",
        tags = "@testLogin",
        plugin = {
                "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json"
        }
)
public class RunnerClass {
}
