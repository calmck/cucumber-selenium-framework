Feature: I am a feature file, and this should be a brief summary of what that feature is
  Here I should describe what the feature I am testing is
  I can use as many lines as I want, but it's always good to be concise

  Background: I am a background, and I will run before all the Scenarios within this feature file
    Given I am a pre-requisite for all scenarios for this feature
    When I am an action
    Then I am a result

  Scenario: I am a scenario and will test one or more acceptance criteria for this feature
    Given some pre-requisite
    And some other pre-requisite
    When I do this action
    And I do another action
    Then this thing should happen
    But this thing should not happen

  Scenario Outline: I will run several scenarios with different inputs and results
    Given some pre-requisite
    When I have this <input>
    Then I should get this <output>
    Examples:
      | input  | output    |
      | Callum | McKeefery |
      | Daniel | Wood      |

  Scenario Template: Not really sure what I do?
    Scenarios: I don't know what this is either

    