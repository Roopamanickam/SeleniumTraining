package week2.assignments;
import java.util.List;



import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {
	 public static void main(String[] args) throws InterruptedException

     {

   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

                     ChromeDriver driver = new ChromeDriver();

                     Thread.sleep(1000);

                     driver.get("http://erail.in/");

                     driver.manage().window().maximize();

                     Thread.sleep(2000);                      

                    

                     WebElement Frmsta = driver.findElementById("txtStationFrom");

                     Frmsta.clear();

                     Frmsta.sendKeys("MAS",Keys.TAB);

                    

                     WebElement Tosta = driver.findElementById("txtStationTo");

                     Tosta.clear();

                     Tosta.sendKeys("SBC",Keys.TAB);

                    

                     boolean chk = driver.findElementByXPath("//input[@id='chkSelectDateOnly' and @type='checkbox']").isSelected();

                     System.out.println(chk);

                    

                     if(chk)

                     {

                                     driver.findElementByXPath("//input[@id='chkSelectDateOnly' and @type='checkbox']").click();      

                     }

                    

                     driver.findElementById("buttonFromTo").click();

                     Thread.sleep(3000);

                    

                     WebElement traintable = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");

                    

                     // rows are static , print all the data present  in first row(All details of first train)

                     List<WebElement> rows = traintable.findElements(By.tagName("tr"));

                     List<WebElement> cols = rows.get(1).findElements(By.tagName("td"));

                     for (int i = 0; i < cols.size(); i++)

                     {

                                     System.out.println(cols.get(i).getText());

                     }

                    

                     /*
                      //columns are static , print all the train names

                     List<WebElement> tabrow = traintable.findElements(By.tagName("tr"));

                     int rowsize = tabrow.size();

                    

                     System.out.println(rowsize);

                     for (int j = 1; j < tabrow.size(); j++)

                     {

                     List<WebElement> R1col = tabrow.get(j).findElements(By.tagName("td"));

                     System.out.println(R1col.size());

                    

                                     //for (int i = 1; i < R1col.size(); i++)

                                     //{

                                                     System.out.print(R1col.get(2).getText());

                                                    

                                     //}

                                     System.out.println();

                     }*/

                    


                    

     }



}
