import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Guru99_Login {
    static protected WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/v4");
        driver.findElement(By.name("uid")).sendKeys("mngr139514");
        driver.findElement(By.name("password")).sendKeys("UvYpYmY");
        driver.findElement(By.name("btnLogin")).click();
        driver.findElement(By.xpath("//a[@href='addcustomerpage.php']")).click();
        driver.findElement(By.name("name")).sendKeys("Rakesh");
        driver.findElement(By.name("rad1")).click();
        driver.findElement(By.name("dob")).sendKeys("22/11/1981");
        driver.findElement(By.name("addr")).sendKeys("24 Cranbourne Road");
        driver.findElement(By.name("city")).sendKeys("Slough");
        driver.findElement(By.name("state")).sendKeys("London");
        driver.findElement(By.name("pinno")).sendKeys("143001");
        driver.findElement(By.name("telephoneno")).sendKeys("07450445904");
        driver.findElement(By.name("emailid")).sendKeys("mahajan452@gmail.com");
        driver.findElement(By.name("password")).sendKeys("test1");
        driver.findElement(By.name("sub")).click();
       // driver.quit();
    }
}
