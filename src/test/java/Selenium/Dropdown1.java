package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown1 {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
driver.get("https://testautomationpractice.blogspot.com/");
Select speed=new Select(driver.findElement(By.id("speed")) );
speed.selectByVisibleText("Fast");
Select file=new Select(driver.findElement(By.id("files")) );
file.selectByVisibleText("PDF file");
Select num=new Select(driver.findElement(By.id("number")) );
num.selectByVisibleText("4");
Select prod=new Select(driver.findElement(By.id("products")) );
prod.selectByVisibleText("Iphone");
Select pet=new Select(driver.findElement(By.id("animals")) );
pet.selectByVisibleText("Baby Cat");

}
}