package co.com.sofka.runner.soap.tempconvert;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/tempConvert/celsiusToFahrenheit.feature"},
        glue = {"co.com.sofka.stepdefnitions.soap.tempconvert.celsiusToFahrenheit"}
)
public class CelsiusToFahrenheitCucumber {
}
