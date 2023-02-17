Feature: FB retest login feature
  
  Scenario Outline: 
    Given User open ChromeBrowser and type URL
    When user enter invalid "<UserName>" and "<Password>"
    And click on Login button
    Then verify Error message on screen

    Examples: 
      | UserName                             | Password          |
      | test1243d32edsf32@gmail.com          | 97941W$%rwsdfd    |
      | test12df546ydgf43d32edsf32@gmail.com | 97sdf941W$%rwsdfd |
      | testsgshs1243d32edsf32@gmail.com     | 9sdf7941W$%rwsdfd |
