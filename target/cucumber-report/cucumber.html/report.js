$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/tempConvert/celsiusToFahrenheit.feature");
formatter.feature({
  "name": "Convertir temperatura - Celsius a Fahrenheit",
  "description": "  Como usuario de un aplicativo web que permite convertir de celsius a fahrenheit\n  necesito validar que la funcionalidad de convertir de celsius a fahrenheit trabaje adecuadamente\n  para poder tener seguridad del resultado y poder hacer uso del mismo.",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Convertir grados celius a grados fahrenheit pasando valores validos",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "el usuario ha definido un valor de \"10.2\" grados celsius valido para el sistema",
  "keyword": "Given "
});
formatter.match({
  "location": "co.com.sofka.stepdefinitions.soap.tempconvert.celsiusToFahrenheit.CelsiusToFahrenheitCucumberStepDefinition.elUsuarioHaDefinidoUnValorDeGradosCelsiusValidoParaElSistema(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el usuario ejecuta la conversion de temperatura en el aplicativo",
  "keyword": "When "
});
formatter.match({
  "location": "co.com.sofka.stepdefinitions.soap.tempconvert.celsiusToFahrenheit.CelsiusToFahrenheitCucumberStepDefinition.elUsuarioEjecutaLaConversionDeTemperaturaEnElAplicativo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el usuario deberia obtener el resultado \"50.36\" grados fahrenheit",
  "keyword": "Then "
});
formatter.match({
  "location": "co.com.sofka.stepdefinitions.soap.tempconvert.celsiusToFahrenheit.CelsiusToFahrenheitCucumberStepDefinition.elUsusarioDeberiaObtenerElResultadoGradosFahrenheit(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Convertir grados celius a grados fahrenheit pasando valores invalidos",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "el usuario ha definido un valor de \"#10.2\" invalido para el sistema",
  "keyword": "Given "
});
formatter.match({
  "location": "co.com.sofka.stepdefinitions.soap.tempconvert.celsiusToFahrenheit.CelsiusToFahrenheitCucumberStepDefinition.elUsuarioHaDefinidoUnValorDeInvalidoParaElSistema(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el usuario ejecuta la conversion de temperatura en el aplicativo con un valor invalido",
  "keyword": "When "
});
formatter.match({
  "location": "co.com.sofka.stepdefinitions.soap.tempconvert.celsiusToFahrenheit.CelsiusToFahrenheitCucumberStepDefinition.elUsuarioEjecutaLaConversionDeTemperaturaEnElAplicativoConUnValorInvalido()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el usuario deberia obtener el resultado de \"Error\"",
  "keyword": "Then "
});
formatter.match({
  "location": "co.com.sofka.stepdefinitions.soap.tempconvert.celsiusToFahrenheit.CelsiusToFahrenheitCucumberStepDefinition.elUsuarioDeberiaObtenerElResultadoDe(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});