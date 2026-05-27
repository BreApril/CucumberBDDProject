package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpPage {
    WebDriver driver;

    @FindBy(id = "signup-toggle")
    WebElement signUpButton;

    @FindBy(id = "register-group")
    WebElement groupDropdown;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignUpButton() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(signUpButton));
        signUpButton.click();
    }

    //    public boolean isGroupPresentInDropdown(String groupName) {
//        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(groupDropdown));
//        Select select = new Select(groupDropdown);
//        return  select.getOptions().stream()
//                .anyMatch(option -> option.getText().equals(groupName));
//    public boolean isGroupPresentInDropdown(String groupName) {
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        WebElement dropdownElement = wait.until(
//                ExpectedConditions.visibilityOfElementLocated(
//                        By.id("groupDropdown")
//                )
//        );
//
//        Select dropdown = new Select(dropdownElement);
//
//        for (WebElement option : dropdown.getOptions()) {
//
//            System.out.println("Dropdown option: " + option.getText());
//
//            if (option.getText().trim().equalsIgnoreCase(groupName.trim())) {
//                return true;
//            }
//        }
//
//        return false;
//    }
//    public boolean isGroupPresentInDropdown(String groupName) {
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        WebElement dropdownElement = wait.until(
//                ExpectedConditions.visibilityOfElementLocated(
//                        By.id("register-group")
//                )
//        );
//
//        Select dropdown = new Select(dropdownElement);
//
//        for (WebElement option : dropdown.getOptions()) {
//
//            System.out.println("Dropdown option: " + option.getText());
//
//            if (option.getText().trim().equalsIgnoreCase(groupName.trim())) {
//                return true;
//            }
//        }
//
//        return false;
//    }
    public boolean isGroupPresentInDropdown(String groupName) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement dropdownElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("register-group")
                )
        );

        wait.until(driver ->
                dropdownElement.getText().contains(groupName)
        );

        Select dropdown = new Select(dropdownElement);

        for (WebElement option : dropdown.getOptions()) {

            System.out.println("Dropdown option: " + option.getText());

            if (option.getText().contains(groupName)) {
                return true;
            }
        }

        return false;
    }
}
