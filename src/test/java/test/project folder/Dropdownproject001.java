package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownproject001 {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		new Select(driver.findElement(By.id("speed"))).selectByVisibleText("Fast");
		Thread.sleep(6000);
		new Select(driver.findElement(By.id("files"))).selectByVisibleText("PDF file");
		Thread.sleep(5000);
		new Select(driver.findElement(By.id("number"))).selectByVisibleText("4");
		Thread.sleep(5000);
		new Select(driver.findElement(By.id("products"))).selectByVisibleText("Iphone");
		Thread.sleep(5000);
		
		new Select(driver.findElement(By.id("animals"))).selectByVisibleText("Baby Cat");
		Thread.sleep(5000);
		driver.quit();
		
		

	}

}
