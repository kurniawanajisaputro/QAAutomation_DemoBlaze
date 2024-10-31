Feature: LogIn Website
  Scenario:Test002 LogIn Website (user)
    When Test002 Pop Out Sign Up Berhasil
    And Test002 Validasi website
    And Test002 Click Button Log In
    And Test002 Input TextField <any> Yang Valid One
    And Test002 Input TextField <any> Yang Valid Two
    Then Test002 Click Button Login Form


    Examples:
      | username | password |
      | jajajakvvvvv | jajak4k4 |