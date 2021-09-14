package co.konecta.sura.certificate.runners.cases;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "co.konecta.sura.certificate.stepsdefinitions",
        features = "src/test/resources/features/fullflowcase.feature",
        tags = {"@TestCreateFlowCompleteChosenDriver"},
        snippets = SnippetType.CAMELCASE,
        monochrome = true

)
public class FullFlowCaseRunner {
}
