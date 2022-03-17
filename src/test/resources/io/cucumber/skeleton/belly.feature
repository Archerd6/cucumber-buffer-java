Feature: Belly

  Scenario: a few cukes
    Given I have 42 cukes in my belly
    When I wait 1 hour
    Then my belly should growl

    Scenario Outline: TamanoOk
    Given I have a Buffer
    When I sum <a> and <b>
    Then the result is <value>

    Examples: 
         |  a   |  b  |  value  |
         |  2   |  2  |    4    |
         |  0   |  0  |    0    |
         |  -2  |  1  |    -1   |