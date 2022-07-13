package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JustRecharge {

	public static void main(String[] args) {
WebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.justrechargeit.com/SignIn.aspx");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUserName")).sendKeys("smonica.ias@gmail.com");
		driver.findElement(By.id("txtPasswd")).sendKeys("how r u");
		driver.findElement(By.id("txtCaptcha")).sendKeys("123");
		driver.findElement(By.partialLinkText("Create")).click();
		
		System.out.println("monica");
		

	}

}
