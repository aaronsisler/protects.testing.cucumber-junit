Feature: Calculator

  Scenario: Add some integers
    Given I have 1 and 4
    When I add those numbers
    Then I get 5


  Scenario Outline: Add some integers from table
    Given I have two numbers
      | <first> | <second> |
    When I add those numbers
    Then I get the correct result
      | <result> |

    Examples:
      | first | second | result |
      | 2     | 5      | 7      |
      | 3     | 7      | 10     |