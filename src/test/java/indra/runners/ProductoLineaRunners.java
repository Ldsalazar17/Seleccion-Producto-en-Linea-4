package indra.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features.Advantage/Advantage.feature"


        ,glue = "indra.steps_definitions"
        ,snippets = SnippetType.CAMELCASE
      //  ,tags = ""
)


public class ProductoLineaRunners {
}
