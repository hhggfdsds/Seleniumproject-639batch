package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertproject2 {
  @Test
  public void f() throws Exception {
	  WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://collegeweeklive.com/go-signup");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
String abc =driver.findElement(By.id("firstNameError")).getText();
		Thread.sleep(3000);
		String expecterMessage =  "Please enter your first name.";
		Assert.assertEquals(expecterMessage,abc );
		
		System.out.println("programme end.");
		
  }
}
