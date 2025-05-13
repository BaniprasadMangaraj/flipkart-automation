package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AddToCartPage {
    private WebDriver driver;
    

    private By searchBar = By.xpath("//input[@placeholder='Search for Products, Brands and More']"); 

    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
      
    }


    public void searchProduct(String productName) {
        WebElement searchInput = driver.findElement(searchBar);
        searchInput.sendKeys(productName);
        searchInput.sendKeys(Keys.ENTER);  // hit Enter key to search
    }

    public void clickFirstProduct() {
        driver.findElement(By.xpath("//img[@loading='eager']")).click();
    }

    public void addToCart() {
        driver.findElement(By.xpath("(//*[name()='svg'][@class='KRzcNw'])[1]")).click();
    }

}
