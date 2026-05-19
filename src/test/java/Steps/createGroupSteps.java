package Steps;

import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class createGroupSteps extends Base {

    String createdGroupName;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        homePage.clickLoginButton();
        loginPage.verifyLoginPageIsDisplayed();
    }

  @And("I enter admin email {string} and password {string}")
  public void i_enter_admin_email_and_password(String email, String password) {
//      System.out.println("Email: " + email);
//      System.out.println("Password: " + password);
      loginPage.enterEmail(email);
      loginPage.enterPassword(password);
    }

    @And("I click the login button")
    public void i_click_the_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
    }

    @Then("I click on the logged in user")
    public void i_click_on_the_logged_in_user() {
        adminPage.clickUserDropdown();
    }

    @And("I click on the admin panel")
    public void i_click_on_the_admin_panel() {
        adminPage.clickAdminPanel();
    }

    @And("I click on the groups tab")
    public void i_click_on_the_groups_tab() {
        adminPage.clickGroups();
    }

    @And("I click on the create group button")
    public void i_click_on_the_create_group_button() {
        adminPage.clickCreateNewGroup();
    }

    @And("I enter group name {string}")
    public void i_enter_group_name(String groupName) {
        createdGroupName = groupName;
        adminPage.enterGroupName(groupName);
    }

    @And("I enter group description {string}")
    public void i_enter_group_description(String groupDescription) {
        adminPage.enterGroupDescription(groupDescription);
    }

    @And("I enter year {string}")
    public void i_enter_year(String year) {
        adminPage.enterYear(year);
    }

    @And("I enter max capacity {string}")
    public void i_enter_max_capacity(String maxCapacity) {
        adminPage.enterMaxCapacity(maxCapacity);
    }

    @And("I enter start date")
    public void i_enter_start_date(String startDate) {
        adminPage.enterStartDate(startDate);
    }

    @And("I enter end date {string}")
    public void i_enter_end_date(String endDate) {
        adminPage.enterEndDate(endDate);
    }

    @When("I click on the create group button")
    public void i_click_on_the_create_group_button() {
        adminPage.clickCreateGroup();
    }

    @Then("I should see the group created successfully")
    public void i_should_see_the_group_created_successfully() {
    }

    @And("I logout")
    public void i_logout() {
        adminPage.clickBackToWebsite();
        adminPage.clickUserDropdown();
        adminPage.clickLogout();
    }

    @And("I navigate to the sign up page")
    public void i_navigate_to_the_sign_up_page() {
        signUpPage.clickSignUpButton();
    }

    @Then("the created group should appear in the group dropdown")
    public void the_created_group_should_appear() {
        assert signUpPage.isGroupPresentInDropdown(createdGroupName);
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}