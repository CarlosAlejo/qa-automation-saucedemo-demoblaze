Feature: Signup Demoblaze API

  Background:
    * url baseUrl
    * configure headers = { Content-Type: 'application/json' }

  Scenario: Crear un nuevo usuario
    * def requestBody =
    """
    {
      "username": "user_test_karate_01",
      "password": "123456"
    }
    """
    Given path 'signup'
    And request requestBody
    When method post
    Then status 200
    And match response == {}

  Scenario: Crear usuario ya existente
    * def requestBody =
    """
    {
      "username": "user_test_karate_01",
      "password": "123456"
    }
    """
    Given path 'signup'
    And request requestBody
    When method post
    Then status 200
    And match response.errorMessage contains 'This user already exist.'
