Feature: FB login feature

  Scenario: Login with invalid credentials into FB URL
    Given User open ChromeBrowser and type URL
    When user enter invalid UserName and Password
    And click on Login button
    Then verify Error message on screen
