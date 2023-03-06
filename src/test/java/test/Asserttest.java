package test;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Asserttest {
  @Test
  public void f() throws Exception {
	  WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
String actualmessage =driver.findElement(By.id("email")).getText();
String expectedName = "The email or mobile number you entered isn’t connected to an account. Find your account and log in.";
Assert.assertEquals(actualmessage,expectedName );
Thread.sleep(4000);


	  
  }
}
