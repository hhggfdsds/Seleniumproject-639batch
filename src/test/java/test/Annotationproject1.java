package test;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Annotationproject1 {
	  WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver.get("https://www.justrechargeit.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
  }
  @BeforeClass
  public void beforeClass() {
	  WebDriver driver;
	  WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
