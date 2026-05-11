package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class createGroupSteps {
    WebDriver driver;

    @Given("I am on the login page")
    public void i_am_on_the_login_page(); {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
    }
    @And("I enter admin email {string} and password {string}")
    public void i_enter_admin_email_and_password(String email, String password){
    }
    @And("I click the login button")
    public void i_click_the_login_button(); {
    }
    @When("I navigate to the admin panel")
    public void i_navigate_to_the_admin_panel(); {
    }
    @And("I click on groups")
    public void i_click_on_groups(); {
    }
    @And("I create a new group with all fields populated")
    public void i_create_a_new_group(); {
    }
    @And("I logout")
    public void i_logout(); {
    }
    @And("I navigate to the sign up page")
    public void i_navigate_to_the_sign_up_page(); {
    }
    @Then("The created group should appear in the group dropdown")
    public void the_created_group_should_appear(); {

    }
}
