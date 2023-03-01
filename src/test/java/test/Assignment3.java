package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.justrechargeit.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("home")).sendKeys("9163459588");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//WebDriverWait ww = new WebDriverWait(driver, Duration.ofSeconds(30));
driver.findElement(By.id("txtUserName")).sendKeys("nbali.stg@gmail.com");
		
		//driver.close();

	}

}
