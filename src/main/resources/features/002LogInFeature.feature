Feature: LogIn Website
  Scenario:Test002 LogIn Website (user)
    When Test002 Click Button Log In
    And Test002 Input TextField <username> Yang Valid One
    And Test002 Input TextField <password> Yang Valid Two
    Then Test002 Click Button Login Form


    Examples:
      | username | password |
      | jajajakcvasdgsa | jajak4k4 |