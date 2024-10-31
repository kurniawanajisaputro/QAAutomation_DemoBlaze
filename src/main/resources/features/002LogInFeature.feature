Feature: LogIn Website
  Scenario:Test002 LogIn Website (user)
    When Test002 Validasi website
    And Test002 Click Button Log In
    And Test002 Input TextField <any> Yang Valid One
    And Test002 Input TextField <any> Yang Valid Two
    And Test002 Click Button Login Form
    And Test003 Validasi website

    Examples:
      | username | password |
      | jajajakakaka | jajakiki |