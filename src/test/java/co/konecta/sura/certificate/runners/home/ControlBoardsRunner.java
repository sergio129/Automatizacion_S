package co.konecta.sura.certificate.runners.home;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "co.konecta.sura.certificate.stepsdefinitions",
        features = "src/test/resources/features/controlboards.feature",
        snippets = SnippetType.CAMELCASE,
        tags = {"@TestControlBoardsCases"},
        monochrome = true

)
public class ControlBoardsRunner {
}
