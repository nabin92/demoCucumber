Feature: Logging into Rediff Money

  @Login12
  Scenario Outline: Logging into Rediff
    Given I open <Browser>
    And I go to loginURL
    And I click link register
#    And I Login inside application
#    |nabin.ghosh99| Capita|
#    Then Login should be <Result>
    
    Examples: 
      |Browser |   Result     |
      #|Mozilla |   success    |
      |Chrome  |   success    |