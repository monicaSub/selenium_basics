package Selenium;z

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gettext1 {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
driver.get("https://blazedemo.com//");
Select speed=new Select(driver.findElement(By.name("fromPort")) );
speed.selectByVisibleText("Boston");

Select speed1=new Select(driver.findElement(By.name("toPort")) );
speed1.selectByVisibleText("London");


driver.findElement(By.xpath("//input[@type='submit']")).click();
driver.findElement(By.xpath("//*[@value='Choose This Flight']")).click();
driver.findElement(By.id("inputName")).sendKeys("monica ");

	}

}
