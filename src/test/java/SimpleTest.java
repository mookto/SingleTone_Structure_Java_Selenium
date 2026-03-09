import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Singleton থেকে driver নেওয়া
        driver = DriverManager.getDriver();
    }

    @Test
    public void openGoogle() throws InterruptedException {
        driver.get("https://www.google.com");

        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selectorshub.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='lJ9FBc']//input[@name='btnK']")).click();
    }

    @AfterMethod
    public void tearDown() {
        // সব টেস্ট শেষ হলে ব্রাউজার বন্ধ
        DriverManager.quitDriver();
    }
}