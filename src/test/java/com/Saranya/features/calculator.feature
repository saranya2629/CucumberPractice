Feature: Verify calculator operations

  Scenario: Verify addition of two numbers
    Given I am on calculator page
    When I enter number 1
    And I click on operator '+'
    When I enter number 2
    Then I verify the result as 3


    Scenario Outline: Verify all operations
      Given I am on calculator page
      When I enter <number1>
      And I click on '<operator>'
      When I enter <number2>
      Then I verify the <result>
      Examples:
      |number1|number2|operator|result|
      |1      |2      |+       |3     |
      |5      |3      |-       |2     |
      |4      |2      |*       |8     |
      |6      |2      |/       |3     |


