Feature: Pruebas de Login en Demoblaze

  Background:
    * def config = call read('classpath:karate-config.js')
    * url config.baseUrl
    * configure headers = { Content-Type: 'application/json' }

  Scenario: Login con usuario y password correctos
    Given path 'login'
    And request { username: 'user_test_karate_123', password: '123456' }
    When method post
    Then status 200
    And print response

  Scenario: Login con usuario y password incorrectos
    Given path 'login'
    And request { username: 'user_test_karate_123', password: 'wrong_pass' }
    When method post
    Then status 200
    And print response
