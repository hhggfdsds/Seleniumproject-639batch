package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment10 {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		new Select(driver.findElement(By.className("form-inline"))).selectByVisibleText("Philadelphia");
		Thread.sleep(4000);
		new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("London");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[3]/td[1]/input")).click();
		Thread.sleep(4000);
		System.out.println("Your flight from TLV to SFO has been reserved.");
		System.out.println("Airline: United");
		System.out.println("Flight Number: UA954");
		System.out.println("Price: 400");
		System.out.println("Arbitrary Fees and Taxes: 514.76");
		System.out.println("**********************************************************************");
		System.out.println("Please submit the form below to purchase the flight.");
		
		driver.findElement(By.id("inputName")).sendKeys("Nisha");
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("inputName")).getText());
		
		driver.findElement(By.id("address")).sendKeys("adgfhjjuyutghj");
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("address")).getText());
		
		driver.findElement(By.id("city")).sendKeys("Folsom");
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("city")).getText());
		
		driver.findElement(By.id("state")).sendKeys("California");
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("state")).getText());
		
		driver.findElement(By.id("zipCode")).sendKeys("93076");
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("zipCode")).getText());
		
		new Select(driver.findElement(By.name("cardType"))).selectByVisibleText("American Express");
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.name("cardType")).getText());
		
		driver.findElement(By.id("creditCardNumber")).sendKeys("356875");
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.id("creditCardNumber")).getText());
		
		driver.findElement(By.id("creditCardMonth")).sendKeys("11");										
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.id("creditCardMonth")).getText());
		
		driver.findElement(By.id("creditCardYear")).sendKeys("2017");
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.id("creditCardYear")).getText());
		
	
		driver.findElement(By.id("nameOnCard")).sendKeys("Nisha");
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("nameOnCard")).getText());
		
		if (driver.findElement(By.id("rememberMe")).isSelected()) {
			System.out.println("RememberMe check box is selected");	
		}
		else {
			System.out.println("RememberMe check box is selected");

		}
		
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		Thread.sleep(2000);
		System.out.println("Thank you for your purchase today!");
		
		
		
		
		
		
		
		
		
		
	}

}
