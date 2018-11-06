Feature: Find by department and product category

  Scenario Outline: Amazon FindByDepartment
    Given that I'm in amazon's app
    When I click on the menu buttom
    And click on Buscar por Departamento
    And select "<department>"
    Then I should see "<section>" and enable
    Examples:
      | department  | section   |
      | Informática | Monitores |

