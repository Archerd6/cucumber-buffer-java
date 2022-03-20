Feature: TestGlobal

   Scenario Outline: Put
    Given I have a <string>buffer with a capacity of 5
    When I add a "element"
    Then It is added to the buffer
		
    Examples:
      | element |
      |   one   |
      |   two   |
      |   tree  |
      |   four  |
      
   Scenario: Size
    Given I have a <string>buffer with a capacity of 3
    When I add a "first string"
    When I add a "second string"
    When I add a "third string"
    Then The size should be full
   
   Scenario: Get
    Given I have a <string>buffer with a capacity of 8
    When I add the first element "first string"
    When I add a "second string"
    When I add a "third string"
    Then Get should be the first string
    
   Scenario: Emptiness
    Given I have a <string>buffer with a capacity of 88
    Then The buffer should be empty
   
   Scenario: Fullness
    Given I have a full buffer
    When I add a "element"
    Then I can't add the element
    		