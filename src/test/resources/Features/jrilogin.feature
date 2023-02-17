Feature: JRI login feature

  Scenario: JRI login with invalid data
    Given Open JRI app using ChromeBrowser
    When User type invalid credentisla
    And Click on SecureSignin button
    Then verify ErrorMessage
