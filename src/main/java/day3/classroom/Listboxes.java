package day3.classroom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listboxes {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();
		
		//Select Training Program using text
		WebElement dd1 = driver.findElementById("dropdown1");
		Select dd = new Select(dd1);
		
		//List<WebElement> dd1opt = dd.getOptions();
		dd.selectByVisibleText("Selenium");
		
		// Select Training Program using Index
		Select dd2 = new Select(driver.findElementByName("dropdown2"));
		
		List<WebElement> dd2obj = dd2.getOptions();
		int dd2size = dd2obj.size();
		dd2.selectByIndex(dd2size-1);
		
		//using value
		Select dd4 = new Select(driver.findElementByName("dropdown3"));
		//dd4.selectByValue("2");
		dd4.selectByValue("2");
		
		//select no of dp options
		
		Select dd3 = new Select(driver.findElementByClassName("dropdown"));
		List<WebElement> dd3obj = dd3.getOptions();
		int dd3size = dd3obj.size();
		
		System.out.println("The number of dp options :"+dd3size);
		
		//using send keys to select
		
		
		

		
		
	
		
	}

}
