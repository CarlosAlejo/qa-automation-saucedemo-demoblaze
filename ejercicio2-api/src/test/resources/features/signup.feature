Feature: Pruebas de Signup en Demoblaze

  Background:
    * def config = call read('classpath:karate-config.js')
    * url config.baseUrl
    * configure headers = { Content-Type: 'application/json' }

  Scenario: Crear un nuevo usuario
    Given path 'signup'
    And request { username: 'user_test_karate_123', password: '123456' }
    When method post
    Then status 200
    And print response

  Scenario: Intentar crear un usuario ya existente
    Given path 'signup'
    And request { username: 'user_test_karate_123', password: '123456' }
    When method post
    Then status 200
    And print response
