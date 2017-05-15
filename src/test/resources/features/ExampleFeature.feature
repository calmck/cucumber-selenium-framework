Feature: I am a feature file, and this should be a brief summary of what that feature is
  Here I should describe what the feature I am testing is
  I can use as many lines as I want, but it's always good to be concise

  @wip
  Scenario: book a flight from newcastle (NCL) to Chennai (MAA)
    Given We are logged into the expedia page
    When I choose NCL as my departure airport
    And I choose MAA as my arrival airport
    And I choose the departure date of "06/05/2017"
    And I choose the returning date of "13/05/2017"
    Then I click the "Search" button