import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class newtours_login
{
    static protected WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=649bc8cf2ce17ae2d091bce2b50775af");
        driver.findElement(By.name("firstName")).sendKeys("Rakesh");
        driver.findElement(By.name("lastName")).sendKeys("Mahajan");
        driver.findElement(By.name("phone")).sendKeys("07450445904");
        driver.findElement(By.id("userName")).sendKeys("softtest452@gmail.com");
        driver.findElement(By.name("address1")).sendKeys("24 cranbourne road");
        driver.findElement(By.name("address2")).sendKeys("Slough");
        driver.findElement(By.name("city")).sendKeys("Slough");
        driver.findElement(By.name("state")).sendKeys("Berks");
        driver.findElement(By.name("postalCode")).sendKeys("143001");
        driver.findElement(By.name("country")).sendKeys("UNITED STATES");
        driver.findElement(By.id("email")).sendKeys("softtest452@gmail.com");
        driver.findElement(By.name("password")).sendKeys("test1");
        driver.findElement(By.name("confirmPassword")).sendKeys("test1");
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input")).click();
        driver.quit();
    }
}
