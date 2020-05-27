Feature: Calcular calorias de diferentes deportes

  @Calorias

Scenario Outline: Calcular calorias
Given se encuentra en la pagina de calcular calorias
    When se escoge una <actividad>, se ingresa el <peso>, <tiempo>
    Then se obtienen las calorias <resultado>, se guarda la <evidencia>

    Examples:

      | actividad | peso | tiempo | resultado | evidencia|
      | "futbol"    | 85   | 90     | "1026.6"    | "calorias1"        |
      | "bailar"    | 50   | 180    | "673.2"     | "calorias2"        |
      | "tenis"     | 52   | 75     | "420.4"     | "calorias3"        |
      | "vertv"     | 82   | 30     | "43.3"      | "calorias4"        |