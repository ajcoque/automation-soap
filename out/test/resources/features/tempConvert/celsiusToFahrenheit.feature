
Feature: Convertir temperatura - Celsius a Fahrenheit
  Como usuario de un aplicativo web que permite convertir de celsius a fahrenheit
  necesito validar que la funcionalidad de convertir de celsius a fahrenheit trabaje adecuadamente
  para poder tener seguridad del resultado y poder hacer uso del mismo.


  Scenario: Convertir grados celius a grados fahrenheit pasando valores validos
    Given el usuario ha definido un valor de "10.2" grados celsius valido para el sistema
    When el usuario ejecuta la conversion de temperatura en el aplicativo
    Then el usuario deberia obtener el resultado "50.36" grados fahrenheit

  Scenario: Convertir grados celius a grados fahrenheit pasando valores invalidos
    Given el usuario ha definido un valor de "#10.2" invalido para el sistema
    When el usuario ejecuta la conversion de temperatura en el aplicativo con un valor invalido
    Then el usuario deberia obtener el resultado de "Error"