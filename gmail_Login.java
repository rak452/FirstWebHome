import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class gmail_Login {

    static protected WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/ServiceLogin/identifier?continue=https%3A%2F%2Fwww.google.com%2F&hl=en&flowName=GlifWebSignIn&flowEntry=AddSession");
        driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div/div[2]/div/div/content/span")).click();
        driver.findElement(By.name("firstName")).sendKeys("jess");
        driver.findElement(By.name("lastName")).sendKeys("Maha");
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("mahajess169");
        driver.findElement(By.name("Passwd")).sendKeys("Shanker81");
        driver.findElement(By.name("ConfirmPasswd")).sendKeys("Shanker81");
        driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/content/span")).click();
        driver.findElement(By.id("phoneNumberId")).sendKeys("01753671561");
        driver.findElement(By.xpath("//*[@id=\"gradsIdvPhoneNext\"]/content/span")).click();
        driver.findElement(By.id("code")).sendKeys("823973");
        driver.findElement(By.xpath("//*[@id=\"gradsIdvVerifyNext\"]/content/span")).click();
        driver.findElement(By.xpath("//*[@id=\"view_container\"]/form/div[2]/div/div[2]/div/div[1]/div/div[1]/input")).sendKeys("mahajan452@gmail.com");
        driver.findElement(By.id("month")).sendKeys("November");
        driver.findElement(By.id("day")).sendKeys("22");
        driver.findElement(By.id("year")).sendKeys("1981");
        driver.findElement(By.id("gender")).sendKeys("male");
        driver.findElement(By.xpath("//*[@id=\"personalDetailsNext\"]/content/span")).click();
        driver.findElement(By.xpath("//*[@id=\"c0\"]/div[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"c2\"]/div[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"termsofserviceNext\"]/content/span")).click();
        driver.findElement(By.xpath("//*[@id=\"confirmdialog-confirm\"]/content/span")).click();
        driver.quit();
    }
}
