package indra.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features.hu6/hu6.feature"


        ,glue = "indra.steps_definitions"
        ,snippets = SnippetType.CAMELCASE
        ,tags = "@seccion3"
)


public class Hu6Runners {
}
