package day3.classroom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
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
		
		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[3]").click();
		
		driver.findElementByXPath("//input[@name='emailAddress' and @type='text']").sendKeys("roopa.manickam@gmail.com");
		
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		
		Thread.sleep(3000);
		WebElement fname = driver.findElementByXPath("//div[@class='x-grid3-scroller']/div/div[1]//tbody/tr[1]/td[3]");
		String name = driver.findElementByXPath("//div[@class='x-grid3-scroller']/div/div[1]//tbody/tr[1]/td[3]").getText();
		System.out.println(name);
		
		/*WebElement fname = driver.findElementByXPath("//div[@class='x-grid3-scroller']/div/div[1]//tbody/tr[1]/td[3]");
		//String name = driver.findElementByXPath("(//table[@class='x-grid3-row-table'])[1]//td[3]/div/a").getText();
		System.out.println("---->"+driver.findElementByXPath("(//table[@class='x-grid3-row-table'])[1]//td[3]/div/a").getText());*/
		
		
		
		
		
		 driver.findElementByXPath("(//table[@class='x-grid3-row-table'])[1]//td[3]/div/a").click();
		 Thread.sleep(3000);
		 driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		 System.out.println("--->Title : "+driver.getTitle());
		
		 String DuplicateName = driver.findElementByXPath("//input[@id='createLeadForm_firstName']").getAttribute("value");
		System.out.println(DuplicateName);
		
		if(DuplicateName.equals(name))
		{
			System.out.println(" both names are same");
		}
		
		
		
	}

}
