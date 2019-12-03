package day3.classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;



public class ButtonPage {
	
	public static void main(String[] args)
		{
		
		//set property for chrome driver
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		//Initiate chrome Driver
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Button.html");
		
		driver.manage().window().maximize();
		
		//driver.findElementBy.("//button[contains(text(),'Go to Home Page").click();
		driver.findElement(By.xpath("//button[contains(text(),'Go to Home Page')]")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Get Position')]")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'color')]")).click();
		
		driver.findElement(By.xpath("//button[text()[contains(.,'size')]]")).click();
		
		
		
		}
}
