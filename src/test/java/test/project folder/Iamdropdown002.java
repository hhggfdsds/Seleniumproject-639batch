package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iamdropdown002 {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://collegeweeklive.com/go-signup");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("firstName")).sendKeys("Nisha");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("lastName")).sendKeys("Sharma");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("emailAddress")).sendKeys("nbali.stg@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("phoneNumber")).sendKeys("9163459588");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("password")).sendKeys("abcgddd12");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("ConfirmPassword")).sendKeys("abcgddd12");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		new Select(driver.findElement(By.name("nationality"))).selectByVisibleText("BANGLADESH");
		Thread.sleep(6000);
		new Select(driver.findElement(By.name("attendeeType"))).selectByVisibleText("Student Looking for Graduate Degree");
		Thread.sleep(5000);
		driver.findElement(By.id("questions[q_135]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.close();

	}

}
