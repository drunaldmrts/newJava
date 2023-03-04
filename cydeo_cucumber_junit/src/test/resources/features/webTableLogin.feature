Feature: User should be login using correct credentials
  @wip
  Scenario: Positive login scenario
    Given user is on the login page of web table app
    When user enters username "Test"
    And user enters password "Tester"
    And user clicks the login button
    Then user should see url contains order