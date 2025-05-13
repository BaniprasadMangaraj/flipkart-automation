package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage {
    private WebDriver driver;

    // Locators
    private By loginButtonOnHomePage = By.xpath("//a[contains(text(),'Login')]");
    private By mobileField = By.xpath("//input[@class='r4vIwl BV+Dqf']");   
    private By requestOTPButton = By.xpath("//button[normalize-space()='Request OTP']");
    //private By otpField = By.xpath("//form[@autocomplete='on']//input[@maxlength='1' and @autocomplete='off' and @type='text']");
    private By verifyButton = By.xpath("//button[normalize-space()='Verify']");

    //Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLoginButton() {
        driver.findElement(loginButtonOnHomePage).click();
    }

    public void enterMobileNumber(String mobile) {
        driver.findElement(mobileField).sendKeys(mobile);
    }

    public void clickRequestOTP() {
        driver.findElement(requestOTPButton).click();
    }

    //public void enterOTP(String otp) {
    	 //driver.findElement(otpField).click();
       // driver.findElement(otpField).sendKeys(otp);
   // }

    
    public void clickVerify() {
        driver.findElement(verifyButton).click();
    }
}
