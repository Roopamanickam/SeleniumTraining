package week2.assignments;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

 public class DeleteLeads {

 

                public static void main(String[] args) throws InterruptedException

                {

                                System.setProperty("webdriver.chrome.driver", "D://ALM_ERP_Automation//src//main//bin//resources/chromedriver_78.exe");

                                ChromeDriver driver = new ChromeDriver();

                                //driver.navigate().to("https://leaftaps.com/opentaps/control/main");

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

                                driver.findElementByXPath("//span[contains(text(), 'Phone')]").click();

                               

                               

                                driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9967542349");

                                driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();

                                Thread.sleep(3000);

                               

                                String LeadID = driver.findElementByXPath("//table[@class='x-grid3-row-table']//tr/td[1]/div/a").getText();

                               

                                driver.findElementByXPath("//table[@class='x-grid3-row-table']//tr/td[1]/div/a").click();

                                //System.out.println(driver.findElementByXPath("//table[@class='x-grid3-row-table']//tr/td[1]/div/a").getText());

                                System.out.println(LeadID);

                                Thread.sleep(3000);

                                               

                                /*WebElement LeadIDclk = driver.findElementByLinkText("//table[@class='x-grid3-row-table']//tr/td[1]/div/a");

                                LeadIDclk.click();*/

                               

                                //Actions act = new Actions("Keyboard","LeadIDclk");

                               

                                driver.findElementByClassName("subMenuButtonDangerous").click();

                                Thread.sleep(2000);

                                                               

                                driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();

                               

                                driver.findElementByXPath("//input[@name='id']").sendKeys(LeadID);                  

                                driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();

                               

                                Thread.sleep(2000);

                               

                                String verytxt = driver.findElementByXPath("//div[contains(text(),'No records to display')]").getText();

                                System.out.println(verytxt);

                               

                                if(verytxt.equals("No records to display"))

                                {

                                                System.out.println("Success");

                                }

                               

                               

                               

                               

                               

                               

                               

                               

                               

                               

                               

                               

                               

                               

 

                }

}
