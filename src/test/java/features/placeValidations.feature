Feature: Validating place APIs

@AddPlace @Regression
Scenario Outline: Verify if place is being successfully added using AddPlaceAPI

    Given Add place payload with "<name>" "<language>" "<address>"
    When User calls "AddPlaceAPI" with "POST" http request
    Then The API call got success with status code 200
    And "status" in response body is "OK"
    And "scope" in response body is "APP"
    And verify place id created maps to "<name>" using "getPlaceAPI"

Examples: 
		|name 	 |language |address 					 |
		|Aahouse |English  |World cross center |
#		|Bbhouse |Spanish  |World center 			 |		

@DeletePlace @Regression
Scenario: Verify if delete place functionality working
		Given DeletePlace payload
		When User calls "deletePlaceAPI" with "POST" http request
		Then The API call got success with status code 200
		And "status" in response body is "OK"
