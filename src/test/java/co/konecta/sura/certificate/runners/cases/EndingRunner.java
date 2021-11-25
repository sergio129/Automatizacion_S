package co.konecta.sura.certificate.runners.cases;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
//Submodulo de Finalizacion-Casos
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "co.konecta.sura.certificate.stepsdefinitions",
        features = "src/test/resources/features/ending.feature",
        tags = {"@TestEndingComplete"},
        snippets = SnippetType.CAMELCASE,
        monochrome = true

)

public class EndingRunner {
}
