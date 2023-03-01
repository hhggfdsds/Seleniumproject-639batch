package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

class Project6dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tirupatibalaji.ap.gov.in/#/registration");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		new Select(driver.findElement(By.name("countryS"))).selectByVisibleText("India");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		new Select(driver.findElement(By.name("stateS"))).selectByVisibleText("Assam");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(6000);
		

	}

}
