Feature: Error scenarios for Simple Books API


Scenario: Filter books with an invalid available value
    When I send a GET request to "/books?available=maybe"
    Then the response status code should be 200
    And the response body should not be empty


  Scenario: Get a book with an invalid ID (string instead of number)
    When I send a GET request to "/books/invalid-id"
    Then the response status code should be 404
    And the response should contain "No book with id NaN"

  
  Scenario: Get a book with a non-existent ID
    When I send a GET request to "/books/99999"
    Then the response status code should be 404
    And the response should contain "No book with id 99999"


  Scenario: Filter books with an invalid type
    When I send a GET request to "/books?type=unknown"
    Then the response status code should be 400
    And the response size should not be empty

  Scenario: Access books endpoint with an unsupported HTTP method
    When I send a PUT request to "/books"
    Then the response status code should be 404
    And the response should contain "Cannot PUT"