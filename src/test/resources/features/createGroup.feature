@createGroup
Feature: Create Group and Validate in Sign Up

  Scenario Outline: Admin creates a group and it appears in sign up dropdown
    Given I am on the login page
    And I enter admin email <email> and password <password>
    And I click the login button
    When I navigate to the admin panel
    And I click on Groups
    And I create a new group with all fields populated
    And I logout
    And I navigate to the sign up page
    Then the created group should appear in the group dropdown

    Examples:
     | email           | password
     | admin@gmail.com | @12345678

