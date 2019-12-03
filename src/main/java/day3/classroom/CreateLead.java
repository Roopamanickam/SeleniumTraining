package day3.classroom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {

		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// Initiate the ChromeBroswer
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Maximize the browser
		driver.manage().window().maximize();
		// Enter the UserName
			WebElement userName = driver.findElementById("username");
			userName.sendKeys("DemoSalesManager");
		// Enter the Password
			driver.findElementById("password").sendKeys("crmsfa");
		// Click on Login Button
			driver.findElementByClassName("decorativeSubmit").click();
		// Click on crm/sfa button
			driver.findElementByLinkText("CRM/SFA").click();

		// Click on Leads
			driver.findElementByLinkText("Leads").click();
		// Click on Create Lead button
			driver.findElementByLinkText("Create Lead").click();
		// Enter Company Name
			driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");;
		// Enter First Name
			driver.findElementById("createLeadForm_firstName").sendKeys("Roopa");
		// Enter Last Name
			driver.findElementById("createLeadForm_lastName").sendKeys("Manickam");
		
		// Verify the Lead is created by checking the Company or First Name
			
			// select source
			WebElement sourceDd = driver.findElementById("createLeadForm_dataSourceId");
			Select dd = new Select(sourceDd);
			//To select a particular option
			List<WebElement> options = dd.getOptions();
			int opt = options.size();
			dd.selectByIndex(opt-1);
			
			// To select industry
			WebElement insDd = driver.findElementById("createLeadForm_industryEnumId");
			Select inDd = new Select(insDd);
			
				// Options
			List<WebElement> options2 = inDd.getOptions();
			int opt2  = options2.size();			
			inDd.selectByIndex(opt2-2);
			
			// To select ownership
			
			WebElement ownerDd = driver.findElementById("createLeadForm_ownershipEnumId");
			Select ownDd = new Select(ownerDd);
				
				//Select By value
			ownDd.selectByValue("OWN_PARTNERSHIP");
			
			// To Select Market Campaign
			
			WebElement MCDd = driver.findElementByName("marketingCampaignId");
			Select MCDdobj =  new Select(MCDd);
			
				//select by value
			MCDdobj.selectByValue("CATRQ_CARNDRIVER");
			
			//To select prefered currency
			WebElement pcDd = driver.findElementById("createLeadForm_currencyUomId");
			Select pcDdObj = new Select(pcDd);
			
				//Select by value
			pcDdObj.selectByVisibleText("INR - Indian Rupee");
			
			// State
			
			WebElement stateDd =  driver.findElementById("createLeadForm_generalStateProvinceGeoId");
			Select stateObj = new Select(stateDd);
			
			stateObj.selectByValue("AR");
			
			//Country
			WebElement ctryDd =  driver.findElementById("createLeadForm_generalCountryGeoId");
			Select ctryObj = new Select(ctryDd);
			
			ctryObj.selectByVisibleText("India");
			
			//first name, last name
			WebElement fn = driver.findElementById("createLeadForm_firstNameLocal");
			fn.sendKeys("Roopa");
			
			String fnn = driver.findElementById("createLeadForm_firstNameLocal").getAttribute("value");
			System.out.println(driver.findElementById("createLeadForm_firstNameLocal").getAttribute("value"));
			
			driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Manickam");
			
			driver.findElementByName("personalTitle").sendKeys("Mrs");
			
			driver.findElementByXPath("//input[@id='createLeadForm_birthDate' and @title='Format: M/d/yy']").sendKeys("08/27/2000");
			
			driver.findElementById("createLeadForm_generalProfTitle").sendKeys("testing course");
			
			driver.findElementById("createLeadForm_departmentName").sendKeys("testing department");
			
			driver.findElementById("createLeadForm_annualRevenue").sendKeys("700000");
			driver.findElementById("createLeadForm_numberEmployees").sendKeys("750");
			driver.findElementById("createLeadForm_sicCode").sendKeys("9000123");
			driver.findElementById("createLeadForm_tickerSymbol").sendKeys("tickerSymbol");
			driver.findElementById("createLeadForm_description").sendKeys("createLeadForm_descriptioncreateLeadForm_descriptioncreateLeadForm_description");
			
			driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9967542349");
			driver.findElementById("createLeadForm_primaryEmail").sendKeys("roopa.manickam@gmail.com");

			driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("100630");
			driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("anand");
			
			// Click on Create Lead (Submit) button
						driver.findElementByClassName("smallSubmit").click();
						
			//verify
						String vy = driver.findElementById("viewLead_firstName_sp").getText();
						System.out.println("------>>>>"+vy); 
						
						if(vy.equals(fnn))
						{
							System.out.println("Success");
						}
						else
						{
							System.out.println("not success");
						} 
 }

}
