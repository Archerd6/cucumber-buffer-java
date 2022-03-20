# cucumber-calculadora-java
## David Ramírez
#### Especificación de pruebas usando Cucumber y Gherkin 

#### El archivo *Test.feature* contiene todas las pruebas como distintos escenarios

- *Put*: Contiene pruebas del método BufferAcotado.put()    &nbsp; &nbsp; &nbsp;    **Escenario Outline**\
    Given I have a <string>buffer with a capacity of 5\
    When I add a "element"\
    Then It is added to the buffer

- *Size*: Contiene pruebas que comprueban el tamaño del buffer    &nbsp; &nbsp; &nbsp;    **Escenario**\
    Given I have a <string>buffer with a capacity of 3\
    When I add a "first string"\
    When I add a "second string"\
    When I add a "third string"\
    Then The size should be full

- *Get*: Contiene pruebas del método BufferAcotado.get()    &nbsp; &nbsp; &nbsp;    **Escenario**\
    Given I have a <string>buffer with a capacity of 8\
    When I add the first element "first string"\
    When I add a "second string"\
    When I add a "third string"\
    Then Get should be the first string


- *Emptiness*: Contiene pruebas que comprueban el funcionamiento del buffer estando vacío    &nbsp; &nbsp; &nbsp;    **Escenario**\
    Given I have a <string>buffer with a capacity of 88\
    Then The buffer should be empty


- *Fullness*: Contiene pruebas que comprueban el funcionamiento del buffer estando lleno     &nbsp; &nbsp; &nbsp;    **Escenario**\
    Given I have a full buffer\
    When I add a "element"\
    Then I can't add the element



