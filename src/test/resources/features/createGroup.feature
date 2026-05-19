@createGroup
Feature: Create Group and Validate in Sign Up

  Scenario Outline: Admin creates a group and it appears in sign up dropdown
    Given I am on the login page
    And I enter admin email "<email>" and password "<password>"
    And I click the login button
    Then I should be logged in succesfully
    Then I click on the logged in user
    And I click on the admin panel
    And I click on the groups tab
    And I click on the create group button
    And I enter group name "<groupName>"
    And I enter group description "<groupDescription>"
    And I enter year "<year>"
    And I enter max capacity "<maxCapacity>"
    And I enter start date "<startDate>"
    And I enter end date "<endDate>"
    When I click on the create group button
    Then i should see the group created successfully
    And I logout
    And I navigate to the sign up page
    Then the created group should appear in the group dropdown

    Examples:
      | email           | password  | groupName      | groupDescription    | year | maxCapacity | startDate  | endDate    |
      | admin@gmail.com | @12345678 | BDD Test Group | BDD Test Pipeline   | 2026 |  20         |  01012026  |  31122027  |



#seperate populate line and add data to examples table, adjust assignment accordingly