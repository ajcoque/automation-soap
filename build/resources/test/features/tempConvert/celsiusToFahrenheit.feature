# new feature
# Tags: optional

Feature: Convertir temperatura - Celsius a Fahrenheit
  Como usuario de un aplicativo web que permite convertir de celsius a fahrenheit
  necesito validar que la funcionalidad de convertir de celsius a fahrenheit trabaje adecuadamente
  para poder tener seguridad del resultado y poder hacer uso del mismo.

  Scenario: Convertir grados celius a grados fahrenheit pasando valores validos
    Given el usuario ha definido un valor de "10.2" grados celsius valido para el sistema
    When el usuario ejecuta la conversion de temperatura en el aplicativo
    Then el ususario debería obtener el resultado "50.26" grados fahrenheit