package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features = "src/test/resources/features/Calorias.feature",
        tags = "@Calorias",
        glue = "definitions",
        snippets = SnippetType.CAMELCASE
)


public class Calorias3Runner {
}
