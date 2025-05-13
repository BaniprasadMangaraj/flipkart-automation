package tests;


import org.testng.annotations.Test;
import base.BaseTest;
import pages.AddToCartPage;

public class AddToCartTest extends BaseTest {

    @Test
    public void addToCartAfterLogin() {
        AddToCartPage cartPage = new AddToCartPage(driver);
        cartPage.searchProduct("OnePlus 12");

        // wait and switch to new tab if required
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        cartPage.clickFirstProduct();
        cartPage.addToCart();
    }
}
