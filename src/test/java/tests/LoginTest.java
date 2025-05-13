package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginWithMobileAndOTP() throws InterruptedException {
        classTest.info("Test Started: loginWithMobileAndOTP");

        LoginPage login = new LoginPage(driver);

        // STEP 1: Click the LOGIN button on top-right of Flipkart home
        classTest.info("Clicking login button");
        login.clickLoginButton();

        // STEP 2: Enter the mobile number (from config.properties)
        classTest.info("Entering mobile number");
        login.enterMobileNumber(prop.getProperty("mobile"));

        // STEP 3: Click "Request OTP"
        classTest.info("Clicking 'Request OTP'");
        login.clickRequestOTP();

        // STEP 4: Wait for OTP field to appear (5 seconds wait)
        classTest.info("Waiting for OTP input to appear");
        Thread.sleep(5000);

        // STEP 5: Enter OTP (mock or skip)
        // classTest.info("Entering OTP");
        // login.enterOTP(prop.getProperty("otp"));

        // STEP 6: Click Verify
        classTest.info("Clicking 'Verify'");
        Thread.sleep(1000);
        login.clickVerify();

        
    }
}
