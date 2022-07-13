package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium {

	public static void main(String[] args) {
WebDriver driver;
		
		// Open chrome browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		// type FB url
		driver.get("https://www.facebook.com/");
		// to maximize the current window
		driver.manage().window().maximize();

		// Type UN and PWD
		driver.findElement(By.id("email")).sendKeys("sbdfbddfg@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("sdgsr32435");
		// Click on Login button
		driver.findElement(By.name("login")).click();
	}

}
