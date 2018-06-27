import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class php_travels_login {

    static protected WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.phptravels.net/register");
        driver.findElement(By.name("firstname")).sendKeys("Rakesh");
        driver.findElement(By.name("lastname")).sendKeys("Mahajan");
        driver.findElement(By.name("phone")).sendKeys("07450445904");
        driver.findElement(By.name("email")).sendKeys("softtest452@gmail.com");
        driver.findElement(By.name("password")).sendKeys("test123");
        driver.findElement(By.name("confirmpassword")).sendKeys("test123");
        driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[9]/button")).click();

    }
}
