Feature: Sabiranje brojeva
  Scenario Outline: Sabiranje dva cela broja
    Given prvi broj je <prviBroj>
    And drugi broj je <drugiBroj>
    When saberem brojeve
    Then rezultat treba da bude <rezultat>

    Examples:
      | prviBroj | drugiBroj | rezultat |
      | 2        | 3         | 5        |
      | 5        | 7         | 12       |
      | 10       | 20        | 30       |
      | -2       | 3         |  1       |
      | 0        | 8         |  8       |