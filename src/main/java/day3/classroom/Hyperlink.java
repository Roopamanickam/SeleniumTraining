package day3.classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlink {
	
	public static void main(String args[])
	{
		//set browser property
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Link.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'How many links are available in this page?')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
		
		driver.findElement(By.xpath("//button[@id=\"home\"]")).click();
		
			//click hyperlink
		driver.findElement(By.xpath("//img[@src='images/link.png']")).click();
		
			driver.findElement(By.xpath("//a[contains(text(),'Verify')]")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		String pt = "HTTP Status 404 – Not Found";
		//HTTP Status 404 – Not Found
		if(title.equals(pt) )
		{
			System.out.println("correct");
		}
		else
		{
			System.out.println("not valid");
		}
		
	
		
		
		
		
		
		
		
	
	}

}
