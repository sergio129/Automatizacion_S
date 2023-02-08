package co.konecta.sura.certificate.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "co.konecta.sura.certificate.stepsdefinitions",
        features = "src/test/resources/features/",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@TestPruebasLogin or  @TestCreacionCaso or  @TestCreacionCodigoSalida or @TestCaseComplete or  @TestCreacionPrefijos",
        monochrome = true
)

public class PrincipalRunner {
}
