package Pages;

import Steps.createGroupSteps;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id='app-root']/nav/div[1]/div[3]/div/button/span[2]")
    WebElement userDropdown;

    @FindBy(xpath = "//*[@id='app-root']/nav/div[1]/div[3]/div/div/button[4]")
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

//    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[2]/div[2]/button")
//    WebElement backToWebsiteButton;
//    @FindBy(xpath = "//button[text()='Back to Website']")
//    WebElement backToWebsiteButton;
//
    By backToWebsite = By.xpath("//button[contains(.,'Back to Website')]");

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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(adminPanelButton));
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

    public void enterGroupName(String groupName) {
        groupNameInput.sendKeys(groupName);
    }

    public void enterGroupDescription(String description) {
        descriptionInput.sendKeys(description);
    }

    public void enterYear(String year) {
        yearInput.clear();
        yearInput.sendKeys(year);
    }

    public void enterMaxCapacity(String capacity) {
        maxCapacityInput.sendKeys(capacity);
    }

    public void enterStartDate(String startDate) {
        startDateInput.sendKeys(startDate);
    }

    public void enterEndDate(String endDate) {
        endDateInput.sendKeys(endDate);
    }

    public void clickCreateGroup() {
        createGroupButton.click();
            // Wait for modal to appear then dismiss with Escape
            try {
                Thread.sleep(2000);
                new org.openqa.selenium.interactions.Actions(driver).sendKeys(org.openqa.selenium.Keys.ESCAPE).perform();
            } catch (Exception e) {
                // continue
            }
    }

    public void clickBackToWebsite() {
//        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(backToWebsiteButton));
//        backToWebsiteButton.click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(
//                By.xpath("//div[contains(@style,'position: fixed')]")
//        ));
//        wait.until(ExpectedConditions.elementToBeClickable(backToWebsiteButton));
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//
//        wait.until(ExpectedConditions.elementToBeClickable(backToWebsiteButton));
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(
//                By.xpath("//*[contains(text(),'successfully')]")
//        ));
//
//        wait.until(ExpectedConditions.elementToBeClickable(backToWebsiteButton));
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//
//            wait.until(ExpectedConditions.invisibilityOfElementLocated(
//                    By.cssSelector("div[style*='position: fixed']")
//            ));
//
//            wait.until(ExpectedConditions.elementToBeClickable(backToWebsiteButton));

//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//            wait.until(ExpectedConditions.elementToBeClickable(backToWebsiteButton));
//
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//
//            js.executeScript("arguments[0].click();", backToWebsiteButton);
//
//            backToWebsiteButton.click();

//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//
//            WebElement backButton = wait.until(
//                    ExpectedConditions.elementToBeClickable(
//                            By.xpath("//*[@id='app-root']//button")
//                    )
//            );
//
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        js.executeScript("arguments[0].click();", backButton);
//    }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            WebElement button = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(backToWebsite)
            );

            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].scrollIntoView(true);", button);

            wait.until(ExpectedConditions.elementToBeClickable(button));

            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].click();", button);
        }

    public void clickLogout() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(logoutButton));
        logoutButton.click();
        Alert alert = driver.switchTo().alert();

        alert.accept();
    }

}
