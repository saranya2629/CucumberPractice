Feature: Fraction Calculator

  @web
  Scenario Outline: Verify Fraction calculator operations
    Given I am on Fraction Calculator page
    When I enter '<numerator1>' and '<denominator1>'
    And I select '<operator>'
    And I also enter '<numerator2>' and '<denominator2>'
    And I click on Calculate button
    Then I verify the '<result>' displayed
    Examples:
    |numerator1|denominator1|numerator2|denominator2|operator|result|
    |2        |7          |3       |8               |+       |0.66071428571429|
    |6        |7          |2       |5               |-       |0.45714285714286|
    |8        |9          |2       |9               |*       |0.19753086419753|
    |3        |9          |2       |8               |/       |1.3333333333333 |