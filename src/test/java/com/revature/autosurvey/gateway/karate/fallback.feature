
Feature: Make call to Fallback URL and get Fallback Responses
Background:
  	* def fallbackUrl = 'http://localhost:8080/fallback'
  	
  Scenario: Perform a Get request on the Fallback
    Given url fallbackUrl
    When method get
    Then status 200

 Scenario: Perform a Put request on the Fallback
    Given url fallbackUrl
    When method put
    Then status 503
    
 Scenario: Perform a Post request on the Fallback
    Given url fallbackUrl
    When method post
    Then status 503

 Scenario: Perform a Delete request on the Fallback
    Given url fallbackUrl
    When method delete
    Then status 503