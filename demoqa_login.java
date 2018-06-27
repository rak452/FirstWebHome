import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class demoqa_login {
    static protected WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://demoqa.com/registration/");
        driver.findElement(By.name("first_name")).sendKeys("Rakesh");
        driver.findElement(By.name("last_name")).sendKeys("Mahajan");
        driver.findElement(By.name("radio_4[]")).click();
        driver.findElement(By.name("checkbox_5[]")).click();
        driver.findElement(By.xpath("//*[@id=\"dropdown_7\"]"));
        driver.findElement(By.xpath("//*[@id=\"mm_date_8\"]"));
        driver.findElement(By.xpath("//*[@id=\"dd_date_8\"]"));
        driver.findElement(By.xpath("//*[@id=\"yy_date_8\"]"));
        driver.findElement(By.name("phone_9")).sendKeys("07450445904");
        driver.findElement(By.name("username")).sendKeys("test452");
        driver.findElement(By.name("e_mail")).sendKeys("softtest452@gmail.com");
        //driver.findElement(By.xpath("//*[@id="profile_pic_10"]")).
        driver.findElement(By.name("description")).sendKeys("Hello");
        driver.findElement(By.name("password")).sendKeys("test12345");
        driver.findElement(By.id("confirm_password_password_2")).sendKeys("test12345");
        driver.findElement(By.xpath("//*[@id=\"piereg_passwordStrength\"]"));
        driver.findElement(By.xpath("//*[@id=\"pie_register\"]/li[14]/div/input")).click();
        //driver.quit();
    }
}
