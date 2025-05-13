package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import utils.ExtentManager;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {


public WebDriver driver;
public Properties prop;
public static ExtentReports extent;
public ExtentTest classTest;

@BeforeSuite
public void setupReport() throws IOException {
    extent = ExtentManager.getInstance();
}

@BeforeClass
public void setUp() throws IOException {
    // Create ExtentTest node for current test class
    String className = this.getClass().getSimpleName();
    classTest = extent.createTest(className);

    // Load properties
    prop = new Properties();
    FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
    prop.load(fis);

    // Setup WebDriver
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();

    // Timeouts from config
    int implicitWait = Integer.parseInt(prop.getProperty("implicitWait"));
    int pageLoadTimeout = Integer.parseInt(prop.getProperty("pageLoadTimeout"));

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTimeout));
    driver.manage().window().maximize();

    // Open Flipkart URL
    driver.get(prop.getProperty("baseUrl"));
}

@AfterClass
public void tearDown() {
    if (driver != null) {
        driver.quit();
    }
}

@AfterSuite
public void flushReport() {
    if (extent != null) {
        extent.flush();
    }
}


}
