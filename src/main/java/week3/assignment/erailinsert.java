package week3.assignment;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class erailinsert {
	public static void main(String[] args) throws InterruptedException

    {

  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

                    
  					ChromeDriver driver = new ChromeDriver();

                    Thread.sleep(1000);

                    driver.get("http://erail.in/");

                    driver.manage().window().maximize();

                    Thread.sleep(2000);  
                    String name = "PUNJAB MAIL";
                    char[] chrary = name.toCharArray();
                    
                   
                    Map<Integer, String> entry = new LinkedHashMap<>();
                    
                    entry.put(12138, name);
                    
                    driver.findElementByXPath("//input[@id='txtTrain_no']").sendKeys("12138");
                    Thread.sleep(2000);
                    driver.findElementByXPath("//a[@title='Click to get the Full Train Route']").click();
                    
                    Thread.sleep(3000);
                    WebElement tname = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//td[2]");
                    
                    System.out.println(tname.getText());
                    
                    if(tname.getText().equals(name))
                    {
                    	System.out.println("Correct train name");
                    }
                    else
                    {
                    	System.out.println("inCorrect train name");
                    	
                    }
                    // entry.put(12138, chrary);
    }
}
