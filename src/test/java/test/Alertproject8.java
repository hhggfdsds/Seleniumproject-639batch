package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertproject8 {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("Button2")).click();
		Thread.sleep(5000);
         driver.switchTo().alert().getText();
         System.out.println( driver.switchTo().alert().getText());
         Thread.sleep(5000);
         driver.switchTo().alert().accept();
         Thread.sleep(5000);
         driver.findElement(By.partialLinkText("New User ")).click();
         Thread.sleep(2000);
         driver.switchTo().alert().getText();
         Thread.sleep(2000);
         System.out.println( driver.switchTo().alert().getText());
         Thread.sleep(3000);
         driver.switchTo().alert().dismiss();
         Thread.sleep(5000);
         driver.close();
	}

}
