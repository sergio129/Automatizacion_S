package co.konecta.sura.certificate.runners.integration;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "co.konecta.sura.certificate.stepsdefinitions",
        features = "src/test/resources/features/highcontacttimesintegration.feature",
        snippets = SnippetType.CAMELCASE,
        tags = {"@TestHighContactTimesIntegrationManagement"},
        monochrome = true

)
public class HighContactTimesIntegrationRunner {
}
