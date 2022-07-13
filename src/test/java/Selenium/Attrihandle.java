package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Attrihandle  {

	public static void main(String[] args) throws Exception  {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.xe.com/");

String str=driver.findElement(By.className("amount-input__NumberInput-sc-1gq6pic-1 eIuRdk")).getAttribute("value");
System.out.println(str);
//Thread.sleep(3000);
//System.out.println(driver.findElement(By.partialLinkText("how to")).getText());
	}

}
