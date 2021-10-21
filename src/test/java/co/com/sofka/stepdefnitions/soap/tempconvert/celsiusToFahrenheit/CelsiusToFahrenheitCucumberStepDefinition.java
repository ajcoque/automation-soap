package co.com.sofka.stepdefnitions.soap.tempconvert.celsiusToFahrenheit;

import co.com.sofka.exceptions.tempconvert.ValidationIsNotNumeric;
import co.com.sofka.stepdefnitions.soap.tempconvert.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.exceptions.tempconvert.ValidationIsNotNumeric.VALIDATION_IS_NOT_NUMERIC;
import static co.com.sofka.questions.ReturnStringValue.systemValue;
import static co.com.sofka.tasks.tempconvert.DoPost.doPost;
import static co.com.sofka.util.FileUtilities.readFile;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.apache.http.HttpStatus.SC_OK;
import static org.hamcrest.CoreMatchers.containsString;

public class CelsiusToFahrenheitCucumberStepDefinition extends SetUp {
    private static final String ADD_XML = System.getProperty("user.dir") + "\\src\\test\\resources\\tempConvert\\celsiusToFahrenheit.xml";
    private static final String CELSIUS = "[Celsius]";
    private String celsius;

    @Given("el usuario ha definido un valor de {string} grados celsius valido para el sistema")
    public void elUsuarioHaDefinidoUnValorDeGradosCelsiusValidoParaElSistema(String celsius) {
        this.celsius=celsius;
        setUp();
        bodyRequest = defineBodyRequest(celsius);
    }

    @When("el usuario ejecuta la conversion de temperatura en el aplicativo")
    public void elUsuarioEjecutaLaConversionDeTemperaturaEnElAplicativo() {
        interactionActor();
    }

    @Then("el usuario deberia obtener el resultado {string} grados fahrenheit")
    public void elUsusarioDeberiaObtenerElResultadoGradosFahrenheit(String fahrenheit) {

        actor.should(
                seeThatResponse(
                        "El código de respuesta HTTP debe ser: " + SC_OK,
                        response -> response
                                .statusCode(SC_OK)
                ),
                seeThat(
                        "El resultado de la conversion de la temperatura debe ser: ",
                        systemValue(fromLastResponseBy(actor)),
                        containsString("<CelsiusToFahrenheitResult>" + fahrenheit + "</CelsiusToFahrenheitResult>")
                )
                .orComplainWith(
                        ValidationIsNotNumeric.class,
                        String.format(VALIDATION_IS_NOT_NUMERIC, celsius)
                )
        );
    }


    @Given("el usuario ha definido un valor de {string} invalido para el sistema")
    public void elUsuarioHaDefinidoUnValorDeInvalidoParaElSistema(String error) {
        setUp();
        bodyRequest = defineBodyRequest(error);
    }

    @When("el usuario ejecuta la conversion de temperatura en el aplicativo con un valor invalido")
    public void elUsuarioEjecutaLaConversionDeTemperaturaEnElAplicativoConUnValorInvalido() {
        interactionActor();
    }

    @Then("el usuario deberia obtener el resultado de {string}")
    public void elUsuarioDeberiaObtenerElResultadoDe(String error) {
        actor.should(
                seeThatResponse(
                        "El código de respuesta HTTP debe ser: " + SC_OK,
                        response -> response
                                .statusCode(SC_OK)
                ),
                seeThat(
                        "El resultado de la conversion de la temperatura debe ser: ",
                        systemValue(fromLastResponseBy(actor)),
                        containsString("<CelsiusToFahrenheitResult>" + error + "</CelsiusToFahrenheitResult>")
                )
        );
    }

    private String defineBodyRequest(String celsius) {
        return readFile(ADD_XML)
                .replace(CELSIUS, celsius);
    }

    private void interactionActor(){
        actor.attemptsTo(
                doPost().
                        usingThe(RESOURCE).
                        with(headers()).
                        and(bodyRequest)
        );
    }

}
