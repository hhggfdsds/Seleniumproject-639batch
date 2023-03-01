package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignmentcheckbutton9 {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/gaura/Downloads/QE%20-%20index%20(1).html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("test5-button")).click();
		Thread.sleep(5000);
		if (driver.findElement(By.id("test5-button")).isEnabled()) {
			System.out.println("Test 5 button is enabled");
			
		}
		else {
			System.out.println("Test 5 button is disabled");
			
			
		}

	}

}
