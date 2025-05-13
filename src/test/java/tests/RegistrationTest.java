package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.RegistrationPage;

public class RegistrationTest extends BaseTest {

    @Test
    public void createNewFlipkartAccount() throws InterruptedException {
        RegistrationPage reg = new RegistrationPage(driver);

        // Step 1: Open login popup
        reg.clickLogin();

        // Step 2: Click "Create an account"
        reg.clickCreateAccount();

        // Step 3: Enter Mobile number
        reg.enterMobile(prop.getProperty("newregmobile")); // Use unique test number

        // Step 4: Click Continue
        reg.clickContinue();

        // Wait for form to load
        Thread.sleep(3000);

        // Step 5: Fill name, email, password
        reg.enterName("Test User");
        reg.enterEmail("testuser@example.com"); // Use disposable/test email
        reg.enterPassword("Test@1234");

        // Step 6: Click Signup
        reg.clickSignup();

        
    }
}
