Feature: TestGlobal

   Scenario: Get
    Given I have a buffer with a capacity of 3
    When I add the first element "element1"
    When I add an "element2"
    When I add an "element3"
    Then The first element to get should be the first I have put in the buffer