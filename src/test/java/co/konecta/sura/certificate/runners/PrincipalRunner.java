package co.konecta.sura.certificate.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "co.konecta.sura.certificate.stepsdefinitions",
        features = "src/test/resources/features/",
        snippets = SnippetType.CAMELCASE,
        tags = {"@TestCreacionCodigoSalida"},
        monochrome = true

)

public class PrincipalRunner {

}
