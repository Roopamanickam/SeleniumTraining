package week2.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		// Enter the UserName
		WebElement userName = driver.findElementById("username");
		userName.sendKeys("DemoSalesManager");
		// Enter the Password
		driver.findElementById("password").sendKeys("crmsfa");
		// Click on Login Button
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
		
		driver.findElementByXPath("(//input[@name='firstName' and @type='text'])[3]").sendKeys("Roopa");
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(3000);
		WebElement clk = driver.findElementByXPath("//div[@class='x-grid3-scroller']/div/div[1]//tbody/tr[1]/td[1]/div/a");
		clk.click();
		
		System.out.println("Title :"+driver .getTitle());
		/*driver.findElementByXPath("(//table[@class='x-grid3-row-table'])[1]//td[3]/div/a").click();
		
		Thread.sleep(2000);*/
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.findElementByXPath("//a[contains(text(),'Edit')]").click();
		
		driver.findElementByXPath("//input[@name='companyName' and @class='inputBox']").clear();
		
		driver.findElementByXPath("//input[@name='companyName' and @class='inputBox']").sendKeys("GAVSTECH");
		driver.findElementByXPath("//input[@name='submitButton' and @value='Update']").click();
		
		 WebElement verify = driver.findElementById("viewLead_companyName_sp");
		
		String verifyName = verify.getText();
		
	//	System.out.println(verifyName);
		String[] word =  verifyName.split(" ");
		System.out.println(word[0]);
		/*if (verifyName.contains("GAVSTECH"))
		{
			System.out.println("Edited text is printed corerectly");
		}*/
		if(word[0].equals("GAVSTECH"))
		{
			System.out.println("Edited text is printed corerectly");
		}
			
		
	}
}
