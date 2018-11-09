@F2
Feature: Search an element by text input

  Scenario Outline: Amazon FindByTextInput
    Given that I'm in amazon's app
    When I type "<product>" and enter
    Then I check that there is a product with "<brand>"
    Examples:
      | product  | brand   |
      | Smart TV | Samsung |
