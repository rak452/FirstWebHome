import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class automation_Login {
    static protected WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?controller=authentication");
        driver.findElement(By.id("email_create")).sendKeys("softtest452@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Rakesh");
        driver.findElement(By.id("customer_lastname")).sendKeys("Mahajan");
        driver.findElement(By.name("email"));//.sendKeys("softtest452@gmail.com");
        driver.findElement(By.name("passwd")).sendKeys("test1");
        driver.findElement(By.name("days")).sendKeys("22");
        driver.findElement(By.name("months")).sendKeys("Novemder");
        driver.findElement(By.name("years")).sendKeys("1981");
        driver.findElement(By.name("newsletter")).click();
        driver.findElement(By.name("optin")).click();
        driver.findElement(By.name("firstname")).sendKeys("Rakesh");
        driver.findElement(By.name("lastname")).sendKeys("Mahajan");
        driver.findElement(By.id("company")).sendKeys("Test Company");
        driver.findElement(By.name("address1")).sendKeys("24");
        driver.findElement(By.name("address2")).sendKeys("cranbourne road");
        driver.findElement(By.name("city")).sendKeys("slough");
        driver.findElement(By.id("id_state")).sendKeys("New York");
        driver.findElement(By.id("postcode")).sendKeys("14301");
        driver.findElement(By.id("id_country")).sendKeys("United States");
        driver.findElement(By.name("other")).sendKeys("Hello");
        driver.findElement(By.id("phone")).sendKeys("07450445904");
        driver.findElement(By.name("phone_mobile")).sendKeys("07450445904");
        driver.findElement(By.name("alias")).sendKeys("24 cranbourne road");
        driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
        driver.quit();
    }
}
