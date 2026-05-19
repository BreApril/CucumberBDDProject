package Pages;

import Steps.createGroupSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id='app-root']/nav/div[1]/div[3]/div/button/span[2]")
    WebElement userDropdown;

    @FindBy(xpath = "//*[@id='app-root']/nav/div[1]/div[3]/div/div/button[4]/span[2]")
    WebElement adminPanelButton;

    @FindBy(xpath = "//*[@id='app-root']/div/div[2]/nav/button[4]")
    WebElement groupsLink;

    @FindBy(xpath = "//*[@id='app-root']/div/div[3]/div/div[2]/button")
    WebElement createNewGroupButton;

    @FindBy(xpath = "//*[@id='app-root']/div/div[3]/div/div[4]/div/form/div[1]/input")
    WebElement groupNameInput;

    @FindBy(xpath = "//*[@id='app-root']/div/div[3]/div/div[4]/div/form/div[2]/textarea")
    WebElement descriptionInput;

    @FindBy(xpath = "//*[@id='app-root']/div/div[3]/div/div[4]/div/form/div[3]/div[1]/input")
    WebElement yearInput;

    @FindBy(xpath = "//*[@id='app-root']/div/div[3]/div/div[4]/div/form/div[3]/div[2]/input")
    WebElement maxCapacityInput;

    @FindBy(xpath = "//*[@id='app-root']/div/div[3]/div/div[4]/div/form/div[4]/div[1]/input")
    WebElement startDateInput;

    @FindBy(xpath = "//*[@id='app-root']/div/div[3]/div/div[4]/div/form/div[4]/div[2]/input" )
    WebElement endDateInput;

    @FindBy(xpath = "//*[@id='app-root']/div/div[3]/div/div[4]/div/form/div[5]/button[1]")
    WebElement createGroupButton;

    @FindBy(xpath = "//*[@id='app-root']/div/div[2]/div[2]/button")
    WebElement backToWebsiteButton;

    @FindBy(xpath = "//*[@id='app-root']/nav/div[1]/div[3]/div/div/button[5]/span[2]")
    WebElement logoutButton;

    public AdminPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickUserDropdown() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(userDropdown));
        userDropdown.click();
    }

    public void clickAdminPanel() {
        adminPanelButton.click();
    }

    public void clickGroups() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(groupsLink));
        groupsLink.click();
    }

    public void clickCreateNewGroup() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(createNewGroupButton));
        createNewGroupButton.click();
    }

    public void fillGroupDetails(String groupName, String description, String year, String capacity, String startDate, String endDate) {
        groupNameInput.sendKeys(groupName);
        descriptionInput.sendKeys(description);
        yearInput.clear();
        yearInput.sendKeys(year);
        maxCapacityInput.sendKeys(capacity);
        startDateInput.sendKeys(startDate);
        endDateInput.sendKeys(endDate);
    }

    public void clickCreateGroup() {
        createGroupButton.click();
    }

    public void clickBackToWebsite() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(backToWebsiteButton));
        backToWebsiteButton.click();
    }

    public void clickLogout() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(logoutButton));
        logoutButton.click();
    }

}
