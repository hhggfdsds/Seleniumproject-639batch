package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Collegealertproject {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		List<WebElement>allHyperlinks = driver.findElements(By.tagName("a"));
		Thread.sleep(2000);
		System.out.println(allHyperlinks.size());
		for(int i=0; i<allHyperlinks.size(); i++) {
			System.out.println(allHyperlinks.get(i).getText());
			}

		driver.close();
			
		}

	}


