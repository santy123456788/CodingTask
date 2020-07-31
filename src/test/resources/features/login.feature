@login

Feature:Login To DLG Digital

  Scenario:Login with valid credentials and verify
    Given I open login page
    And I login with test@qa-experience.com and Password1
    Then I verify the successfull message Successfully logged in! is displayed

  Scenario:Email format validation
    Given I open login page
    When I enter invalid email format test123
    Then I verify the Error message is visible