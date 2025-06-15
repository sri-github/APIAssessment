Feature: Book API Testing
@smoke
  Scenario: Verify response elements of book API
    Given I have access to the Books API
    When I send a GET request to "/books"
    Then the response status code should be 200
    And the response time should be less than 2 seconds
    And the response body should contain book records
    And the response size should not be empty
