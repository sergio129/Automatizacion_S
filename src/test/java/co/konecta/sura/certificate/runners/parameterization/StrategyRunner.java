package co.konecta.sura.certificate.runners.parameterization;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "co.konecta.sura.certificate.stepsdefinitions",
        features = "src/test/resources/features/strategy.feature",
        snippets = SnippetType.CAMELCASE,
        tags = {"@TestMonitoringStrategyParameterizationEdition"},
        monochrome = true

)

public class StrategyRunner {
}
