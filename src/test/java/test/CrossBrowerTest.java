package test;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class CrossBrowerTest {
	WebDriver driver;

	
  @Test
  public void f() throws Exception {
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("nbali.stg@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("welcome123");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		
		
  }
	@Parameters("browserName")
  @BeforeClass
  public void crossbrowsing(String browserName ) {
	  if (browserName.equalsIgnoreCase("firefox")) {
		  WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
	}else if (browserName.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
			
		}else if (browserName.equalsIgnoreCase("edge")) {
			 WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
			
			
		}else {
			System.out.println("please give valid browser name");
		}
		
	}
	 
	  
  

  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
	  
  }

}
