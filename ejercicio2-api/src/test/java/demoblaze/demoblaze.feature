Feature: Smoke test Demoblaze - Versión JSON

  Background:
    * url 'https://api.demoblaze.com'
    * configure headers = {  'Content-Type': 'application/json',   'Accept': '*/*'  }

  Scenario: Probar signup con JSON
    Given path '/signup'
    And request { username: 'test_tmp_123', password: '123456' }
    When method post
    Then status 200
    And print 'Respuesta JSON:', response