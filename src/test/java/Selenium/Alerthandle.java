package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerthandle {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
driver.get("https://demoqa.com/alerts");
Thread.sleep(3000);
driver.findElement(By.id("alertButton")).click();
Thread.sleep(3000);
driver.switchTo().alert().accept();
driver.findElement(By.id("timerAlertButton")).click();
Thread.sleep(6000);
driver.switchTo().alert().accept();
driver.findElement(By.id("confirmButton")).click();
Thread.sleep(6000);
driver.switchTo().alert().dismiss();

Thread.sleep(3000);


String art=driver.findElement(By.id("confirmResult")).getText();
System.out.println(art);


	}

}
