package week2.assignments;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectOptions {
	public static void main(String args[]) throws InterruptedException

    {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		

          ChromeDriver driver = new ChromeDriver();

          //driver.navigate().to("https://leaftaps.com/opentaps/control/main");

          driver.get("https://www.irctc.co.in/");

         

          driver.manage().window().maximize();

         

          driver.findElementByXPath("(//a[contains(text(),'REGISTER')])[1]").click();

          Thread.sleep(2000);

          WebElement ctry = driver.findElementByXPath("//select[@formcontrolname='resCountry']");

          Select ctrydd = new Select(ctry);

         

          ctrydd.selectByValue("93");

         

          List<WebElement> dpsize = ctrydd.getOptions();

          System.out.println(dpsize.size());

          /*for (int i = 0; i <= dpsize.size(); i++)

          {

               

          }*/

         

    for (WebElement eachoptions : dpsize) {

          int i=0;

          //boolean startsWith = eachoptions.getText().startsWith("E");

          if(eachoptions.getText().startsWith("E")){

          i++;

          if(i==2)

          {

                System.out.println(eachoptions);

          }

  }
    
    }       

    }
}

