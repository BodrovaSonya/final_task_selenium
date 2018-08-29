import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/"}, glue = {"selenium.task"},
        plugin = {
                "selenium.task.util.AllureReporter",
        }
)
public class CucumberRunner {

}