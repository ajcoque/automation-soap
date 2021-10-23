package co.com.sofka.runner.soap.tempconvert;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        strict = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html"},
        features = {"src/test/resources/features/tempConvert/celsiusToFahrenheit.feature"},
        glue = {"co.com.sofka.stepdefinitions.soap.tempconvert.celsiusToFahrenheit"}

)
public class CelsiusToFahrenheitCucumber {
}
