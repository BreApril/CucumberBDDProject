@createGroup
Feature: Create Group and Validate in Sign Up

  Scenario Outline: Admin creates a group and it appears in sign up dropdown
    Given I am on the login page
    And I enter admin email "<email>" and password "<password>"
    And I click the login button
    Then I should be logged in successfully
    Then I click on the logged in user
    And I click on the admin panel
    And I click on the groups tab
    And I click on the create new group button
    And I enter group name "<groupName>"
    And I enter group description "<groupDescription>"
    And I enter year "<year>"
    And I enter max capacity "<maxCapacity>"
    And I enter start date "<startDate>"
    And I enter end date "<endDate>"
    When I click on the create group button
    Then I should see the group created successfully
    And I logout
    And I navigate to the sign up page
    Then the created group should appear in the group dropdown

    Examples:
      | email           | password  | groupName      | groupDescription    | year | maxCapacity | startDate  | endDate    |
      | admin@gmail.com | @12345678 | BDD5 Test Group | BDD Test Pipeline   | 2026 |  20         |  20260101  |  20271231  |



