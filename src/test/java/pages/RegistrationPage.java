package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Locators
    private By loginButtonOnHomePage = By.xpath("//a[contains(text(),'Login')]");
    private By createAccountLink = By.xpath("//a[normalize-space()='New to Flipkart? Create an account']");
    private By mobileField = By.xpath("//input[@class='r4vIwl BV+Dqf']");
    private By continueButton = By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']");
    private By nameField = By.xpath("//input[@name='name']");
    private By emailField = By.xpath("//input[@name='email']");
    private By passwordField = By.xpath("//input[@type='password']");
    private By submitButton = By.xpath("//button[normalize-space()='Signup']");

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void clickLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButtonOnHomePage)).click();
    }

    public void clickCreateAccount() {
        wait.until(ExpectedConditions.elementToBeClickable(createAccountLink)).click();
    }

    public void enterMobile(String mobile) {
        WebElement mobileInput = wait.until(ExpectedConditions.visibilityOfElementLocated(mobileField));
        mobileInput.clear();
        mobileInput.sendKeys(mobile);
    }

    public void clickContinue() {
        wait.until(ExpectedConditions.elementToBeClickable(continueButton)).click();
    }

    public void enterName(String name) {
        WebElement nameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(nameField));
        nameInput.clear();
        nameInput.sendKeys(name);
    }

    public void enterEmail(String email) {
        WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(emailField));
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement pwdInput = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
        pwdInput.clear();
        pwdInput.sendKeys(password);
    }

    public void clickSignup() {
        wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
    }
}
