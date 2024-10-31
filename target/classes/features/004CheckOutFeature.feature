Feature: Checkout Website
  Scenario: Test007 Checkout Item
    When Test007 Validasi CheckOut Page
    And Test007 Input TextField <name> Yang Valid One
    And Test007 Input TextField <country> Yang Valid Two
    And Test007 Input TextField <city> Yang Valid Three
    And Test007 Input TextField <any> Yang Valid Four
    And Test007 Input TextField <any> Yang Valid Five
    And Test007 Input TextField <any> Yang Valid Six
    And Test007 Click Button purchase
    Then Test007 Klik Ok Pop Up

    Examples:
      | name | country | city | creditcard | month | year |
      | budi | indonesia | banyumas | 55612345 | March | 2024 |