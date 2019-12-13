package week2.assignments;

import java.util.Date;
import java.text.SimpleDateFormat;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		WebElement frm = driver.findElementByXPath("//input[@id='src']");
		frm.sendKeys("Chennai",Keys.TAB);
		
		WebElement to = driver.findElementByXPath("//input[@id='dest']");
		to.sendKeys("Trichy",Keys.TAB);
		
		
		WebElement onward = driver.findElementByXPath("//label[contains(text(),'Onward Date')]");

		onward.click();
		WebElement onwarddate = driver.findElementByXPath("(//td[@class='current day'])[2]");
		onwarddate.click();
		//onward.sendKeys("06-Dec-2019");

       

        //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MON-yyyy");

        //Date date = new Date();

        //LocalDate localDate = LocalDate.now();

        //System.out.println(dtf.format(localDate));

        //onward.sendKeys("Trichy");

       
/*
        String pattern = "dd-MMM-yyyy";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date = simpleDateFormat.format(new Date());

        System.out.println(date);	
        driver.findElementByXPath("//label[contains(text(),'Onward Date')]").sendKeys("06-Dec-2019");*/
        
        
		
		
	}

}
