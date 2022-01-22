package runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "stepDefinitions",
        features = "src/test/resources/features/createUser.feature"
)
public class CommonRunner {
}
