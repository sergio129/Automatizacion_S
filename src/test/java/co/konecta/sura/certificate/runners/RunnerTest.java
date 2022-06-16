package co.konecta.sura.certificate.runners;

import org.openqa.selenium.WebDriver;

public class RunnerTest {
    public static WebDriver driver;

    public static void main(String[] args) throws Throwable {
        cucumber.api.cli.Main.main(new String[]{
                "src/test/resources/features/",
                "-t", "@TestCaseComplete",
                "-g", "co.konecta.sura.certificate.stepsdefinitions",
        });
    }
}
